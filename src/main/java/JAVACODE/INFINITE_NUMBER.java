package JAVACODE;
import java.util.Scanner;

public class INFINITE_NUMBER {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to find in the infinte number");
		int[]arr= {3,5,7,9,10,90,100,130,140,160,170};
		int target=sc.nextInt();
		System.out.println(ans(arr,target));
	}
	static int ans( int arr[] ,int target) {
			// first find the range
		// first start with a box of 2
		int start=0;
		int end=1;
		// condition forthe target to lie in the range
		while(target>arr[end]) {
			int newStart= end+1;// we are taking this coz old start we are using in the new end
			//double the box value
			//end=end+size of box*2
			end=end+(end-start+1)*2 ;
			start=newStart; // so we update start here ;
			
		}
		return binarySearch(arr, target,start,end);
	}
	public static int binarySearch(int[] arr, int target,int start, int end) {
		
		while(start<=end) {
			int mid= start+(end -start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
				
			}
		}
		return -1;
	}
}
