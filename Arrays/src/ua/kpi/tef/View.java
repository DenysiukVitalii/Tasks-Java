package ua.kpi.tef;

/**
 * Created by Віталій on 05.03.2017.
 */
public class View {
    public static final String ARRAY = "Array: ";
    public static final String ALL_POSITIVE = "\nAll elements of array are positive! ";
    public static final String ALL_NEGATIVE = "\nAll elements of array are negative! ";
    public static final String POSITIVE_NEGATIVE = "\nSome elements of array are positive and other elements are negative! ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printArray(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
