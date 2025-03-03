package com.example.test01.hm;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author ：lily.Yin
 * @since ：2025/2/28 10:57
 */
public class ListTest {

    public static void main(String[] args) {
        String policyNo = "   ";
        // JSON 字符串
        String jsonString = "{\"personPolicyInfo\": [{\"policyNos\": \"123312313\"},{\"policyNos\": \"vbxzbvsb\"}]}";

        // 解析 JSON 字符串
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取 personPolicyInfo 数组
        JSONArray personPolicyInfoArray = jsonObject.getJSONArray("personPolicyInfo");
//        List<String> result = new ArrayList<>();
        Set<String> result = new HashSet<>();
        if (personPolicyInfoArray != null) {
            // 使用 Stream 处理
            result = (Set<String>) StreamSupport.stream(personPolicyInfoArray.spliterator(), false)
                    .map(obj -> {
                        if (obj instanceof JSONObject) {
                            return ((JSONObject) obj).getString("policyNo"); // 提取 policyNo
                        }
                        return "";
                    })
                    .collect(Collectors.toSet()); // 以逗号分隔拼接
            result.add(StringUtils.isNotBlank(policyNo) ? policyNo.trim() : null);
            result.remove(null);
        }
        System.out.println(String.join(",", result));
    }
}
