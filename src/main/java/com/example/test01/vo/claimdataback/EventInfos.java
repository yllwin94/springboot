package com.example.test01.vo.claimdataback;

import com.alibaba.fastjson2.util.DateUtils;
import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.Date;
import java.util.List;

/**
 * [模块名] EventInfos  [功能描述] 事件信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 23:27
 */
public class EventInfos {
    @Description(value = "出险日期（格式：yyyy-MM-dd）")
    private Date AccDate;

    @Description(value = "事件开始时间（格式：yyyy-MM-dd）")
    private Date EventStartDate;

    @Description(value = "事件结束时间（格式：yyyy-MM-dd）")
    private Date EventEndDate;

    @Description(value = "事件描述")
    private String EventDesc;

    @Description(value = "事故原因")
    private String EventReason;

    @Description(value = "事件发生地洲")
    private String Continent;

    @Description(value = "事件发生地国家")
    private String Country;

    @Description(value = "事故发生省")
    private String Province;

    @Description(value = "事故发生市")
    private String City;

    @Description(value = "事故发生区")
    private String District;

    @Description(value = "事故发生地点")
    private String EventPlace;

    @Description(value = "传染病隔离津贴信息集合")
    private List<InfectAllowance> InfectAllowanceList;

    @Description(value = "福利使用赔付信息集合")
    private List<WelfarePayInfo> WelfarePayInfo;

    @Description(value = "账单信息集合")
    private List<InvoiceInfo> InvoiceInfo;

    @Description(value = "诊疗信息集合")
    private List<TreatmentInfo> TreatmentInfo;

    public Date getAccDate() {
        return AccDate;
    }

    public void setAccDate(Date accDate) {
        AccDate = accDate;
    }

    public Date getEventStartDate() {
        return EventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        EventStartDate = eventStartDate;
    }

    public Date getEventEndDate() {
        return EventEndDate;
    }

    public void setEventEndDate(Date eventEndDate) {
        EventEndDate = eventEndDate;
    }

    public String getEventDesc() {
        return EventDesc;
    }

    public void setEventDesc(String eventDesc) {
        EventDesc = eventDesc;
    }

    public String getEventReason() {
        return EventReason;
    }

    public void setEventReason(String eventReason) {
        EventReason = eventReason;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getEventPlace() {
        return EventPlace;
    }

    public void setEventPlace(String eventPlace) {
        EventPlace = eventPlace;
    }

    public List<InfectAllowance> getInfectAllowanceList() {
        return InfectAllowanceList;
    }

    public void setInfectAllowanceList(List<InfectAllowance> infectAllowanceList) {
        InfectAllowanceList = infectAllowanceList;
    }

    public List<WelfarePayInfo> getWelfarePayInfo() {
        return WelfarePayInfo;
    }

    public void setWelfarePayInfo(List<WelfarePayInfo> welfarePayInfo) {
        WelfarePayInfo = welfarePayInfo;
    }

    public List<InvoiceInfo> getInvoiceInfo() {
        return InvoiceInfo;
    }

    public void setInvoiceInfo(List<InvoiceInfo> invoiceInfo) {
        InvoiceInfo = invoiceInfo;
    }

    public List<TreatmentInfo> getTreatmentInfo() {
        return TreatmentInfo;
    }

    public void setTreatmentInfo(List<TreatmentInfo> treatmentInfo) {
        TreatmentInfo = treatmentInfo;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "EventInfos[事件信息]{" +
        return "{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + DateUtils.format(AccDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + DateUtils.format(EventStartDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + DateUtils.format(EventEndDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + EventDesc + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + EventReason + '\"' + ",\n" +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + Continent + '\"' + ",\n" +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + Country + '\"' + ",\n" +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + Province + '\"' + ",\n" +
                "\"" + descriptionList.get(8) + "\"" + ":\"" + City + '\"' + ",\n" +
                "\"" + descriptionList.get(9) + "\"" + ":\"" + District + '\"' + ",\n" +
                "\"" + descriptionList.get(10) + "\"" + ":\"" + EventPlace + '\"' + ",\n" +
                "\"" + descriptionList.get(11) + "\"" + ":" + InfectAllowanceList + ",\n" +
                "\"" + descriptionList.get(12) + "\"" + ":" + WelfarePayInfo + ",\n" +
                "\"" + descriptionList.get(13) + "\"" + ":" + InvoiceInfo + ",\n" +
                "\"" + descriptionList.get(14) + "\"" + ":" + TreatmentInfo + "\n}";



    }
}
