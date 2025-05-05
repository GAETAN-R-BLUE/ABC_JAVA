package CAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        ArrayList<Car>carList = new ArrayList<>();
        carList.add(new Car("Honda", "Accord", 2020, 18960.25));
        carList.add(new Car("Honda", "Civic", 2020, 18960.25));
        carList.add(new Car("Honda", "CRV", 2020, 18960.25));
        System.out.println("\nCar details:");

        for (Car car : carList) {
            System.out.println("\n" + car + "\n");
        }
        Collections.sort(carList, (c1, c2) -> Double.compare(c2.getPrice(), c1.getPrice()));
        for (Car car : carList) {
            System.out.println("\n" + car + "\n");
        }
        printTotalPrice(carList);
    }
    public static void printTotalPrice (ArrayList <Car> cars){
        double total = 0;
        for (Car c : cars){
            total += c.getPrice();
        }
        System.out.println("The cumulative total for all cars is: " + total);
    }
}
