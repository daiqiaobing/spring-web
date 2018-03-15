package com.soecode.lyf;

import junit.framework.TestCase;

public class BasicTest extends TestCase{


    public void testSwitch(){
        int i = 200;
        switch (i){
            case 100:
                System.out.println(i);
            case 200:
                System.out.println(i);
            case 300:
                System.out.println(i + 1);
            case 400:
                System.out.println(i);
        }
    }


}
