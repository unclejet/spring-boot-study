package com.uj.study.security;

import com.google.gson.Gson;
import com.uj.study.model.JwtAuthenticationRequest;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/9/2 上午9:47
 * @description：
 */
@Component
public class WebAuthenticationDetailsSourceImpl implements AuthenticationDetailsSource<HttpServletRequest, JwtAuthenticationRequest> {

    @Override
    public JwtAuthenticationRequest buildDetails(HttpServletRequest request) {

        Gson gson = new Gson();
        String json = new String();
        String output = new String();
        BufferedReader br;
        StringBuffer buffer = new StringBuffer(16384);
        JwtAuthenticationRequest jwtAuthenticationRequest = new JwtAuthenticationRequest();
        try {
            br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            while ((output = br.readLine()) != null){
                buffer.append(output);
            }

            json = buffer.toString();
            jwtAuthenticationRequest = gson.fromJson(json, JwtAuthenticationRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jwtAuthenticationRequest;
    }
}

