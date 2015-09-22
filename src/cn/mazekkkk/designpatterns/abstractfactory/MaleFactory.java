package cn.mazekkkk.designpatterns.abstractfactory;

import cn.mazekkkk.designpatterns.abstractfactory.service.Human;
import cn.mazekkkk.designpatterns.abstractfactory.service.HumanFactory;
import cn.mazekkkk.designpatterns.abstractfactory.serviceImpl.MaleBlackMan;
import cn.mazekkkk.designpatterns.abstractfactory.serviceImpl.MaleWhiteMan;
import cn.mazekkkk.designpatterns.abstractfactory.serviceImpl.MaleYellowMan;

/**
 * Created by maz on 2015/3/20.
 */
public class MaleFactory implements HumanFactory {
    //生产黄人
    @Override
    public Human createYellowHuman() {
        return new MaleYellowMan();
    }
    //生产白人
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteMan();
    }
    //生产黑人
    @Override
    public Human createBlackHuman() {
        return new MaleBlackMan();
    }
}
