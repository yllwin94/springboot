package com.example.test01.vo.claimdataback;

import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.List;

/**
 * [模块名] FullDetailsInfo  [功能描述] 全明细信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 17:25
 */
public class FullDetailsInfo {

    @Description(value = "诊疗名称")
    private String DiagnosisName;

    @Description(value = "明细金额")
    private String DetailAmount;

    @Description(value = "医保类型")
    private String MedicalType;

    @Description(value = "自付比例")
    private String SelfRatio;

    @Description(value = "自付金额")
    private String SelfAmount;

    @Description(value = "自费金额")
    private String SelfPay;

    @Description(value = "剂量")
    private int Dose;

    @Description(value = "规格")
    private String SpeciFications;

    public String getDiagnosisName() {
        return DiagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        DiagnosisName = diagnosisName;
    }

    public String getDetailAmount() {
        return DetailAmount;
    }

    public void setDetailAmount(String detailAmount) {
        DetailAmount = detailAmount;
    }

    public String getMedicalType() {
        return MedicalType;
    }

    public void setMedicalType(String medicalType) {
        MedicalType = medicalType;
    }

    public String getSelfRatio() {
        return SelfRatio;
    }

    public void setSelfRatio(String selfRatio) {
        SelfRatio = selfRatio;
    }

    public String getSelfAmount() {
        return SelfAmount;
    }

    public void setSelfAmount(String selfAmount) {
        SelfAmount = selfAmount;
    }

    public String getSelfPay() {
        return SelfPay;
    }

    public void setSelfPay(String selfPay) {
        SelfPay = selfPay;
    }

    public int getDose() {
        return Dose;
    }

    public void setDose(int dose) {
        Dose = dose;
    }

    public String getSpeciFications() {
        return SpeciFications;
    }

    public void setSpeciFications(String speciFications) {
        SpeciFications = speciFications;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "FullDetailsInfo[全明细信息]{" +
        return "\n\t{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + DiagnosisName + '\"' + "," +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + DetailAmount + '\"' + "," +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + MedicalType + '\"' + "," +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + SelfRatio + '\"' + "," +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + SelfAmount + '\"' + "," +
                "\"" + descriptionList.get(5) + "\"" + ":\"" + SelfPay + '\"' + "," +
                "\"" + descriptionList.get(6) + "\"" + ":\"" + Dose + '\"' + "," +
                "\"" + descriptionList.get(7) + "\"" + ":\"" + SpeciFications + '\"' + "}";

    }

}
