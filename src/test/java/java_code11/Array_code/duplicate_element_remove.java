package java_code11.Array_code;
    class duplicate_element_remove // works on unsorted array also
    {
        public static void main(String args[])
        {
            int arr[] = {99, 99, 77, 77, 88, 88, 55, 54, 54, 65, 10};
            System.out.println("Unique elements:");
            for (int i = 0; i < arr.length; i++)
            {
                    // check duplicates of arr[i]
                    for (int j = i + 1; j < arr.length; j++)
                    {
                        if (arr[i] == arr[j])
                        {
                            arr[j] = '\0'; // mark duplicate
                        }
                    }
                }
            for(int i = 0; i<arr.length;i++)
            {
                if(arr[i] != '\0')
                {
                    System.out.print(arr[i]+"  ");
                }
            }
        }
    }

