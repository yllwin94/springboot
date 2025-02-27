package com.example.test01.vo.claimdataback;

import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.List;

/**
 * [模块名] ClaimRiskList  [功能描述] 索赔险种集合
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 23:02
 */
public class ClaimRisk {
    @Description(value = "险种编码")
    private String RiskCode;

    @Description(value = "报案金额")
    private String RgtaMount;

    public String getRiskCode() {
        return RiskCode;
    }

    public void setRiskCode(String riskCode) {
        RiskCode = riskCode;
    }

    public String getRgtaMount() {
        return RgtaMount;
    }

    public void setRgtaMount(String rgtaMount) {
        RgtaMount = rgtaMount;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "ClaimRisk[索赔险种]{" +
        return "\n\t{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + RiskCode + '\"' + "," +
                "\"" + descriptionList.get(1) + "\"" + ":\"" + RgtaMount + '\"' + "}";

    }

}
