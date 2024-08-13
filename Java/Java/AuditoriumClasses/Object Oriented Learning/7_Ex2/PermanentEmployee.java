public class PermanentEmployee extends Employee {
    public double basicPay;
    public double hra;
    public int experience;
    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void calculateSalary(){
        int exp = (this.experience<3)?0:(this.experience<5)?5:(this.experience<10)?10:12;
        this.salary = exp + this.basicPay + this.hra;
    }
}