package com.example.test01.vo.claimdataback;

import com.alibaba.fastjson2.util.DateUtils;
import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.Date;

/**
 * [模块名] BnfInfo  [功能描述] 受益人信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 23:15
 */
public class BnfInfo {
    @Description(value = "受益人与出险人关系")
    private String BRelation;

    @Description(value = "受益人姓名")
    private String BName;

    @Description(value = "受益人性别")
    private String BSex;

    @Description(value = "受益人出生日期（格式：yyyy-MM-dd）")
    private Date BBirthday;

    @Description(value = "受益人证件类型")
    private String BIdType;

    @Description(value = "受益人证件号")
    private String BIdNo;

    @Description(value = "受益人类型")
    private String BType;

    @Description(value = "受益人手机号")
    private String Phone;

    @Description(value = "受益人分配类型")
    private String BnfAllotType;

    @Description(value = "受益比例/金额")
    private String PayeeRatio;

    @Description(value = "受益人职业")
    private String BnfJob;

    @Description(value = "国籍")
    private String Nationality;

    @Description(value = "联系地址")
    private String ContactAddress;

    @Description(value = "税收居民类型")
    private String TaxRevenueType;

    @Description(value = "证件有效止期（格式：yyyy-MM-dd）")
    private Date ValCer;

    @Description(value = "领款人与受益人关系")
    private String PayeeRelation;

    @Description(value = "领款人属性")
    private String Attribute;

    @Description(value = "领款人姓名")
    private String PayeeName;

    @Description(value = "领款人性别")
    private String PayeeSex;

    @Description(value = "领款人出生日期（格式：yyyy-MM-dd）")
    private Date PayeeBirthday;

    @Description(value = "领款人证件类型")
    private String PayeeIdType;

    @Description(value = "领款人证件号")
    private String PayeeIdNo;

    @Description(value = "领款人手机号")
    private String PayeeMobile;

    @Description(value = "联系人")
    private String Contacts;

    @Description(value = "领款人证件有效期起期（格式：yyyy-MM-dd）")
    private Date IDValStrat;

    @Description(value = "领款人证件有效期止期（格式：yyyy-MM-dd）")
    private Date IDValEnd;

    @Description(value = "领款人国家")
    private String PayeeCountry;

    @Description(value = "领款人省")
    private String PayeeProvince;

    @Description(value = "领款人市")
    private String PayeeCity;

    @Description(value = "领款人区")
    private String PayeeArea;

    @Description(value = "领款人详细地址")
    private String IDAddress;

    @Description(value = "银行代码")
    private String BankCode;

    @Description(value = "银行帐户名")
    private String AccName;

    @Description(value = "银行账号")
    private String AccNo;

    @Description(value = "账户属性（00-对公、01-对私）")
    private String AccAttribute;

    @Description(value = "开户行所在省")
    private String OpBankProvince;

    @Description(value = "开户行所在市")
    private String OpBankCity;

    public String getBRelation() {
        return BRelation;
    }

    public void setBRelation(String BRelation) {
        this.BRelation = BRelation;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public String getBSex() {
        return BSex;
    }

    public void setBSex(String BSex) {
        this.BSex = BSex;
    }

    public Date getBBirthday() {
        return BBirthday;
    }

    public void setBBirthday(Date BBirthday) {
        this.BBirthday = BBirthday;
    }

    public String getBIdType() {
        return BIdType;
    }

    public void setBIdType(String BIdType) {
        this.BIdType = BIdType;
    }

    public String getBIdNo() {
        return BIdNo;
    }

    public void setBIdNo(String BIdNo) {
        this.BIdNo = BIdNo;
    }

    public String getBType() {
        return BType;
    }

    public void setBType(String BType) {
        this.BType = BType;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getBnfAllotType() {
        return BnfAllotType;
    }

    public void setBnfAllotType(String bnfAllotType) {
        BnfAllotType = bnfAllotType;
    }

    public String getPayeeRatio() {
        return PayeeRatio;
    }

    public void setPayeeRatio(String payeeRatio) {
        PayeeRatio = payeeRatio;
    }

    public String getBnfJob() {
        return BnfJob;
    }

    public void setBnfJob(String bnfJob) {
        BnfJob = bnfJob;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getContactAddress() {
        return ContactAddress;
    }

    public void setContactAddress(String contactAddress) {
        ContactAddress = contactAddress;
    }

    public String getTaxRevenueType() {
        return TaxRevenueType;
    }

    public void setTaxRevenueType(String taxRevenueType) {
        TaxRevenueType = taxRevenueType;
    }

    public Date getValCer() {
        return ValCer;
    }

    public void setValCer(Date valCer) {
        ValCer = valCer;
    }

    public String getPayeeRelation() {
        return PayeeRelation;
    }

    public void setPayeeRelation(String payeeRelation) {
        PayeeRelation = payeeRelation;
    }

    public String getAttribute() {
        return Attribute;
    }

    public void setAttribute(String attribute) {
        Attribute = attribute;
    }

    public String getPayeeName() {
        return PayeeName;
    }

    public void setPayeeName(String payeeName) {
        PayeeName = payeeName;
    }

    public String getPayeeSex() {
        return PayeeSex;
    }

    public void setPayeeSex(String payeeSex) {
        PayeeSex = payeeSex;
    }

    public Date getPayeeBirthday() {
        return PayeeBirthday;
    }

    public void setPayeeBirthday(Date payeeBirthday) {
        PayeeBirthday = payeeBirthday;
    }

    public String getPayeeIdType() {
        return PayeeIdType;
    }

    public void setPayeeIdType(String payeeIdType) {
        PayeeIdType = payeeIdType;
    }

    public String getPayeeIdNo() {
        return PayeeIdNo;
    }

    public void setPayeeIdNo(String payeeIdNo) {
        PayeeIdNo = payeeIdNo;
    }

    public String getPayeeMobile() {
        return PayeeMobile;
    }

    public void setPayeeMobile(String payeeMobile) {
        PayeeMobile = payeeMobile;
    }

    public String getContacts() {
        return Contacts;
    }

    public void setContacts(String contacts) {
        Contacts = contacts;
    }

    public Date getIDValStrat() {
        return IDValStrat;
    }

    public void setIDValStrat(Date IDValStrat) {
        this.IDValStrat = IDValStrat;
    }

    public Date getIDValEnd() {
        return IDValEnd;
    }

    public void setIDValEnd(Date IDValEnd) {
        this.IDValEnd = IDValEnd;
    }

    public String getPayeeCountry() {
        return PayeeCountry;
    }

    public void setPayeeCountry(String payeeCountry) {
        PayeeCountry = payeeCountry;
    }

    public String getPayeeProvince() {
        return PayeeProvince;
    }

    public void setPayeeProvince(String payeeProvince) {
        PayeeProvince = payeeProvince;
    }

    public String getPayeeCity() {
        return PayeeCity;
    }

    public void setPayeeCity(String payeeCity) {
        PayeeCity = payeeCity;
    }

    public String getPayeeArea() {
        return PayeeArea;
    }

    public void setPayeeArea(String payeeArea) {
        PayeeArea = payeeArea;
    }

    public String getIDAddress() {
        return IDAddress;
    }

    public void setIDAddress(String IDAddress) {
        this.IDAddress = IDAddress;
    }

    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String accName) {
        AccName = accName;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }

    public String getAccAttribute() {
        return AccAttribute;
    }

    public void setAccAttribute(String accAttribute) {
        AccAttribute = accAttribute;
    }

    public String getOpBankProvince() {
        return OpBankProvince;
    }

    public void setOpBankProvince(String opBankProvince) {
        OpBankProvince = opBankProvince;
    }

    public String getOpBankCity() {
        return OpBankCity;
    }

    public void setOpBankCity(String opBankCity) {
        OpBankCity = opBankCity;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "BnfInfo[受益人信息]{" +
        return "\n{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + BRelation + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + BName + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + BSex + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + BBirthday + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + BIdType + '\"' + ",\n" +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + BIdNo + '\"' + ",\n" +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + BType + '\"' + ",\n" +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + Phone + '\"' + ",\n" +
                "\"" + descriptionList.get(8) + "\"" + ":\"" + BnfAllotType + '\"' + ",\n" +
                "\"" + descriptionList.get(9) + "\"" + ":\"" + PayeeRatio + '\"' + ",\n" +
                "\"" + descriptionList.get(10) + "\"" + ":\"" + BnfJob + '\"' + ",\n" +
                "\"" + descriptionList.get(11) + "\"" + ":\"" + Nationality + '\"' + ",\n" +
                "\"" + descriptionList.get(12) + "\"" + ":\"" + ContactAddress + '\"' + ",\n" +
                "\"" + descriptionList.get(13) + "\"" + ":\"" + TaxRevenueType + '\"' + ",\n" +
                "\"" + descriptionList.get(14) + "\"" + ":\"" + ValCer + '\"' + ",\n" +
                "\"" + descriptionList.get(15) + "\"" + ":\"" + PayeeRelation + '\"' + ",\n" +
                "\"" + descriptionList.get(16) + "\"" + ":\"" + Attribute + '\"' + ",\n" +
                "\"" + descriptionList.get(17) + "\"" + ":\"" + PayeeName + '\"' + ",\n" +
                "\"" + descriptionList.get(18) + "\"" + ":\"" + PayeeSex + '\"' + ",\n" +
                "\"" + descriptionList.get(19) + "\"" + ":\"" + DateUtils.format(PayeeBirthday,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(20) + "\"" + ":\"" + PayeeIdType + '\"' + ",\n" +
                "\"" + descriptionList.get(21) + "\"" + ":\"" + PayeeIdNo + '\"' + ",\n" +
                "\"" + descriptionList.get(22) + "\"" + ":\"" + PayeeMobile + '\"' + ",\n" +
                "\"" + descriptionList.get(23) + "\"" + ":\"" + Contacts + '\"' + ",\n" +
                "\"" + descriptionList.get(24) + "\"" + ":\"" + DateUtils.format(IDValStrat,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(25) + "\"" + ":\"" + DateUtils.format(IDValEnd,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(26) + "\"" + ":\"" + PayeeCountry + '\"' + ",\n" +
                "\"" + descriptionList.get(27) + "\"" + ":\"" + PayeeProvince + '\"' + ",\n" +
                "\"" + descriptionList.get(28) + "\"" + ":\"" + PayeeCity + '\"' + ",\n" +
                "\"" + descriptionList.get(29) + "\"" + ":\"" + PayeeArea + '\"' + ",\n" +
                "\"" + descriptionList.get(30) + "\"" + ":\"" + IDAddress + '\"' + ",\n" +
                "\"" + descriptionList.get(31) + "\"" + ":\"" + BankCode + '\"' + ",\n" +
                "\"" + descriptionList.get(32) + "\"" + ":\"" + AccName + '\"' + ",\n" +
                "\"" + descriptionList.get(33) + "\"" + ":\"" + AccNo + '\"' + ",\n" +
                "\"" + descriptionList.get(34) + "\"" + ":\"" + AccAttribute + '\"' + ",\n" +
                "\"" + descriptionList.get(35) + "\"" + ":\"" + OpBankProvince + '\"' + ",\n" +
                "\"" + descriptionList.get(36) + "\"" + ":\"" + OpBankCity + '\"' + "\n}";
    }
}
