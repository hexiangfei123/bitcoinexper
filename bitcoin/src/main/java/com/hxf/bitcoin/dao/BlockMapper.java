package com.hxf.bitcoin.dao;

import com.hxf.bitcoin.po.Block;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlockMapper {
    int insert(Block record);

    int insertSelective(Block record);

    List<Block> getblocks();

    Block getByblockHash(@Param("hash") String hash);
}