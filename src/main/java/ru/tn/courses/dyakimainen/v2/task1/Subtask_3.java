package ru.tn.courses.dyakimainen.v2.task1;
/**
 * Created by dyakimainen on 12.11.21.
 Сортировка выбором. Дана последовательность чисел а1, а2, ..., аn.
 Требуется переставить элементы так, чтобы они были расположены по убыванию.
 Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый – на место наибольшего.
 Затем, начиная со второго, эта процедура повторяется.
 Написать алгоритм сортировки выбором.
 */
public class Subtask_3 {
    public static void main(String[] args) {
        int n=10; //пусть будет 10
        int[] arr=arr_gen(n);
        sel_sort(arr);
    }
    public static void sel_sort(int [] array){
        for (int i=0;i<array.length;i++){
            int max = array[i];
            int buf=i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]>max){
                    buf=j;
                    max=array[j];
                }}
            array[buf]=array[i];
            array[i]=max;
        }
        System.out.println("Sorted array:");
        arr_printer(array);
    }
    public static int [] arr_gen(int n){
        int[] array = new int[n];
        System.out.println("Original array:");
        for (int i=0; i<array.length;i++) {
            array[i]= (int) Math.round((Math.random() * 20)); //от 0 до 5
        }
        arr_printer(array);
        return array;
    }
    public static void arr_printer(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }


}
