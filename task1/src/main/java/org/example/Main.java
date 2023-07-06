package org.example;

import static jdk.internal.org.jline.utils.Colors.h;

public class Main {
    public static <decimal> void main(String[] args) {
        int a = 23;                 //bit : 32, değer aralığı : -2,147,483,648’den 2,147,483,647’ye
        // uint                     //bit : 32, değer aralığı : 0’dan 4,294,967,295’e (unsigned)
        double b = 23.7;            //bit : 64, değer aralığı : 5E-324 ile 1.7E+308
        String txt = "testinium";   //bit : 20+(n/2)*4
        char x = 'a';               //bit : 16, değer aralığı : yalnızca bir karakter
        boolean tf = true;          //bit : 16, değer aralığı : true-false
        float c = 2.3f;             //bit : 32, değer aralığı : 1.5E-45 ile 3.4E+38
        byte d = 0;                 //bit : 8, değer aralığı : 0'dan 255'e
        //sbyte e = -128;           //bit : 8, değer aralığı : -128'den 127'ye kadar
        //short f = -32.768;        //bit : 16, değer aralığı : -32,768’den 32,767’ye
        //ushort z = 65.000;        //bit : 16, değer aralığı : 0’dan 65,535’e
        //decimal ab = 3.14f;       //bit:128, değer aralığı : 1E-28 ile 7.9E+28
        long s = -9223372036854775808L; //bit : 64, değer aralığı : -9,223,372,036,854,775,808’den 9,223,372,036,854,775,807’ye
        //ulong y = 18446744073709551615; //bit : 64, değer aralığı : 0’dan 18,446,744,073,709,551,615’e



        System.out.println(a);
        System.out.println(b);
        System.out.println(txt);
        System.out.println(tf);
        System.out.println(c);
        System.out.println(x);
        System.out.println(d);
        //System.out.println(y);
        //System.out.println(ab);
        //System.out.println(z);
        //System.out.println(f);
        //System.out.println(e);
        System.out.println(s);


    }
}
