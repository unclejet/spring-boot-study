package com.uj.study.filter;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/2 上午11:54
 * @description：
 */
public class PermissionException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public PermissionException(String msg) {
        super(msg);
    }
}
