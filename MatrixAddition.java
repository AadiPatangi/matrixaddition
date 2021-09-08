import java.util.Scanner;
public class matrix_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr1[][] = new int[2][3];
		System.out.println("matrix addition");
		System.out.println("Enter some values: ");
		for(int x = 0;x<2;x++) {
			for(int y = 0;y<3;y++) {
				arr1[x][y] = scan.nextInt();
			}
			
		}
     int arr2[][] = new int[2][3];
     System.out.println("Enter some values");
     for(int i = 0;i<2;i++) {
    	 for(int j = 0;j<3;j++)
    	 {
    		 arr2[i][j] = scan.nextInt();
     }
	}
     
     int sum[][]=new int[2][3];
  for (int x = 0;x<2;x++) {
	  for(int y = 0;y<3;y++) {
		   sum[x][y] = arr1[x][y] + arr2[x][y];
	  }
  }
  
  
  System.out.println("  Here  is the  resultant Matxix");
  for (int x = 0;x<2;x++) {
	  for(int y = 0;y<3;y++) {
		  System.out.print(" "+sum[x][y]);
	  }
	 System.out.println();
  }
  
  
 

  
  }
}
