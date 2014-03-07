package chat.chatClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import chatServer.ChatServiceRemoteInterface;

/**
 *
 * @author bartspiering
 */
public class ChatClient{
    public void connect(){
        try {
            ChatServiceRemoteInterface remoteService = (ChatServiceRemoteInterface)
                      Naming.lookup("rmi://127.0.0.1/ChatService");
            String test = remoteService.sendMessage("Dit is een bericht send from 1");
            
            System.out.println(test);
        } catch (NotBoundException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.connect();
    }
}
