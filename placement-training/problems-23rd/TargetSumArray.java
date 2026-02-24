import java.util.Scanner;

public class TargetSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Target sum: ");
        int tar = sc.nextInt();
        
        int start = 0;
        boolean flag = false;
        int sum = arr[0];
        
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            
            while (sum > tar && start <= end) {
                sum -= arr[start];
                start++;
            }
            
            if (sum == tar) {
                System.out.println("Indexes are: " + start + " and " + end);
                flag = true;
                break;
            }
        }
        
        if (!flag) {
            System.out.println("Not possible");
        }
        
        sc.close();
    }
}
