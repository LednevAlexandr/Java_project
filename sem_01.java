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
        if (arr.length < 3) return false;
        if (arr[0] >= arr[1]) return false;
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
