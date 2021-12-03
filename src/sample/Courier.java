package sample;

import javafx.concurrent.Task;

import java.net.*;
import java.io.*;

public class Courier extends Task<String> {


    private final String command;
    private final String text1;
    private final String text2;
    private final String text3;
    private final int socket1;


    public final String delimiter = "spergzilion";

    public Courier(String mode, String gameid, String payload, String judge, int socket) {
        this.command = mode;
        this.text1 = gameid;
        this.text2 = payload;
        this.text3 = judge;
        this.socket1 = socket;
    }

    @Override
    protected String call() throws Exception {
        return sendMessage(command, text1, text2, text3);
    }

    public String sendMessage
            (String command, String text1, String text2, String text3)
            throws Exception {
        String message = command + delimiter + text1 + delimiter + text2 + delimiter + text3;
        System.out.println(message);

        try (Socket s = new Socket("localhost", socket1);
             //  try (Socket s = new Socket("localhost", socket1);
             DataInputStream din = new DataInputStream(s.getInputStream());
             DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        ) {
            try {
                dout.writeUTF(message);
                dout.flush();
                System.out.println("1");
                updateValue(din.readUTF());
                System.out.println(getValue());
                System.out.println("4");
                try {
                    s.close();
                    din.close();
                    dout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return getValue();

            } catch (EOFException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return getValue();

    }
}











