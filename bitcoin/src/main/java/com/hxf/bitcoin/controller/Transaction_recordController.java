package com.hxf.bitcoin.controller;

import com.hxf.bitcoin.dao.Transaction_recordMapper;
import com.hxf.bitcoin.po.Trans;
import com.hxf.bitcoin.po.Transaction_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
@CrossOrigin
public class Transaction_recordController {

    @Autowired
    private Transaction_recordMapper transaction_recordMapper;
    @GetMapping("/getrecord")
    public List<Transaction_record> getblocks(@RequestParam Integer txid){
        List<Transaction_record> records= transaction_recordMapper.getrecord(txid);
        return records;
    }
//根据地址查询交易记录金额

    @GetMapping("/address")
    public List<Transaction_record> getaddress(@RequestParam String address){
        List<Transaction_record> records= transaction_recordMapper.getaddress(address);
        return records;
    }




}
