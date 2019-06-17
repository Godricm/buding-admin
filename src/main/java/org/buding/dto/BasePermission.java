package org.buding.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_permission")
public class BasePermission {
    /**
     * 权限ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 资源Id
     */
    @Column(name = "resource_id")
    private String resourceId;

    /**
     * 状态，0:禁用；1:授权；
     */
    private Integer status;

    private String permission;

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
     * 获取权限ID
     *
     * @return id - 权限ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置权限ID
     *
     * @param id 权限ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取资源Id
     *
     * @return resource_id - 资源Id
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源Id
     *
     * @param resourceId 资源Id
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 获取状态，0:禁用；1:授权；
     *
     * @return status - 状态，0:禁用；1:授权；
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态，0:禁用；1:授权；
     *
     * @param status 状态，0:禁用；1:授权；
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
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