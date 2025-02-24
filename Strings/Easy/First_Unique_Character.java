public class First_Unique_Character {
    public static void main(String[] args) {
        String str = "hello";
        int index = unique_Character(str);
        System.out.println("First Unique Character Index: " + index);
    }
    public static int unique_Character(String str){

        // Create new array of length 26 to store alphabets
        int countArray[] = new int[26];

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
}


// Input :
// str = "hello"

// Output :
// First Unique Character Index: 0