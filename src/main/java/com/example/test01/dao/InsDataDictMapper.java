package com.example.test01.dao;

import com.example.test01.entity.InsDataDict;

/**
* @author ThinKPad
* @description 针对表【t_ins_data_dict(数据字典表-保险公司)】的数据库操作Mapper
* @createDate 2025-02-12 17:01:13
* @Entity com.example.test01.entity.InsDataDict
*/
public interface InsDataDictMapper {

    int deleteByPrimaryKey(Long id);

    int insert(InsDataDict record);

    int insertSelective(InsDataDict record);

    InsDataDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InsDataDict record);

    int updateByPrimaryKey(InsDataDict record);

}
