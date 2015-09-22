package cn.mazekkkk.designpatterns.factory.fabstract;

import cn.mazekkkk.designpatterns.factory.faService.Human;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 下午6:17
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
