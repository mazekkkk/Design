package cn.mazekkkk.designpatterns.templateEx;

import cn.mazekkkk.designpatterns.templateEx.serviceAbstract.HummerModel;
import cn.mazekkkk.designpatterns.templateEx.serviceImpl.HummerH1Model;
import cn.mazekkkk.designpatterns.templateEx.serviceImpl.HummerH2Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by maz on 2015/3/21.
 */
public class templateExRun {

    public static void main(String args[])throws IOException {
//        System.out.println("模板扩展");
        System.out.println("-------------H1型号悍马---------------");
        System.out.println("-------------是否需要喇叭声响？0-不需要 1-需要---------------");
        //状态
        String state = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1 = new HummerH1Model();


        if(state.equals("0")){
            h1.setAlarmFlag(false);
        }

        h1.run();

        System.out.println("-------------h2型号悍马---------------");

        HummerH2Model h2 = new HummerH2Model();

        h2.run();

    }


}
