package com.hxf.bitcoin.po;

public class Trans {
    private Integer txid;

    private String blkId;

    private String txhash;

    private Integer version;

    private Boolean istimelock;

    private Integer locktimevalue;

    public Integer getTxid() {
        return txid;
    }

    public void setTxid(Integer txid) {
        this.txid = txid;
    }

    public String getBlkId() {
        return blkId;
    }

    public void setBlkId(String blkId) {
        this.blkId = blkId == null ? null : blkId.trim();
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash == null ? null : txhash.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getIstimelock() {
        return istimelock;
    }

    public void setIstimelock(Boolean istimelock) {
        this.istimelock = istimelock;
    }

    public Integer getLocktimevalue() {
        return locktimevalue;
    }

    public void setLocktimevalue(Integer locktimevalue) {
        this.locktimevalue = locktimevalue;
    }
}