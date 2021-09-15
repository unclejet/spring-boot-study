package com.uj.study.model;

import java.io.Serializable;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/9/2 上午9:48
 * @description：
 */
public class JwtAuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}

