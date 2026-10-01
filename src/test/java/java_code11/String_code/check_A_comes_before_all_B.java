package java_code11.String_code;

public class check_A_comes_before_all_B {

        public static void main(String[] args) {

            String str = "aaaabb";
            int lastA = str.lastIndexOf('a');
            int firstB = str.indexOf('b');

            System.out.println("lastA = " + lastA);
            System.out.println("firstB = " + firstB);

            if (firstB == -1 || lastA == -1 || lastA < firstB) {
                System.out.println("Output : true");
            } else {
                System.out.println("Output : false");
            }
        }
    }
//String str = "aaabb";   // true
//String str = "ababa";   // false
//String str = "aaaa";    // true
//String str = "bbbb";    // true
//String str = "";        // true

//String str = "aaaabb";
//int index = str.lastIndexOf('a');
//System.out.println(index); // 3
