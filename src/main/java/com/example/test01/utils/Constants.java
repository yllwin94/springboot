package com.example.test01.utils;

/**
 * [模块名] Constants  [功能描述] 常量类
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/1/9 13:49
 */
public final class Constants {
    /**
     * redis key
      */
    public static final String REDIS_KEY_FL_DICT_DATA = "kd-main-dg".concat("FL_DICT_DATA");
    /**
     * AES密钥
     */
    public static final String REDIS_FIELD_FL_AES_PASSWORD = "AES_PASSWORD";
    /**
     * 渠道号
     */
    public static final String REDIS_FIELD_FL_CHANNEL = "Channel";
    /**
     * 复联api
     */
    public static final String REDIS_FIELD_FL_API = "JSON_PACKETS_ARE_INTERCONNECTED";
    /**
     * MD5密钥
     */
    public static final String REDIS_FIELD_FL_MD5_PASSWORD = "MD5_PASSWORD";
    /**
     * sftp路径
     */
    public static final String REDIS_FIELD_FL_SFTP_PATH = "PULL_CLAIM_NOTIC_BASE_PATH";
    /**
     * sftp配置id
     */
    public static final String REDIS_FIELD_FL_SFTP_CONFIGID = "SFTP_CONFIGID";

    /**
     * 测试：TPA立案申请接口的交易编码
     */
    public static final String FL_REGISTER_TRANSNO = "View0000025UAT";
    /**
     * 测试：TPA立案申请接口的业务类型
     */
    public static final String FL_REGISTER_BUSINESS_TYPE = "fosun-contract";

}
