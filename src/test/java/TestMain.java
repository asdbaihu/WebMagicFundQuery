import Pojo.FundCompany.DayDayFund;
import Util.StringUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String []args) {
        //me">\(d{2}\-\d{2}\-\d{2}\w\d{2}\:\d{2}\)
        Pattern number = Pattern.compile("me\">\\((.*?)\\)</span>");
        Matcher matcher = number.matcher("<p><span><span class=\"sp01\">净值估算</span></span><span id=\"gz_gztime\">(18-04-04 15:00)</span><span class=\"infoTips\"><span class=\"tipsBubble\" style=\"display: none;\">净值估算每个交易日9：30-15：00盘中实时更新（QDII基金为海外交易时段），是按照基金持仓、指数走势和基金过往业绩估算，估算数据并不代表真实净值，仅供参考，请以基金管理人披露净值为准。</span></span></p>)");
       // System.out.println(StringUtil.getMatcher("<p><span class=\"ui-color-blue\"><span class=\"sp01\"><a href=\"http://fund.eastmoney.com/f10/jjjz_110022.html\">单位净值</a></span> (</span>2018-04-04)</p>", DayDayFund.UNIT_NET_EST_TIME_REG,DayDayFund.TIME_REG));

        System.out.println(matcher.find());
        System.out.println(matcher.group());

        Pattern number2 = Pattern.compile("\\d+-\\d+-\\d+\\s\\d+:\\d+|\\d+-\\d+-\\d+");
        Matcher matcher2 = number2.matcher(matcher.group());
        System.out.println(matcher2.find());
        System.out.println(matcher2.group());
//        String URL="http://fund.eastmoney.com/[FUNDCODE].html";
//        URL = URL.replace("[FUNDCODE]","110022");
//        System.out.println(URL);


    }




}
