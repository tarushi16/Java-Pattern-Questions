public class prog76 {
    public static void main(String[] args) {
        int arr[] = new int[]{2,42,12,36,96,42};
        int max = 0;
        for(int i =1; i<arr.length;  i++){
            if(arr[i]>arr[max])
                max = i;
        }
        System.out.println(" max element = " + arr[max] + " found at " + max + "index");
    }
}
