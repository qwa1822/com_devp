package study.배열;

import java.util.Arrays;

public class Arr_02 {
    public static void main(String[] args) {

        //[1]
        int[] a,b,c;


        //[2]
        int d[],e[],f[];

        //[3]
        int g[],h,i;

        //배열 사용이 가능한지 체크
        a=new int[3];
        b=new int[3];
        c=new int[3];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        d=new int[3];
        e=new int[3];
        f=new int[3];

        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));

        g=new int[9];
        h=100;
        i=200;

        System.out.println(Arrays.toString(g));
        System.out.println(h);
        System.out.println(i);

    }
}
