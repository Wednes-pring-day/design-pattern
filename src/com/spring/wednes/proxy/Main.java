package com.spring.wednes.proxy;

public class Main {
    public static void main(String[] args) {
        // ์์กด ์ญ์ 
        IBrowser browserProxy = new BrowserProxy("www.naver.com");
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
    }
}
