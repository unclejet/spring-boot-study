package com.uj.study.custom.media.type.dto;

import lombok.Getter;

@Getter
public class BaeldungItem {
    private final String itemId;

    public BaeldungItem(String itemId) {
        this.itemId = itemId;
    }
}
