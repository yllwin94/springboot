package com.example.test01.vo.claimdataback;

import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

/**
 * [模块名] WelfarePayInfo  [功能描述] 福利使用赔付信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 22:44
 */
public class WelfarePayInfo {
    @Description(value = "险种编码")
    private String RiskCode;

    @Description(value = "给付责任编码")
    private String GetDutyCode;

    @Description(value = "赔付比例")
    private String PayRate;

    @Description(value = "赔付金额")
    private String PayAmount;

    @Description(value = "赔付结论")
    private String GiveType;

    @Description(value = "赔付结论依据")
    private String GiveTypeReason;

    @Description(value = "给付责任扣除年免赔额")
    private String GetDutySpyeardedu;

    @Description(value = "津贴责任扣除年免赔天数")
    private String JTSpyearDay;

    @Description(value = "津贴理赔天数")
    private String JTClaimDay;

    @Description(value = "责任合理金额（未扣除免赔前的值）")
    private String ClaimableAmount;

    @Description(value = "津贴责任合理天数（未扣除免赔天数的值）")
    private String ReasonableDays;

    @Description(value = "扣除次免赔额")
    private String PopedomPay;

    public String getRiskCode() {
        return RiskCode;
    }

    public void setRiskCode(String riskCode) {
        RiskCode = riskCode;
    }

    public String getGetDutyCode() {
        return GetDutyCode;
    }

    public void setGetDutyCode(String getDutyCode) {
        GetDutyCode = getDutyCode;
    }

    public String getPayRate() {
        return PayRate;
    }

    public void setPayRate(String payRate) {
        PayRate = payRate;
    }

    public String getPayAmount() {
        return PayAmount;
    }

    public void setPayAmount(String payAmount) {
        PayAmount = payAmount;
    }

    public String getGiveType() {
        return GiveType;
    }

    public void setGiveType(String giveType) {
        GiveType = giveType;
    }

    public String getGiveTypeReason() {
        return GiveTypeReason;
    }

    public void setGiveTypeReason(String giveTypeReason) {
        GiveTypeReason = giveTypeReason;
    }

    public String getGetDutySpyeardedu() {
        return GetDutySpyeardedu;
    }

    public void setGetDutySpyeardedu(String getDutySpyeardedu) {
        GetDutySpyeardedu = getDutySpyeardedu;
    }

    public String getJTSpyearDay() {
        return JTSpyearDay;
    }

    public void setJTSpyearDay(String JTSpyearDay) {
        this.JTSpyearDay = JTSpyearDay;
    }

    public String getJTClaimDay() {
        return JTClaimDay;
    }

    public void setJTClaimDay(String JTClaimDay) {
        this.JTClaimDay = JTClaimDay;
    }

    public String getClaimableAmount() {
        return ClaimableAmount;
    }

    public void setClaimableAmount(String claimableAmount) {
        ClaimableAmount = claimableAmount;
    }

    public String getReasonableDays() {
        return ReasonableDays;
    }

    public void setReasonableDays(String reasonableDays) {
        ReasonableDays = reasonableDays;
    }

    public String getPopedomPay() {
        return PopedomPay;
    }

    public void setPopedomPay(String popedomPay) {
        PopedomPay = popedomPay;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "WelfarePayInfo[福利使用赔付信息]{" +
        return "{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + RiskCode + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + GetDutyCode + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + PayRate + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + PayAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + GiveType + '\"' + ",\n" +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + GiveTypeReason + '\"' + ",\n" +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + GetDutySpyeardedu + '\"' + ",\n" +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + JTSpyearDay + '\"' + ",\n" +
                "\"" + descriptionList.get(8) + "\"" + ":\"" + JTClaimDay + '\"' + ",\n" +
                "\"" + descriptionList.get(9) + "\"" + ":\"" + ClaimableAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(10) + "\"" + ":\"" + ReasonableDays + '\"' + ",\n" +
                "\"" + descriptionList.get(11) + "\"" + ":\"" + PopedomPay + '\"' + "\n}";

    }
}
