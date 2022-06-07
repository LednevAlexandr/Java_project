class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i <= arr.length-1;i++){
            if (arr[i] == 0){
                for (int j=arr.length-1;j>=i;j--){
                    arr[j]=arr[j-1];
                }
                arr[i]=0;
                i++;
            }
        }
        return;
    }
}


class Solution {
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        if (arr.length < 3 || arr[0] >= arr[1]) return false;
        for (int i = 2;i < arr.length;i++){
            if (arr[i] == arr[i-1]) return  false;
            if (arr[i] < arr[i-1]){
                index = i;
                break;
            }
           
        }
         if (index == 0) return false;
        for (int j = index+1;j <arr.length;j++){
            if (arr[j] >= arr[j-1] ) return false;
        }
        return true;
    }
}



import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	   moveTower(3,'А','B','C');
}
    public static void move(char point1, char point2){
        System.out.printf("Передвигаем из стержня %s в стержень %s",point1,point2);
        System.out.println();
        return;
    }
    public static void moveTower(int n,char point1,char point2,char temp){
        if (n == 0){
            return;
        }
        moveTower(n-1,point1,temp,point2);
        move(point1,point2);
        moveTower(n-1,temp,point2,point1);
    }

}


