package models;

public class Decode {

    private String cMessage;
    public Decode(String msg,int key){
        this.cMessage=msg;
    }
    public String getMsg(){
        return this.cMessage;
    }
}
