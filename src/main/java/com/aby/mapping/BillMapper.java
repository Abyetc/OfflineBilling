package com.aby.mapping;

import java.util.List;

import com.aby.model.Bill;
import com.aby.model.BillKey;

public interface BillMapper {
    int deleteByPrimaryKey(BillKey key);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(BillKey key);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
    
    int insertBatch(List<Bill> bills);
    
    
}