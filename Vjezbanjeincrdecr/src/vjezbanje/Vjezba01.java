package vjezbanje;

public class Vjezba01 {
	public static void main(String[] args) {
		// #1
		int i = 11;
        
        i = i++ + ++i;
        
        System.out.println(i);
        
        // i = 24
        
        // #2
        
        int a=11, b=22, c;
        
        c = a + b + a++ + b++ + ++a + ++b;
        // a = 13 b = 24 c = 103
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        // #3
        
        i=0;
        
        i = i++ - --i + ++i - i--;
        // i = 0
        System.out.println(i);
        
        // #4
        
        /*boolean b = true;
        
        b++;
         
        System.out.println(b);
        
        ++ se ne može koristit kod booleana*/
        
        // #5
        i=1;
        int j=2, k=3;
        
        int m = i-- - j-- - k--;
        // i = 0 j = 1 k = 2 m = -4 
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);
        
        // #6
        a=1; b=2;
        // 0
        System.out.println(--b - ++a + ++b - --a);
	
        // #7
        
        i=19; j=29; k = 0;
        
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        // i = 19 j = 29 k = -20
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        
        // #8
       /* i = 11; 
          greška je jer se -- i ++ nemogu tako koristiti 
		  j = -- (i++); */
        
        // #9
        m = 0; int n = 0;
        
        int p = --m * --n * n-- * m--;
        // p = 1
        System.out.println(p);
        
        // #10
        a=1;
        
        a = a++ + ++a * --a - a--;
        // a = 5
        System.out.println(a);
        
        // #11
        /*a = 11++;
        ++ i -- se nemogu koristi u konstantama
        System.out.println(a);*/
        
        //#12
        m=1010; n=1010;
        // = 0 jer je int 
        System.out.println(m++ / ++n * n-- / --m); 
        
        // #13
        int x = 001, y=010, z=100;
        
        i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        // x = -2 y = 11 z = 98 i = -167
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("i="+i);
        //#19
        i = 0; j = 0;
        // =1
        System.out.println(--i * i++ * ++j * j++);
        
        //#21
        double d = 1.5, D = 2.5;
        // = 5.0
        System.out.println(d++ + ++D);
	}
}
