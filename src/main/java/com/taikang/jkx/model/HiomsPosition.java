package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class HiomsPosition extends TreeNode<HiomsPosition> implements Serializable {
    /**
     * 岗位唯一标识
     */
    private String positionId;

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 所属组织名称
     */
    private String groupName;

    /**
     * 所属组织
     */
    private String groupId;

    /**
     * 是否有效
     */
    private Integer valid;

    /**
     * 创建者ID
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HiomsPosition other = (HiomsPosition) that;
        return (this.getPositionId() == null ? other.getPositionId() == null : this.getPositionId().equals(other.getPositionId()))
            && (this.getPositionName() == null ? other.getPositionName() == null : this.getPositionName().equals(other.getPositionName()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPositionId() == null) ? 0 : getPositionId().hashCode());
        result = prime * result + ((getPositionName() == null) ? 0 : getPositionName().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", positionId=").append(positionId);
        sb.append(", positionName=").append(positionName);
        sb.append(", groupName=").append(groupName);
        sb.append(", groupId=").append(groupId);
        sb.append(", valid=").append(valid);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}