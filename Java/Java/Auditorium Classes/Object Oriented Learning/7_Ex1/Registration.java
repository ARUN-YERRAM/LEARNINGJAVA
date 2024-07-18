public class Registration{
    public String customerName;
    public String panCardno;
    public int voterID;
    public String passportNo;
    public int licenseNo;
    public long[] telephoneNo;

    Registration(String customerName,String passportNo,long[] telephoneNo){
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+this.customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("Passport No: "+this.passportNo);
        System.out.println("Telephone No: "+this.telephoneNo[0]+"\n"+this.telephoneNo[1]);
    }
    Registration(String customerName,int licenseNo, String panCardNo, long[] telephoneNo){
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardno = panCardNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+this.customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("License No: "+this.licenseNo);
        System.out.println("PAN Card No: "+this.panCardno);
        System.out.println("Telephone No: "+this.telephoneNo[0]+"\n"+this.telephoneNo[1]);
    }
    Registration(String customerName,int voterID, int licenseNo, long[] telephoneNo){
        this.customerName = customerName;
        this.voterID = voterID;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+this.customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("VoterID: "+this.voterID);
        System.out.println("License No: "+this.licenseNo);
        System.out.println("Telephone No: "+this.telephoneNo[0]+"\n"+this.telephoneNo[1]);
    }
    Registration(String customerName,String panCardno,int voterID,long[] telephoneNo){
        this.customerName = customerName;
        this.panCardno = panCardno;
        this.voterID = voterID;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+this.customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("PAN Card No: "+this.licenseNo);
        System.out.println("VoterID: "+this.voterID);
        System.out.println("Telephone No: "+this.telephoneNo[0]+"\n"+this.telephoneNo[1]);
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getPanCardno() {
        return panCardno;
    }
    public int getVoterID() {
        return voterID;
    }
    public String getPassportNo() {
        return passportNo;
    }
    public int getLicenseNo() {
        return licenseNo;
    }
    public long[] getTelephoneNo() {
        return telephoneNo;
    }
}