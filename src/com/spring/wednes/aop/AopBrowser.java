package com.spring.wednes.aop;

import com.spring.wednes.proxy.Html;
import com.spring.wednes.proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();

        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from : " + url);
            try {
                Thread.sleep(1500); // 임의적으로 로딩은 1.5초가 걸리게 만들었다!
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("AopBrowser html cache: " + url);
        }
        after.run();
        return html;

    }
}
