package models;

public class Encode {
    private String cMessage;
    public Encode(String msg,int key){
        this.cMessage=msg;
    }
    public String getMsg(){
        return this.cMessage;
    }
}
