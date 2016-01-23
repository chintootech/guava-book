package bbejeck.guava.chapter2.splitter;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * User: Bill Bejeck
 * Date: 7/16/13
 * Time: 11:17 PM
 */
public class StringSplitExample {

    public static void main(String[] args) {
        // use java
        String commaSeparatedString = "Foo,,Bar,,Baz,,,";
        String[] words = commaSeparatedString.split(",");
        System.out.println(Arrays.toString(words)); // [Foo, , Bar, , Baz]

        // guava used
        Iterable<String> list = Splitter.on(",").omitEmptyStrings().split(commaSeparatedString);
        System.out.println(list); // [Foo, Bar, Baz]

        //split string to a map
        Map<String, String> map = Splitter.on(";").trimResults().withKeyValueSeparator(",").split("guava, google;java, oracle");
        System.out.println(map); //{guava= google, java= oracle}
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + "," + "value = " + entry.getValue());
        }

        //key = guava,value =  google
        //key = java,value =  oracle
    }
}
