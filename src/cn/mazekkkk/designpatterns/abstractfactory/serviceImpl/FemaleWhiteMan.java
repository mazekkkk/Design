package cn.mazekkkk.designpatterns.abstractfactory.serviceImpl;

import cn.mazekkkk.designpatterns.abstractfactory.serviceAbstract.AbstractYellowHuman;

/**
 * Created by maz on 2015/3/20.
 */
public class FemaleWhiteMan extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
