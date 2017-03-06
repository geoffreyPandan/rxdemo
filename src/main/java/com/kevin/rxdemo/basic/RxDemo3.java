package com.kevin.rxdemo.basic;

import rx.Observable;
import rx.functions.Action1;

/**
 * RxDemo1
 *
 * @author: KevinSun
 * @date: 2017/3/6
 */
public class RxDemo3 {

    /**
     * rx1 rx2 demop的进化版本
     */
    public static void main(String[] args) {
         Observable.just("Hello, RxDemo3").subscribe(new Action1<String>() {
             public void call(String s) {
                 System.out.println(s);
             }
         });
    }
}
