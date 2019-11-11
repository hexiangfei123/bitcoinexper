package com.hxf.bitcoin.dto;

import com.hxf.bitcoin.po.Block;
import com.hxf.bitcoin.po.Trans;


import java.util.Set;

public class BlockListDTO extends Block {
    private Set<Trans> trans;

    public Set<Trans> getTrans() {
        return trans;
    }

    public void setTrans(Set<Trans> trans) {
        this.trans = trans;
    }

    public BlockListDTO(Set<Trans> trans) {
        this.trans = trans;
    }
    public BlockListDTO() {

    }
}
