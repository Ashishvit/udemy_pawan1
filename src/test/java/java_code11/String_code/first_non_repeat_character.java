package java_code11.String_code;


public class first_non_repeat_character {

    public static void main(String args[]) {
        String str = "aabbbcccf";
        char[] arr = str.toCharArray();  // Example input
        for (int i = 0; i < arr.length; i++) {

         int  count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("First non-repeating character: " + arr[i]);
                break;
            }
        }
    }
}

//for (int i = arr.length - 1; i >= 0; i--) {
//count = 0;
  //      for (int j = arr.length - 1; j >= 0; j--) {
    //    if (i != j && arr[i] == arr[j]) {
//count++;
    //    break;
  //      }
      //  }

        //if (count == 0) {
        //System.out.println("Last non-repeating character: " + arr[i]);
          //          break;
            //                }


//String str = "swiss";
//char[] ch = str.toCharArray();

// ASCII values ke liye frequency array
//int[] freq = new int[256];

// Frequency count
      //  for (int i = 0; i < ch.length; i++) {
//freq[ch[i]]++;
     //   }

        // First non-repeating character find karna
      //  for (int i = 0; i < ch.length; i++) {
       // if (freq[ch[i]] == 1) {
       // System.out.println("First Non-Repeating Character: " + ch[i]);
         //       break;
         //               }
          //              }