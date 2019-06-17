package org.buding.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_role")
public class BaseRole {
    /**
     * 角色id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色代码
     */
    private String code;

    /**
     * 排序代码
     */
    @Column(name = "sort_code")
    private String sortCode;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色类型
     */
    private String type;

    /**
     * 是否使用于工作流
     */
    @Column(name = "in_work_flow")
    private Integer inWorkFlow;

    /**
     * 是否启用，0:否：1:是；
     */
    @Column(name = "is_enabled")
    private Integer isEnabled;

    /**
     * 删除状态0:否1:是
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 角色描述
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
     * 获取角色id
     *
     * @return id - 角色id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置角色id
     *
     * @param id 角色id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取角色代码
     *
     * @return code - 角色代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置角色代码
     *
     * @param code 角色代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取排序代码
     *
     * @return sort_code - 排序代码
     */
    public String getSortCode() {
        return sortCode;
    }

    /**
     * 设置排序代码
     *
     * @param sortCode 排序代码
     */
    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    /**
     * 获取角色名
     *
     * @return name - 角色名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名
     *
     * @param name 角色名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取角色类型
     *
     * @return type - 角色类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置角色类型
     *
     * @param type 角色类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取是否使用于工作流
     *
     * @return in_work_flow - 是否使用于工作流
     */
    public Integer getInWorkFlow() {
        return inWorkFlow;
    }

    /**
     * 设置是否使用于工作流
     *
     * @param inWorkFlow 是否使用于工作流
     */
    public void setInWorkFlow(Integer inWorkFlow) {
        this.inWorkFlow = inWorkFlow;
    }

    /**
     * 获取是否启用，0:否：1:是；
     *
     * @return is_enabled - 是否启用，0:否：1:是；
     */
    public Integer getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用，0:否：1:是；
     *
     * @param isEnabled 是否启用，0:否：1:是；
     */
    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取删除状态0:否1:是
     *
     * @return is_deleted - 删除状态0:否1:是
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置删除状态0:否1:是
     *
     * @param isDeleted 删除状态0:否1:是
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取角色描述
     *
     * @return remark - 角色描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置角色描述
     *
     * @param remark 角色描述
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