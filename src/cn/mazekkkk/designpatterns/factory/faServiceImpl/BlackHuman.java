package cn.mazekkkk.designpatterns.factory.faServiceImpl;

import cn.mazekkkk.designpatterns.factory.faService.Human;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 下午6:13
 * To change this template use File | Settings | File Templates.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void toSay() {
        System.out.println("我是黑种人");
    }
}
