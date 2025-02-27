package com.example.test01.vo;

/**
 * [模块名] MsgPackage  [功能描述] 请求报文封装-针对复联项目
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/1/9 11:29
 */
public class ReqMsgPackage {
    private static final long serialVersionUID = 1L;

    /**
     * 报文头
     */
    private Head head;
    /**
     * 报文内容
     */
    private String data;

    /**
     * 报文头
     */
    class Head {
        private String transTime;
        private String tranSource;
        private String transNo;
        private String businessType;

        public Head(String transTime, String tranSource, String transNo, String businessType) {
            this.transTime = transTime;
            this.tranSource = tranSource;
            this.transNo = transNo;
            this.businessType = businessType;
        }

        public String getTransTime() {
            return transTime;
        }

        public void setTransTime(String transTime) {
            this.transTime = transTime;
        }

        public String getTranSource() {
            return tranSource;
        }

        public void setTranSource(String tranSource) {
            this.tranSource = tranSource;
        }

        public String getTransNo() {
            return transNo;
        }

        public void setTransNo(String transNo) {
            this.transNo = transNo;
        }

        public String getBusinessType() {
            return businessType;
        }

        public void setBusinessType(String businessType) {
            this.businessType = businessType;
        }
    }

    public ReqMsgPackage(String data, String transTime, String tranSource, String transNo, String businessType) {
        this.head = new Head(transTime, tranSource, transNo, businessType);
        this.data = data;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
