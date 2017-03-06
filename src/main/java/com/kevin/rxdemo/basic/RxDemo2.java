package com.kevin.rxdemo.basic;

import rx.Observable;
import rx.functions.Action1;

/**
 * RxDemo1
 *
 * @author: KevinSun
 * @date: 2017/3/6
 */
public class RxDemo2 {

    /**
     * rx1 demop的进化版本
     */
    public static void main(String[] args) {
//        Observable<String> observable1 = Observable.create(
//            new Observable.OnSubscribe<String>() {
//                public void call(Subscriber<? super String> subscriber) {
//                    subscriber.onNext("123131");
//                    subscriber.onCompleted();
//                }
//            }
//        );
        Observable<String> observable1 = Observable.just("Hello, RxDemo2");

//        Subscriber<String> subscriber1 = new Subscriber<String>() {
//            public void onCompleted() {
//
//            }
//
//            public void onError(Throwable e) {
//
//            }
//
//            public void onNext(String s) {
//                System.out.println(s);
//            }
//        };

        Action1<String> onNextAction = new Action1<String>() {
            public void call(String s) {
                System.out.println(s);
            }
        };

        //myObservable.subscribe(onNextAction, onErrorAction, onCompleteAction);
        observable1.subscribe(onNextAction);
    }
}
