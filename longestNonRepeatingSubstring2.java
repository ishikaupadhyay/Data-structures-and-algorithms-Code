import java.util.Arrays;

public class longestNonRepeatingSubstring2 {

    public int FindlongestNonRepeatingSubstring(String s) {
        int n = s.length();
        int maxlen = 0;

        int hash[] = new int[256];

        Arrays.fill(hash, 0);// the values of array have nit been encounterd yet

        // 2 ptrs approach
        int l = 0;// left
        int r = 0;// right

        while (r < n) {
            if (hash[s.charAt(r)] >= l) // agr value repeat hoti hai tohh!(means right ptr ki value left ptr ke barabar
                                        // ya usse jayda aajati hai tohh)
            {
                l = Math.max(hash[s.charAt(r)] + 1, l);// toh increase the value of l! (Math.max is used : so that l
                                                       // doesnot go backwards )
            }
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);
            

            //storing latest index of current character :
            hash[s.charAt(r)]=r;
            r++;//badhte chalo
        }
        return maxlen;

    }

    public static void main(String[] args) {
        String s = "aaabbbccc";
        longestNonRepeatingSubstring2 result = new longestNonRepeatingSubstring2();
        System.out.println(result.FindlongestNonRepeatingSubstring(s));
    }
}
