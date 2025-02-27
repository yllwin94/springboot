package com.example.test01.vo.claimdataback;

import com.example.test01.annotation.Description;
import com.example.test01.processor.AnnotationProcessor;
import lombok.val;

import java.util.List;

/**
 * [模块名] ClaimTypeList  [功能描述] 理赔类型集合
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/2/12 22:59
 */
public class ClaimType {
    @Description(value = "理赔类型")
    private String ClaimType;

    public String getClaimType() {
        return ClaimType;
    }

    public void setClaimType(String claimType) {
        ClaimType = claimType;
    }

    @Override
    public String toString() {
        val descriptionList = AnnotationProcessor.getDescription(getClass());
//        return "ClaimType[理赔类型]{" +
        return "\n\t{" +
                "\"" + descriptionList.get(0) + "\"" + ":\"" + ClaimType + '\"' + "}";

    }
}
