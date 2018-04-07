package Pojo;

public class UnitNet {

    private String fundCode;             //基金代码
    private String fundeName;            //基金名称
    private String unitNetEst;           //基金净值
    private String unitNetEstTime;      //基金净值时间
    private String unitNetEstimate;     //净值估算
    private String unitNetEstimateTime; //估算净值时间

    @Override
    public String toString() {
        return "UnitNet{" +
                "fundCode='" + fundCode + '\'' +
                ", fundeName='" + fundeName + '\'' +
                ", unitNetEst='" + unitNetEst + '\'' +
                ", unitNetEstTime='" + unitNetEstTime + '\'' +
                ", unitNetEstimate='" + unitNetEstimate + '\'' +
                ", unitNetEstimateTime='" + unitNetEstimateTime + '\'' +
                '}';
    }

    public UnitNet() {
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundeName() {
        return fundeName;
    }

    public void setFundeName(String fundeName) {
        this.fundeName = fundeName;
    }

    public String getUnitNetEst() {
        return unitNetEst;
    }

    public void setUnitNetEst(String unitNetEst) {
        this.unitNetEst = unitNetEst;
    }

    public String getUnitNetEstTime() {
        return unitNetEstTime;
    }

    public void setUnitNetEstTime(String unitNetEstTime) {
        this.unitNetEstTime = unitNetEstTime;
    }

    public String getUnitNetEstimate() {
        return unitNetEstimate;
    }

    public void setUnitNetEstimate(String unitNetEstimate) {
        this.unitNetEstimate = unitNetEstimate;
    }

    public String getUnitNetEstimateTime() {
        return unitNetEstimateTime;
    }

    public void setUnitNetEstimateTime(String unitNetEstimateTime) {
        this.unitNetEstimateTime = unitNetEstimateTime;
    }
}
