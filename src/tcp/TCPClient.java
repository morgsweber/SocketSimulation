import java.io.*;
import java.net.Socket;

public class TCPClient {
    private static final int PORT = 5000;

    private static DataOutputStream dataOutputStream = null;

    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",PORT)) {
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            sendFile("./sent/sample.txt");
            
            dataOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void sendFile(String path) throws Exception{
        int bytes = 0;
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        
        // send file size
        dataOutputStream.writeLong(file.length());  
        // break file into chunks
        byte[] buffer = new byte[4*1024];
        while ((bytes=fileInputStream.read(buffer))!=-1){
            dataOutputStream.write(buffer,0,bytes);
            dataOutputStream.flush();
        }
        fileInputStream.close();
    }
}
