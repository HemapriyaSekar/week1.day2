package week1.day2.Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		for (int i=0;i<arr1.length;i++)
		{
			for (int m=0;m<arr2.length;m++)
			{
				if (arr1[i]==arr2[m])
				{
					System.out.print(arr1[i]);
					return;
				}
			}
		}

	}

}
