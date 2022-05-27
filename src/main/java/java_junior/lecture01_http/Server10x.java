package java_junior.lecture01_http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Server10x {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(80);
        while (true) {
            try (Socket socket = serverSocket.accept();
                 InputStream in = socket.getInputStream();
                 OutputStream out = socket.getOutputStream()) {
                // READ request
                byte[] request;
                byte[] response = new Date().toString().getBytes(StandardCharsets.US_ASCII);
                out.write(response);
            }
        }
    }

}
