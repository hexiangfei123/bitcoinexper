package com.hxf.bitcoin.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.hxf.bitcoin.po.Block;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlockMapper {
    int insert(Block record);

    int insertSelective(Block record);

    Page<Block> getblocks();

    Block getByblockHash(@Param("hash") String hash);
}