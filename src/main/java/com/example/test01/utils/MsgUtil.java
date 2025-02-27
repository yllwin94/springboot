//package com.example.test01.utils;
//
//
//import io.micrometer.core.lang.Nullable;
//
//import javax.validation.constraints.NotBlank;
//
///**
// * [模块名] MsgUtil  [功能描述] 报文处理类
// * +----------------------------------------------------------------------
// * | Copyright (c) 可东网络 2025~2025 All rights reserved.
// * +----------------------------------------------------------------------
// * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
// * +----------------------------------------------------------------------
// *
// * @author ：lily.Yin
// * @since ：2025/1/9 15:35
// */
//public interface MsgUtil {
//
//
//    /**
//     * 请求报文封装
//     * @param str 请求报文
//     * @param key AES密钥
//     * @param tranSource 渠道来源
//     * @param transNo 交易编码
//     * @param businessType 业务类型
//     * @return 封装后的报文
//     */
//    String reqDataPackage(@NotBlank String str, @NotBlank String key, @NotBlank String tranSource, @NotBlank String transNo, @NotBlank String businessType);
//
//    /**
//     * 响应报文解析
//     * @param str 响应报文
//     * @return 解析后的报文
//     */
//    String resDataAnalyze(@Nullable String str, @Nullable String key) ;
//
//}
