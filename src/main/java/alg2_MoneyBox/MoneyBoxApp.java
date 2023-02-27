package alg2_MoneyBox;

import alg2_27_2.Point;

import java.util.Scanner;

public class MoneyBoxApp
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        MoneyBox Alice = new MoneyBox(12, 9, "Alice");
        MoneyBox Bob = new MoneyBox("Bob");

        Bob.insertSingle();
        Bob.insertSingle();
        Bob.insertDouble();
        Bob.insertDouble();
        Bob.insertDouble();
        Bob.insert(5,10);

        System.out.println(Alice.getSum());
        System.out.println(Bob.getSum());

        System.out.println(Alice);
        System.out.println(Bob);

        System.out.println(Alice.isEnough(39)?"Alice si muze koupit burger":"Alice si nemuze koupit burger");
        System.out.println(Bob.isEnough(39)?"Bob si muze koupit burger":"Bob si nemuze koupit burger");

        int aSum = Alice.getSum();
        int bSum = Bob.getSum();

        if(aSum > bSum){
            System.out.println("Alice ma vice penez.");
        }
        else if(aSum < bSum){
            System.out.println("Bob ma vice penez.");
        }
        else{
            System.out.println("Oba maji stejne");
        }

        Bob.setOwner("Alice");

    }



}
