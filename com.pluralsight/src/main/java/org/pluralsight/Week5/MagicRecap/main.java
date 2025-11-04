package org.pluralsight.Week5.MagicRecap;

import java.util.ArrayList;

public class main {
    static void main() {
        Wizard wizard = new DarkWizard("Yo yo", "dodge attacks");
        wizard.setHouse("187th murda block");
        wizard.setAge(18);
        Wand wand = new Wand();

//        Professor professor = new Professor("yooo", "sliding ");
        wand.setOwner("yo yo");
        wand.setWood("polymer");
        wand.setLength(19);
        wizard.addWand(wand);

        ArrayList<Wizard> wizards = new ArrayList<>();
        wizards.add(wizard);
//        wizards.add(professor);
        for(Wand wands : wizard.getWands()) {
            if(wands instanceof  Wand) {
                wands.castSpell("mike");
            }
        }

        for(Wizard wizardChoice : wizards) {
            if(wizardChoice instanceof  Professor) {
                System.out.println(wizardChoice.getName() + " is a professor");
            } else if(wizardChoice instanceof  Wizard) {
                System.out.println(wizardChoice.getName() + " is not a professor");
            }
        }
    }
}
