import java.util.Scanner;

public class Task4 {
    public static int[] getArray(int n, int m){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            temp = scanner.nextInt();
            if(temp >= m || temp < 0){
                System.out.println(temp + " Не принадлежит диапозону [0;" + (m-1) + "]");
                return arr;
            }
            arr[i] = temp;
        }
        return arr;
    }
    public static int[] getCountedArray(int[] array,int m){ //countedArray - массив, которые подсчитывает кол-во одиннаковых значений(значения = индексы)
        int[] countedArray = new int[m];
        for (int i = 0; i < array.length; i++) {
            countedArray[array[i]] +=1;
        }
        return countedArray;
    }

    public static void printCountedArray(int[] countedArray){
        for (int i = 0; i < countedArray.length; i++) {
            for (int j = 0; j < countedArray[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число элементов в массиве");
        int n = scanner.nextInt();

        System.out.println("Введите m максимальное число для массива вида m - 1");
        int m = scanner.nextInt();

        printCountedArray(getCountedArray(getArray(n,m),m));
    }
}