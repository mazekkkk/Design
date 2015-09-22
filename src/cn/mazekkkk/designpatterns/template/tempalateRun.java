package cn.mazekkkk.designpatterns.template;

import cn.mazekkkk.designpatterns.template.serviceAbstract.HummerModel;
import cn.mazekkkk.designpatterns.template.serviceImpl.HummerH1Model;
import cn.mazekkkk.designpatterns.template.serviceImpl.HummerH2Model;
import cn.mazekkkk.designpatterns.template.serviceImpl.HummerH3Model;

/**
 * Created by maz on 2015/3/20.
 */
public class tempalateRun {
    public static void main(String[] args){
        HummerModel h1 = new HummerH1Model();

        HummerModel h2 = new HummerH2Model();

        HummerModel h3 = new HummerH3Model();

        h1.run();

        h2.run();

        h3.run();
    }
}
