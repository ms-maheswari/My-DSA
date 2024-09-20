package Easy;

import java.util.Arrays;

public class Longest_common_prefix {

    public static String longest_prefix(String str[]){
        Arrays.sort(str);
        int n = str.length;
        String s1 = str[0];
        String s2 = str[n-1];

        String op = "";
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i))
               op = op+s1.charAt(i);
            else 
               break;
        }
        return op;
    }
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String result = longest_prefix(str);
        System.out.print("Longest common prefix is "+result);
    }
}

// Input: strs = ["flower","flow","flight"]
// Output: "fl"