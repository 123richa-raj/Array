package Array;
import java.util.*;

public class matrix_sum_column {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int [][]arr=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
				}
			}
		maxsum(arr);
		}
	public static   void maxsum(int [][]arr) {
		int ans=Integer.MIN_VALUE;
		int max=-1;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				sum=sum+arr[j][i];
				}
			if(sum>max){
				max=sum;
				ans=i;
				}
			}
		System.out.println((ans+1)+" "+max);
	}
}