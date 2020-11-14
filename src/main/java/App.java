import models.Decode;
import models.Encode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm Caesar cipher!");
        System.out.println("Enter any string or Type Exit");
        boolean Running=true;
        String regex = "^[a-zA-Z]+$";
        while (Running) {
            try {
                String message = bufferedReader.readLine();
                if(message.equals("Exit")) {
                    Running = false;
                }else{
                    if (message.matches(regex)) {
                        System.out.println("Enter Shift Key(any number):");
                        Integer Key = Integer.parseInt(bufferedReader.readLine());
                        String sMsg = message.toLowerCase();
                        Encode EncodedStr = new Encode(sMsg, Key);
                        Decode DecodedStr = new Decode(EncodedStr.strEncrypt(), Key);
                        String EncryptedStr = String.format("Encrypted String: %s", EncodedStr.strEncrypt());
                        String InputStr = String.format("Input String: %s", sMsg);
                        String DecryptedStr = String.format("Decrypted String: %s", DecodedStr.strDecrypt());
                        System.out.println("Awesome here is the output!");
                        System.out.println("--------------------------");
                        System.out.println(InputStr.toUpperCase());
                        System.out.println(EncryptedStr.toUpperCase());
                        System.out.println(DecryptedStr.toUpperCase());
                        System.out.println("--------------------------");
                        System.out.println("Enter any string or Type Exit");
                    }else {
                        System.out.println("You entered invalid string, Please try another one!");
                    }
                } } catch (IOException e) {
                e.printStackTrace();
            }
                }
        }
    }
