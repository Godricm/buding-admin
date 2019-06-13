package main.java.org.buding.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 */
@Data
public class BaseUser {
    private String id;
    private String orgId;
    private String loginName;
    private String password;
    private String  slat;
    private String nickName;
    private String avator;
    private Boolean isEnabled;
    private Boolean isDeleted;
    private String remark;
    private Date createDate;
    private String createBy;
    private Date modifiedDate;
    private String modifiedBy;
}
