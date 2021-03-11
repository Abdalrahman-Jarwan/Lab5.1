/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Blank47
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbArray = new int[5];
        numbArray[0] = 1;
        numbArray[1] = 456;
        numbArray[2] = 765;
        numbArray[3] = 66;
        numbArray[4] = 7;

        int x = countOfGreater(numbArray, 5);

        System.out.println(x);
    }

    public static int countOfGreater(int[] Array1, int checkingNumber) {

        int result = 0;
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] > checkingNumber) {
                result++;
            }

        }
        return result;

    }

}
