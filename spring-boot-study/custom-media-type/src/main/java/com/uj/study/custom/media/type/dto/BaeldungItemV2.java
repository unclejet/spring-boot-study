package com.uj.study.custom.media.type.dto;

import lombok.Getter;

@Getter
public class BaeldungItemV2 {
    private final String itemName;

    public BaeldungItemV2(String itemName) {
        this.itemName = itemName;
    }
}
