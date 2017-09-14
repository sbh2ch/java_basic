package kr.goci.lec;

/**
 * Created by sonbyeonghwa on 2017. 9. 14..
 */
public class Test implements TestInterface {
    @Override
    public void helloWorld(String text) {
        System.out.println(text);
    }
}
