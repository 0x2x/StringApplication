package org.pluralsight.Week5.MagicRecap;

public class DarkWizard extends Wizard{
    private String subject;
    DarkWizard(String name, String subject) {
        super(name);
        this.subject = subject;
    }


    @Override
    public void castSpell() {
        System.out.println(getName() + " just killed a innocent standby wizard");
    }
}
