package cn.mazekkkk.designpatterns.factory.faServiceImpl;

import cn.mazekkkk.designpatterns.factory.faService.Human;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 下午6:13
 * To change this template use File | Settings | File Templates.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void toSay() {
        System.out.println("我是黄种人");
    }
}
