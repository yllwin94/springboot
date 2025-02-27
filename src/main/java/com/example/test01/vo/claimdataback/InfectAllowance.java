package com.example.test01.vo.claimdataback;

import com.alibaba.fastjson2.util.DateUtils;
import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.Date;
import java.util.List;

/**
 * [模块名] InfectAllowanceList  [功能描述] 传染病隔离津贴信息集合
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 22:36
 */
public class InfectAllowance {

    @Description(value = "险种编码")
    private String RiskCode;

    @Description(value = "隔离人姓名")
    private String DivideName;

    @Description(value = "隔离开始日期（格式：yyyy-MM-dd）")
    private Date DivideStartDate;

    @Description(value = "隔离结束日期（格式：yyyy-MM-dd）")
    private Date DivideEndDate;

    @Description(value = "隔离天数")
    private String DivideDays;

    public String getRiskCode() {
        return RiskCode;
    }

    public void setRiskCode(String riskCode) {
        RiskCode = riskCode;
    }

    public String getDivideName() {
        return DivideName;
    }

    public void setDivideName(String divideName) {
        DivideName = divideName;
    }

    public Date getDivideStartDate() {
        return DivideStartDate;
    }

    public void setDivideStartDate(Date divideStartDate) {
        DivideStartDate = divideStartDate;
    }

    public Date getDivideEndDate() {
        return DivideEndDate;
    }

    public void setDivideEndDate(Date divideEndDate) {
        DivideEndDate = divideEndDate;
    }

    public String getDivideDays() {
        return DivideDays;
    }

    public void setDivideDays(String divideDays) {
        DivideDays = divideDays;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "InfectAllowance[传染病隔离津贴信息]{" +
        return "{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + RiskCode + '\"' + ",\n" +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + DivideName + '\"' + ",\n" +
                "\"" + descriptionList.get(2) + "\"" + ":\"" + DateUtils.format(DivideStartDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(3) + "\"" + ":\"" + DateUtils.format(DivideEndDate,"yyyy-MM-dd") + '\"' + ",\n" +
                "\"" + descriptionList.get(4) + "\"" + ":\"" + DivideDays + '\"' + "\n}";
    }
}
