package hw_1;

import hw_1.fruits.Apple;
import hw_1.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"qwe","ff","sdf"};

        ArrayList<String> arrl = arrayToList(arr);
        System.out.println(arrl);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        box1.add(new Apple());

        BoxWithFruits<Orange> box2 = new BoxWithFruits<>();
        box2.add(new Orange());

    }

    public static <T> ArrayList<T> arrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }


    public static <T> void swap(T[] arr, int index1, int index2){
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }
}
