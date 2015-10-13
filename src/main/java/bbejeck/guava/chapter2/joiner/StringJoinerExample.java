package bbejeck.guava.chapter2.joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * Created by renqun.yuan on 2015/10/13.
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        // join strings array
        Joiner.on(",").join(args);

        // join List<String>
        List<String> strings = Lists.newArrayList("a", "b", "c");
        System.out.println(Joiner.on(",").join(strings)); // a,b,c

        // join map to string
        Map<String, String> map = Maps.newHashMap();
        map.put("1", "one");
        map.put("2", "two");
        System.out.println(Joiner.on(";").withKeyValueSeparator("=").join(map)); // 2=two;1=one
    }
}
