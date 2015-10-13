package bbejeck.guava.chapter2.charmatcher;

import com.google.common.base.CharMatcher;

/**
 * Created by renqun.yuan on 2015/10/13.
 */
public class CharMatcherExample {
    public static void main(String[] args) {
        // remove invisible char
        String string = " kkk   ttt \n sss aaa vvv";
        System.out.println(CharMatcher.INVISIBLE.removeFrom(string)); // kkktttsssaaavvv

        int count = CharMatcher.DIGIT.countIn("23Xkkjkda4"); // 3
        System.out.println(count);

        String s = CharMatcher.inRange('a', 'c').negate().retainFrom("abdcds"); // dds
        System.out.println(s);
    }
}
