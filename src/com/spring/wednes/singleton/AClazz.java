package com.spring.wednes.singleton;

// 클래스 명에 class 가 아니라 clazz를 쓰는 나름의 약속이 있다고 한다. (예약어때문에)
public class AClazz {
    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
