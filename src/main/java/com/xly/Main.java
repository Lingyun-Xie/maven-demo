package com.xly;

import org.apache.commons.lang.StringUtils;

public class Main {
    public static void main(String[] args) {
        test("");
    }

    public static void test(String value) {
        if (StringUtils.isEmpty(value)) {
            System.out.println("Empty Value");
        }
    }
}
