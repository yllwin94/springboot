package com.example.test01.vo.claimdataback;

import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.List;

/**
 * [模块名] DetailInfo  [功能描述] 账单明细信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 19:54
 */
public class DetailInfo {

    @Description(value = "费用项代码")
    private String FeeItemCode;

    @Description(value = "费用项金额")
    private String FeeAmount;

    @Description(value = "自费金额")
    private String SelfAmount;

    @Description(value = "自费描述")
    private String SelfAmountDepict;

    @Description(value = "分类自负金额")
    private String PaymentMoney;

    @Description(value = "分类自负描述")
    private String PaymentMoneyDepict;

    @Description(value = "社保支付金额")
    private String SocialAmount;

    @Description(value = "社保支付描述")
    private String SocialAmountDepict;

    @Description(value = "第三方支付金额")
    private String ThirdPartyAmount;

    @Description(value = "第三方支付描述")
    private String ThirdPartyDepict;

    @Description(value = "不合理费用")
    private String RefuseAmount;

    @Description(value = "不合理费用描述")
    private String RefuseAmountDepict;

    @Description(value = "全明细信息集合")
    private List<FullDetailsInfo> fullDetailsInfo;

    public String getFeeItemCode() {
        return FeeItemCode;
    }

    public void setFeeItemCode(String feeItemCode) {
        FeeItemCode = feeItemCode;
    }

    public String getFeeAmount() {
        return FeeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        FeeAmount = feeAmount;
    }

    public String getSelfAmount() {
        return SelfAmount;
    }

    public void setSelfAmount(String selfAmount) {
        SelfAmount = selfAmount;
    }

    public String getSelfAmountDepict() {
        return SelfAmountDepict;
    }

    public void setSelfAmountDepict(String selfAmountDepict) {
        SelfAmountDepict = selfAmountDepict;
    }

    public String getPaymentMoney() {
        return PaymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        PaymentMoney = paymentMoney;
    }

    public String getPaymentMoneyDepict() {
        return PaymentMoneyDepict;
    }

    public void setPaymentMoneyDepict(String paymentMoneyDepict) {
        PaymentMoneyDepict = paymentMoneyDepict;
    }

    public String getSocialAmount() {
        return SocialAmount;
    }

    public void setSocialAmount(String socialAmount) {
        SocialAmount = socialAmount;
    }

    public String getSocialAmountDepict() {
        return SocialAmountDepict;
    }

    public void setSocialAmountDepict(String socialAmountDepict) {
        SocialAmountDepict = socialAmountDepict;
    }

    public String getThirdPartyAmount() {
        return ThirdPartyAmount;
    }

    public void setThirdPartyAmount(String thirdPartyAmount) {
        ThirdPartyAmount = thirdPartyAmount;
    }

    public String getThirdPartyDepict() {
        return ThirdPartyDepict;
    }

    public void setThirdPartyDepict(String thirdPartyDepict) {
        ThirdPartyDepict = thirdPartyDepict;
    }

    public String getRefuseAmount() {
        return RefuseAmount;
    }

    public void setRefuseAmount(String refuseAmount) {
        RefuseAmount = refuseAmount;
    }

    public String getRefuseAmountDepict() {
        return RefuseAmountDepict;
    }

    public void setRefuseAmountDepict(String refuseAmountDepict) {
        RefuseAmountDepict = refuseAmountDepict;
    }

    public List<FullDetailsInfo> getFullDetailsInfo() {
        return fullDetailsInfo;
    }

    public void setFullDetailsInfo(List<FullDetailsInfo> fullDetailsInfo) {
        this.fullDetailsInfo = fullDetailsInfo;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "DetailInfo[账单明细信息]{" +
        return "\n\t{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + FeeItemCode + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + FeeAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + SelfAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + SelfAmountDepict + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + PaymentMoney + '\"' + ",\n" +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + PaymentMoneyDepict + '\"' + ",\n" +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + SocialAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + SocialAmountDepict + '\"' + ",\n" +
                "\"" + descriptionList.get(8) + "\"" + ":\"" + ThirdPartyAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(9) + "\"" + ":\"" + ThirdPartyDepict + '\"' + ",\n" +
                "\"" + descriptionList.get(10) + "\"" + ":\"" + RefuseAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(11) + "\"" + ":\"" + RefuseAmountDepict + '\"' + ",\n" +
                "\"" + descriptionList.get(12) + "\"" + ":" + fullDetailsInfo + "\n}";


    }
}
