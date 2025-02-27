package com.example.test01.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lily.Yin
 * @date 2025/1/6 14:27
 * @description
 */
public class RedisTest {
    private final static Logger logger = LoggerFactory.getLogger(RedisTest.class);

    private final static String AES_PASSWORD = "FOSUN2016";
    private final static String Channel = "KD";
    private final static String JSON_PACKETS_ARE_INTERCONNECTED = "https://sit-impthirdfuis.fosun-uhi.com/third/forwardRequestApi/forwardRequest";
    private final static String FL_REGISTER_TRANS_NO = "View0000025UAT";
    private final static String FL_REGISTER_BUSINESS_TYPE = "fosun-contract";


//    public void pushValue() {
//        Set<String> set = new HashSet<>();
//        set.add("9329000000064210");
//        set.add("9329000000064389");
//        Jedis jedis = new Jedis("localhost", 6379);
//        jedis.auth("123");
//        //添加一个字符串数据
//        jedis.set("dg-fl_policy_dict_data", String.valueOf(set));
//        //添加一个hash表
//        jedis.hset("dg-fl_policy_dict_data_hash", "policyNo", "9329000000064210");
//        //添加一个列表
//        jedis.rpush("dg-fl_policy_dict_data_list", "9329000000064210", "9329000000064389");
//        //添加一个集合
//        jedis.sadd("dg-fl_policy_dict_data_set", "9329000000064210", "9329000000064389");
//        //添加一个有序集合
//        jedis.zadd("dg-fl_policy_dict_data_zset", 1, "9329000000064210");
//        jedis.zadd("dg-fl_policy_dict_data_zset", 2, "9329000000064389");
//        jedis.close();
//    }
//
//    public static void main(String[] args) throws Exception {
////        extracted();
//        String a = "yrT54O6lQsnUwMd2npC4Oa4cntmbF9eFVBPJ474O3kOHPsl+JnsxmkPuLboM/nfagCETEtlIkE9j\n" +
//                "yKRylkQBILu70EVhAPXPiFOmSOIyGBICUJZxIyRdNM1jatH/HZCHc+HjTszchwW9VUVsxCABGVMM\n" +
//                "znivsQTHWh//9n4I1wTkjgWVMNUtu9fVs9j3Glaxi6irNCEHLSVS2IIlF0dCbiF6qJDqec/7DJ6Y\n" +
//                "UfnyqyOmIYxYj0vWCL/tX7aqLr78YeInG3TQ3jRyIfmvvkMqbu5aWV2Y3hS2aiHMnBmnTHo=";
//        System.out.println(EncryptUtil.decrypt(a, AES_PASSWORD));
//
////        String view1 = "{\"head\": {\"transTime\": \"20250108095958685\",\"tranSource\": \"SHKD\",\"transNo\": \"View0000025UAT\",\"businessType\": \"fosun-contract\"},\"data\": \"lELGtLRBPR/bY1E2fCZGZL5xg8NokccrAwMrEyJOQtAx/tEgNfKEMFQkLQRlSoh/GtB8p1XajBib9Apq/LjPBlP2ZgOyLUrqZK736ohijsr20V5usvAq0S0xZmxYYQkrYqdEO898R2aI4Ja5zs1lulKYRp1oFJBFZvLaxMT/TL3VD3xDOAH0eUOZ39S5p2811vgCOxI9Cyz3hMgWrDaoI8a/ohzmx00wwlmGn5ECDwtRTYZiiGv1ABEQhymg88fyNno51D7kVTtTk96FIj8ZAJPbYQuvxhwxPWD70hORrB7ioQrXUNU0dANDTNBqYXNWUt6fCws/BoGm1JJOeO/yuMyjghK013put/GXEB9NebePZemrQuAOokn4YUNloNEbCKbQnpU3fOiE4ntEo52/TgzeqOqJ1APjf9SYFmbQcPHM3jZVDdsudbftiLCSwmJ2AReqIw3VhBTnr8OtgkhrfwqPRgar5xTvDnibX41bB5eI0lP4MxzjmxL6hTM9EXSjS40N8cANWqCDHmyE80OfY0dNpMuDcdkM4w87bqUx4x1l7iVLeysp9CapW6f41HmqRojSzSI1JsW7jIEu/xrwkmffCqv2WPtLy0IUUSFopaKuOYXJHChFrdibuiM8oA8TABDb5D8n5L3Y3RXbn/zj6gGCuxLQ7LI0UAqIE558u8vAuReiXF80XoWCf3LNrdWDaeKViF7MByXImm03IirOYtkGBk96eiAou5WuOILx8VW8Y0jjxkvCiT0Xo1dPvPYf4Mbi3nI8ScX/8ve/FT4jte3snh3xvavpNV/k1FyvqJi73gqIDY3n9iJHgk0Brtcl5Xgzn3IRVyLNsxtMBzjBu782qlsh5Rgcrn1ZEIxGghqJCIwR4i0driAcPANMO6rFqDVcLL59JQWZnW8EkkS0OJvrgrBoXvLQszTUtzkaIAMYl9yIQ1WVzZFuYI8UgGZBjTBnRlmrAHt12ahNl7Cm78625gF6tESjLn4xyViMYM0K3LkdDGnZ8gOhlIll1xtqIAvNcR/ksJohROQnLIzzOgBqfpPPGCG2/JglfSQj8jFOypw94K8J9Qv5Dri2Pj1sszYxcIrogrVGjLC5VDYhAGNnAYzeE38nQAbCpUjXn2Ey9B8rSb9gkM0EiuZTGvDV9UMB8xIif0iYgBa9muRfkrQS9sade/LahUqeFMdCmEtez57VRHYLmxs46NuIEkVhJK9eijHrDvfjib/iwSKKORFGjazrann2O7UJsaZZvpiBOwyqxG68nrfFOnaPB6vp/mDjvEh9WHsIi4dE9YlnHPs98MByPkvBHDWR4BYC6r86essjBMKzlAtew00AA9acpTWVyM0noddJ/XqR0PfFRlICotcjSyQtWmk0rLJohOvxMA848phRpL8poO6mWklATPvo156dbrr1SX2XVjFaZVj3nunjOz/BJR\"}";
//
////        String view = "{\"head\": {\"transTime\": \"20250108095958685\",\"tranSource\": \"SHKD\",\"transNo\": \"View0000025UAT\",\"businessType\": \"fosun-contract\"},\"data\": \"lELGtLRBPR/bY1E2fCZGZL5xg8NokccrAwMrEyJOQtAx/tEgNfKEMFQkLQRlSoh/GtB8p1XajBib9Apq/LjPBl+P2ZgOyLUrqZK7+36ohijsr20V5usvAq0S0xZmxYYQkrYqdEO898R2aI4Ja5zs1lulKYRp1oFJBFZvLaxMT/TL3VD3xDOAH0eUOZ39S5p2811vgCO+xI9Cyz3hMgWrDaoI8a/ohzmx00wwlmGn5ECD+wtRTY+ZiiGv1ABEQhymg88f+yNno51D7kVTtTk96FIj8ZAJPbYQuvxhwxPWD70hORrB7ioQrXUNU+0dANDTNBqYXNWUt6fCws/BoGm1JJOeO/yuMyj+ghK013put/GXEB9Nebe+PZemrQuAOokn4YUNloNEbCKbQnpU3fOiE4ntEo52/TgzeqOqJ1APjf9SYFm+bQcPHM3jZVDdsudbftiLCSwmJ2AReqIw3VhBTnr8OtgkhrfwqPRgar5xTvDnibX41bB5eI0lP4MxzjmxL6hTM9EXSjS40N8cA+N+WqCDHmyE80OfY0dNpMuDcdkM+4w87bqUx4x1l7iVLeysp9CapW6f41HmqRojSzSI1+JsW7jIEu/xrwkmffCqv2WPtLy0IUUSFopaKuOYXJHChFrdibuiM8oA8TABDb5D8n5L3Y3RXbn/zj6gGCuxLQ7LI0UAqIE558u8vAuReiXF80XoWCf3LNrdWDaeKViF7MByXImm03IirOYtkGBk96eiAou5WuOILx8VW8Y0jjxkvCiT0Xo1dPvPYf4Mbi3nI8ScX/8ve/FT4jte3snh3xvavpNV/k1FyvqJi73gqIDY3n9iJHgk0Brtcl5Xgzn3IRVyLNsxtMBzjBu782q+lsh5Rgcrn+1ZEIxGghqJCIw+R4i0driAcPANMO6rFqDVcLL59JQWZnW8EkkS0OJvrgrBoXvLQszTUtzkaIAMYl9yIQ1WVzZFuYI8UgGZBjTBnR+lmrAHt12ahNl7Cm78625gF6tESjLn+4xyViMYM0K3LkdDGnZ8g+OhlIll1xtqIAvNcR/ksJohROQ+n+LIzzOgBqfpPPGCG2/JglfSQj8jFOypw94K8+J9Qv5Dri2Pj1sszYxcIrogrVGjLC5V+DYh+AGNnAYze+E38nQAbCpUjXn2Ey9B8rS+b9gkM0EiuZTGvDV9UMB8xIif0iYgBa9muRfkrQS9sade/LahUqeFMdC+mEtez57VRHYLmxs46NuIEkVhJK9eijHrDvfjib/iwSKKORFGjazrann2O7UJsaZZvpiBO+wyqxG68nrfFOnaPB6vp/mDjvEh9WHsIi4dE9YlnHPs98MByPkvBHDWR4BYC6r86essjBMKzlAt+ew00AA9acpTWVyM0noddJ/XqR0PfFRlICotcjSyQtWmk0rLJohOvxMA848phRpL8poO6mWklATPvo156dbrr1SX2XVjFaZVj3nunjOz/BJR\"}";
////        System.out.println("外部请求报文" + view);
////        Map<String, Object> headerMap = new HashMap<>();
////        headerMap.put("Content-Type", "application/json");
////        String resData = HttpToolV3.callApiByPostStr(true, JSON_PACKETS_ARE_INTERCONNECTED, headerMap, view);
////        System.out.println("返回报文：" + resData);
//
//    }
//
//    private static void extracted1() {
//        ClaimCaseDataVo claimCaseDataVo1 = new ClaimCaseDataVo("9329000000064210", "FXLH000000064210");
//        ClaimCaseDataVo claimCaseDataVo2 = new ClaimCaseDataVo("9329000000064210", "FXLH000000064211");
//        ClaimCaseDataVo claimCaseDataVo3 = new ClaimCaseDataVo("9329000000064211", "FXLH000000064212");
//        ClaimCaseDataVo claimCaseDataVo4 = new ClaimCaseDataVo("9329000000064211", "FXLH000000064213");
//        ClaimCaseDataVo claimCaseDataVo5 = new ClaimCaseDataVo("9329000000064212", "FXLH000000064214");
//        ClaimCaseDataVo claimCaseDataVo6 = new ClaimCaseDataVo("9329000000064213", "FXLH000000064215");
//        List<ClaimCaseDataVo> claimCaseDataList = new ArrayList<>();
//        claimCaseDataList.add(claimCaseDataVo1);
//        claimCaseDataList.add(claimCaseDataVo2);
//        claimCaseDataList.add(claimCaseDataVo3);
//        claimCaseDataList.add(claimCaseDataVo4);
//        claimCaseDataList.add(claimCaseDataVo5);
//        claimCaseDataList.add(claimCaseDataVo6);
//        Map<String, List<ClaimCaseDataVo>> collect = claimCaseDataList.stream().collect(Collectors.groupingBy(ClaimCaseDataVo::getPolicyNo));
////        claimCaseDataList.stream().collect(Collectors.groupingBy());
////        collect.forEach((key, value) -> {
////            System.out.println("key:" + key);
////            System.out.println("value:" + value.toString());
////        });
//    }
//
//    private static void extracted() {
//        final String AES_PASSWORD = "FOSUN2016";
//        final String Channel = "KDWL";
//        final String JSON_PACKETS_ARE_INTERCONNECTED = "https://sit-impthirdfuis.fosun-uhi.com/third/forwardRequestApi/forwardRequest";
//
//        //模拟
//        JSONObject jsonObject = new JSONObject();//请求报文
//        JSONObject jsonHeader = new JSONObject();
//        JSONObject jsonBody = new JSONObject();
//
//
//        jsonObject.put("head", jsonHeader);
//        jsonObject.put("body", jsonBody);
//        System.out.println("请求前：" + jsonObject.toJSONString());
//        //加密
//        String encrypt = EncryptUtil.encrypt(jsonObject.toJSONString(), AES_PASSWORD);//加密
//        String decrypt = EncryptUtil.decrypt(encrypt, AES_PASSWORD);
//        System.out.println("加密后的data数据：" + encrypt);
//        System.out.println("解密后的data数据：" + decrypt);
//
//        //外部请求报文
//        JSONObject jsonExObject = new JSONObject();//外部请求报文
//        JSONObject jsonExHeader = new JSONObject();
//        jsonExHeader.put("transTime", DateUtils.format(new Date(),DateUtils.FORMAT_DATE_YYYY_MM_DD_HHMMSSSSS));
//        jsonExHeader.put("tranSource", Channel);
//        jsonExHeader.put("transNo", "View0000025UAT");
//        jsonExHeader.put("businessType", "fosun-contract");
//        jsonExObject.put("head", jsonExHeader);
//        jsonExObject.put("data", encrypt);
//        System.out.println("外部请求报文" + jsonExObject.toJSONString());
//
////        String view = "{\"head\": {\"transTime\": \"20250108095958685\",\"tranSource\": \"SHKD\",\"transNo\": \"View0000025UAT\",\"businessType\": \"fosun-contract\"},\"data\": \"lELGtLRBPR/bY1E2fCZGZL5xg8NokccrAwMrEyJOQtAx/tEgNfKEMFQkLQRlSoh/GtB8p1XajBib9Apq/LjPBlP2ZgOyLUrqZK736ohijsr20V5usvAq0S0xZmxYYQkrYqdEO898R2aI4Ja5zs1lulKYRp1oFJBFZvLaxMT/TL3VD3xDOAH0eUOZ39S5p2811vgCOxI9Cyz3hMgWrDaoI8a/ohzmx00wwlmGn5ECDwtRTYZiiGv1ABEQhymg88fyNno51D7kVTtTk96FIj8ZAJPbYQuvxhwxPWD70hORrB7ioQrXUNU0dANDTNBqYXNWUt6fCws/BoGm1JJOeO/yuMyjghK013put/GXEB9NebePZemrQuAOokn4YUNloNEbCKbQnpU3fOiE4ntEo52/TgzeqOqJ1APjf9SYFmbQcPHM3jZVDdsudbftiLCSwmJ2AReqIw3VhBTnr8OtgkhrfwqPRgar5xTvDnibX41bB5eI0lP4MxzjmxL6hTM9EXSjS40N8cANWqCDHmyE80OfY0dNpMuDcdkM4w87bqUx4x1l7iVLeysp9CapW6f41HmqRojSzSI1JsW7jIEu/xrwkmffCqv2WPtLy0IUUSFopaKuOYXJHChFrdibuiM8oA8TABDb5D8n5L3Y3RXbn/zj6gGCuxLQ7LI0UAqIE558u8vAuReiXF80XoWCf3LNrdWDaeKViF7MByXImm03IirOYtkGBk96eiAou5WuOILx8VW8Y0jjxkvCiT0Xo1dPvPYf4Mbi3nI8ScX/8ve/FT4jte3snh3xvavpNV/k1FyvqJi73gqIDY3n9iJHgk0Brtcl5Xgzn3IRVyLNsxtMBzjBu782qlsh5Rgcrn1ZEIxGghqJCIwR4i0driAcPANMO6rFqDVcLL59JQWZnW8EkkS0OJvrgrBoXvLQszTUtzkaIAMYl9yIQ1WVzZFuYI8UgGZBjTBnRlmrAHt12ahNl7Cm78625gF6tESjLn4xyViMYM0K3LkdDGnZ8gOhlIll1xtqIAvNcR/ksJohROQnLIzzOgBqfpPPGCG2/JglfSQj8jFOypw94K8J9Qv5Dri2Pj1sszYxcIrogrVGjLC5VDYhAGNnAYzeE38nQAbCpUjXn2Ey9B8rSb9gkM0EiuZTGvDV9UMB8xIif0iYgBa9muRfkrQS9sade/LahUqeFMdCmEtez57VRHYLmxs46NuIEkVhJK9eijHrDvfjib/iwSKKORFGjazrann2O7UJsaZZvpiBOwyqxG68nrfFOnaPB6vp/mDjvEh9WHsIi4dE9YlnHPs98MByPkvBHDWR4BYC6r86essjBMKzlAtew00AA9acpTWVyM0noddJ/XqR0PfFRlICotcjSyQtWmk0rLJohOvxMA848phRpL8poO6mWklATPvo156dbrr1SX2XVjFaZVj3nunjOz/BJR\"}";
////        System.out.println("外部请求报文" + view);
//        Map<String, Object> headerMap = new HashMap<>();
//        headerMap.put("Content-Type", "application/json");
//        String resData = HttpToolV3.callApiByPostStr(true, JSON_PACKETS_ARE_INTERCONNECTED, headerMap, jsonExObject.toJSONString());
//        System.out.println("返回报文：" + resData);
//
////        JSONObject jsonResp = JSON.parseObject(resData);
////        String content = jsonResp.getString("content");
////        JSONObject jsonResp1 = JSON.parseObject(content);
////        String data = jsonResp1.getString("data");
//
////        String decrypt1 = EncryptUtil.decrypt(data, AES_PASSWORD);
////        System.out.println("解密后的data数据：" + decrypt1);
//
//    }


}
