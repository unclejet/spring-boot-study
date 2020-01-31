package com.uj.study;

import java.io.InputStream;
import java.util.Scanner;

public final class Util {

    private Util() {
    }

    public static String inputStreamToString(InputStream is) {
        Scanner s = new Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
