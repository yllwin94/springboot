package com.example.test01.vo;


/**
 * [模块名] RespMsgPackage  [功能描述] 返回报文封装-针对复联项目
 * +----------------------------------------------------------------------
 * | Copyright (c) 可东网络 2025~2025 All rights reserved.
 * +----------------------------------------------------------------------
 * | Licensed 可东网络并不是自由软件，未经许可禁止使用版权
 * +----------------------------------------------------------------------
 *
 * @author ：lily.Yin
 * @since ：2025/1/9 16:10
 */
public class RespMsgPackage {
    private Additions additions;
    private String code;
    private Content content;
    private String message;
    private int result;

    public static class Additions {
        @Override
        public String toString() {
            return "Additions{}";
        }
    }

    public static class Content {
        private Head head;
        private String data;

         public static class Head {
            private String businessType;
            private String tranSource;
            private String transNo;
            private String transTime;

            public String getBusinessType() {
                return businessType;
            }

            public void setBusinessType(String businessType) {
                this.businessType = businessType;
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

            public String getTransTime() {
                return transTime;
            }

            public void setTransTime(String transTime) {
                this.transTime = transTime;
            }

             @Override
             public String toString() {
                 return "Head{" +
                         "businessType='" + businessType + '\'' +
                         ", tranSource='" + tranSource + '\'' +
                         ", transNo='" + transNo + '\'' +
                         ", transTime='" + transTime + '\'' +
                         '}';
             }
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

        @Override
        public String toString() {
            return "Content{" +
                    "head=" + head.toString() +
                    ", data='" + data + '\'' +
                    '}';
        }
    }

    public Additions getAdditions() {
        return additions;
    }

    public void setAdditions(Additions additions) {
        this.additions = additions;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RespMsgPackage{" +
                "additions=" + additions.toString() +
                ", code='" + code + '\'' +
                ", content=" + content.toString() +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
