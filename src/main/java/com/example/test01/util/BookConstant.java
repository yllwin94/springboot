package com.example.test01.util;

/**
 * 常量类
 */
public interface BookConstant {

    interface code {
        /** 执行成功 */
        int success = 200;

        /** 执行失败 */
        int failure = 400;

        /** 异常 */
        int error = 500;

        /** 登录状态异常 */
        int loginStatusError = 999;

    }

    /** 操作（添加图书，删除图书，展示全部图书） */
    enum function {ADD, DEL,LIST};

}
