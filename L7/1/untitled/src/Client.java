import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{
    Socket socket;
    ObjectOutputStream out;
    String message;
    ObjectInputStream in;


    @Override
    public void run() {
//        System.out.println("Client!!");
        try {
            while(true) {
                socket = new Socket(InetAddress.getByName("localhost"), 8080);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Client: ");
                message = scanner.nextLine();
                out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(message);

                in = new ObjectInputStream(socket.getInputStream());
                System.out.println("C--> "+(String) in.readObject());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


