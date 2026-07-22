public class upd1{
    public static void main(String[] args) {
        int[] arr={12,32,43,65,77};
        System.out.println("arr[0] :"+ arr[0]);

        arr[0]=24;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}