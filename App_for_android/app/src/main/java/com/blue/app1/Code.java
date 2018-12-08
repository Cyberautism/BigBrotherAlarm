package com.blue.app1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Code {
    static DataInputStream dis; static DataOutputStream dos;
    static Socket socket = new Socket();
    static boolean cn(String ip, String pass){
        try {
            socket = new Socket(ip,7000);
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            dos.writeUTF(pass);
            return dis.readBoolean();
        } catch (Exception e) {
            return false;
        }
    }
}
