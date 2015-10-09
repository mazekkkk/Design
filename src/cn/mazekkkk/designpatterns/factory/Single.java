package cn.mazekkkk.designpatterns.factory;

import cn.mazekkkk.design23.Person;

/**
 * Created by mazekkkk on 15/9/30.
 */
public class Single {

    private static final Person person = new Person();

    private Single() {
    }

    public static Person getPerson() {
        return person;
    }

    public static void toSay(){
        System.out.println(person.hashCode());
    }

}
