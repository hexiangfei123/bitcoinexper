package com.hxf.bitcoin.dto;

import com.hxf.bitcoin.po.Trans;
import com.hxf.bitcoin.po.Transaction_record;

import java.util.Set;

public class TranListDTO extends  Trans{
    private Set<Transaction_record> records;

    public Set<Transaction_record> getRecords() {
        return records;
    }

    public void setRecords(Set<Transaction_record> records) {
        this.records = records;
    }
}
