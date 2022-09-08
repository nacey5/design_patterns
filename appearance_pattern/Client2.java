package com.hzh.pattern.appearance_pattern;

/**
 * @NAME: Client
 * @USER: DaHuangGO
 * @DATE: 2022/9/8
 * @TIME: 23:30
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 08
 */
public class Client2 {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.methodA();
        facade.methodB();
    }
}
