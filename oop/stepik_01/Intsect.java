package oop.stepik_01;

public class Intsect extends Animal{
    int wingCount ;
    boolean likeJesus;
    {setWalk(true);}
    
    public int getWingCount(){
        return this.wingCount;  
    }
    public boolean isLikeJesus(){
        return this.likeJesus;
    }
    public void setLikeJesus(Boolean likeJesus){
        this.likeJesus = likeJesus;
    }
    public void setWingCount(int wingCount){
        this.wingCount = wingCount;
    }
    
    public void ggggg(){
        System.out.println("Ggggg");
    }
    
}
