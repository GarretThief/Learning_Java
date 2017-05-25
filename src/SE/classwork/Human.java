package SE.classwork;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by garret on 25.05.17.
 */
public class Human {

    public static void main(String[] args) {
        Random random = new Random(999);
        //create people
        int [] people = new int[random.nextInt(95)+5];
        for (int i = 0; i< people.length; i++)
            people[i] = random.nextInt(140)+20;
        //create 2 groups
        int []group1 = new int[people.length];
        int []group2 = new int[people.length];
        int count1 = 0;
        int count2 = 0;
        Arrays.sort(people);
        for (int ves : people)
            System.out.print(ves + " ");



        //Суммарный вес всех людей
        int sumOfPeople = 0;
        for (int i = 0; i < people.length; i++){
            sumOfPeople += people[i];
        }

        int sum1 = 0;
        int sum2 = 0;
        //Разбитие на группы
        for (int i = 0; i<people.length; i++){
            if (i % 2 == 0) {
                group1[count1] = people[i];
                count1++;
            }else {
                group2[count2] = people[i];
                count2++;
            }
        }

        //Суммирование каждой группы

        for (int i = 0; i < group1.length; i++){
            sum1 += group1[i];
        }
        for (int i = 0; i < group2.length; i++){
            sum2 += group2[i];
        }

        //Уравниваем шансы
        int raznica = 0;
        if (sum1>sum2){
            raznica = sum1-sum2;
            for (int i = 0; i < group1.length; i++){
                if (group1[i] >= raznica/2) {
                    group2[count2] = group1[i];
                    group1[i] = 0;
                    break;
                }
            }
        }
        else if (sum2>sum1){
            raznica = sum2 - sum1;
            for (int i = 0; i < group2.length; i++){
                if (group2[i] >= raznica/2) {
                    group1[count1] = group2[i];
                    group2[i] = 0;
                    break;
                }
            }
        }


        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < group1.length; i++){
            sum1 += group1[i];
        }
        for (int i = 0; i < group2.length; i++){
            sum2 += group2[i];
        }

        System.out.println("\n Всего людей: "+people.length);
        System.out.println("\n Общий вес: "+sumOfPeople);
        System.out.println("Cуммарный вес 1 группы: "+sum1);
        System.out.println("Cуммарный вес 2 группы: "+sum2);
        System.out.println("difference = "+(sum2- sum1));

    }
}
