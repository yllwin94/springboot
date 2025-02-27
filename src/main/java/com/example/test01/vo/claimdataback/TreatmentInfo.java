package com.example.test01.vo.claimdataback;

import com.alibaba.fastjson2.util.DateUtils;
import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.Date;
import java.util.List;

/**
 * [模块名] TreatmentInfo  [功能描述] 诊疗信息
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 21:54
 */
public class TreatmentInfo {

    @Description(value = "诊疗类型")
    private String TreatmentType;

    @Description(value = "诊疗代码")
    private String TreatmentCode;

    @Description(value = "确诊医院代码")
    private String HospitalCode;

    @Description(value = "确诊日期（格式：yyyy-MM-dd）")
    private Date ConfirmedDate;

    @Description(value = "鉴定日期（格式：yyyy-MM-dd）")
    private Date IdentificationDate;

    public String getTreatmentType() {
        return TreatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        TreatmentType = treatmentType;
    }

    public String getTreatmentCode() {
        return TreatmentCode;
    }

    public void setTreatmentCode(String treatmentCode) {
        TreatmentCode = treatmentCode;
    }

    public String getHospitalCode() {
        return HospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        HospitalCode = hospitalCode;
    }

    public Date getConfirmedDate() {
        return ConfirmedDate;
    }

    public void setConfirmedDate(Date confirmedDate) {
        ConfirmedDate = confirmedDate;
    }

    public Date getIdentificationDate() {
        return IdentificationDate;
    }

    public void setIdentificationDate(Date identificationDate) {
        IdentificationDate = identificationDate;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "TreatmentInfo[诊疗信息]{" +
        return "\n\t{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + TreatmentType + '\"' + "," +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + TreatmentCode + '\"' + "," +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + HospitalCode + '\"' + "," +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + DateUtils.format(ConfirmedDate,"yyyy-MM-dd") + '\"' + "," +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + DateUtils.format(IdentificationDate,"yyyy-MM-dd") + '\"' + "}";

    }
}
