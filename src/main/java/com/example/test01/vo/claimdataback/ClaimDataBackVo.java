package com.example.test01.vo.claimdataback;

import com.alibaba.fastjson2.util.DateUtils;
import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.Date;
import java.util.List;

/**
 * [模块名] ClaimDataBackVo  [功能描述] 理赔信息回传接口
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 23:36
 */
public class ClaimDataBackVo {
    @Description(value = "TPA公司")
    private String TPACompany;

    @Description(value = "UUID")
    private String UUID;

    @Description(value = "标识符")
    private String TransrNo;

    @Description(value = "复联案件号")
    private String CaseNo;

    @Description(value = "服务类型（01-全流程,02-半流程）")
    private String ServiceType;

    @Description(value = "保单号")
    private String ContNo;

    @Description(value = "报案人与被保险人的关系")
    private String RptRelation;

    @Description(value = "报案方式")
    private String RptMode;

    @Description(value = "报案人姓名")
    private String RptorName;

    @Description(value = "报案人的证件类型")
    private String RptorIdType;

    @Description(value = "报案人的证件号码")
    private String RptorIdno;

    @Description(value = "报案人性别")
    private String RptorSex;

    @Description(value = "出险人姓名")
    private String IName;

    @Description(value = "出险人性别（0-男,1-女）")
    private String ISex;

    @Description(value = "出险人出生日期（格式：yyyy-MM-dd）")
    private Date IBirthday;

    @Description(value = "出险人证件类型")
    private String IIdType;

    @Description(value = "出险人证件号")
    private String IIdNo;

    @Description(value = "申请日期（格式：yyyy-MM-dd）")
    private Date ApplyDate;

    @Description(value = "申请人与被保人关系")
    private String ApplyRelation;

    @Description(value = "申请人姓名")
    private String AName;

    @Description(value = "申请人性别")
    private String ASex;

    @Description(value = "申请人证件类型")
    private String AIdType;

    @Description(value = "申请人证件号")
    private String AIdNo;

    @Description(value = "申请人手机号")
    private String AMoblie;

    @Description(value = "受理方式")
    private String RgtType;

    @Description(value = "预估赔付总金额")
    private String RgtTotalMoney;

    @Description(value = "材料收到日期（格式：yyyy-MM-dd）")
    private Date MaterialRecvDate;

    @Description(value = "发票数量")
    private String InvoiceNum;

    @Description(value = "事故者现状")
    private String Custsituation;

    @Description(value = "死亡日期（格式：yyyy-MM-dd）")
    private Date DieDate;

    @Description(value = "出险事故描述")
    private String AccDescription;

    @Description(value = "索赔险种集合")
    private List<ClaimRisk> ClaimRiskList;

    @Description(value = "理赔类型集合")
    private List<ClaimType> ClaimTypeList;

    @Description(value = "关联原案件号")
    private String OldCaseNo;

    @Description(value = "理赔结论")
    private String ClaimConclusion;

    @Description(value = "不予立案原因")
    private String NoRgtReason;

    @Description(value = "不予立案原因描述")
    private String NoRgtDescribe;

    @Description(value = "审核意见")
    private String Audit;

    @Description(value = "备注")
    private String Remarks;

    @Description(value = "受益人信息集合")
    private List<BnfInfo> BnfInfo;

    @Description(value = "事件信息集合")
    private List<EventInfos> EventInfos;

    public String getTPACompany() {
        return TPACompany;
    }

    public void setTPACompany(String TPACompany) {
        this.TPACompany = TPACompany;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getTransrNo() {
        return TransrNo;
    }

    public void setTransrNo(String transrNo) {
        TransrNo = transrNo;
    }

    public String getCaseNo() {
        return CaseNo;
    }

    public void setCaseNo(String caseNo) {
        CaseNo = caseNo;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }

    public String getContNo() {
        return ContNo;
    }

    public void setContNo(String contNo) {
        ContNo = contNo;
    }

    public String getRptRelation() {
        return RptRelation;
    }

    public void setRptRelation(String rptRelation) {
        RptRelation = rptRelation;
    }

    public String getRptMode() {
        return RptMode;
    }

    public void setRptMode(String rptMode) {
        RptMode = rptMode;
    }

    public String getRptorName() {
        return RptorName;
    }

    public void setRptorName(String rptorName) {
        RptorName = rptorName;
    }

    public String getRptorIdType() {
        return RptorIdType;
    }

    public void setRptorIdType(String rptorIdType) {
        RptorIdType = rptorIdType;
    }

    public String getRptorIdno() {
        return RptorIdno;
    }

    public void setRptorIdno(String rptorIdno) {
        RptorIdno = rptorIdno;
    }

    public String getRptorSex() {
        return RptorSex;
    }

    public void setRptorSex(String rptorSex) {
        RptorSex = rptorSex;
    }

    public String getIName() {
        return IName;
    }

    public void setIName(String IName) {
        this.IName = IName;
    }

    public String getISex() {
        return ISex;
    }

    public void setISex(String ISex) {
        this.ISex = ISex;
    }

    public Date getIBirthday() {
        return IBirthday;
    }

    public void setIBirthday(Date IBirthday) {
        this.IBirthday = IBirthday;
    }

    public String getIIdType() {
        return IIdType;
    }

    public void setIIdType(String IIdType) {
        this.IIdType = IIdType;
    }

    public String getIIdNo() {
        return IIdNo;
    }

    public void setIIdNo(String IIdNo) {
        this.IIdNo = IIdNo;
    }

    public Date getApplyDate() {
        return ApplyDate;
    }

    public void setApplyDate(Date applyDate) {
        ApplyDate = applyDate;
    }

    public String getApplyRelation() {
        return ApplyRelation;
    }

    public void setApplyRelation(String applyRelation) {
        ApplyRelation = applyRelation;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    public String getASex() {
        return ASex;
    }

    public void setASex(String ASex) {
        this.ASex = ASex;
    }

    public String getAIdType() {
        return AIdType;
    }

    public void setAIdType(String AIdType) {
        this.AIdType = AIdType;
    }

    public String getAIdNo() {
        return AIdNo;
    }

    public void setAIdNo(String AIdNo) {
        this.AIdNo = AIdNo;
    }

    public String getAMoblie() {
        return AMoblie;
    }

    public void setAMoblie(String AMoblie) {
        this.AMoblie = AMoblie;
    }

    public String getRgtType() {
        return RgtType;
    }

    public void setRgtType(String rgtType) {
        RgtType = rgtType;
    }

    public String getRgtTotalMoney() {
        return RgtTotalMoney;
    }

    public void setRgtTotalMoney(String rgtTotalMoney) {
        RgtTotalMoney = rgtTotalMoney;
    }

    public Date getMaterialRecvDate() {
        return MaterialRecvDate;
    }

    public void setMaterialRecvDate(Date materialRecvDate) {
        MaterialRecvDate = materialRecvDate;
    }

    public String getInvoiceNum() {
        return InvoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        InvoiceNum = invoiceNum;
    }

    public String getCustsituation() {
        return Custsituation;
    }

    public void setCustsituation(String custsituation) {
        Custsituation = custsituation;
    }

    public Date getDieDate() {
        return DieDate;
    }

    public void setDieDate(Date dieDate) {
        DieDate = dieDate;
    }

    public String getAccDescription() {
        return AccDescription;
    }

    public void setAccDescription(String accDescription) {
        AccDescription = accDescription;
    }

    public List<ClaimRisk> getClaimRiskList() {
        return ClaimRiskList;
    }

    public void setClaimRiskList(List<ClaimRisk> claimRiskList) {
        ClaimRiskList = claimRiskList;
    }

    public List<ClaimType> getClaimTypeList() {
        return ClaimTypeList;
    }

    public void setClaimTypeList(List<ClaimType> claimTypeList) {
        ClaimTypeList = claimTypeList;
    }

    public String getOldCaseNo() {
        return OldCaseNo;
    }

    public void setOldCaseNo(String oldCaseNo) {
        OldCaseNo = oldCaseNo;
    }

    public String getClaimConclusion() {
        return ClaimConclusion;
    }

    public void setClaimConclusion(String claimConclusion) {
        ClaimConclusion = claimConclusion;
    }

    public String getNoRgtReason() {
        return NoRgtReason;
    }

    public void setNoRgtReason(String noRgtReason) {
        NoRgtReason = noRgtReason;
    }

    public String getNoRgtDescribe() {
        return NoRgtDescribe;
    }

    public void setNoRgtDescribe(String noRgtDescribe) {
        NoRgtDescribe = noRgtDescribe;
    }

    public String getAudit() {
        return Audit;
    }

    public void setAudit(String audit) {
        Audit = audit;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public List<BnfInfo> getBnfInfo() {
        return BnfInfo;
    }

    public void setBnfInfo(List<BnfInfo> bnfInfo) {
        BnfInfo = bnfInfo;
    }

    public List<EventInfos> getEventInfos() {
        return EventInfos;
    }

    public void setEventInfos(List<EventInfos> eventInfos) {
        EventInfos = eventInfos;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "ClaimDataBackVo[理赔信息回传接口]{" +
        return "{\n" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + TPACompany + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + UUID + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + TransrNo + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + CaseNo + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + ServiceType + '\"' + ",\n" +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + ContNo + '\"' + ",\n" +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + RptRelation + '\"' + ",\n" +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + RptMode + '\"' + ",\n" +
                "\"" + descriptionList.get(8) + "\"" + ":\"" + RptorName + '\"' + ",\n" +
                "\"" + descriptionList.get(9) + "\"" + ":\"" + RptorIdType + '\"' + ",\n" +
                "\"" + descriptionList.get(10) + "\"" + ":\"" + RptorIdno + '\"' + ",\n" +
                "\"" + descriptionList.get(11) + "\"" + ":\"" + RptorSex + '\"' + ",\n" +
                "\"" + descriptionList.get(12) + "\"" + ":\"" + IName + '\"' + ",\n" +
                "\"" + descriptionList.get(13) + "\"" + ":\"" + ISex + '\"' + ",\n" +
                "\"" + descriptionList.get(14) + "\"" + ":\"" + DateUtils.format(IBirthday,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(15) + "\"" + ":\"" + IIdType + '\"' + ",\n" +
                "\"" + descriptionList.get(16) + "\"" + ":\"" + IIdNo + '\"' + ",\n" +
                "\"" + descriptionList.get(17) + "\"" + ":\"" + DateUtils.format(ApplyDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(18) + "\"" + ":\"" + ApplyRelation + '\"' + ",\n" +
                "\"" + descriptionList.get(19) + "\"" + ":\"" + AName + '\"' + ",\n" +
                "\"" + descriptionList.get(20) + "\"" + ":\"" + ASex + '\"' + ",\n" +
                "\"" + descriptionList.get(21) + "\"" + ":\"" + AIdType + '\"' + ",\n" +
                "\"" + descriptionList.get(22) + "\"" + ":\"" + AIdNo + '\"' + ",\n" +
                "\"" + descriptionList.get(23) + "\"" + ":\"" + AMoblie + '\"' + ",\n" +
                "\"" + descriptionList.get(24) + "\"" + ":\"" + RgtType + '\"' + ",\n" +
                "\"" + descriptionList.get(25) + "\"" + ":\"" + RgtTotalMoney + '\"' + ",\n" +
                "\"" + descriptionList.get(26) + "\"" + ":\"" + DateUtils.format(MaterialRecvDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(27) + "\"" + ":\"" + InvoiceNum + '\"' + ",\n" +
                "\"" + descriptionList.get(28) + "\"" + ":\"" + Custsituation + '\"' + ",\n" +
                "\"" + descriptionList.get(29) + "\"" + ":\"" + DateUtils.format(DieDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(30) + "\"" + ":\"" + AccDescription + '\"' + ",\n" +
                "\"" + descriptionList.get(31) + "\"" + ":" + ClaimRiskList + ",\n" +
                "\"" + descriptionList.get(32) + "\"" + ":" + ClaimTypeList + ",\n" +
                "\"" + descriptionList.get(33) + "\"" + ":\"" + OldCaseNo + '\"' + ",\n" +
                "\"" + descriptionList.get(34) + "\"" + ":\"" + ClaimConclusion + '\"' + ",\n" +
                "\"" + descriptionList.get(35) + "\"" + ":\"" + NoRgtReason + '\"' + ",\n" +
                "\"" + descriptionList.get(36) + "\"" + ":\"" + NoRgtDescribe + '\"' + ",\n" +
                "\"" + descriptionList.get(37) + "\"" + ":\"" + Audit + '\"' + ",\n" +
                "\"" + descriptionList.get(38) + "\"" + ":\"" + Remarks + '\"' + ",\n" +
                "\"" + descriptionList.get(39) + "\"" + ":" + BnfInfo + ",\n" +
                "\"" + descriptionList.get(40) + "\"" + ":" + EventInfos + "\n}";

    }
}
