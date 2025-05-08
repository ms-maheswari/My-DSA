package Medium;
public class First_Unique_Character {

    // Method 1

    public static int firstUniqChar(String s) {
        char arr[] = s.toLowerCase().toCharArray();

        for(int i = 0 ; i < s.length(); i++){
            boolean visited = false;

            for(int j = i + 1 ; j < i ; j++){
                if(arr[i] == arr[j]){
                    visited = true;
                    break;
                }
            }

            if(!visited){
                int count = 1;
                for(int k = i + 1 ; k < s.length(); k++){
                    if(arr[i] == arr[k]){
                        count++;
                    }
                }
                if(count == 1){
                    return i;
                }
            }
        }
        return -1;
    }
   
    // Method 2

    public static int unique_Character(String str){

        // Create new array of length 26 to store alphabets
        int countArray[] = new int[26];

        str = str.toLowerCase();

        // Use loop to iterate the string characters and stores their frequency in countArray
        for(int i=0;i<str.length();i++){
            countArray[str.charAt(i) - 'a']++;
        }

        // Use loop to iterate the string characters and if the countArray of respective character frequency is equals to 1 then return that index
        for(int i=0;i<str.length();i++){
            if(countArray[str.charAt(i) - 'a']==1){
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        String str = "Maheswarim";
        int index = unique_Character(str);
        System.out.println("First Unique Character is " + str.charAt(index) + " at index " + index);
        int index1 = firstUniqChar(str);
        System.out.println("First Unique Character is " + str.charAt(index1) + " at index " + index1);
    }    
}


// Input : str = "hello"

// Output : First Unique Character is: h at index: 0