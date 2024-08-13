package JAVALAB;

class Test3C
{

	public static int maxWater(int[] arr, int n)
	{
		int res = 0;
		for(int i = 1; i < n - 1; i++)
		{
			int left = arr[i];
			for(int j = 0; j < i; j++)
			{
				left = Math.max(left, arr[j]);
			}
			int right = arr[i];
			for(int j = i + 1; j < n; j++)
			{
				right = Math.max(right, arr[j]);
			}
			res += Math.min(left, right) - arr[i];
		}
		return res;
	}
	public static void main(String[] args)
	{
		int[] arr = {3,0,0,2,0,4};
		int n = arr.length;
		System.out.print(maxWater(arr,n));
	}
}
