import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{
    ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
	public static void main(String[] args) {
	    int k = 2;
	    int n = 4;
	    Integer[] arr = new Integer[k];
	    genrated(arr,0,n);
	}
        
     public static void genrated(Integer arr[],int index,int n){
        if (index == arr.length){ 
            
            ArrayList<Integer> smallList = new ArrayList<Integer>(Arrays.asList(arr));
            bigList.add(new ArrayList<>(smallList));
            smallList.clear();
            return;
        }
        for (int i = 1;i < n + 1;++i){
            arr[index] = i;
            genrated(arr,index+1,n);
        }
        }    
}
