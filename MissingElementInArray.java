package week1.day2.Assignments;
import java.util.Arrays;

public class MissingElementInArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {4,2,3,1,6,9,8,7};
		Arrays.sort(arr);
		
		for(int i= 1;i<=arr.length;i++)
		{
			if (i!=arr[i-1])
			{
				System.out.println(i);
				break;
			}
		}
		

	}

}
