package cn.mazekkkk.designpatterns.builder.serviceAbstract;

/**
 * Created by maz on 2015/3/21.
 */
public class BMWModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("宝马车启动");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停止");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车按喇叭");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车启动引擎");
    }
}
