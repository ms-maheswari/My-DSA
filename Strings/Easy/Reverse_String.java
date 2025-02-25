public class Reverse_String {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverseString(str);
        System.out.println(result);
    }

    // Two Pointer Approach
    public static String reverseString(String str){
        char arr[] = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}


// Input: 
// String : Hello

// Output:
// olleH