package que3;
import java.util.Scanner;
public class MaximumElementInTheMatrix {
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
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++){
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(+max);
	}
}
