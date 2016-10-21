package com.ironyard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raul on 10/20/16.
 */
public class Main {

    public static void main(String[] args){

        testcaughtSpeedingExample();
        testcaughtSpeedingExample2();
        testcaughtSpeedingExample3();
        testcaughtSpeedingExample4();
        testsortaSumExample();
        testsortaSumExample2();
        testsortaSumExample3();
        testlove6Example();
        testlove6Example2();
        testlove6Example3();
        testblackJackExample();
        testblackJackExample2();
        testblackJackExample3();
        testblackJackExample4();

        }

    private static void testcaughtSpeedingExample(){
        int x =60;
        boolean y = false;
        int z = Logickata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);


    }

    private static void testcaughtSpeedingExample2(){
        int x =65;
        boolean y = false;
        int z = Logickata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);


    }

    private static void testcaughtSpeedingExample3(){
        int x =65;
        boolean y = true;
        int z = Logickata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);


     }

    private static void testcaughtSpeedingExample4(){
        int x =81;
        boolean y = false;
        int z = Logickata.caughtSpeeding(x, y);
        System.out.printf("caughtSpeeding(%s, %s) -> %s\n", x,y,z);


    }
    private static void testsortaSumExample(){
        int x =3;
        int y = 4;
        int z = Logickata.sortaSum(x, y);
        System.out.printf("sortaSum(%s, %s) -> %s\n", x,y,z);

    }
    private static void testsortaSumExample2(){
        int x =9;
        int y = 4;
        int z = Logickata.sortaSum(x, y);
        System.out.printf("sortaSum(%s, %s) -> %s\n", x,y,z);

    }

    private static void testsortaSumExample3(){
        int x =10;
        int y = 11;
        int z = Logickata.sortaSum(x, y);
        System.out.printf("sortaSum(%s, %s) -> %s\n", x,y,z);

    }
    private static void testlove6Example() {
        int x = 6;
        int y = 4;
        boolean z = Logickata.love6(x, y);
        System.out.printf("love6(%s, %s) -> %s\n", x, y, z);

    }

    private static void testlove6Example2() {
        int x = 4;
        int y = 5;
        boolean z = Logickata.love6(x, y);
        System.out.printf("love6(%s, %s) -> %s\n", x, y, z);

    }

    private static void testlove6Example3() {
        int x = 1;
        int y = 5;
        boolean z = Logickata.love6(x, y);
        System.out.printf("love6(%s, %s) -> %s\n", x, y, z);

    }
    private static void testblackJackExample(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(7);
        x.add(3);
        List<Integer> y = new ArrayList<Integer>();
        y.add(4);
        y.add(10);
        y.add(10);
        String z = Logickata.blackJack(x,y);

        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);


    }

    private static void testblackJackExample2(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(7);
        x.add(3);
        x.add(5);
        List<Integer> y = new ArrayList<Integer>();
        y.add(4);
        y.add(10);

        String z = Logickata.blackJack(x,y);

        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);

    }

    private static void testblackJackExample3(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(7);
        x.add(6);
        List<Integer> y = new ArrayList<Integer>();
        y.add(4);
        y.add(10);
        y.add(3);

        String z = Logickata.blackJack(x,y);

        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);

    }

    private static void testblackJackExample4(){
        List<Integer> x = new ArrayList<Integer>();
        x.add(30);
        x.add(10);
        List<Integer> y = new ArrayList<Integer>();
        y.add(11);
        y.add(10);

        String z = Logickata.blackJack(x,y);

        System.out.printf("blackJack(%s, %s) -> %s\n", x, y, z);

    }



}


