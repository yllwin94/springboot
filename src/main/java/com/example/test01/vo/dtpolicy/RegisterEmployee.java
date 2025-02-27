package com.example.test01.vo.dtpolicy;

import com.example.test01.annotation.Description;

/**
 * @author ：lily.Yin
 * @since ：2025/2/27 11:12
 */
public class RegisterEmployee {
    @Description(value = "渠道编码")
    private String channelCode;

    @Description(value = "销售人姓名")
    private String name;

    @Description(value = "销售人工号")
    private String employeeNumber;

    @Description(value = "销售人手机号")
    private String mobile;

    @Description(value = "企业名称")
    private String entName;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

}
