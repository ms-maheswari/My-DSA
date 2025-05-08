public class String_Frequency {

    // Method 1 maintains the original order of appearance   
    
    public static void countFrequency(String str){
       
        char arr[] = str.toLowerCase().toCharArray(); // convert all to lowercase and store in array

        for(int i=0;i<str.length();i++){
            
            boolean visited = false;

            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    visited = true;
                    break;
                }
            }
            if(!visited){
                int count = 1;
                for(int k= i+1; k<str.length();k++){
                    if(arr[i] == arr[k]){
                        count++;
                    }
                }
                System.out.println(arr[i] + " - " + count);
            }
        }
    }
    
    // Method 2 gives a sorted alphabetical order output (Optimal approach)

    public static void freq(String str) {
        // Create an array to store the frequency of each letter (a to z)
        int countFreq[] = new int[26];
    
        // Convert the input string to lowercase to handle case uniformly
        str = str.toLowerCase();
    
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
    
            // Check if the character is a lowercase letter (a to z)
            if (ch >= 'a' && ch <= 'z') {
                // Increment the count for that letter in the frequency array
                countFreq[ch - 'a']++;
            }
            // Ignore characters that are not letters
        }
    
      
        for (int i = 0; i < 26; i++) {
            if (countFreq[i] > 0) {
                // Convert index back to character and print its frequency
                System.out.println((char)(i + 'a') + " occurs " + countFreq[i] + " times");
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "Maheswarim";
        countFrequency(str);  // Method 1 maintains the original order of appearance
        System.out.println();
        freq(str);  // Method 2 gives a sorted alphabetical order output.
    }
}

// Method 1 

// Input : Maheswarim

// Output : 

// m - 2
// a - 2
// h - 1
// e - 1
// s - 1
// w - 1
// r - 1
// i - 1


// Method 2

// Input : Maheswarim

// Output : 

// a occurs 2 times
// e occurs 1 times
// h occurs 1 times
// i occurs 1 times
// m occurs 2 times
// r occurs 1 times
// s occurs 1 times
// w occurs 1 times