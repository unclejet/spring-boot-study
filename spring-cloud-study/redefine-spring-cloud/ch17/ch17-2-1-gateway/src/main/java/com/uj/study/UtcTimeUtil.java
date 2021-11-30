package com.uj.study;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author ：UncleJet
 * @date ：Created in 2021/11/12 下午3:55
 * @description：
 */
public class UtcTimeUtil {

    public static void main(String[] args) {
        ZonedDateTime time=  ZonedDateTime.now();
        System.out.println("zonedDateTime:"+time);

        String  maxTime=ZonedDateTime.now().plusHours(1).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println("maxTime："+maxTime);

        String  minTime=ZonedDateTime.now().minusHours(1).format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println("minTime:"+minTime);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str=time.format(formatter);
        System.out.println(str);
    }

}
