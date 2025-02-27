package com.example.test01.entity;

/**
 * 数据字典表-保险公司
 * @TableName t_ins_data_dict
 */
public class InsDataDict {
    /**
     * id
     */
    private String id;

    /**
     * 类型
     */
    private String type;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 上级类型
     */
    private String preType;

    /**
     * 上级类型对应的值
     */
    private String preDvalue;

    /**
     * 值
     */
    private String dvalue;

    /**
     * 显示标签
     */
    private String dlabel;

    /**
     * 备注
     */
    private String remark;

    /**
     * id
     */
    public String getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 上级类型
     */
    public String getPreType() {
        return preType;
    }

    /**
     * 上级类型
     */
    public void setPreType(String preType) {
        this.preType = preType;
    }

    /**
     * 上级类型对应的值
     */
    public String getPreDvalue() {
        return preDvalue;
    }

    /**
     * 上级类型对应的值
     */
    public void setPreDvalue(String preDvalue) {
        this.preDvalue = preDvalue;
    }

    /**
     * 值
     */
    public String getDvalue() {
        return dvalue;
    }

    /**
     * 值
     */
    public void setDvalue(String dvalue) {
        this.dvalue = dvalue;
    }

    /**
     * 显示标签
     */
    public String getDlabel() {
        return dlabel;
    }

    /**
     * 显示标签
     */
    public void setDlabel(String dlabel) {
        this.dlabel = dlabel;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}