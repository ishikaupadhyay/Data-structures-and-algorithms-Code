class Solution {
    public String modifyString(String s) {
        String newStr = s;
        newStr += " World";
        return newStr;
    }
}

public class passing {
    public static void main(String[] args) {
        String str = "Hello";

        Solution obj=new Solution();

        String result=obj.modifyString(str);

        System.out.println("Original string: "+str);
        System.out.println("Final string: "+result);

    }
}