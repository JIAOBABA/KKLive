package com.kk.kklive.event;

/**
 * Created by Administrator on 2016/9/21.
 */
public class NickNameEvent extends BaseEvent {
    public NickNameEvent(int what) {
        super(what);
    }
    private Object nickname;

    private Object figureurl_2;

    public Object getNickname() {
        return nickname;
    }

    public void setNickname(Object nickname) {
        this.nickname = nickname;
    }

    public Object getFigureurl_2() {
        return figureurl_2;
    }

    public void setFigureurl_2(Object figureurl_2) {
        this.figureurl_2 = figureurl_2;
    }
}
