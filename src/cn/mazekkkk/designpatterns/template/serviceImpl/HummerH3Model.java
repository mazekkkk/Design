package cn.mazekkkk.designpatterns.template.serviceImpl;

import cn.mazekkkk.designpatterns.template.serviceAbstract.HummerModel;

/**
 * Created by maz on 2015/3/21.
 */
public class HummerH3Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("h3启动");
    }

    @Override
    public void stop() {
        System.out.println("h3停止");
    }

    @Override
    public void alarm() {
        System.out.println("h3按喇叭");
    }

    @Override
    public void engineBoom() {
        System.out.println("h3引擎启动");
    }
}
