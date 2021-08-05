import java.util.*;

class Matrix
{
	public int Addition(int Arr[][])
	{
		int iSum = 0;
		for(int i = 0; i< Arr.length;i++)
		{
			for(int j = 0; j < Arr[i].length;j++)
			{
				iSum = iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}
class Program214
{
	public static void main(String str[])	// From 26th June new PPA batch
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of columns");
		int col = sobj.nextInt();

		int Arr[][] = new int[row][col];

		System.out.println("Enter the elements");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				Arr[i][j] = sobj.nextInt();
			}
		}

		System.out.println("Entered elements are");
		for(int i = 0; i < Arr.length; i++)	// Rows
		{
			for(int j = 0; j < Arr[i].length; j++)	// Columns
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}

		Matrix mobj = new Matrix();
		int ret = mobj.Addition(Arr);
		System.out.println("Addition is : "+ret);

		Arr = null;
	}
}


























