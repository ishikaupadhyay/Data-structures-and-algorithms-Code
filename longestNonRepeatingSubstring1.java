import java.util.Arrays;

public class longestNonRepeatingSubstring1 {

    public int FindlongestNonRepeatingSubstring(String s) {
        int n = s.length();
        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int hash[] = new int[256];// new hash- to store all the Characters!
             Arrays.fill(hash, 0);//sbhi index ko 0 pr rkhna (As if they havent encounterd yet!)

            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] == 1)
                    break;// if repeated char found ,just break!
                hash[s.charAt(j)] = 1;// if first time encounter , give it index =1;

                // as we need to find the legth of that particular string :
                // so ,
                int newlen = j - i + 1;

                maxlen = Math.max(maxlen, newlen);

            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "aaabbbccc";
        longestNonRepeatingSubstring1 result = new longestNonRepeatingSubstring1();
        System.out.println(result.FindlongestNonRepeatingSubstring(s));
    }
}
