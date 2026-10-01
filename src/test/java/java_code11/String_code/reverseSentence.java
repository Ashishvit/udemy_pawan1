package java_code11.String_code;

class reverseSentence {

    public static void main(String args[]) {

    String sentence = "Today is Sunday";
    String words[] = sentence.split(" ");
    //“This line splits a sentence into an array of words using space as the delimiter.
    // For example, ‘I am learning Java’ becomes ["I","am","learning","Java"].”
         for (int i = words.length - 1; i >= 0; i--) {
             System.out.print(words[i]+" ");
         }
    }
}

// Input: "Today is Sunday"
// split("") creates: ["T", "o", "d", "a", "y", " ", "i", "s", ...]
// Output after reverse: y a d n u S   s i   y a d o T
//String str = "Hello I am here";
//String[] words = str.split(" ");

//String result = "";

     //   for (String word : words) {

//String reverse = "";

           // for (int i = word.length() - 1; i >= 0; i--) {
//reverse = reverse + word.charAt(i);
         //   }

//result = result + reverse + " ";
      //  }

     //   System.out.println(result.trim());
     //



