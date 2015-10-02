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

public class AHelloSocketServer {

    protected static ServerSocket mListenSocket;
    public final static int mPORT = 1574;
    
    public AHelloSocketServer(){
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PrintStream cout = System.out;
        try{
            mListenSocket = new ServerSocket(mPORT);
            cout.println("Server: listening on port " + mPORT);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        while(true){
            try{
                Socket client = mListenSocket.accept();
                cout.println(client.getPort());
                ConversationManager cm = new ConversationManager(client);
                cm.start();
                cout.println("Rrrrrriiiiiiggggggg");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
}
