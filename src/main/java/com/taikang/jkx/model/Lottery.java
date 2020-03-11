package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * lottery
 * @author 
 */
public class Lottery implements Serializable {
    private String lotteryid;

    private String lotteryName;

    private static final long serialVersionUID = 1L;

    public String getLotteryid() {
        return lotteryid;
    }

    public void setLotteryid(String lotteryid) {
        this.lotteryid = lotteryid;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
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
        Lottery other = (Lottery) that;
        return (this.getLotteryid() == null ? other.getLotteryid() == null : this.getLotteryid().equals(other.getLotteryid()))
            && (this.getLotteryName() == null ? other.getLotteryName() == null : this.getLotteryName().equals(other.getLotteryName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLotteryid() == null) ? 0 : getLotteryid().hashCode());
        result = prime * result + ((getLotteryName() == null) ? 0 : getLotteryName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lotteryid=").append(lotteryid);
        sb.append(", lotteryName=").append(lotteryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}