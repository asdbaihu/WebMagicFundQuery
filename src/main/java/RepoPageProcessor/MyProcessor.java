package RepoPageProcessor;

import Pojo.FundCompany.DayDayFund;
import Pojo.FundList;
import Pojo.ResultList;
import Pojo.UnitNet;
import Util.StringUtil;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;

public class MyProcessor implements PageProcessor {
    // 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me()
                              .setRetryTimes(3)
                              .setSleepTime(100);
    private static int count =0;

    @Override
    public Site getSite() {
        return site;
    }

    @Override
    public void process(Page page) {
            UnitNet tempResult = new UnitNet();

//        System.out.println("抓取的内容："+
//                page.getHtml()
//            );
        tempResult.setFundCode(StringUtil.getMatcher(page.getHtml().toString(),DayDayFund.FUND_CODE_REG,DayDayFund.NUMBER_REG));
        //tempResult.setFundeName(StringUtil.getMatcher(page.getHtml().toString(),DayDayFund.FUND_NAME_REG,DayDayFund.CHINESE_REG));
        tempResult.setFundeName(page.getHtml().xpath("[@class='fix_fname']/text()").toString());
        tempResult.setUnitNetEst(StringUtil.getMatcher(page.getHtml().toString(),DayDayFund.UNIT_NET_EST_REG,DayDayFund.NUMBER_REG));
        tempResult.setUnitNetEstTime(StringUtil.getMatcher(page.getHtml().toString(),DayDayFund.UNIT_NET_EST_TIME_REG,DayDayFund.TIME_REG));
        tempResult.setUnitNetEstimate(StringUtil.getMatcher(page.getHtml().toString(),DayDayFund.UNIT_NET_ESTIMATE_REG,DayDayFund.NUMBER_REG));
        tempResult.setUnitNetEstimateTime(StringUtil.getMatcher(page.getHtml().toString(),DayDayFund.UNIT_NET_ESTIMATE_TIME_REG,DayDayFund.TIME_REG));
        ResultList.resultList.add(tempResult);
        count++;
    }

    public static void main(String[] args) {
        long startTime, endTime;
        System.out.println("开始爬取...");
        FundList fundCodeList = new FundList();

        ArrayList<String> urlList = new ArrayList<String>();

        String[] urls = new String[fundCodeList.getFundList().size()];
        for(int i =0;i<fundCodeList.getFundList().size();i++)
        {
            String funcode = fundCodeList.getFundList().get(i);
            urls[i] = StringUtil.replaceFundcode(DayDayFund.URL,funcode);
        }

        startTime = System.currentTimeMillis();
        Spider.create(new MyProcessor())
                .addUrl(urls)
                .thread(5)
                .run();
        endTime = System.currentTimeMillis();
        System.out.println("爬取结束，耗时约" + ((endTime - startTime) / 1000) + "秒，抓取了"+count+"条记录");
        System.out.println(ResultList.resultList);
    }

}