public class Main
{
	public static void main(String[] args) {
	    int[] arr1 = {3,5,24,5};
	    int[] arr2 = {1,1,1,1};
	    Separation_arrays(arr1,arr2);
		System.out.println(Except1(5,0));
		System.out.println(Except2(null));
		System.out.println(Except3(arr1,10));
	}
	//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    //Посмотрите на код, и подумайте сколько разных типов исключений вы тут 
    //сможете получить?
    public static double Except1(int a, int b){
        return a/b;
    }
    public static int Except2(int[] a){
        return a.length;
    }
    public static int Except3(int[] a,int k){
        
        return a[k];
    }
    
   // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    //и возвращающий новый массив, каждый элемент которого равен разности элементов 
   // двух входящих массивов в той же ячейке. Если длины массивов не равны,
    //необходимо как-то оповестить пользователя.
    
    public static void Separation_arrays(int[] a,int[] b){
        if (a.length != b.length){ 
            System.out.println("Длинны масивов не равны, введите равные по длинне масивы");
        }
        int[] array = new int[a.length];
        for (int i = 0;i < a.length;i++){
            array[i] = a[i]-b[i];
        }
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        return;
    }
    
}
