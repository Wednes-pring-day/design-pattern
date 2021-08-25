package com.spring.wednes;

import com.spring.wednes.singleton.AClazz;
import com.spring.wednes.singleton.BClazz;
import com.spring.wednes.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
