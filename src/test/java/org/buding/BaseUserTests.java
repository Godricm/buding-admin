package org.buding;

import org.buding.dao.BaseUserMapper;
import org.buding.dto.BaseUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseUserTests {
    @Autowired
    private BaseUserMapper baseUserMapper;

    @Test
    public void Test(){
        try {
           // session.selectOne("org.buding.mapper.BaseUserMapper.insert",baseUser);

            BaseUser user=baseUserMapper.selectByPrimaryKey("1");
            if(user!=null){
                String userInfo = "名字："+user.getLoginName();
                System.out.println(userInfo);
            }
        }catch (Exception e){
e.printStackTrace();
        }
    }
}
