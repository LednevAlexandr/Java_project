package oop.stepik_01;

public class Fish extends Animal{
    
    String squama;
    boolean upStreamSwim;
    {setSwim(true);}


    public String getSquama(){
        return this.squama;
    }
    public boolean isUpStreamSwim(){
        return this.upStreamSwim;
    }
    public void setSquama(String squama){
        this.squama = squama;
    }
    public void setUpStreamSwim(boolean upStreamSwim){
        this.upStreamSwim = upStreamSwim;
    }
    public void bul_bul(){
        System.out.println("Bul_Bul");
    }
}
