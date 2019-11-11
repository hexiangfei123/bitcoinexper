package com.hxf.bitcoin.controller;

import com.hxf.bitcoin.dao.BlockMapper;
import com.hxf.bitcoin.dao.TransMapper;
import com.hxf.bitcoin.po.Block;
import com.hxf.bitcoin.po.Trans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Trans")
@CrossOrigin
public class TransController {
    @Autowired
    private TransMapper transMapper;

    @GetMapping("getTrans")
    public List<Trans> getblocks(@RequestParam String blkId){
        List<Trans> trans= transMapper.getTrans(blkId);
        return trans;
    }
    @GetMapping("getTransbyhash")
    public Trans getTransbyhash(@RequestParam String txhash){
        Trans tran= transMapper.getTransbyhash(txhash);
        System.out.println("kkk");
        return tran;
    }




}
