package Pojo;

import java.util.ArrayList;

/**
 *
 * 此类为中间状态类，未来需改造成动态数据库获取
 *
 */
public class FundList {

    ArrayList<String> fundList = new ArrayList<String>(){
        {
            add("110022");
            add("110011");
            add("100056");
        }

    };



    public ArrayList<String> getFundList() {
        return fundList;
    }

    public void setFundList(ArrayList<String> fundList) {
        this.fundList = fundList;
    }

}
