package com.hxf.bitcoin.dao;

import com.hxf.bitcoin.po.Trans;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransMapper {
    int deleteByPrimaryKey(Integer txid);

    int insert(Trans record);

    int insertSelective(Trans record);

    Trans selectByPrimaryKey(Integer txid);

    int updateByPrimaryKeySelective(Trans record);

    int updateByPrimaryKey(Trans record);

    List<Trans> getTrans(@Param("blkId") String blkId);

    Trans getTransbyhash(@Param("txhash")String txhash);
}