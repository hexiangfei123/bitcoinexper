package com.hxf.bitcoin.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxf.bitcoin.dao.BlockMapper;
import com.hxf.bitcoin.po.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Blocks")
@CrossOrigin
public class BlockController {
    @Autowired
    private BlockMapper blockMapper;
    //最新区块列表
    @GetMapping("/getnewblocks")
    public List<Block> getnewblocks(){
      List<Block> blocks= blockMapper.getblocks();
      return blocks;
    }

    //更多区块列表
    @GetMapping("/getblocks")
    public PageInfo<Block> getblocks(@RequestParam(required = false, defaultValue = "1") Integer page){
        PageHelper.startPage(page, 2);
        Page<Block> getblocks = blockMapper.getblocks();
        PageInfo<Block> blockPageInfo = getblocks.toPageInfo();

        return blockPageInfo;
    }
//区块详情
    @GetMapping("getByblockHash")
    public Block getByblockHash(@RequestParam String hash){
        Block block= blockMapper.getByblockHash(hash);
        return block;
    }



}
