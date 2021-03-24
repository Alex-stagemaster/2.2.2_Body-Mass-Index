import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш вес в килограммах:");
        int clientWeight = in.nextInt();

        System.out.println("Введите Ваш рост в сантиметрах:");
        int clientHeight = in.nextInt();

        double bmi = service.calculate(clientWeight, clientHeight);

        if (bmi < 16.00) {
            System.out.printf("Ваш ИМТ составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас выраженный дифицит массы тела");
        } else if (bmi < 18.50) {
            System.out.printf("Ваш ИМТ составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас недостаточная масса тела");
        } else if (bmi < 25.00) {
            System.out.printf("Ваш ИМТ составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас нормальная масса тела");
        } else if (bmi < 30.00) {
            System.out.printf("Ваш индекс массы тела составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас избыточная масса тела");
        } else if (bmi < 35.00) {
            System.out.printf("Ваш ИМТ составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас ожирениеш I степени");
        } else if (bmi < 40.00) {
            System.out.printf("Ваш ИМТ составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас ожирение II степени");
        } else {
            System.out.printf("Ваш ИМТ составляет: " + "%.1f", bmi);
            System.out.println();
            System.out.println("У Вас ожирение III степени");
        }
    }
}