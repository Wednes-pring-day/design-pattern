package com.spring.wednes.aop;


import com.spring.wednes.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

        // 동시성 문제 때문에 이렇게 해준다.
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        aopBrowser.show();
        System.out.println("loading time: " + end.get());
        aopBrowser.show();
        System.out.println("loading time: " + end.get());
    }
}

