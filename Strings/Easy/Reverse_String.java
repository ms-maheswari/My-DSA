public class Reverse_String {
    // Two Pointer Approach
    public static String reverseString(String str){
        char arr[] = str.toCharArray(); // Store the string in char array
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
    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverseString(str);
        System.out.println(result);
    }
}


// Input: Hello

// Output: olleH