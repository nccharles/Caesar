package models;

public class Decode {

    private String cMessage;
    private int cKey;
    public Decode(String msg,int key){
        this.cMessage=msg;
        this.cKey=key;
    }
    public String getMsg(){
        return this.cMessage;
    }
    public int getKey(){
        return this.cKey;
    }
    public String strDecrypt(){
        return getString(this.cMessage, this.cKey);
    }
    static String getString(String cMessage, int cKey) {
        String s = "";
        int len = cMessage.length();
        for(int x = 0; x < len; x++){
            char c = (char)(cMessage.charAt(x) - cKey);
            if (c < 'a') {
                s += (char)(cMessage.charAt(x) + (26- cKey));
            } else
                s += (char)(cMessage.charAt(x) - cKey);
        }
        return s;
    }
}
