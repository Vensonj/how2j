package com.wen.controlflow;

/**
 * @program: IntelliJ IDEA
 * @author: wen
 * @create: 2020/12/30 0030
 */
public class Case1 {
    public static void main(String[] args) {
        int x,y,z,m;
        for (x=0;x<100;x++){
            for (y=0;y<100;y++){
                for (z=0;z<100;z++){
                    for (m=0;m<100;m++){
                        if (x+y==8){
                            if (z-m==6){
                                if (x+z==14){
                                    if (y+m==10){
                                        System.out.println("x="+x);
                                        System.out.println("y="+y);
                                        System.out.println("z="+z);
                                        System.out.println("m="+m);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
