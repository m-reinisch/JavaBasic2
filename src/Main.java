import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static void main() {
        /** easy */
//        int[] numbers= {1, 2, 3, 4, 5};
//        String[] names= {"Michael", "Andreas", "Claudia", "Anna"};
//        int[] numbers2= {2, 4, 6, 8};
//
//        for(int i= 0; i < 5; i++){
//            //System.out.println(i);
//            System.out.println(numbers[i]);
//        }
//        for (String curname:names){
//            System.out.println(curname);
//        }
//        for (int k= 0; k < numbers2.length; k++){
//            System.out.println(String.format("Das Quadrat von %d ist %d.", numbers2[k],numbers2[k]*numbers2[k]));
//        }
        /** medium */
//        int[] num= new int[10];
//        int[] num2= {11, 6, 13, 5, 8, 71};
//        int sum= 0;
//        int minimum, maximum;
//        String[] cities= {"Frankfurt", "Köln", "Berlin", "Hamburg", "Schwäbisch Hall"};
//
//        for (int i= 0; i< num.length; i++){
//            num[i]= i;
//        }
//        for (int n:num){
//            if (isEven(n)){
//                System.out.println(n);
//            }
//        }
//        for (int m:num2){
//            sum+= m;
//        }
//        System.out.println("Summe: " + sum);
//        for (int j= 0; j < cities.length; j++){
//            System.out.println(j + " " + cities[j]);
//        }
//        minimum = getMinimum(num2);
//        System.out.println("Minimum: " + minimum);
//        maximum = getMaximum(num2);
//        System.out.println("Maximum: " + maximum);
        /** bonus */
        int[] randnum= new int[10];

        System.out.println("Zufällig:");
        for (int i= 0; i < randnum.length; i++){
            randnum[i]= (int)(Math.random() * 100) + 1;
            System.out.println(randnum[i]);
        }
        int[] sortnum= randnum;
        Arrays.sort(sortnum);
        System.out.println("Sortiert:");
        for (int num:sortnum){
            System.out.println(num);
        }
        System.out.print("Minimum: ");
        System.out.println(getMinimum(randnum));
        System.out.print("Maxyimum: ");
        System.out.println(getMaximum(randnum));
        System.out.println("Durchschnitt: " + getAverage(randnum));
    }

    public static int getMaximum(int[] num2) {
        int maximum= num2[0];
        for (int actual2: num2){
            if (actual2 > maximum){
                maximum = actual2;
            }
        }
        return maximum;
    }

    public static int getMinimum(int[] num2) {
        int minimum;
        minimum= num2[0];
        for (int actual: num2){
            if (actual < minimum){
                minimum= actual;
            }
        }
        return minimum;
    }

    public static boolean isEven(int number){
        if (number%2==0){
            return true;
        } else {
            return false;
        }
    }

    public static int getAverage(int[] numbers){
        int average= 0;
        int sum= 0;

        for (int s:numbers){
            sum+= s;
        }
        average= sum / numbers.length;
        return average;
    }
}
