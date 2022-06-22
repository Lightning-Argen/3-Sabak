import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       /* System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");*/
//        System.out.println();
//        System.out.println();


//        System.out.printf("%s %d", "Salam", 77);
//        System.out.println();
//        System.out.printf("%s %d %.2f" , "Salam", 7, 2.5);

       /* System.out.printf("%s %d %.9f", "Salam",55,38.4);*/

// бул горячий калвишалар

//ctrl C копия
//ctrl V вставка
//sout бул горячий клавиша
//ctrl D дубликат
//ctrl Z бир к адам артка
//ctrl / баарыны бир заматта комент жасоо

        // %s создорго
// %d бутун сандарга  12345
// %f болчок сандарга  2.5  1.2

// bytyn san
//        int nameArgen  = 51;
//        int nameargen  = 33;
//        System.out.println(nameArgen);
//
//        byte bytesan = 127;
//        System.out.println(bytesan);
//        short shortsan = 32767;
//        short mensan = 32767;
//        System.out.println(shortsan + mensan);
//
//        int intsan = -2147483648;
//        int intsan2 = 2147483647;
//        System.out.println(intsan);

// bolchok san
//        float f = 2.2f;
//        double d = 2.2d;

//boolean b1 = true;
//boolean b2 = false;
//
//char CH ='@';
//char ch = '3';
//char ch2 = 'a';
//        System.out.println(ch);
//        System.out.println(CH);
//        System.out.print(ch2  - ch);
//        System.out.printf("%d %d", shortsan, mensan);



//        Scanner sk = new Scanner(System.in);
//
//        int a = sk.nextInt();
//        boolean b = sk.nextBoolean();
//        System.out.println(a);
//        System.out.println(b);
//        Scanner argen = new Scanner(System.in);
//       int a = argen.nextInt();
//        int b = argen.nextInt();
//        int c = argen.nextInt();
//      boolean c1 = argen.nextBoolean();
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(c);
//       System.out.println(a+c+b);


//         int a = 5;
//        int b = 7;
//         int c = 8;
//        System.out.println(a+b+c);
//        System.out.printf("%d %d %d" , 5,7,8 );
////        System.out.println(a);
////        System.out.println(b);
////        System.out.println(c);
//        System.out.println(a+c+b);


 /*    Scanner argen = new Scanner(System.in);

    int a1 = argen.nextInt();
    int b1 = argen.nextInt();
    int c1 = argen.nextInt();*/
////        int a = 5;
////        int b = 7;
////        int c = 8;
////        System.out.println(a1);
//////        System.out.println(b1);
//////        System.out.println(c1);
////        System.out.printf("%d+%d+%d ", (a1+b1+c1));
//
        Scanner argen1  = new Scanner(System.in);

        int a = argen1.nextInt();
        int b = argen1.nextInt();
        int c = argen1.nextInt();
        float c1 = argen1.nextFloat();

//int a = 5;
//int b = 7;
//int c = 8;
//float c1 = 3.0f;



        System.out.printf("%d + %d + %d = ", a, b, c);
        System.out.println(5 +7 + 8);

        System.out.printf("%d * %d * %d = ", a, b, c);
        System.out.println(5*7*8);

        System.out.printf("(%d + %d + %d) / %.0f =  " , a, b, c,c1);
        System.out.println((5+7+8) / 3.0);






    }

}