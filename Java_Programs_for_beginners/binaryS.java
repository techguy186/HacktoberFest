import java.util.*;

public class binaryS{

    public static void main(String[] args) {

        // Binary Search O(log n)
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        int val = sc.nextInt();

        int low = 0;
        int high = a.length - 1;

        if(val < a[low] || val > a[high]){
            System.out.println("Not Found");
            System.exit(-1);
        }

        else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (val > a[mid]) {
                    low = mid + 1;
                } else if (val < a[mid]) {
                    high = mid - 1;
                } else {
                    System.out.println(val + " Found at Index " + mid);
                    System.exit(1);
                }
            }
        }

        System.out.println("Not Found");

    }
}