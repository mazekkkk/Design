package cn.mazekkkk.designpatterns.singleton;

/**
 * User: maz
 * Date: 14-10-13
 * Time: 上午11:26
 * To change this template use File | Settings | File Templates.
 */
public class SingletonPatternsClient {
    public static void main(String[] args){
        for(int i=0;i<100;i++){
            SingletonPatterns singletonPatterns = SingletonPatterns.getInstance();
            singletonPatterns.say();
        }
    }
}
