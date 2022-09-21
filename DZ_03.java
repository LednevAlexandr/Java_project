public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

public class Main
{
	public static void main(String[] args) {
		int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}};
		Method(twoDimArray);
	}
    public static int Method(String[][] twoDimArray) {
        int sum = 0;
        if (twoDimArray.length != 4 || twoDimArray[0].length != 4){
            throw new MyArrayDataException ("Введите масив 4х4");
        }
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;i++){
                try{
                    sum += Integer.parseInt (twoDimArray[i][j]);
                }
                catch(NumberFormatException e){
                    throw new MyArrayDataException ("В ячейки" + [i]+[j] + "не число"); 
                }
            }
        }
                finally{
                    return sum;
                }
            }
        }
