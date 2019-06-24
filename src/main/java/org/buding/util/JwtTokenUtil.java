package org.buding.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import io.jsonwebtoken.*;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Administrator
 * \* Date: 2019/6/24 0024
 * \* Time: 21:52
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * JWT 包含了使用.分隔的三部分:
 * 1.Header头部，包含了两部分：token类型和采用的加密算法
 * 2.Payload负载，Token的第二部分是负载，它包含了claim，Claim是一些实体（通常指的用户）的状态和额外的元数据
 * 3.Signature签名，创建签名需要使用编码后的header和payload以及一个密钥，使用header中指定签名算法进行签名
 * {"alg":"HS512"}{"sub":"dfdsa","created":1494928384539,"roles":[{"authority":"ROLE_ANONYMOUS"},{"authority":"ROLE_ADMIN"},{"authority":"ROLE_USER"},{"authority":"ROLE_DBA"}],"id":0,"exp":1495533184}
 * sigurature的生成算法
 * EMACSHA512(base64UrlEncode(header))+"."+base64UrlEncode(payload),+secret
 */
public class JwtTokenUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final String CLAIM_KEY_USER_NAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";

    /**
     * 密钥
     */
    @Value("${jwt.secret}")
    private String secret;

    /**
     * 有效期
     */
    @Value("${jwt.expration}")
    private Long expiration;

    /**
     * 根据负载生成JWT的token
     * @param claims
     * @return
     */
    private String generateToken(Map<String,Object> claims){
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.ES512,secret)
                .compact();
    }

    /**
     * 从token中获取JWT的负载
     * @param token
     * @return
     */
    private Claims getClaimsFromToken(String token){
        Claims claims=null;
        try {
            claims=Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        }catch (Exception e){
            LOGGER.info("JWT格式验证失败：{}",token);
        }

        return claims;
    }

    /**
     * 生成token的过期时间
     * @return
     */
    private Date generateExpirationDate(){
        return new Date(System.currentTimeMillis()+expiration*10000);
    }

    /**
     * 从token中获取登录的用户
     * @param token
     * @return
     */
    public String getUserNameFromToken(String token){
        String userName;
        try {
            Claims claims=getClaimsFromToken(token);
            userName=claims.getSubject();
        } catch (Exception e) {
           userName=null;
        }
        return userName;
    }

    /**
     *  验证token是否有效
     * @param token 客户端传入的token
     * @param userDetails 从数据库中查询出来的用户信息
     * @return
     */
    public boolean vlidateToken(String token, UserDetails userDetails){
        String userName=getUserNameFromToken(token);
        return userName.equals(userDetails.getUsername())&& !isTokenExpired(token);
    }

    /**
     * 判断token是否失效
     * @param token
     * @return
     */
    public  boolean isTokenExpired(String token){
        Date expiredDate=getExpiredDateFromToken(token);
        return expiredDate.before(new Date());
    }

    /**
     * 从token中获取过期时间
     * @param token
     * @return
     */
    private Date getExpiredDateFromToken(String token){
        Claims claims=getClaimsFromToken(token);
        return claims.getExpiration();
    }

    /**
     * 根据用户信息生成Token
     * @param userDetails
     * @return
     */
    public String generateToken(UserDetails userDetails){
        Map<String,Object> claims=new HashMap<>();
        claims.put(CLAIM_KEY_USER_NAME,userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED,new Date());
        return generateToken(claims);
    }

    /**
     * 判断token是否可以被刷新
     * @param token
     * @return
     */
    public boolean canRefresh(String token){
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     * @param token
     * @return
     */
    public String refreshToken(String token){
        Claims claims=getClaimsFromToken(token);
        claims.put(CLAIM_KEY_CREATED,new Date());
        return generateToken(claims);
    }
}
