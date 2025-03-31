package test;

public class Employee extends Person {
    private String name;
    private String address;
    private double experience;

    protected void comeToOffice() {
        System.out.println("In the office from 8-18");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
