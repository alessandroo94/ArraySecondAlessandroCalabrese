package Array01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String carBrands[] = new String[5];
        carBrands[0] = "Ferrari";
        carBrands[1] = "Audi";
        carBrands[2] = "BMW";
        carBrands[3] = "Jeep";
        carBrands[4] = "Fiat";

        System.out.println("The length of the list is: " + carBrands.length);
        System.out.println("The 3rd item is " + carBrands[2]);

        int primeNumber[] = new int[]{2,3,5,7,11,13};
        System.out.println(Arrays.toString(primeNumber));
    }
}
