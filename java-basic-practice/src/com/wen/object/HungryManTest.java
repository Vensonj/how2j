package com.wen.object;

import static org.junit.jupiter.api.Assertions.*;

class HungryManTest {

    @org.junit.jupiter.api.Test
    void getInstance() {
        HungryMan hg1= HungryMan.getInstance();
        HungryMan hg2= HungryMan.getInstance();
        HungryMan hg3= HungryMan.getInstance();
        System.out.println(hg1==hg2);
        System.out.println(hg1==hg3);
        System.out.println(hg2==hg3);
    }
}