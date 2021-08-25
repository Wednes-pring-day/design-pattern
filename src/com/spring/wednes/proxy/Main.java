package com.spring.wednes.proxy;

public class Main {
    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
        BrowserProxy browserProxy = new BrowserProxy("www.naver.com");
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
    }
}
