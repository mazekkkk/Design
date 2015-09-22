package cn.mazekkkk.designpatterns.builder;

import cn.mazekkkk.designpatterns.builder.serviceImpl.BenzModel;

import java.util.ArrayList;

/**
 * Created by maz on 2015/3/21.
 */
public class builderRun {

    public static void main(String args[]){
        /**
         * 客户告诉公司，要一个怎样的产品怎样的顺序，然后来制造
         */

        BenzModel benz = new BenzModel();
        //存放Run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
        sequence.add("start");//启动起来
        sequence.add("stop");//开了一段停下来
        //我们把这个顺序赋予奔驰车
        benz.setSequence(sequence);

        benz.run();
    }

}
