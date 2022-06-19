public class leddcod_01 {
    public static void main(String[] args) {

    }

    public static void main(String[] args) {
        moveTower(3, 'А', 'B', 'C');
    }

    public static void move(char point1, char point2) {
        System.out.printf("Передвигаем из стержня %s в стержень %s", point1, point2);
        System.out.println();
        return;
    }

    public static void moveTower(int n, char point1, char point2, char temp) {
        if (n == 0) {
            return;
        }
        moveTower(n - 1, point1, temp, point2);
        move(point1, point2);
        moveTower(n - 1, temp, point2, point1);
    }

}
