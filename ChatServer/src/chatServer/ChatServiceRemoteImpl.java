package chatServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatServiceRemoteImpl extends UnicastRemoteObject implements ChatServiceRemoteInterface {
    
    public ChatServiceRemoteImpl() throws RemoteException {    
    }

    public String sendMessage(String message) throws RemoteException {
    	System.out.println(message);
        return message;
    }
}
