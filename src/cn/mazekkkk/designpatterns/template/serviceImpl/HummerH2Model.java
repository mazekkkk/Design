package cn.mazekkkk.designpatterns.template.serviceImpl;

import cn.mazekkkk.designpatterns.template.serviceAbstract.HummerModel;

/**
 * Created by maz on 2015/3/20.
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("H2启动");
    }

    @Override
    public void stop() {
        System.out.println("H2停止");
    }

    @Override
    public void alarm() {
        System.out.println("H2按喇叭");
    }

    @Override
    public void engineBoom() {
        System.out.println("H2引擎轰鸣");
    }

}
