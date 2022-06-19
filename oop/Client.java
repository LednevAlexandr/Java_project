package oop;

public class Client {
    enum Info{
        all,
        firstname,
        lastname,
        birthDate,
        pasport,
        phoneNumber
    }
    private String firstname;
    private String lastname;
    private String birthDate;
    private String pasport;
    private String phoneNumber;


    Client(String firstname,String lastname,String birthDate,String pasport,String phoneNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.pasport = pasport;
        this.phoneNumber = phoneNumber;
}
    Client(String firstname,String lastname,String birthDate,String pasport){
        this(firstname,lastname,birthDate,pasport,null);
    }
    public void getInfoBy(Worker w){
        System.out.println(this.firstname);
        System.out.println(this.lastname);
        System.out.println(this.birthDate);

        if(w.getStatus() != Worker.Status.Manager){
            System.out.println(this.pasport);
        }else{
            System.out.println(".....\n");
        }
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber != null || phoneNumber == ""){
            this.phoneNumber = phoneNumber;
        }      
    }
    public void setInfoFLName(String fn, String ln,Worker w){
        if (w.getStatus() != Worker.Status.Manager){
            this.firstname = fn;
            this.lastname = ln;
        }
    }

}
