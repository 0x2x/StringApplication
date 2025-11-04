package org.pluralsight.Week5.MagicRecap;

public abstract class Professor extends Wizard{
    private String subject;
    Professor(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void castSpell() {
        System.out.println("Casting spell");
    }
}
