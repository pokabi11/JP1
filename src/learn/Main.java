// Import the HashMap class
package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.math.*;
import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();
//        int count = 0;
//
//        for(Integer i : arr){
////            if(i==k){
////                count++;
////            }
//            count= i==k ? count+1 : count;
//        }

        System.out.println(arr.stream().filter(e->e==k).count());
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
