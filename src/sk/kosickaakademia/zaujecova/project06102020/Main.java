package sk.kosickaakademia.zaujecova.project06102020;

/*public class Main {
    public static void main(String[] args) {
        //vykresli trojuholnik z hviezdiciek
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Zadaj lubovolne cislo: ");
        int n=sc.nextInt();
        if (n<0) {
            System.out.println("Chyba");
        }
        else if (n==1) {
            System.out.println("#");
        }
        else{
            for (int i=1; i<=n; i++)
                System.out.print("#");
                System.out.println();
            for(int i=1; i<=n-2; i++){
                System.out.print("#");
                for (int j=1; j<=n-2; j++)
                    System.out.print(" ");
                System.out.println("#");
                }
            }
        for (int i=1; i<=n; i++)
            System.out.print("#");*/

        /*System.out.println("zadaj tri lubovolne cisla: "); //zadaj rozmery troch stran trojuholnika a zisti, ci
        //trojuholnik je pravouhly (Pythagorova veta)
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c + c == a * a) {
                System.out.println("Trojuholnik je pravouhly.");
            } else {
                System.out.println("Trojuholnik nie je pravouhly.");
            }
        }
            else {
            System.out.println("Toto nie je trojuholnik.");
        }*/

        /*System.out.println("Napis cislo: ");
        int number = sc.nextInt();
        System.out.println("Cislo n v desiatkovej sustave je: "+number);
        long a=1; //prepis cislo z decimalnej do binarnej sustavy
        while(number!=0) {
            a = a*10 + number%2;
            number = number/2;
        }
        long answer=0;
        for (long n = a; n!=0; n /=10){
            long digit = n%10;
            answer = answer * 10 + digit;
        }
        System.out.println(answer/10);*/

       /* int x; //2. riesenie prevodu z decimal do binary
        int r=0;
       int i=0;
               while (x>0) {
           int z = x%2;
           r=z*Math.pow(10;i)+r;
i=i+1;
x=x/2;
}
        */

        /*int x=7835;  //3. riesenie prevodu z decimal do binary
        String r=" "
                while (x>0) {
                    int z =x%2;
                    if (z==0)
                        r="0"+r;
                    else
                        r="1"+r;
                    r=x/2
                }*/

        /*int x=8914;  // 4. riesenie z decimal do binary
        String s;
        s=Integer.toBinaryString(x);*/


        /* zisti PIN (4-ciferne cislo), ak:
        neparne cislo
        nie je delitene 3
        je delitelne 113
        ziadne cifry sa neopakuju
         */
        /*int x=0;
        for (int i = 1000; i<9999; i++){
            if (i%2==1 && i%3!=0 && i%113==0 && (i/10)%10!=i/10 && (i/100)%10!=(i/10)%10 && (i/100)%10!=i/10 && (i/1000)%10!=(i/100)%10 && (i/1000)%10!=(i/10)%10 && (i/1000)%10!=i/10) {
                x++;
                System.out.println(i);
            }
            }
        System.out.println(x);*/
        /* ine, rychlejsie riesenie podla podmienok, ak prvy nasobok 113 je cislo 1017
        int x=0;
               for  (int i = 1017; i<9999; i=i+226); // 226=113+113, aby pridaval iba neparne cisla */

        /*int[] array = new int[]{2, 52, 74, 1, 28, 65, 7, 189, 54, 12, 36, 74, 87, 69}; //zisti, ktore cislo je najmensie
        int min = array[0];
        for (int i=1; i<array.length; i++)
            if(array[i]<min) min=array[i];
        System.out.println(min);*/

        /*int[] array = new int[]{2, 52, 74, 1, 28, 65, 7, 189, 54, 12, 36, 74, 87, 69}; //zisti, ktore cislo je najvacsie
        int max = array[0];
        for (int i=1; i<array.length; i++)
            if(array[i]>max) max=array[i];
        System.out.println(max);*/

        int[] array = new int[]{2, 52, 74, 1, 28, 65, 7, 189, 54, 12, 36, 74, 87, 69}; //najdi parne a neparne cisla
        /*int parne =0;
        int neparne =0;
        for (int i=0; i< array.length; i++){
            if(array[i]%2==0) {
                parne++;
            }
            if(array[i]%2!=0){
                neparne++;
            }
        }
        System.out.println("Parnych cisiel je: "+parne);
        System.out.println("Neparnych cisiel je: "+neparne);*/

        int positivne = 0;
        int negativne = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                positivne++;
            }
            if (array[i] < 0) {
                negativne++;
            }
            System.out.println("Pocet pozitivnych cisiel je: " + positivne);
            System.out.println("Pocet negativnych cisiel je: " + negativne);


        /*
        //vytvor nove pole, ktore bude reversom povodneho: rev_array

       //riesenie>
       int l=array.length;
       for (int i=0; i<l; i++)
       rev_array[l-1-i]=array[i];


        int rev_array = new int [array.length];
        System.out.println("Opacne pole - reverse: ");
        for (int i=1; i<array.length; i++) {
            rev_array[i] = array[array.length - 1 - i];
            System.out.println(rev_array[i] + " ");
        }
        System.out.println();
        }*/


        }
    }
}

