package com.hzh.pattern.appearance_pattern;

/**
 * @NAME: Facade
 * @USER: DaHuangGO
 * @DATE: 2022/9/8
 * @TIME: 23:23
 * @YEAR: 2022
 * @MONTH: 09
 * @DAY: 08
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;



    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
        this.four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法组A()-----");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB(){
        System.out.println("方法组B()-----");
        one.methodOne();
        three.methodThree();
    }

}
