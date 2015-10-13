package bbejeck.guava.chapter2.strings;

import com.google.common.base.Strings;

/**
 * Created by renqun.yuan on 2015/10/13.
 */
public class StringsExample {
    public static void main(String[] args) {
        // Ìî³ä
        String prefixString = Strings.padStart("1", 4, '0');// Ìî³äÇ°×º,
        System.out.println(prefixString);  // 0001
        String suffixString = Strings.padEnd("0", 4, '1');// Ìî³äºó×º
        System.out.println(suffixString); // 0111

        System.out.println(Strings.commonPrefix("good", "god")); // go

        System.out.println(Strings.commonSuffix("good", "god")); // od

        System.out.println(Strings.repeat("a", 5)); // aaaaa

        String test = null;
        System.out.println(Strings.isNullOrEmpty(test)); // true

        System.out.println(Strings.nullToEmpty(test));
    }
}
