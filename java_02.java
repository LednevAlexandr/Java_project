import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int n = 3;
		int k = 3;
		int[] nums = new int[n];
		generated(nums,0,k);
		}
	public static void generated(int[] arr, int index,int k){
	    if (index == arr.length){
	        System.out.println(Arrays.toString(arr));
	        return;
	    }
	    for (int i = 0; i < k;++i){
	        arr[index] = i;
	        generated(arr,index+1,k);
	    }
	}
}
