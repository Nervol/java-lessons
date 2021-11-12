package ru.tn.courses.dyakimainen.v2.task1;
/**
 * Created by dyakimainen on 12.11.21.
 * У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-продажи в банках города.
 * В городе N банков.
 * Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли..
 * 
 * (от автора) Не стал проделывать ситуацию, что в банках могут быть два курса, так как не указано по условию, пусть будет рандом
 * Реализовал бы через проверку + сохранение индексов в буфер-массив,
 * пробегаясь с условием == в массиве стоимостей обмена по max
 */
public class Subtask_2 {
    public static void main(String[] args) {
        int n=10; //пусть будет 10 банков
        double[] arr=rate_gen(n);
        choose_best_bank(arr);
    }
    public static void choose_best_bank(double [] array){
        double max=array[0];
        int bank_num=0;
        for (int i=1;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
                bank_num=i;
            }}
        System.out.println("Best rate -  "+max+" rub for 1$ in bank №:"+(bank_num+1));
    }
    public static double[] rate_gen(int n){
        double[] array = new double[n];
        System.out.println("Exchange Rates in banks:");
        for (int i=0; i<array.length;i++) {
            array[i]= Math.ceil((70.0+Math.random()*5.0) * Math.pow(10, 2)) / Math.pow(10, 2); //2 знака после запятой, 70-75
        }
        rate_printer(array);
        return array;
    }
    public static void rate_printer(double[] array){
        for (int i=0; i <array.length; i++){
            System.out.println("Bank №"+(i+1)+": "+array[i]+" rub for $");
        }
        System.out.println(" ");
    }
}
