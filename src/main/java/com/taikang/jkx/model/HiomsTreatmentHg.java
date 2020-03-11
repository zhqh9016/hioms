package com.taikang.jkx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * hioms_treatment_hg
 * @author 
 */
public class HiomsTreatmentHg implements Serializable {
    /**
     * 就诊编号
     */
    private String jiuzhenbianhao;

    /**
     * 个人编号
     */
    private String gerenbianhao;

    /**
     * 身份证号
     */
    private String shenfenzheng;

    /**
     * 姓名
     */
    private String xingming;

    /**
     * 性别
     */
    private String xingbie;

    /**
     * 年龄
     */
    private String nianling;

    /**
     * 缴费人员类别
     */
    private String jiaofeirenyuanleibie;

    /**
     * 机构名称
     */
    private String jigoumingcheng;

    /**
     * 支付地点
     */
    private String zhifudidian;

    /**
     * 支付类别
     */
    private String zhifuleibie;

    /**
     * 入院时间
     */
    private Date ruyuanshijian;

    /**
     * 出院时间
     */
    private Date chuyuanshijian;

    /**
     * 住院号
     */
    private String zhuyuanhao;

    /**
     * 结算时间
     */
    private Date jiesuanshijian;

    /**
     * 出院诊断
     */
    private String chuyuanzhenduan;

    /**
     * 费用总额
     */
    private Float feiyongzonge;

    /**
     * 政策外自费
     */
    private Float zhengcewaizifei;

    /**
     * 政策内全自付金额
     */
    private Float zhengceneiquanzifujine;

    /**
     * 超标自付金额
     */
    private Float caobiaozifujine;

    /**
     * 政策内费用
     */
    private Float zhengceneifeiyong;

    /**
     * 起付线
     */
    private Float qifuxian;

    /**
     * 统筹支付
     */
    private Float tongchouzhifu;

    /**
     * 大病支付
     */
    private Float dabingzhifu;

    /**
     * 住院诊疗费
     */
    private Float zhuyuanzhenliaofei;

    /**
     * 本次大病累计
     */
    private Float bencidabingleiji;

    /**
     * 违规费用
     */
    private Float weiguifeiyong;

    /**
     * 个人付现
     */
    private Float gerenfuxian;

    /**
     * 结算人
     */
    private String jiesuanren;

    /**
     * 支付对象
     */
    private String zhifuduixiang;

    /**
     * 是否即时结算
     */
    private String shifoujishijiesuan;

    /**
     * 大病保险起付线
     */
    private Float dabingbaoxianqifuxian;

    /**
     * 大病保险支付
     */
    private Float dabingbaoxianzhifu;

    /**
     * 未办转诊扣减费用
     */
    private Float weibanzhuanzhenkoujianfeiyong;

    /**
     * 当年度住院次数
     */
    private Integer dangnianduzhuyuancishu;

    /**
     * 电话
     */
    private String dianhua;

    /**
     * 支付人
     */
    private String zhifuren;

    /**
     * 支付时间
     */
    private Date zhifushijian;

    /**
     * 保险公司
     */
    private String baoxiangongshi;

    /**
     * 巡查ID
     */
    private String patrolId;

    /**
     * 调查进度(0、未发起调查；1、待执行；2、已执行3、已结案；)
     */
    private Integer patrolStatus;

    /**
     * 调查结论(0、阴性；1、阳性)
     */
    private Integer patrolResult;

    /**
     * 回访ID
     */
    private String returnVisitId;

    /**
     * 回访状态(0、未回访；1、回访成功；2、未查账；3、不满意)
     */
    private String returnVisitStatus;

    /**
     * 统筹区编码
     */
    private String groupId;

    /**
     * 统筹区名称
     */
    private String groupName;

    /**
     * 是否有效
     */
    private Integer valid;

    /**
     * 同名同姓的人的个数
     */
    private Integer repeatNameNum;

    private Float benciqiandabingleiji;

    private Float dabingchongsuan;

    private Float bencidabingleiji2;

    private static final long serialVersionUID = 1L;

    public String getJiuzhenbianhao() {
        return jiuzhenbianhao;
    }

    public void setJiuzhenbianhao(String jiuzhenbianhao) {
        this.jiuzhenbianhao = jiuzhenbianhao;
    }

    public String getGerenbianhao() {
        return gerenbianhao;
    }

    public void setGerenbianhao(String gerenbianhao) {
        this.gerenbianhao = gerenbianhao;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getNianling() {
        return nianling;
    }

    public void setNianling(String nianling) {
        this.nianling = nianling;
    }

    public String getJiaofeirenyuanleibie() {
        return jiaofeirenyuanleibie;
    }

    public void setJiaofeirenyuanleibie(String jiaofeirenyuanleibie) {
        this.jiaofeirenyuanleibie = jiaofeirenyuanleibie;
    }

    public String getJigoumingcheng() {
        return jigoumingcheng;
    }

    public void setJigoumingcheng(String jigoumingcheng) {
        this.jigoumingcheng = jigoumingcheng;
    }

    public String getZhifudidian() {
        return zhifudidian;
    }

    public void setZhifudidian(String zhifudidian) {
        this.zhifudidian = zhifudidian;
    }

    public String getZhifuleibie() {
        return zhifuleibie;
    }

    public void setZhifuleibie(String zhifuleibie) {
        this.zhifuleibie = zhifuleibie;
    }

    public Date getRuyuanshijian() {
        return ruyuanshijian;
    }

    public void setRuyuanshijian(Date ruyuanshijian) {
        this.ruyuanshijian = ruyuanshijian;
    }

    public Date getChuyuanshijian() {
        return chuyuanshijian;
    }

    public void setChuyuanshijian(Date chuyuanshijian) {
        this.chuyuanshijian = chuyuanshijian;
    }

    public String getZhuyuanhao() {
        return zhuyuanhao;
    }

    public void setZhuyuanhao(String zhuyuanhao) {
        this.zhuyuanhao = zhuyuanhao;
    }

    public Date getJiesuanshijian() {
        return jiesuanshijian;
    }

    public void setJiesuanshijian(Date jiesuanshijian) {
        this.jiesuanshijian = jiesuanshijian;
    }

    public String getChuyuanzhenduan() {
        return chuyuanzhenduan;
    }

    public void setChuyuanzhenduan(String chuyuanzhenduan) {
        this.chuyuanzhenduan = chuyuanzhenduan;
    }

    public Float getFeiyongzonge() {
        return feiyongzonge;
    }

    public void setFeiyongzonge(Float feiyongzonge) {
        this.feiyongzonge = feiyongzonge;
    }

    public Float getZhengcewaizifei() {
        return zhengcewaizifei;
    }

    public void setZhengcewaizifei(Float zhengcewaizifei) {
        this.zhengcewaizifei = zhengcewaizifei;
    }

    public Float getZhengceneiquanzifujine() {
        return zhengceneiquanzifujine;
    }

    public void setZhengceneiquanzifujine(Float zhengceneiquanzifujine) {
        this.zhengceneiquanzifujine = zhengceneiquanzifujine;
    }

    public Float getCaobiaozifujine() {
        return caobiaozifujine;
    }

    public void setCaobiaozifujine(Float caobiaozifujine) {
        this.caobiaozifujine = caobiaozifujine;
    }

    public Float getZhengceneifeiyong() {
        return zhengceneifeiyong;
    }

    public void setZhengceneifeiyong(Float zhengceneifeiyong) {
        this.zhengceneifeiyong = zhengceneifeiyong;
    }

    public Float getQifuxian() {
        return qifuxian;
    }

    public void setQifuxian(Float qifuxian) {
        this.qifuxian = qifuxian;
    }

    public Float getTongchouzhifu() {
        return tongchouzhifu;
    }

    public void setTongchouzhifu(Float tongchouzhifu) {
        this.tongchouzhifu = tongchouzhifu;
    }

    public Float getDabingzhifu() {
        return dabingzhifu;
    }

    public void setDabingzhifu(Float dabingzhifu) {
        this.dabingzhifu = dabingzhifu;
    }

    public Float getZhuyuanzhenliaofei() {
        return zhuyuanzhenliaofei;
    }

    public void setZhuyuanzhenliaofei(Float zhuyuanzhenliaofei) {
        this.zhuyuanzhenliaofei = zhuyuanzhenliaofei;
    }

    public Float getBencidabingleiji() {
        return bencidabingleiji;
    }

    public void setBencidabingleiji(Float bencidabingleiji) {
        this.bencidabingleiji = bencidabingleiji;
    }

    public Float getWeiguifeiyong() {
        return weiguifeiyong;
    }

    public void setWeiguifeiyong(Float weiguifeiyong) {
        this.weiguifeiyong = weiguifeiyong;
    }

    public Float getGerenfuxian() {
        return gerenfuxian;
    }

    public void setGerenfuxian(Float gerenfuxian) {
        this.gerenfuxian = gerenfuxian;
    }

    public String getJiesuanren() {
        return jiesuanren;
    }

    public void setJiesuanren(String jiesuanren) {
        this.jiesuanren = jiesuanren;
    }

    public String getZhifuduixiang() {
        return zhifuduixiang;
    }

    public void setZhifuduixiang(String zhifuduixiang) {
        this.zhifuduixiang = zhifuduixiang;
    }

    public String getShifoujishijiesuan() {
        return shifoujishijiesuan;
    }

    public void setShifoujishijiesuan(String shifoujishijiesuan) {
        this.shifoujishijiesuan = shifoujishijiesuan;
    }

    public Float getDabingbaoxianqifuxian() {
        return dabingbaoxianqifuxian;
    }

    public void setDabingbaoxianqifuxian(Float dabingbaoxianqifuxian) {
        this.dabingbaoxianqifuxian = dabingbaoxianqifuxian;
    }

    public Float getDabingbaoxianzhifu() {
        return dabingbaoxianzhifu;
    }

    public void setDabingbaoxianzhifu(Float dabingbaoxianzhifu) {
        this.dabingbaoxianzhifu = dabingbaoxianzhifu;
    }

    public Float getWeibanzhuanzhenkoujianfeiyong() {
        return weibanzhuanzhenkoujianfeiyong;
    }

    public void setWeibanzhuanzhenkoujianfeiyong(Float weibanzhuanzhenkoujianfeiyong) {
        this.weibanzhuanzhenkoujianfeiyong = weibanzhuanzhenkoujianfeiyong;
    }

    public Integer getDangnianduzhuyuancishu() {
        return dangnianduzhuyuancishu;
    }

    public void setDangnianduzhuyuancishu(Integer dangnianduzhuyuancishu) {
        this.dangnianduzhuyuancishu = dangnianduzhuyuancishu;
    }

    public String getDianhua() {
        return dianhua;
    }

    public void setDianhua(String dianhua) {
        this.dianhua = dianhua;
    }

    public String getZhifuren() {
        return zhifuren;
    }

    public void setZhifuren(String zhifuren) {
        this.zhifuren = zhifuren;
    }

    public Date getZhifushijian() {
        return zhifushijian;
    }

    public void setZhifushijian(Date zhifushijian) {
        this.zhifushijian = zhifushijian;
    }

    public String getBaoxiangongshi() {
        return baoxiangongshi;
    }

    public void setBaoxiangongshi(String baoxiangongshi) {
        this.baoxiangongshi = baoxiangongshi;
    }

    public String getPatrolId() {
        return patrolId;
    }

    public void setPatrolId(String patrolId) {
        this.patrolId = patrolId;
    }

    public Integer getPatrolStatus() {
        return patrolStatus;
    }

    public void setPatrolStatus(Integer patrolStatus) {
        this.patrolStatus = patrolStatus;
    }

    public Integer getPatrolResult() {
        return patrolResult;
    }

    public void setPatrolResult(Integer patrolResult) {
        this.patrolResult = patrolResult;
    }

    public String getReturnVisitId() {
        return returnVisitId;
    }

    public void setReturnVisitId(String returnVisitId) {
        this.returnVisitId = returnVisitId;
    }

    public String getReturnVisitStatus() {
        return returnVisitStatus;
    }

    public void setReturnVisitStatus(String returnVisitStatus) {
        this.returnVisitStatus = returnVisitStatus;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getRepeatNameNum() {
        return repeatNameNum;
    }

    public void setRepeatNameNum(Integer repeatNameNum) {
        this.repeatNameNum = repeatNameNum;
    }

    public Float getBenciqiandabingleiji() {
        return benciqiandabingleiji;
    }

    public void setBenciqiandabingleiji(Float benciqiandabingleiji) {
        this.benciqiandabingleiji = benciqiandabingleiji;
    }

    public Float getDabingchongsuan() {
        return dabingchongsuan;
    }

    public void setDabingchongsuan(Float dabingchongsuan) {
        this.dabingchongsuan = dabingchongsuan;
    }

    public Float getBencidabingleiji2() {
        return bencidabingleiji2;
    }

    public void setBencidabingleiji2(Float bencidabingleiji2) {
        this.bencidabingleiji2 = bencidabingleiji2;
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
        HiomsTreatmentHg other = (HiomsTreatmentHg) that;
        return (this.getJiuzhenbianhao() == null ? other.getJiuzhenbianhao() == null : this.getJiuzhenbianhao().equals(other.getJiuzhenbianhao()))
            && (this.getGerenbianhao() == null ? other.getGerenbianhao() == null : this.getGerenbianhao().equals(other.getGerenbianhao()))
            && (this.getShenfenzheng() == null ? other.getShenfenzheng() == null : this.getShenfenzheng().equals(other.getShenfenzheng()))
            && (this.getXingming() == null ? other.getXingming() == null : this.getXingming().equals(other.getXingming()))
            && (this.getXingbie() == null ? other.getXingbie() == null : this.getXingbie().equals(other.getXingbie()))
            && (this.getNianling() == null ? other.getNianling() == null : this.getNianling().equals(other.getNianling()))
            && (this.getJiaofeirenyuanleibie() == null ? other.getJiaofeirenyuanleibie() == null : this.getJiaofeirenyuanleibie().equals(other.getJiaofeirenyuanleibie()))
            && (this.getJigoumingcheng() == null ? other.getJigoumingcheng() == null : this.getJigoumingcheng().equals(other.getJigoumingcheng()))
            && (this.getZhifudidian() == null ? other.getZhifudidian() == null : this.getZhifudidian().equals(other.getZhifudidian()))
            && (this.getZhifuleibie() == null ? other.getZhifuleibie() == null : this.getZhifuleibie().equals(other.getZhifuleibie()))
            && (this.getRuyuanshijian() == null ? other.getRuyuanshijian() == null : this.getRuyuanshijian().equals(other.getRuyuanshijian()))
            && (this.getChuyuanshijian() == null ? other.getChuyuanshijian() == null : this.getChuyuanshijian().equals(other.getChuyuanshijian()))
            && (this.getZhuyuanhao() == null ? other.getZhuyuanhao() == null : this.getZhuyuanhao().equals(other.getZhuyuanhao()))
            && (this.getJiesuanshijian() == null ? other.getJiesuanshijian() == null : this.getJiesuanshijian().equals(other.getJiesuanshijian()))
            && (this.getChuyuanzhenduan() == null ? other.getChuyuanzhenduan() == null : this.getChuyuanzhenduan().equals(other.getChuyuanzhenduan()))
            && (this.getFeiyongzonge() == null ? other.getFeiyongzonge() == null : this.getFeiyongzonge().equals(other.getFeiyongzonge()))
            && (this.getZhengcewaizifei() == null ? other.getZhengcewaizifei() == null : this.getZhengcewaizifei().equals(other.getZhengcewaizifei()))
            && (this.getZhengceneiquanzifujine() == null ? other.getZhengceneiquanzifujine() == null : this.getZhengceneiquanzifujine().equals(other.getZhengceneiquanzifujine()))
            && (this.getCaobiaozifujine() == null ? other.getCaobiaozifujine() == null : this.getCaobiaozifujine().equals(other.getCaobiaozifujine()))
            && (this.getZhengceneifeiyong() == null ? other.getZhengceneifeiyong() == null : this.getZhengceneifeiyong().equals(other.getZhengceneifeiyong()))
            && (this.getQifuxian() == null ? other.getQifuxian() == null : this.getQifuxian().equals(other.getQifuxian()))
            && (this.getTongchouzhifu() == null ? other.getTongchouzhifu() == null : this.getTongchouzhifu().equals(other.getTongchouzhifu()))
            && (this.getDabingzhifu() == null ? other.getDabingzhifu() == null : this.getDabingzhifu().equals(other.getDabingzhifu()))
            && (this.getZhuyuanzhenliaofei() == null ? other.getZhuyuanzhenliaofei() == null : this.getZhuyuanzhenliaofei().equals(other.getZhuyuanzhenliaofei()))
            && (this.getBencidabingleiji() == null ? other.getBencidabingleiji() == null : this.getBencidabingleiji().equals(other.getBencidabingleiji()))
            && (this.getWeiguifeiyong() == null ? other.getWeiguifeiyong() == null : this.getWeiguifeiyong().equals(other.getWeiguifeiyong()))
            && (this.getGerenfuxian() == null ? other.getGerenfuxian() == null : this.getGerenfuxian().equals(other.getGerenfuxian()))
            && (this.getJiesuanren() == null ? other.getJiesuanren() == null : this.getJiesuanren().equals(other.getJiesuanren()))
            && (this.getZhifuduixiang() == null ? other.getZhifuduixiang() == null : this.getZhifuduixiang().equals(other.getZhifuduixiang()))
            && (this.getShifoujishijiesuan() == null ? other.getShifoujishijiesuan() == null : this.getShifoujishijiesuan().equals(other.getShifoujishijiesuan()))
            && (this.getDabingbaoxianqifuxian() == null ? other.getDabingbaoxianqifuxian() == null : this.getDabingbaoxianqifuxian().equals(other.getDabingbaoxianqifuxian()))
            && (this.getDabingbaoxianzhifu() == null ? other.getDabingbaoxianzhifu() == null : this.getDabingbaoxianzhifu().equals(other.getDabingbaoxianzhifu()))
            && (this.getWeibanzhuanzhenkoujianfeiyong() == null ? other.getWeibanzhuanzhenkoujianfeiyong() == null : this.getWeibanzhuanzhenkoujianfeiyong().equals(other.getWeibanzhuanzhenkoujianfeiyong()))
            && (this.getDangnianduzhuyuancishu() == null ? other.getDangnianduzhuyuancishu() == null : this.getDangnianduzhuyuancishu().equals(other.getDangnianduzhuyuancishu()))
            && (this.getDianhua() == null ? other.getDianhua() == null : this.getDianhua().equals(other.getDianhua()))
            && (this.getZhifuren() == null ? other.getZhifuren() == null : this.getZhifuren().equals(other.getZhifuren()))
            && (this.getZhifushijian() == null ? other.getZhifushijian() == null : this.getZhifushijian().equals(other.getZhifushijian()))
            && (this.getBaoxiangongshi() == null ? other.getBaoxiangongshi() == null : this.getBaoxiangongshi().equals(other.getBaoxiangongshi()))
            && (this.getPatrolId() == null ? other.getPatrolId() == null : this.getPatrolId().equals(other.getPatrolId()))
            && (this.getPatrolStatus() == null ? other.getPatrolStatus() == null : this.getPatrolStatus().equals(other.getPatrolStatus()))
            && (this.getPatrolResult() == null ? other.getPatrolResult() == null : this.getPatrolResult().equals(other.getPatrolResult()))
            && (this.getReturnVisitId() == null ? other.getReturnVisitId() == null : this.getReturnVisitId().equals(other.getReturnVisitId()))
            && (this.getReturnVisitStatus() == null ? other.getReturnVisitStatus() == null : this.getReturnVisitStatus().equals(other.getReturnVisitStatus()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getRepeatNameNum() == null ? other.getRepeatNameNum() == null : this.getRepeatNameNum().equals(other.getRepeatNameNum()))
            && (this.getBenciqiandabingleiji() == null ? other.getBenciqiandabingleiji() == null : this.getBenciqiandabingleiji().equals(other.getBenciqiandabingleiji()))
            && (this.getDabingchongsuan() == null ? other.getDabingchongsuan() == null : this.getDabingchongsuan().equals(other.getDabingchongsuan()))
            && (this.getBencidabingleiji2() == null ? other.getBencidabingleiji2() == null : this.getBencidabingleiji2().equals(other.getBencidabingleiji2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJiuzhenbianhao() == null) ? 0 : getJiuzhenbianhao().hashCode());
        result = prime * result + ((getGerenbianhao() == null) ? 0 : getGerenbianhao().hashCode());
        result = prime * result + ((getShenfenzheng() == null) ? 0 : getShenfenzheng().hashCode());
        result = prime * result + ((getXingming() == null) ? 0 : getXingming().hashCode());
        result = prime * result + ((getXingbie() == null) ? 0 : getXingbie().hashCode());
        result = prime * result + ((getNianling() == null) ? 0 : getNianling().hashCode());
        result = prime * result + ((getJiaofeirenyuanleibie() == null) ? 0 : getJiaofeirenyuanleibie().hashCode());
        result = prime * result + ((getJigoumingcheng() == null) ? 0 : getJigoumingcheng().hashCode());
        result = prime * result + ((getZhifudidian() == null) ? 0 : getZhifudidian().hashCode());
        result = prime * result + ((getZhifuleibie() == null) ? 0 : getZhifuleibie().hashCode());
        result = prime * result + ((getRuyuanshijian() == null) ? 0 : getRuyuanshijian().hashCode());
        result = prime * result + ((getChuyuanshijian() == null) ? 0 : getChuyuanshijian().hashCode());
        result = prime * result + ((getZhuyuanhao() == null) ? 0 : getZhuyuanhao().hashCode());
        result = prime * result + ((getJiesuanshijian() == null) ? 0 : getJiesuanshijian().hashCode());
        result = prime * result + ((getChuyuanzhenduan() == null) ? 0 : getChuyuanzhenduan().hashCode());
        result = prime * result + ((getFeiyongzonge() == null) ? 0 : getFeiyongzonge().hashCode());
        result = prime * result + ((getZhengcewaizifei() == null) ? 0 : getZhengcewaizifei().hashCode());
        result = prime * result + ((getZhengceneiquanzifujine() == null) ? 0 : getZhengceneiquanzifujine().hashCode());
        result = prime * result + ((getCaobiaozifujine() == null) ? 0 : getCaobiaozifujine().hashCode());
        result = prime * result + ((getZhengceneifeiyong() == null) ? 0 : getZhengceneifeiyong().hashCode());
        result = prime * result + ((getQifuxian() == null) ? 0 : getQifuxian().hashCode());
        result = prime * result + ((getTongchouzhifu() == null) ? 0 : getTongchouzhifu().hashCode());
        result = prime * result + ((getDabingzhifu() == null) ? 0 : getDabingzhifu().hashCode());
        result = prime * result + ((getZhuyuanzhenliaofei() == null) ? 0 : getZhuyuanzhenliaofei().hashCode());
        result = prime * result + ((getBencidabingleiji() == null) ? 0 : getBencidabingleiji().hashCode());
        result = prime * result + ((getWeiguifeiyong() == null) ? 0 : getWeiguifeiyong().hashCode());
        result = prime * result + ((getGerenfuxian() == null) ? 0 : getGerenfuxian().hashCode());
        result = prime * result + ((getJiesuanren() == null) ? 0 : getJiesuanren().hashCode());
        result = prime * result + ((getZhifuduixiang() == null) ? 0 : getZhifuduixiang().hashCode());
        result = prime * result + ((getShifoujishijiesuan() == null) ? 0 : getShifoujishijiesuan().hashCode());
        result = prime * result + ((getDabingbaoxianqifuxian() == null) ? 0 : getDabingbaoxianqifuxian().hashCode());
        result = prime * result + ((getDabingbaoxianzhifu() == null) ? 0 : getDabingbaoxianzhifu().hashCode());
        result = prime * result + ((getWeibanzhuanzhenkoujianfeiyong() == null) ? 0 : getWeibanzhuanzhenkoujianfeiyong().hashCode());
        result = prime * result + ((getDangnianduzhuyuancishu() == null) ? 0 : getDangnianduzhuyuancishu().hashCode());
        result = prime * result + ((getDianhua() == null) ? 0 : getDianhua().hashCode());
        result = prime * result + ((getZhifuren() == null) ? 0 : getZhifuren().hashCode());
        result = prime * result + ((getZhifushijian() == null) ? 0 : getZhifushijian().hashCode());
        result = prime * result + ((getBaoxiangongshi() == null) ? 0 : getBaoxiangongshi().hashCode());
        result = prime * result + ((getPatrolId() == null) ? 0 : getPatrolId().hashCode());
        result = prime * result + ((getPatrolStatus() == null) ? 0 : getPatrolStatus().hashCode());
        result = prime * result + ((getPatrolResult() == null) ? 0 : getPatrolResult().hashCode());
        result = prime * result + ((getReturnVisitId() == null) ? 0 : getReturnVisitId().hashCode());
        result = prime * result + ((getReturnVisitStatus() == null) ? 0 : getReturnVisitStatus().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getRepeatNameNum() == null) ? 0 : getRepeatNameNum().hashCode());
        result = prime * result + ((getBenciqiandabingleiji() == null) ? 0 : getBenciqiandabingleiji().hashCode());
        result = prime * result + ((getDabingchongsuan() == null) ? 0 : getDabingchongsuan().hashCode());
        result = prime * result + ((getBencidabingleiji2() == null) ? 0 : getBencidabingleiji2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jiuzhenbianhao=").append(jiuzhenbianhao);
        sb.append(", gerenbianhao=").append(gerenbianhao);
        sb.append(", shenfenzheng=").append(shenfenzheng);
        sb.append(", xingming=").append(xingming);
        sb.append(", xingbie=").append(xingbie);
        sb.append(", nianling=").append(nianling);
        sb.append(", jiaofeirenyuanleibie=").append(jiaofeirenyuanleibie);
        sb.append(", jigoumingcheng=").append(jigoumingcheng);
        sb.append(", zhifudidian=").append(zhifudidian);
        sb.append(", zhifuleibie=").append(zhifuleibie);
        sb.append(", ruyuanshijian=").append(ruyuanshijian);
        sb.append(", chuyuanshijian=").append(chuyuanshijian);
        sb.append(", zhuyuanhao=").append(zhuyuanhao);
        sb.append(", jiesuanshijian=").append(jiesuanshijian);
        sb.append(", chuyuanzhenduan=").append(chuyuanzhenduan);
        sb.append(", feiyongzonge=").append(feiyongzonge);
        sb.append(", zhengcewaizifei=").append(zhengcewaizifei);
        sb.append(", zhengceneiquanzifujine=").append(zhengceneiquanzifujine);
        sb.append(", caobiaozifujine=").append(caobiaozifujine);
        sb.append(", zhengceneifeiyong=").append(zhengceneifeiyong);
        sb.append(", qifuxian=").append(qifuxian);
        sb.append(", tongchouzhifu=").append(tongchouzhifu);
        sb.append(", dabingzhifu=").append(dabingzhifu);
        sb.append(", zhuyuanzhenliaofei=").append(zhuyuanzhenliaofei);
        sb.append(", bencidabingleiji=").append(bencidabingleiji);
        sb.append(", weiguifeiyong=").append(weiguifeiyong);
        sb.append(", gerenfuxian=").append(gerenfuxian);
        sb.append(", jiesuanren=").append(jiesuanren);
        sb.append(", zhifuduixiang=").append(zhifuduixiang);
        sb.append(", shifoujishijiesuan=").append(shifoujishijiesuan);
        sb.append(", dabingbaoxianqifuxian=").append(dabingbaoxianqifuxian);
        sb.append(", dabingbaoxianzhifu=").append(dabingbaoxianzhifu);
        sb.append(", weibanzhuanzhenkoujianfeiyong=").append(weibanzhuanzhenkoujianfeiyong);
        sb.append(", dangnianduzhuyuancishu=").append(dangnianduzhuyuancishu);
        sb.append(", dianhua=").append(dianhua);
        sb.append(", zhifuren=").append(zhifuren);
        sb.append(", zhifushijian=").append(zhifushijian);
        sb.append(", baoxiangongshi=").append(baoxiangongshi);
        sb.append(", patrolId=").append(patrolId);
        sb.append(", patrolStatus=").append(patrolStatus);
        sb.append(", patrolResult=").append(patrolResult);
        sb.append(", returnVisitId=").append(returnVisitId);
        sb.append(", returnVisitStatus=").append(returnVisitStatus);
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", valid=").append(valid);
        sb.append(", repeatNameNum=").append(repeatNameNum);
        sb.append(", benciqiandabingleiji=").append(benciqiandabingleiji);
        sb.append(", dabingchongsuan=").append(dabingchongsuan);
        sb.append(", bencidabingleiji2=").append(bencidabingleiji2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}