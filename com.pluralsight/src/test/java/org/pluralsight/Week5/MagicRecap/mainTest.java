package org.pluralsight.Week5.MagicRecap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    void testCastSpell() {
        // action
        Wizard wizard = new Wizard("yooo");
        wizard.setHouse("187th murda block");
        wizard.setName("yo yo ");
        wizard.setAge(18);
        Wand wand = new Wand();

        wand.setOwner("yo yo");
        wand.setWood("polymer");
        wand.setLength(19);

        //act
        wizard.addWand(wand);
        // arrange
        System.out.println(wizard.getWands().getFirst().getOwner());
    }

}