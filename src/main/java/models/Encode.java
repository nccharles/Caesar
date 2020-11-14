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
        String ans = "";
        int len = cMessage.length();
        for(int x = 0; x < len; x++){
            char c = (char)(cMessage.charAt(x) + cKey);
            if(cMessage.charAt(x)==' '){
                ans += (char)(cMessage.charAt(x));
            }else if (c > 'z') {
                ans += (char)(cMessage.charAt(x) - (26- cKey));
            } else
                ans += (char)(cMessage.charAt(x) + cKey);
        }
        return ans;
    }

}
