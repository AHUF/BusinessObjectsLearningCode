/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahellosocketclient;

/**
 *
 * @author Ann Huang
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class AHelloSocketClient {

    public static final int mPORT = 1574;
    private static Socket mSocket;
    
    private static BufferedReader mIn;
    private static PrintStream mOut;
    
    public AHelloSocketClient(){
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            mSocket = new Socket("localhost", mPORT);
            Scanner cin = new Scanner(System.in);
            PrintStream cout = System.out;
            
            mIn = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
            mOut = new PrintStream(mSocket.getOutputStream());
            
            cout.println(mSocket.getLocalPort());
            cout.println(mSocket.getPort());
            
            while(true){
                cout.println("Enter a name or q to quit");
                String nm = cin.nextLine();
                mOut.println(nm);
                if(nm.compareToIgnoreCase("q") == 0)
                    break;
                String res = mIn.readLine();
                cout.println(res);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
