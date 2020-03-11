package com.taikang.jkx.common;

public class Constant {

	/**
	 * 记录是否有效
	 */
	public static int HIOMS_VALID_YES = 1; // 有效
	public static int HIOMS_VALID_NO = 0; // 无效

	/**
	 * 巡查状态
	 */
	public static int HIOMS_PATROL_UNLAUNCH = 0; // 未发起
	public static int HIOMS_PATROL_WAIT_PATROL = 1; // 待执行
	public static int HIOMS_PATROL_FINISH = 2; // 已执行
	public static int HIOMS_PATROL_SUCCESS = 3; // 已结案

	/**
	 * 巡查结论,阴性或阳性
	 */
	public static int HIOMS_PATROL_YIN = 0; // 阴性
	public static int HIOMS_PATROL_YANG = 1; // 阳性

	/** 用户默认密码 */
	public static final String USER_DEFAULT = "111111";
	/** 巡查附件来源 */
	public static final int HIOMS_PATROL_ATTACHMENT_SOURCE_LAUNCHER = 0; // 发起者上传
	public static final int HIOMS_PATROL_ATTACHMENT_SOURCE_RECIPIENT = 1; // 执行者上传

	public static final String IMPORT_EXCEL_COL_TM_0 = "序号";
	public static final String IMPORT_EXCEL_COL_TM_1 = "是否支付";
	public static final String IMPORT_EXCEL_COL_TM_2 = "支付时间";
	public static final String IMPORT_EXCEL_COL_TM_3 = "就诊编号";
	public static final String IMPORT_EXCEL_COL_TM_4 = "个人编号";
	public static final String IMPORT_EXCEL_COL_TM_5 = "结算日期";
	public static final String IMPORT_EXCEL_COL_TM_6 = "姓名";
	public static final String IMPORT_EXCEL_COL_TM_7 = "身份证号码";
	public static final String IMPORT_EXCEL_COL_TM_8 = "支付对象";
	public static final String IMPORT_EXCEL_COL_TM_9 = "总费用";
	public static final String IMPORT_EXCEL_COL_TM_10 = "统筹支付";
	public static final String IMPORT_EXCEL_COL_TM_11 = "非医保";
	public static final String IMPORT_EXCEL_COL_TM_12 = "起付线";
	public static final String IMPORT_EXCEL_COL_TM_13 = "特殊自付";
	public static final String IMPORT_EXCEL_COL_TM_14 = "本次进入大病";
	public static final String IMPORT_EXCEL_COL_TM_15 = "大病支付";
	public static final String IMPORT_EXCEL_COL_TM_16 = "大病实际支付";
	
	public static final String Group_City_ID_TM = "10000000101";
	public static final String Group_City_ID_HG = "10000000102";
	public static final String Group_City_ID_JM = "10000000103";
	
	//居民大病查询界面导出的数据包含的字段
	public static String IMPORT_EXCEL_JMCX_COL1 = "个人编号";
	public static String IMPORT_EXCEL_JMCX_COL2 = "身份证号";
	public static String IMPORT_EXCEL_JMCX_COL3 = "姓名";
	public static String IMPORT_EXCEL_JMCX_COL4 = "性别";
	public static String IMPORT_EXCEL_JMCX_COL5 = "年龄";
	public static String IMPORT_EXCEL_JMCX_COL6 = "缴费人员类别";
	public static String IMPORT_EXCEL_JMCX_COL7 = "机构名称";
	public static String IMPORT_EXCEL_JMCX_COL8 = "支付地点";
	public static String IMPORT_EXCEL_JMCX_COL9 = "支付类别";
	public static String IMPORT_EXCEL_JMCX_COL10 = "入院时间";
	public static String IMPORT_EXCEL_JMCX_COL11 = "出院时间";
	public static String IMPORT_EXCEL_JMCX_COL12 = "住院号";
	public static String IMPORT_EXCEL_JMCX_COL13 = "结算时间";
	public static String IMPORT_EXCEL_JMCX_COL14 = "出院诊断";
	public static String IMPORT_EXCEL_JMCX_COL15 = "费用总额";
	public static String IMPORT_EXCEL_JMCX_COL16 = "政策外自费";
	public static String IMPORT_EXCEL_JMCX_COL17 = "政策内全自付金额";
	public static String IMPORT_EXCEL_JMCX_COL18 = "超标自付金额";
	public static String IMPORT_EXCEL_JMCX_COL19 = "政策内费用";
	public static String IMPORT_EXCEL_JMCX_COL20= "起付线";
	public static String IMPORT_EXCEL_JMCX_COL21 = "统筹支付";
	public static String IMPORT_EXCEL_JMCX_COL22 = "大病支付";
	public static String IMPORT_EXCEL_JMCX_COL23 = "住院诊疗费";
	public static String IMPORT_EXCEL_JMCX_COL24 = "本次大病累计";
	public static String IMPORT_EXCEL_JMCX_COL25 = "违规费用";
	public static String IMPORT_EXCEL_JMCX_COL26 = "个人付现";
	public static String IMPORT_EXCEL_JMCX_COL27 = "结算人";
	public static String IMPORT_EXCEL_JMCX_COL28 = "支付对象";
	public static String IMPORT_EXCEL_JMCX_COL29 = "是否即时结算";
	public static String IMPORT_EXCEL_JMCX_COL30 = "就诊编号";
	public static String IMPORT_EXCEL_JMCX_COL31 = "大病保险起付线";
	public static String IMPORT_EXCEL_JMCX_COL32 = "大病保险支付";
	public static String IMPORT_EXCEL_JMCX_COL33 = "未办转诊扣减费用";
	public static String IMPORT_EXCEL_JMCX_COL34 = "当年度住院次数";
	public static String IMPORT_EXCEL_JMCX_COL35 = "电话";
	public static String IMPORT_EXCEL_JMCX_COL36 = "支付人";
	public static String IMPORT_EXCEL_JMCX_COL37 = "支付时间";
	public static String IMPORT_EXCEL_JMCX_COL38 = "保险公司";

	
	public static String PERSION_CATEGORY_JZ = "精准扶贫人员";
	public static String PERSION_CATEGORY_PJ = "";
	public static String PERSION_CATEGORY_DB = "低保人员";

}
