package com.kevin.rxdemo.basic;

import rx.Observable;
import rx.Subscriber;

/**
 * RxDemo1
 *
 * @author: KevinSun
 * @date: 2017/3/6
 */
public class RxDemo1 {

    /**
     * 最简单的rx例子
     */
    public static void main(String[] args) {
        Observable<String> observable1 = Observable.create(
            new Observable.OnSubscribe<String>() {
                public void call(Subscriber<? super String> subscriber) {
                    subscriber.onNext("Hello, RxDemo2");
                    subscriber.onCompleted();
                }
            }
        );

        Subscriber<String> subscriber1 = new Subscriber<String>() {
            public void onCompleted() {

            }

            public void onError(Throwable e) {

            }

            public void onNext(String s) {
                System.out.println(s);
            }
        };

        observable1.subscribe(subscriber1);
    }
}
