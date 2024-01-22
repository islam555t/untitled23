
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.8, 3.2, -4.7, -5.1, 6.3, -7.9, 8.2, -9.4, 10.6, -11.8, 12.9, -13.2, 14.5, -15.7};

        double sum = 0;
        int count = 0;

        boolean foundNegative = false;


        for (double number : numbers) {
            if (foundNegative && number > 0) {
                sum += number;
                count++;
            }

            if (number < 0) {
                foundNegative = true;
            }
        }

        double average = sum / count;

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}
        

