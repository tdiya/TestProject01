package java_101;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array
		
		//single dimention Array
		//int[]b = {10,20,30};
		//double dimention Array
		//int [][]b= {{10,20,30},{11,22,33,44}};
		//     0 1     { 0,1,2 }, {0,1,2,3}
		// [][]b = [address of base] [address of single array]
		int[][] num={{10,20,30},{11,22,33,44}};
		int x = num[2][2];
		System.out.println(x);
	
	//Exception Array: catch the error
		
	try{
		int [] [] nums = {{1,2,3},{3,5,6}};
		System.out.println(nums[2][1]);
	}
	
	catch (Exception e) {
		System.out.println("doesnt exist");
		
	}
	}

}
