package cn.mazekkkk.designpatterns.templateEx.serviceImpl;

import cn.mazekkkk.designpatterns.templateEx.serviceAbstract.HummerModel;

/**
 * Created by maz on 2015/3/21.
 */
public class HummerH2Model extends HummerModel {


    @Override
    protected void start() {
        System.out.println("悍马H2启动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎发动...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }

}
