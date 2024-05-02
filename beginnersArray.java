public class beginnersArray {
    public static void main (String[] args){
        int arr1[] = {2,4,6,8,10};
        
        //accessing the elements in in array
        arr1[0] = 2;
        arr1[0] = 4;
        arr1[0] = 6;
        arr1[0] = 8;
        arr1[0] = 10;

        System.out.println(arr1[2]);
        System.out.println(arr1[4]);


        //modifying elements of an array
        arr1[4] = 12;
        System.out.println(arr1[4]);

        

        //finding the length of an array
        int arr3[] = {3,4,5,6,7,8,9};
        int length = arr3.length;
        System.out.println("Length of array is:" + length);

        //multidimensional array
        int arr4 [][] = {{1,2,3},{9,3,4},{12,45,67}};
        System.out.println("print element at row 2 column 2: " + arr4[2][2]);

        //modifying the elements in multidimensional array
        int mod = arr4[0][1] = 7;
        System.out.println("The modified element is : " + mod);

        //looping through an array
        int arr5[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arr5.length; i++){
            System.out.println(" The array of elements is: " + arr5[i]);
        }

        //using for each in an array
        int arr2[] = {1,3,5,7,9};
        for(int a: arr2){
            System.out.println(a);
        }
    }
}