import java.util.Scanner;

public class arrayprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter " + size + " ele step by step");
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        for(int i = 0; i<=arr.length-1 ; i++){
            System.out.print(arr[i]+" + ");
        }
        System.out.print(arr[size-1] + "=" + "sum");
    }
}
