package com.hxf.bitcoin.controller;


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
//区块列表
    @GetMapping("getblocks")
    public List<Block> getblocks(){
      List<Block> blocks= blockMapper.getblocks();
      return blocks;
    }
//区块详情
    @GetMapping("getByblockHash")
    public Block getByblockHash(@RequestParam String hash){
        Block block= blockMapper.getByblockHash(hash);
        return block;
    }



}
