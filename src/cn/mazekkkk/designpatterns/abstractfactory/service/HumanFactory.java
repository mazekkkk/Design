package cn.mazekkkk.designpatterns.abstractfactory.service;

/**
 * Created by maz on 2015/3/20.
 */
public interface HumanFactory {
    //黄色人种
    public Human createYellowHuman();
    //白色人种
    public Human createWhiteHuman();
    //黑色人种
    public Human createBlackHuman();
}
