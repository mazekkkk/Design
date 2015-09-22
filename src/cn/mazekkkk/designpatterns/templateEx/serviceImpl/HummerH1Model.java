package cn.mazekkkk.designpatterns.templateEx.serviceImpl;

import cn.mazekkkk.designpatterns.templateEx.serviceAbstract.HummerModel;

/**
 * Created by maz on 2015/3/21.
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1启动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停止...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎发动...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭客户来决定
    public void setAlarmFlag(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }

}
