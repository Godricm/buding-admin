package org.buding.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_user")
public class BaseUser {
    /**
     * Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 机构ID
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 加盐
     */
    private String slat;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 是否启用0:否；1:是；
     */
    @Column(name = "is_enabled")
    private Integer isEnabled;

    /**
     * 是否删除，0:是；1:否；
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 用户描述
     */
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 更新时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 更新人
     */
    @Column(name = "modified_by")
    private String modifiedBy;

    /**
     * 获取Id
     *
     * @return id - Id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置Id
     *
     * @param id Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取机构ID
     *
     * @return org_id - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取加盐
     *
     * @return slat - 加盐
     */
    public String getSlat() {
        return slat;
    }

    /**
     * 设置加盐
     *
     * @param slat 加盐
     */
    public void setSlat(String slat) {
        this.slat = slat;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取是否启用0:否；1:是；
     *
     * @return is_enabled - 是否启用0:否；1:是；
     */
    public Integer getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用0:否；1:是；
     *
     * @param isEnabled 是否启用0:否；1:是；
     */
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取是否删除，0:是；1:否；
     *
     * @return is_deleted - 是否删除，0:是；1:否；
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除，0:是；1:否；
     *
     * @param isDeleted 是否删除，0:是；1:否；
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取用户描述
     *
     * @return remark - 用户描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置用户描述
     *
     * @param remark 用户描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新时间
     *
     * @return modified_time - 更新时间
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置更新时间
     *
     * @param modifiedTime 更新时间
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * 获取更新人
     *
     * @return modified_by - 更新人
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设置更新人
     *
     * @param modifiedBy 更新人
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}