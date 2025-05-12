import java.util.*;
import java.lang.*;
public class GoodInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int a=arr[i];
            int x=1;
            int y=(int)Math.cbrt(a);
            while(x<y){
                int z=(int)Math.pow(x,3)+(int)Math.pow(y, 3);
                if(z<a){
                    x++;
                }else if(z==a){
                    count++;
                    break;
                }
            }  
        }
        System.out.println(count);
    }
}