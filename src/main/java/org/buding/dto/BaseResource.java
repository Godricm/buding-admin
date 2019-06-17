package org.buding.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_resource")
public class BaseResource {
    /**
     * 资源Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 资源代码
     */
    private String code;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源类型，MENU/BUTTON
     */
    @Column(name = "category_type")
    private String categoryType;

    /**
     * 权限描述
     */
    private String permission;

    /**
     * 父级id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 路由
     */
    private String router;

    /**
     * 排序代码
     */
    @Column(name = "sort_code")
    private Integer sortCode;

    /**
     * 图标
     */
    private String icon;

    /**
     * 是否启用，0:否；1:是；
     */
    @Column(name = "is_enabled")
    private Integer isEnabled;

    /**
     * 是否删除，0:否；1:是；
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 资源描述
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
     * 获取资源Id
     *
     * @return id - 资源Id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置资源Id
     *
     * @param id 资源Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取资源代码
     *
     * @return code - 资源代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置资源代码
     *
     * @param code 资源代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资源类型，MENU/BUTTON
     *
     * @return category_type - 资源类型，MENU/BUTTON
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * 设置资源类型，MENU/BUTTON
     *
     * @param categoryType 资源类型，MENU/BUTTON
     */
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * 获取权限描述
     *
     * @return permission - 权限描述
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限描述
     *
     * @param permission 权限描述
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取父级id
     *
     * @return parent_id - 父级id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父级id
     *
     * @param parentId 父级id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取路由
     *
     * @return router - 路由
     */
    public String getRouter() {
        return router;
    }

    /**
     * 设置路由
     *
     * @param router 路由
     */
    public void setRouter(String router) {
        this.router = router;
    }

    /**
     * 获取排序代码
     *
     * @return sort_code - 排序代码
     */
    public Integer getSortCode() {
        return sortCode;
    }

    /**
     * 设置排序代码
     *
     * @param sortCode 排序代码
     */
    public void setSortCode(Integer sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取是否启用，0:否；1:是；
     *
     * @return is_enabled - 是否启用，0:否；1:是；
     */
    public Integer getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用，0:否；1:是；
     *
     * @param isEnabled 是否启用，0:否；1:是；
     */
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取是否删除，0:否；1:是；
     *
     * @return is_deleted - 是否删除，0:否；1:是；
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除，0:否；1:是；
     *
     * @param isDeleted 是否删除，0:否；1:是；
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取资源描述
     *
     * @return remark - 资源描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置资源描述
     *
     * @param remark 资源描述
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