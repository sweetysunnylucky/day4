package que5;
import java.util.Scanner;
public class MaximumElementInEachColumn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=0;
		for(i=0;i<col;i++) {
			for(j=1;j<row;j++) {
				if(arr[j][i]>max) {
					max=arr[j][i];
				}
			}
			System.out.println(max);
		}
		
	}

}
