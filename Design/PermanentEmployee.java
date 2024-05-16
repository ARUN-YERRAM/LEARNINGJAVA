public class PermanentEmployee extends Employee{
    private double basicPay;
    private double hra;
    private int experience;

    PermanentEmployee(String name,int id, double bpay, double h, int e){
        super(name,id);
        basicPay=bpay;
        hra=h;
        experience=e;
    }
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
    void calculateSalary(){
        double temp = 0;
        temp=getBasicPay()+getHra();
        int e = getExperience();
        double bpay = getBasicPay();
        if((e >= 3) && (e < 5)){
            temp+=0.05*bpay;
        } else if (e>=5 && e<10) {
            temp+=0.07*bpay;
        }else {
            temp+=0.12*bpay;
        }
        super.setSalary(temp);
    }
}
