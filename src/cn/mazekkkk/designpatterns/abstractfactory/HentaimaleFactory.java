package cn.mazekkkk.designpatterns.abstractfactory;

import cn.mazekkkk.designpatterns.abstractfactory.service.Human;
import cn.mazekkkk.designpatterns.abstractfactory.service.HumanFactory;
import cn.mazekkkk.designpatterns.abstractfactory.serviceImpl.*;

/**
 * Created by maz on 2015/3/20.
 */
public class HentaimaleFactory implements HumanFactory {
    //生产黄人
    @Override
    public Human createYellowHuman() {
        return new HentaiYellowMan();
    }
    //生产白人
    @Override
    public Human createWhiteHuman() {
        return new HentaiWhiteMan();
    }
    //生产黑人
    @Override
    public Human createBlackHuman() {
        return new HentaiBlackMan();
    }
}
