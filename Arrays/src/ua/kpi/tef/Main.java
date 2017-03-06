package ua.kpi.tef;

public class Main {

    public static void main(String[] args) {
        //int []arr = {3,4,6,4,-3,5,4,3,-5,3};
        int []arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) ( Math.random() * 10 - 2);

        // Initialization
        Model model = new Model(arr);
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
