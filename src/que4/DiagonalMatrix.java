package que4;
import java.util.Scanner;
public class DiagonalMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		//System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		//System.out.println("Enter the array elements");
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int flag=1;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i!=j) {
					if(arr[i][j]==0) {
						flag=1;
					}
					else {
						flag=0;
						break;
					}
				}
			}
		}
		if(flag==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
