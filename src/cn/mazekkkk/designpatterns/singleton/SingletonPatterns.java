package cn.mazekkkk.designpatterns.singleton;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 上午11:26
 * To change this template use File | Settings | File Templates.
 */
public class SingletonPatterns {
//    恶汉式
    private static final SingletonPatterns singletonPatterns = new SingletonPatterns();

//    懒汉式
//    private static SingletonPatterns singletonPatterns = null;

//    私有构造方法
    private SingletonPatterns(){

    }
//    恶汉式
    public static SingletonPatterns getInstance(){
        return singletonPatterns;
    }

//    懒汉式
//    public static SingletonPatterns getInstance(){
//        if(singletonPatterns==null){
//            singletonPatterns = new SingletonPatterns();
//        }
//        return singletonPatterns;
//    }

    public static void say(){
        System.out.println(singletonPatterns.hashCode());
    }

}
