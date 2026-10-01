package java_code11.String_code;

public class count_unique_character {

	public static void main(String[] args) {

			String str = "hhpp$$@**";
			char arr[] = str.toCharArray();
		    int count = 0;

		for(int i = 0; i < arr.length; i++) {
			for(int j = i +1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						arr[j] = '\0';
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] != '\0') {
					count++;
				}
			}
			System.out.print(count);
		}
	}

//this for unique chracter
//String str = "abcde"
//   int count = 0;
//	 for(int i =0;i<str.length();i++)
//		{
//		if(str.charAt(i)!=' ')
            //count++;
//		}
//	 System.out.println("Total number of characters in a string: " +count);