package cn.mazekkkk.designpatterns.factory;

import cn.mazekkkk.designpatterns.factory.fabstract.AbstractHumanFactory;
import cn.mazekkkk.designpatterns.factory.faService.Human;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 下午6:19
 * To change this template use File | Settings | File Templates.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try{
//          具体产生人类办法
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人种生成错误");
        }
//        返回人种需要强转为泛型
        return (T)human;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
