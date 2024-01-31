import java.util.HashSet;

public class LongedSubstring {
    public static void main(String[] args) {
        String str = "abcdbba";
        int res = longestSubstringLength(str);
        System.out.println(res);
    }
    
    public static int longestSubstringLength(String str) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;

        while (j < str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }

        return max;
    }
}
