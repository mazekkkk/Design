package cn.mazekkkk.designpatterns.abstractfactory;

import cn.mazekkkk.designpatterns.abstractfactory.service.Human;
import cn.mazekkkk.designpatterns.abstractfactory.service.HumanFactory;

/**
 * Created by maz on 2015/3/20.
 */
public class NvWa {

    public static void main(String[] args){

        //男人工厂
        HumanFactory maleHumanFactory = new MaleFactory();
        //女人工厂
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //变态工厂
        HumanFactory hentaiHumanFactory = new HentaimaleFactory();


        //男性黄人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        //女性黄人
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        //中性黄人
        Human hentaiYellowHuman = hentaiHumanFactory.createYellowHuman();

        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();

        hentaiYellowHuman.getColor();
        hentaiYellowHuman.getSex();
        hentaiYellowHuman.talk();

    }

}
