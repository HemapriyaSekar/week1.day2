package week1.day2.Assignments;
import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,5,2,6,5,9,8,9,1,7};
		int length=arr.length;
		int count;
		for(int i=0;i<length-1;i++)
		{
			count=0;
			for(int a=i+1;a<length;a++)
			{
				if (arr[i]==arr[a])
				{
					count=count+1;
					break;
				}
				
			}
			if (count>0)
				System.out.println(arr[i]);
		
			
		}
		
		

	}

}
