package romanToInteger;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int value = 0;

        Map<String, Integer> roman = new java.util.HashMap<>(Map.of("I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "CD", 400,
                "D", 500,
                "M", 1000
        ));

        Map<String, String> map = Map.of("IV", "IIII",
                "IX", "VIIII",
                "XL", "XXXX",
                "XC", "LXXXX",
                "CD", "CCCC",
                "CM", "DCCCC"
        );

        String sn = s;

        for (String key : map.keySet()) {
            sn = sn.replace(key, map.get(key));
        }

        for (int i = 0; i < sn.length(); i++) {
            if (roman.containsKey(String.valueOf(sn.charAt(i)))) {
                value += roman.get(String.valueOf(sn.charAt(i)));
            }
        }
        return value;
    }

}
