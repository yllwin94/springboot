package com.example.test01.vo.claimdataback;

import com.alibaba.fastjson2.util.DateUtils;
import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.Date;
import java.util.List;

/**
 * [模块名] InvoiceInfo  [功能描述] 账单信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 22:54
 */
public class InvoiceInfo {
    @Description(value = "就诊人姓名")
    private String PatientName;

    @Description(value = "账单收据号")
    private String InvoiceNo;

    @Description(value = "账单属性")
    private String InAttribute;

    @Description(value = "账单种类")
    private String InvoiceKind;

    @Description(value = "收据类型")
    private String InvoiceType;

    @Description(value = "账单日期（格式：yyyy-MM-dd）")
    private Date BillDate;

    @Description(value = "账单起期（格式：yyyy-MM-dd）")
    private Date InStartDate;

    @Description(value = "账单止期（格式：yyyy-MM-dd）")
    private Date InEndDate;

    @Description(value = "服务机构类型")
    private String InstitutionType;

    @Description(value = "机构编码")
    private String InstitutionCode;

    @Description(value = "就诊科室")
    private String Departments;

    @Description(value = "账单总金额")
    private String SumAmount;

    @Description(value = "关联险种编码")
    private String InRiskCode;

    @Description(value = "关联给付责任编码")
    private String InGetDutyCode;

    @Description(value = "机构中文名称")
    private String CnName;

    @Description(value = "机构英文名称")
    private String EnName;

    @Description(value = "机构类型")
    private String SorgType;

    @Description(value = "机构属性")
    private String SorgProperty;

    @Description(value = "医疗类型")
    private String MedicalType;

    @Description(value = "医疗等级")
    private String MedicalLevel;

    @Description(value = "是否当地社保")
    private String IsSocialSecurity;

    @Description(value = "是否直付")
    private String IsPayment;

    @Description(value = "直付方式")
    private String PaymentMode;

    @Description(value = "直付类型")
    private String PaymentType;

    @Description(value = "是否昂贵")
    private String IsExpensive;

    @Description(value = "洲")
    private String Continent;

    @Description(value = "地区")
    private String Area;

    @Description(value = "省")
    private String Province;

    @Description(value = "市")
    private String City;

    @Description(value = "区/县")
    private String County;

    @Description(value = "市，非中国大陆的地区，录入时规范到城市")
    private String Town;

    @Description(value = "详细地址")
    private String DetailedAddress;

    @Description(value = "医疗收据类型")
    private String MedicalReceiptType;

    @Description(value = "账单医院国家")
    private String BillingCountry;

    @Description(value = "账单医院地区/省份")
    private String BillingProvince;

    @Description(value = "账单明细信息集合")
    private List<DetailInfo> DetailInfo;

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public String getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        InvoiceNo = invoiceNo;
    }

    public String getInAttribute() {
        return InAttribute;
    }

    public void setInAttribute(String inAttribute) {
        InAttribute = inAttribute;
    }

    public String getInvoiceKind() {
        return InvoiceKind;
    }

    public void setInvoiceKind(String invoiceKind) {
        InvoiceKind = invoiceKind;
    }

    public String getInvoiceType() {
        return InvoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        InvoiceType = invoiceType;
    }

    public Date getBillDate() {
        return BillDate;
    }

    public void setBillDate(Date billDate) {
        BillDate = billDate;
    }

    public Date getInStartDate() {
        return InStartDate;
    }

    public void setInStartDate(Date inStartDate) {
        InStartDate = inStartDate;
    }

    public Date getInEndDate() {
        return InEndDate;
    }

    public void setInEndDate(Date inEndDate) {
        InEndDate = inEndDate;
    }

    public String getInstitutionType() {
        return InstitutionType;
    }

    public void setInstitutionType(String institutionType) {
        InstitutionType = institutionType;
    }

    public String getInstitutionCode() {
        return InstitutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        InstitutionCode = institutionCode;
    }

    public String getDepartments() {
        return Departments;
    }

    public void setDepartments(String departments) {
        Departments = departments;
    }

    public String getSumAmount() {
        return SumAmount;
    }

    public void setSumAmount(String sumAmount) {
        SumAmount = sumAmount;
    }

    public String getInRiskCode() {
        return InRiskCode;
    }

    public void setInRiskCode(String inRiskCode) {
        InRiskCode = inRiskCode;
    }

    public String getInGetDutyCode() {
        return InGetDutyCode;
    }

    public void setInGetDutyCode(String inGetDutyCode) {
        InGetDutyCode = inGetDutyCode;
    }

    public String getCnName() {
        return CnName;
    }

    public void setCnName(String cnName) {
        CnName = cnName;
    }

    public String getEnName() {
        return EnName;
    }

    public void setEnName(String enName) {
        EnName = enName;
    }

    public String getSorgType() {
        return SorgType;
    }

    public void setSorgType(String sorgType) {
        SorgType = sorgType;
    }

    public String getSorgProperty() {
        return SorgProperty;
    }

    public void setSorgProperty(String sorgProperty) {
        SorgProperty = sorgProperty;
    }

    public String getMedicalType() {
        return MedicalType;
    }

    public void setMedicalType(String medicalType) {
        MedicalType = medicalType;
    }

    public String getMedicalLevel() {
        return MedicalLevel;
    }

    public void setMedicalLevel(String medicalLevel) {
        MedicalLevel = medicalLevel;
    }

    public String getIsSocialSecurity() {
        return IsSocialSecurity;
    }

    public void setIsSocialSecurity(String isSocialSecurity) {
        IsSocialSecurity = isSocialSecurity;
    }

    public String getIsPayment() {
        return IsPayment;
    }

    public void setIsPayment(String isPayment) {
        IsPayment = isPayment;
    }

    public String getPaymentMode() {
        return PaymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        PaymentMode = paymentMode;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public String getIsExpensive() {
        return IsExpensive;
    }

    public void setIsExpensive(String isExpensive) {
        IsExpensive = isExpensive;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
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

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getDetailedAddress() {
        return DetailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        DetailedAddress = detailedAddress;
    }

    public String getMedicalReceiptType() {
        return MedicalReceiptType;
    }

    public void setMedicalReceiptType(String medicalReceiptType) {
        MedicalReceiptType = medicalReceiptType;
    }

    public String getBillingCountry() {
        return BillingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        BillingCountry = billingCountry;
    }

    public String getBillingProvince() {
        return BillingProvince;
    }

    public void setBillingProvince(String billingProvince) {
        BillingProvince = billingProvince;
    }

    public List<DetailInfo> getDetailInfo() {
        return DetailInfo;
    }

    public void setDetailInfo(List<DetailInfo> detailInfo) {
        DetailInfo = detailInfo;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "InvoiceInfo[账单信息]{" +
        return "{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + PatientName + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + InvoiceNo + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + InAttribute + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + InvoiceKind + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + InvoiceType + '\"' + ",\n" +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + DateUtils.format(BillDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + DateUtils.format(InStartDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + DateUtils.format(InEndDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(8) + "\"" + ":\"" + InstitutionType + '\"' + ",\n" +
                "\"" + descriptionList.get(9) + "\"" + ":\"" + InstitutionCode + '\"' + ",\n" +
                "\"" + descriptionList.get(10) + "\"" + ":\"" + Departments + '\"' + ",\n" +
                "\"" + descriptionList.get(11) + "\"" + ":\"" + SumAmount + '\"' + ",\n" +
                "\"" + descriptionList.get(12) + "\"" + ":\"" + InRiskCode + '\"' + ",\n" +
                "\"" + descriptionList.get(13) + "\"" + ":\"" + InGetDutyCode + '\"' + ",\n" +
                "\"" + descriptionList.get(14) + "\"" + ":\"" + CnName + '\"' + ",\n" +
                "\"" + descriptionList.get(15) + "\"" + ":\"" + EnName + '\"' + ",\n" +
                "\"" + descriptionList.get(16) + "\"" + ":\"" + SorgType + '\"' + ",\n" +
                "\"" + descriptionList.get(17) + "\"" + ":\"" + SorgProperty + '\"' + ",\n" +
                "\"" + descriptionList.get(18) + "\"" + ":\"" + MedicalType + '\"' + ",\n" +
                "\"" + descriptionList.get(19) + "\"" + ":\"" + MedicalLevel + '\"' + ",\n" +
                "\"" + descriptionList.get(20) + "\"" + ":\"" + IsSocialSecurity + '\"' + ",\n" +
                "\"" + descriptionList.get(21) + "\"" + ":\"" + IsPayment + '\"' + ",\n" +
                "\"" + descriptionList.get(22) + "\"" + ":\"" + PaymentMode + '\"' + ",\n" +
                "\"" + descriptionList.get(23) + "\"" + ":\"" + PaymentType + '\"' + ",\n" +
                "\"" + descriptionList.get(24) + "\"" + ":\"" + IsExpensive + '\"' + ",\n" +
                "\"" + descriptionList.get(25) + "\"" + ":\"" + Continent + '\"' + ",\n" +
                "\"" + descriptionList.get(26) + "\"" + ":\"" + Area + '\"' + ",\n" +
                "\"" + descriptionList.get(27) + "\"" + ":\"" + Province + '\"' + ",\n" +
                "\"" + descriptionList.get(28) + "\"" + ":\"" + City + '\"' + ",\n" +
                "\"" + descriptionList.get(29) + "\"" + ":\"" + County + '\"' + ",\n" +
                "\"" + descriptionList.get(30) + "\"" + ":\"" + Town + '\"' + ",\n" +
                "\"" + descriptionList.get(31) + "\"" + ":\"" + DetailedAddress + '\"' + ",\n" +
                "\"" + descriptionList.get(32) + "\"" + ":\"" + MedicalReceiptType + '\"' + ",\n" +
                "\"" + descriptionList.get(33) + "\"" + ":\"" + BillingCountry + '\"' + ",\n" +
                "\"" + descriptionList.get(34) + "\"" + ":\"" + BillingProvince + '\"' + ",\n" +
                "\"" + descriptionList.get(35) + "\"" + ":" + DetailInfo + "\n}";

    }
}
