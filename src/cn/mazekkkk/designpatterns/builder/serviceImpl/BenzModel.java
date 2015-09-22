package cn.mazekkkk.designpatterns.builder.serviceImpl;

import cn.mazekkkk.designpatterns.builder.serviceAbstract.CarModel;

/**
 * Created by maz on 2015/3/21.
 */
public class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车启动");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车按喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰启动引擎");
    }
}
