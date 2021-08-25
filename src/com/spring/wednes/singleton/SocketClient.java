package com.spring.wednes.singleton;

import java.net.Socket;

public class SocketClient {

    // 싱글톤은 자기 자신을 멤버변수로 가지고 있어야한다.
    private static SocketClient socketClient = null;

    // 생성자는 private으로 만든다.
    private SocketClient() {

    }

    public static SocketClient getInstance() { // SocketClient.getInstance()로 접근 가능

        // 객체가 생성돼있지 않은 경우에만 생성해줌.
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
