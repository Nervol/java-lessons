package ru.tn.courses.dyakimainen.v2.task1;
/**
 * Created by dyakimainen on 12.11.21.
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class Subtask_1 {
    public static void main(String[] args) {
        int n=10; //произвольно задали размерность массива
        int[] arr=arr_gen(n);
        int[] arr_null_nums=arr_complete_with_null_nums(arr, new int[null_score(arr)]);
        System.out.println("Array with null numbers of Generated array:");
        arr_printer(arr_null_nums);
    }
    public static int null_score(int[] array){ //метод, чтоб выделяли под массив номеров нулей сколько нужно, а не с запасом
        int k=0;//счетчик
        for (int i:array){ //узнаем число нулевых элементов
            if (i == 0) k++;
        }
        return k;
    }
    public static void arr_printer(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

    public static int[] arr_gen(int n){
        int[] array = new int[n];
        System.out.println("Generated array:");
        for (int i=0; i<array.length;i++) {
            array[i]= (int) Math.round((Math.random() * 5)); //от 0 до 5
        }
        arr_printer(array);
        return array;
    }
    public static int[] arr_complete_with_null_nums(int[] array, int[] array_nums){
        int poz=0;
        for (int i=0;i<array_nums.length;i++){ //для заполнения массива номеров нулей
            for (int j=poz; j<array.length;j++){ //пробегаем по основному массиву и ищем нули, копируем позиции
                if (array[j]==0){
                    poz=j+1; //прерываемся, запоминаем позицию, сдвигаемся от нее при след. иттерации внеш.цикла
                    array_nums[i]=j;
                    break;
                }
            }
        }
        return array_nums;
    }
}
