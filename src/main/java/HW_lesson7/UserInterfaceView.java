package HW_lesson7;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the name of the city");
            String city = scanner.nextLine();


            System.out.println("Forecast for today - 1. Forecast for five days - 5. EXIT - 0");
            String command = scanner.nextLine();


            if("0".equals(command)) break;
            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
