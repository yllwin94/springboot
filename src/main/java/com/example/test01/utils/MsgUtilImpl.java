//package com.example.test01.utils;
//
//import com.alibaba.fastjson.JSONObject;
//import com.example.test01.vo.ReqMsgPackage;
//import com.example.test01.vo.RespMsgPackage;
//import com.example.test01.exception.BusinessException;
//import io.micrometer.core.lang.Nullable;
//import kd.common.tool.DateUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.validation.constraints.NotBlank;
//import java.util.Date;
//
///**
// * [模块名] MsgUtilImpl  [功能描述] 报文处理类-复联专用
// * +----------------------------------------------------------------------
// * | Copyright (c) 可东网络 2025~2025 All rights reserved.
// * +----------------------------------------------------------------------
// * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
// * +----------------------------------------------------------------------
// *
// * @author ：lily.Yin
// * @since ：2025/1/9 15:39
// */
//public class MsgUtilImpl implements MsgUtil {
//
//    private final static Logger logger = LoggerFactory.getLogger(MsgUtilImpl.class);
//
//    @Override
//    public String reqDataPackage(@NotBlank String str, @NotBlank String key, @NotBlank String tranSource, @NotBlank String transNo, @NotBlank String businessType) {
//        String data = EncryptUtil.encrypt(str, key);
//        String transTime = DateUtils.format(new Date(), DateUtils.FORMAT_DATE_YYYY_MM_DD_HHMMSSSSS);
//        ReqMsgPackage reqData = new ReqMsgPackage(data, transTime, tranSource, transNo, businessType);
//        return JSONObject.toJSONString(reqData);
//    }
//
//    @Override
//    public String resDataAnalyze(@Nullable String str, @Nullable String key) {
//        try {
//            RespMsgPackage respMsgPackage = JSONObject.parseObject(str, RespMsgPackage.class);
//            if (respMsgPackage != null) {
//                int result = respMsgPackage.getResult();
//                if (result == 1) {
//                    if (respMsgPackage.getContent() == null){
//                        throw new BusinessException("-1", "无法获取响应报文");
//                    } else if (respMsgPackage.getContent().getData() == null){
//                        throw new BusinessException("-1", "无法获取响应报文中的密文");
//                    } else {
//                        return EncryptUtil.decrypt(respMsgPackage.getContent().getData(), key);
//                    }
//                } else {
//                    return str;
//                }
//            } else {
//                throw new BusinessException("-1", "请求报文不符合模板");
//            }
//        } catch (BusinessException e) {
//            e.printStackTrace();
//            // TODO 2025/1/10 13:18:这里没有设置异常信息打印
//            String jsonString = JSONObject.toJSONString(e.getMsg());
//
//            return JSONObject.toJSONString("");
//        }
//
//    }
//
//}
