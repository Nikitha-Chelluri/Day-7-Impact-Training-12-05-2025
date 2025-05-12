import java.util.*;
class MergeArray{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = s.nextInt();
        int num1[] = new int[m];
        System.out.println("Enter num1 values: ");
        for(int i = 0; i < m; i++) {
            num1[i] = s.nextInt();
        }
        System.out.println("Enter n: ");
        int n = s.nextInt();
        int num2[] = new int[n];
        System.out.println("Enter num2 values: ");
        for(int i = 0; i < n; i++) {
            num2[i] = s.nextInt();
        } 
        int arr[] = new int[m+n];
        int p = 0, i = 0, j = 0;
        while (i < m && j < n ) {
            if (num1[i] < num2[j]) {
                arr[p] = num1[i];
                i++;
                p++;
            }
            else {
                arr[p] = num2[j];
                j++;
                p++;
            }
        }
        while ( i < n) {
            arr[p] = num1[i];
            i++;
            p++;
        }
        while ( j < n) {
            arr[p] =  num2[j];
            j++;
            p++;
        }
        for(int k = 0; k < m+n; k++) {
            System.out.print(arr[k]+"\t");
        }
        System.out.println();
        if (m+n % 2 == 0) {
            int median = (m+n)/2 - 1;
            System.out.println(arr[median]);
        }
        else {
            int median = (m+n)/2 ;
            System.out.println(arr[median]);
        }
    }
}