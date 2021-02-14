/* Understanding concepts of Array, Operators and Control statements*/
/*sort asc, desc a numeric array*/
/* to calculate sum, avg, find max, min values of array*/
/*
 1. A static method cannot access instance variables and instance methods without class reference, even within same class. An instance method can access static methods.
 */
package intro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayOperatorLoops {
//	static int i = 10;
	//	static int n = i++%5;
//	static float m = ++i%5;

	public static int[] sortArray(String order, int arr[]){
		switch(order) {
		case "asc":
			Arrays.sort(arr);
			return arr;
		case "desc":
			int[] sorted = Arrays.stream(arr)
	        .boxed()
	        .sorted(Comparator.reverseOrder())
	        .mapToInt(Integer::intValue)
	        .toArray();
			return sorted;
		default:
			System.out.println("Order not specified");
		}
		return arr;
	}

	public int sumOfArray(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i]; 
		}
		return sum;
	}
	
	//Method Overloading
	public double sumOfArray(double arr[]) {
		double sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i]; 
		}
		return sum;
	}

	public static float avgOfArray(int arr[]) {
		float sum = 0;
		int i = 0;
		do
		{
			sum += (float)arr[i]; 
			i++;
		}while(i<arr.length);
		return (sum /= arr.length);
	}

	public static int minMaxOfArray(boolean a, int arr[]) {
		String c = (a==true)?"max":"min";
		switch(c) {
		case "max": 
			int max = arr[0];
			for(int item:arr)
				if(item>max)
					max = item;
			return max;
		case "min":	
			int min = arr[0];
			for(int item:arr)
				if(item<min)
					min = item;
			return min;
		default:
			System.out.println("duplicate values");
			return 0;
		}
	}
	public static void main(String[] args) {
//		List<String> loList = new ArrayList<String>();
//		loList.forEach(elment ->{
//			System.out.println("test");
//		});
		
		ArrayOperatorLoops obj = new ArrayOperatorLoops();
		System.out.println("What do you want to do with Array today?");
		System.out.println("\n Sort an array \n Calculate Sum of values of array \n Calculate Average of values of array \n Find max/min of values of array \n ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.print("Enter no. of elements you want in array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		double b[] = {2.2, 5.0, 7.6};
		System.out.println("Enter all the elements:");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		if(input.contains("sort") || input.contains("Sort")) {
			System.out.println("asc or desc?");
			String order = sc.next();
				System.out.println(Arrays.toString(sortArray(order, a))); 
		}
		else if(input.contains("sum")|| input.contains("Sum")) {
			System.out.println(obj.sumOfArray(a));
			System.out.println(obj.sumOfArray(b));
		}
		else if(input.contains("Average")|| input.contains("average") || input.contains("Avg")|| input.contains("avg")) {
			System.out.println(avgOfArray(a));
		}
		else
		{
			boolean isMax = (input.contains("max")||input.contains("Max"))?true:false;
			System.out.println(minMaxOfArray(isMax, a));
			System.out.println(~n);
		}		
	}
}
