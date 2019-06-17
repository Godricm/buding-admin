package org.buding.dto;

import java.util.Date;
import javax.persistence.*;

@Table(name = "base_org")
public class BaseOrg {
    /**
     * 机构Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 机构代号
     */
    private String code;

    /**
     * 机构名
     */
    private String name;

    /**
     * 机构路径全称
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 机构简称
     */
    @Column(name = "short_name")
    private String shortName;

    /**
     * 排序代码
     */
    @Column(name = "sort_code")
    private String sortCode;

    /**
     * 上级机构
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 机构级别
     */
    private String level;

    /**
     * 机构类型
     */
    @Column(name = "org_type")
    private String orgType;

    /**
     * 机构负责人
     */
    private String leader;

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
     * 机构说明
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
     * 获取机构Id
     *
     * @return id - 机构Id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置机构Id
     *
     * @param id 机构Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取机构代号
     *
     * @return code - 机构代号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置机构代号
     *
     * @param code 机构代号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取机构名
     *
     * @return name - 机构名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置机构名
     *
     * @param name 机构名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取机构路径全称
     *
     * @return full_name - 机构路径全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置机构路径全称
     *
     * @param fullName 机构路径全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取机构简称
     *
     * @return short_name - 机构简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置机构简称
     *
     * @param shortName 机构简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
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
     * 获取上级机构
     *
     * @return parent_id - 上级机构
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置上级机构
     *
     * @param parentId 上级机构
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取机构级别
     *
     * @return level - 机构级别
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置机构级别
     *
     * @param level 机构级别
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取机构类型
     *
     * @return org_type - 机构类型
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 设置机构类型
     *
     * @param orgType 机构类型
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取机构负责人
     *
     * @return leader - 机构负责人
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置机构负责人
     *
     * @param leader 机构负责人
     */
    public void setLeader(String leader) {
        this.leader = leader;
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
     * 获取机构说明
     *
     * @return remark - 机构说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置机构说明
     *
     * @param remark 机构说明
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