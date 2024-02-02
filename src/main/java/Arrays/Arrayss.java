package Arrays;

public class Arrayss {
    public static void main(String[] args) {
        //declare  -----> construct------> initialize
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=12;
        arr[2]=13;
        arr[3]=14;
        arr[4]=15;
        for(int num:arr)
        {
            System.out.println(num);
        }
       // arr[5]=50; // no index with 5 present
        //System.out.println(arr[5]); //ArrayIndex Out of Bound Exception
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        int num[]={3,4,5,6,2}; // directly initialize the value to the array
        int val[]=new int[]{3,4,5,6,2}; // different way to initialize value to array
        //Problem with array
        //It cannot grow dynamically.
        // We need collections to deal with data which grows dynamically
        // acheive scalability.
        String str[]={"Atif","Akhil","Sabana"};
        //str[0]="Sheikh";
        str[3]="Ram";
        System.out.println(str[3]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    }
}
