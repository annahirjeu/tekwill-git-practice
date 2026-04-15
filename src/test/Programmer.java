package test;

public class Programmer extends Employee {
    private String[] knownLanguages;

    void writeCode() {
        System.out.println("Writing code 24/24");
    }

    public String[] getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(String[] knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    @Override
    public void comeToOffice() {
        super.comeToOffice();
        System.out.println("Maybe to work some more hours");

    }
}
