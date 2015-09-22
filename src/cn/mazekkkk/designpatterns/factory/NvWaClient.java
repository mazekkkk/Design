package cn.mazekkkk.designpatterns.factory;

import cn.mazekkkk.designpatterns.factory.fabstract.AbstractHumanFactory;
import cn.mazekkkk.designpatterns.factory.faService.Human;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 下午6:16
 * To change this template use File | Settings | File Templates.
 */
public class NvWaClient {
    public static void main(String[] args){

        Properties properties = new Properties();
        //对象实例
        Class<Human> whiteMan = null;
        Class<Human> blackMan = null;
        Class<Human> yellowMan = null;
        //拼接路径拿到配置文件
        try{
            InputStream inputStream = new FileInputStream("Design"+File.separator+"src"+File.separator+"Resource"+File.separator+"Factory.properties");
            //载入配置文件
            properties.load(inputStream);
            //通过key获取权限定类名
            String whiteClassName = properties.getProperty("whiteMan");
            String blackClassName = properties.getProperty("blackMan");
            String yellowClassName = properties.getProperty("yellowMan");
            //生成类
            whiteMan = (Class<Human>) Class.forName(whiteClassName);
            blackMan = (Class<Human>) Class.forName(blackClassName);
            yellowMan = (Class<Human>) Class.forName(yellowClassName);
            //关闭写入流
            inputStream.close();
        }catch (Exception e){
            //如果发生异常则抛出异常
            e.printStackTrace();
        }

//        声明阴阳炉造人

        AbstractHumanFactory Yinyanglu = new HumanFactory();
//        女娲第一次造人由于火候不足造出了白人
        System.out.println("第一次造人是白色人种");
        Human whiteHuman = Yinyanglu.createHuman(whiteMan);
        whiteHuman.getColor();
        whiteHuman.toSay();
//        女娲第二次造人由于火候太足造出了黑人
        System.out.println("第二次造出的是黑色人种");
        Human blackHuman = Yinyanglu.createHuman(blackMan);
        blackHuman.getColor();
        blackHuman.toSay();
//        女娲第三次造人火候正好是黄人
        System.out.println("第三次造出的是黄色人种");
        Human yellowHuman = Yinyanglu.createHuman(yellowMan);
        yellowHuman.getColor();
        yellowHuman.toSay();
    }
}