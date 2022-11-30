// Import the HashMap class
package learn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;
import java.util.Scanner;


public class Main   {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 10;i++) {
            ar.add(i);
        }
        ar.stream().filter(abc -> abc >5).forEach(a -> System.out.print(a + " "));
        ar.stream().filter(abc -> abc >5).peek(abc -> System.out.print(abc + " ")).count();
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("amount of nums: ");
        int n = sc.nextInt();
        System.out.print("your array: ");
        for (int i = 0;i<=n;i++){
            arr.add(sc.nextInt());
        }
        System.out.print("your number: ");
        int k = sc.nextInt();
//        int count = 0;
//
//        for(Integer i : arr){
////            if(i==k){
////                count++;
////            }
//            count= i==k ? count+1 : count;
//        }

        System.out.println("there was "+arr.stream().filter(abc->abc==k && abc%2==0).count());
    }

    public static void main2(String[] args) {
//        // Create a HashMap object called capitalCities
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//        // Add keys and values (Country, City)
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.get("USA"));
//        capitalCities.remove("England");
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.size());

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print((int) Math.pow(a,b));

    }
}
