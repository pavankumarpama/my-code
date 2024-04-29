public class oddEven {
    public static void main (String[] args){
        int data [] = {1,3,5,2,4,6,11,12,15,16};
        System.out.println(" odd numbers  are :");
        for(int i = 0; i < data.length; i++){
            // for odd numbers
            if(data[i]%2!=0){
                System.out.println(data[i]);
            }
            }
            System.out.println(" even numbers  are :");
            for(int i = 0; i<data.length; i++){
            if(data[i]%2==0){
                System.out.println(data[i]);
            // System.out.println(data[i]);
            }
        }
    }
}