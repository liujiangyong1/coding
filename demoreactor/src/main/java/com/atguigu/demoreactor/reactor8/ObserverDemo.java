package com.atguigu.demoreactor.reactor8;

import java.util.Observable;

/**
 * @Author 不要有情绪的  ljy
 * @Date 2022/10/8 16:03
 * @Description:
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        //添加观察者
        observer.addObserver((o, arg) ->{
            System.out.println("发生变化");
        });
        observer.addObserver((o,arg)->{
            System.out.println("手动被观察者通知，准备改变");
        });

        observer.setChanged();    //数据变化
        observer.notifyObservers();  //通知()
    }


}
