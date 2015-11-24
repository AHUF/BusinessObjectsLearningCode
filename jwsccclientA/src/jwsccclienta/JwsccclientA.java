/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsccclienta;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Ann
 */
public class JwsccclientA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            PrintStream cout = System.out;
            Scanner cin = new Scanner(System.in);
            
            List<Object> aclist = read("Select AccountNo, Balance, Limit, expirationDate, name from Account order by AccountNo");
            for(int i=0;i<aclist.size();i++){
                cout.println((String)aclist.get(i));
            }
            
            cout.println();
            cout.println("Enter U to update an account credit limit, T to verify a transaction, L to list transactions, Q to quit");
            cout.flush();
            String input = cin.nextLine();
            boolean quit = false;
            
            while(!quit){
                int c = input.charAt(0);
                switch(c){
                    case 'u':
                    case 'U':
                        cout.println("Enter Account No: ");
                        cout.flush();
                        String accno = cin.nextLine();
                        cout.println("Enter the new amount: ");
                        cout.flush();
                        String amt = cin.nextLine();
                        int n = update(accno, amt);
                        cout.printf("%d records got updated", n);
                        break;
                    case 'T':
                    case 't':
                        cout.println("Enter Account No: ");
                        cout.flush();
                        accno = cin.nextLine();
                        cout.println("Enter the amount: ");
                        cout.flush();
                        amt = cin.nextLine();
                        String appcode = charge(accno, amt);
                        System.out.println("The approval code is " + appcode);
                        break;
                    case 'L':
                    case 'l':
                        cout.println("Enter Account No: ");
                        cout.flush();
                        accno = cin.nextLine();
                        List<Object> l = list(accno);
                        for (int i=0; i < l.size(); i++)
                            System.out.println(l.get(i));
                        break;
                    default:
                        quit = true;
                                
                }
                if(!quit){
                    cout.println("Enter U to update an account credit limit, T to verify a transaction, L to list transactions, Q to quit");
                    cout.flush();
                    input = cin.nextLine();
                }
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private static String charge(java.lang.String accno, java.lang.String amount) {
        jwsccclienta.CreditCardServiceA_Service service = new jwsccclienta.CreditCardServiceA_Service();
        jwsccclienta.CreditCardServiceA port = service.getCreditCardServiceAPort();
        return port.charge(accno, amount);
    }

    private static java.util.List<java.lang.Object> list(java.lang.String accno) {
        jwsccclienta.CreditCardServiceA_Service service = new jwsccclienta.CreditCardServiceA_Service();
        jwsccclienta.CreditCardServiceA port = service.getCreditCardServiceAPort();
        return port.list(accno);
    }

    private static java.util.List<java.lang.Object> read(java.lang.String sql) {
        jwsccclienta.CreditCardServiceA_Service service = new jwsccclienta.CreditCardServiceA_Service();
        jwsccclienta.CreditCardServiceA port = service.getCreditCardServiceAPort();
        return port.read(sql);
    }

    private static Integer update(java.lang.String accno, java.lang.String amount) {
        jwsccclienta.CreditCardServiceA_Service service = new jwsccclienta.CreditCardServiceA_Service();
        jwsccclienta.CreditCardServiceA port = service.getCreditCardServiceAPort();
        return port.update(accno, amount);
    }
    
}
