package BoundedGenerics;

public class FindMaxElement {

    public static <T extends Comparable<T>> T findMax(T[] array ){

        if(array == null || array.length == 0) {
            return  null;
        }
        T max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null && max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] number = {4, 7, 1, 9, 3, 5};
        System.out.println("Maximum Integer: "+ findMax(number));
        Double[] decimals = {3.14, 2.71, 1.63, 2.718};
        System.out.println("Maximum Double: "+ findMax(decimals));

    }
}
