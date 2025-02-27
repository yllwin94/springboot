package com.example.test01.exception;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * [模块名] BussinessException  [功能描述]
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/1/10 12:52
 */
public class BusinessException extends RuntimeException {
    private String ret;
    private String msg;

    public BusinessException(String rpt, String msg) {
        this.ret = rpt;
        this.msg = msg;
        System.out.println("");
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String objToJsonObject(Object obj) {
        return JSONObject.toJSONString(obj, SerializerFeature.WriteMapNullValue);
    }



}
