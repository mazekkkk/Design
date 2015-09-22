package cn.mazekkkk.designpatterns.template.serviceImpl;

import cn.mazekkkk.designpatterns.template.serviceAbstract.HummerModel;

/**
 * Created by maz on 2015/3/20.
 */
public class HummerH1Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("H1启动");
    }

    @Override
    public void stop() {
        System.out.println("H1停止");
    }

    @Override
    public void alarm() {
        System.out.println("H1按喇嘛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H1发动引擎");
    }

}
