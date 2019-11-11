package com.hxf.bitcoin.dao;

import com.hxf.bitcoin.po.Transaction_record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Transaction_recordMapper {
    int deleteByPrimaryKey(Integer idx);

    int insert(Transaction_record record);

    int insertSelective(Transaction_record record);

    Transaction_record selectByPrimaryKey(Integer idx);

    int updateByPrimaryKeySelective(Transaction_record record);

    int updateByPrimaryKey(Transaction_record record);

    List<Transaction_record> getrecord(@Param("txid") Integer txid);

    List<Transaction_record> getaddress(@Param("address")String address);
}