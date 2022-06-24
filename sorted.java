import java.util.PriorityQueue;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		array.of(3,5,6,2,7);
		System.println(sort(array));
		
	}
	public static ArrayList<Integer> sort(ArrayList<Integer> array){
	    PriorityQueue<Integer> priorityQueue = new priorityQueue<>();
	    for (int num:array){
	        priorityQueue.add(num);
	    }
	    ArrayList<Integer> sortedArray = new ArrayList<>();
	    while(!priorityQueue.isEmpty()){
	        sortedArray.add(priorityQueue.poll());
	    }
	    return sortedArray;
	}
}
