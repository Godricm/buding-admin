package org.buding.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_user_role")
public class BaseUserRole {
    /**
     * 职责ID
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
     * 角色ID
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 是否启用，0:否；1:是;
     */
    @Column(name = "is_enabled")
    private Integer isEnabled;

    /**
     * 是否删除，0:否；1:是;
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 权限描述
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
     * 获取职责ID
     *
     * @return id - 职责ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置职责ID
     *
     * @param id 职责ID
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
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取是否启用，0:否；1:是;
     *
     * @return is_enabled - 是否启用，0:否；1:是;
     */
    public Integer getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用，0:否；1:是;
     *
     * @param isEnabled 是否启用，0:否；1:是;
     */
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取是否删除，0:否；1:是;
     *
     * @return is_deleted - 是否删除，0:否；1:是;
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除，0:否；1:是;
     *
     * @param isDeleted 是否删除，0:否；1:是;
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取权限描述
     *
     * @return remark - 权限描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置权限描述
     *
     * @param remark 权限描述
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