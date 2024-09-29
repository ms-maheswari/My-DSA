public class Odd_Even {
    public static void main(String[] args) {
        int n = 2;
        String result = isOddEven(n);
        System.out.println(result);
           
    }
    static String isOddEven(int n){
        if((n & 1) == 0)
           return "Even";
        
        return "Odd";
    }
}

// Input : 1
// Output : Odd

// Input : 2
// Output : Even