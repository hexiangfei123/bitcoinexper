package com.hxf.bitcoin.dto;

import com.hxf.bitcoin.po.Transaction_record;

import java.util.List;

public class Transaction_recordListDTO {
    private String address;
    private String format;
    private String transactions;
   private String totalReceived;
   private String totalSent;
   private String finalBalance;

    private List<Transaction_record> recordList;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public String getTotalReceived() {
        return totalReceived;
    }

    public void setTotalReceived(String totalReceived) {
        this.totalReceived = totalReceived;
    }

    public String getTotalSent() {
        return totalSent;
    }

    public void setTotalSent(String totalSent) {
        this.totalSent = totalSent;
    }

    public String getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(String finalBalance) {
        this.finalBalance = finalBalance;
    }

    public List<Transaction_record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Transaction_record> recordList) {
        this.recordList = recordList;
    }

    public Transaction_recordListDTO() {

    }

    public Transaction_recordListDTO(String address, String format, String transactions, String totalReceived, String totalSent, String finalBalance, List<Transaction_record> recordList) {
        this.address = address;
        this.format = format;
        this.transactions = transactions;
        this.totalReceived = totalReceived;
        this.totalSent = totalSent;
        this.finalBalance = finalBalance;
        this.recordList = recordList;
    }
}
