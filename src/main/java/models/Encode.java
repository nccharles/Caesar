package models;

public class Encode {
    private String cMessage;
    private int cKey;
    public Encode(String msg,int key){
        this.cMessage=msg;
        this.cKey=key;
    }
    public String getMsg(){
        return this.cMessage;
    }
    public int getKey(){
        return this.cKey;
    }
    public String strEncrypt(){
        return getString(this.cMessage, this.cKey);
    }

    static String getString(String cMessage, int cKey) {
        return getString(cMessage, cKey);
    }
}
