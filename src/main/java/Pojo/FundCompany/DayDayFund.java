package Pojo.FundCompany;

public final class DayDayFund {

    public static final String COMPANY_NAME="天天基金网";

    /*URL*/
    public static final String URL="http://fund.eastmoney.com/[FUNDCODE].html";

    /*基本信息*/
    public static final String FUND_CODE_REG ="<span class=\"fix_fcode\">(.*?)</span>";                                                            //基金代码正则
    public static final String FUND_NAME_REG ="<span class=\"fix_fname\">(.*?)</span>";                                                            //基金名称正则
    public static final String UNIT_NET_EST_REG ="<span class=\"ui-font-large ui-color-red ui-num\">(.*?)</span>";                            //基金净值正则
    public static final String UNIT_NET_EST_TIME_REG ="</span> \\(</span>(.*?)\\)</p>";                                                            //基金净值时间正则
    public static final String UNIT_NET_ESTIMATE_REG ="<span class=\"ui-font-large ui-color-red ui-num\" id=\"gz_gsz\">(.*?)</span>";      //净值估算正则
    public static final String UNIT_NET_ESTIMATE_TIME_REG ="<span id=\"gz_gztime\">\\((.*?)\\)</span>";                                         //估算净值时间正则



    /*天天基金网其他配置信息*/
    public static final String NUMBER_REG="-[0-9]+(.[0-9]+)?|[0-9]+(.[0-9]+)?";             //小数整数正则
    public static final String TIME_REG="\\d+-\\d+-\\d+\\s\\d+:\\d+|\\d+-\\d+-\\d+";                   //时间格式正则
    public static final String CHINESE_REG = "[\\u4e00-\\u9fa5]+";                               //汉字正则
}
