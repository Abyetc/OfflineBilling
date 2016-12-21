package com.aby.mapping;

import java.util.List;

import com.aby.model.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);
    
    List<Integer> selectIDs(String packageNum);
    
    List<Record> selectByPackageNum(String packageNum);
    
    List<String> selectAllPromName();
    
    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}