package com.kevin.rxdemo.basic;

import rx.Observable;

/**
 * RxDemo1
 *
 * @author: KevinSun
 * @date: 2017/3/6
 */
public class RxDemo4 {

    /**
     * rx3demo的lambda版本
     */
    public static void main(String[] args) {
        Observable.just("Hello, RxDemo4-lambda").subscribe(s -> System.out.println(s));
    }
}
