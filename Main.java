package com.company;

import java.util.Scanner;
// 27) Дано вещественное число x. Вычислить x - x^3/3!+x^5/5!...x^13/13!
public class Main {

    public static void main(String[] args){
        int znam = 1;
        double chesl = 1;
        double[] drobi = new double[14];
        Scanner scanner  = new Scanner(System.in);
        double x = scanner.nextDouble();

        for (int i = 1; i < 14; i++) {
            znam = znam * i;
            chesl = chesl * x;
            drobi[i] = chesl / znam;
            System.out.println(drobi[i]);

        }
        double sum = x;
        for (int z = 3; z < 14; z+=2) {
            sum = sum + drobi[z];
        }
        System.out.println(sum);
    }




}




class lab1 {
    //52) Найти сумму –1^2 + 2^2 – 3^2 + 4^2 + ... + 10^2. Условную инструкцию не использовать.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + i * i;
        }
        System.out.println(sum);

    }
}
class lab2{
    // 77) Около стены наклонно стоит палка длиной 4,5 м. Нижний конец находится на расстоянии 3 м от стены. Он начинает
    //скользить в плоскости, перпендикулярной стене. Определить значения угла между палкой и полом (в градусах) через
    //каждые 0,2 м с момента начала скольжения до падения палки.
    public static void main(String[] args) {
        double len = 4.5;
        double corn, corn2;
        for (double fl = 3; fl < 4.5; fl+=0.2){
            corn = Math.acos(fl/len);
            corn2 = corn * 180 / 3.14;
            System.out.println("The angle is "+corn2);
        }
    }
}
class lab3{

    public static void main(String[] args) {
        //102) В области N районов. Известны количество жителей (в тыс. чел.) и площадь (в км2) каждого района.
        // Определить среднюю плотность населения по области в целом.
        Scanner scanner  = new Scanner(System.in);
        int N = scanner.nextInt();
        double chelall = 0, Sall = 0;
        double chel,S;
        for (int i=0; i<N; i++){
            System.out.print("number of people and area: ");
            chel= scanner.nextDouble();
            S = scanner.nextDouble();
            chelall = chelall + chel;
            Sall = Sall + S;
        }
        double average = chelall / Sall;
        System.out.print("The average is: "+average );


    }
}
class lab4 {
    public static void main(String[] args) {
        //137) Найдите все трёхзначные натуральные числа, равные сумме кубов своих цифр.
        double t,h,o;
        for (int i =100; i < 1000; i++) {
            double tens = Math.floor(i/10) % 10;
            double hundr = Math.floor(i / 100);
            double ones = i%10;
            double cubetens = tens*tens*tens;
            double cubeones = ones*ones*ones;
            double cubehundr = hundr*hundr*hundr;
            double sum = cubetens + cubeones + cubehundr;
            if( sum == i ){
                System.out.println(i);
            }

        }
    }
}