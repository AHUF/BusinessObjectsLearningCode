/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahellosocketserver;

/**
 *
 * @author Ann Huang
 */
import java.net.*;
import java.io.*;


public class ConversationManager extends Thread{
    Socket mClient;
    protected BufferedReader mIn;
    protected PrintStream mOut;
    
    public ConversationManager(Socket client){
        try{
            mClient = client;
            mIn = new BufferedReader(new InputStreamReader(mClient.getInputStream()));
            mOut = new PrintStream(mClient.getOutputStream());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void run(){
        PrintStream cout = System.out;
        try{
            while(true){
                String line = mIn.readLine();
                if(line.compareToIgnoreCase("q") == 0)
                    break;
                cout.println(line);
                mOut.println("Hello " + line);
            }
        }
        catch(IOException e){
            cout.println(e.getMessage());
        }
    }
}
