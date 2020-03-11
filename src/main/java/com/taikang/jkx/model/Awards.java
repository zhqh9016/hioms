package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * awards
 * @author 
 */
public class Awards implements Serializable {
    private String aid;

    private String lotteryid;

    private Integer awardOrder;
    
    private List<AwardInfo> key = new ArrayList<AwardInfo>();
    
    public List<AwardInfo> getKey() {
		return key;
	}

	public void setKey(List<AwardInfo> key) {
		this.key = key;
	}

	/**
     * 奖品等级
     */
    private String awardLevel;

    /**
     * 奖品数量
     */
    private Integer awardNum;

    /**
     * 奖品名称
     */
    private String awardName;

    private static final long serialVersionUID = 1L;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getLotteryid() {
        return lotteryid;
    }

    public void setLotteryid(String lotteryid) {
        this.lotteryid = lotteryid;
    }

    public Integer getAwardOrder() {
        return awardOrder;
    }

    public void setAwardOrder(Integer awardOrder) {
        this.awardOrder = awardOrder;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel;
    }

    public Integer getAwardNum() {
        return awardNum;
    }

    public void setAwardNum(Integer awardNum) {
        this.awardNum = awardNum;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
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
        Awards other = (Awards) that;
        return (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getLotteryid() == null ? other.getLotteryid() == null : this.getLotteryid().equals(other.getLotteryid()))
            && (this.getAwardOrder() == null ? other.getAwardOrder() == null : this.getAwardOrder().equals(other.getAwardOrder()))
            && (this.getAwardLevel() == null ? other.getAwardLevel() == null : this.getAwardLevel().equals(other.getAwardLevel()))
            && (this.getAwardNum() == null ? other.getAwardNum() == null : this.getAwardNum().equals(other.getAwardNum()))
            && (this.getAwardName() == null ? other.getAwardName() == null : this.getAwardName().equals(other.getAwardName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getLotteryid() == null) ? 0 : getLotteryid().hashCode());
        result = prime * result + ((getAwardOrder() == null) ? 0 : getAwardOrder().hashCode());
        result = prime * result + ((getAwardLevel() == null) ? 0 : getAwardLevel().hashCode());
        result = prime * result + ((getAwardNum() == null) ? 0 : getAwardNum().hashCode());
        result = prime * result + ((getAwardName() == null) ? 0 : getAwardName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aid=").append(aid);
        sb.append(", lotteryid=").append(lotteryid);
        sb.append(", awardOrder=").append(awardOrder);
        sb.append(", awardLevel=").append(awardLevel);
        sb.append(", awardNum=").append(awardNum);
        sb.append(", awardName=").append(awardName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}