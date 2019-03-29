import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;


public class Main {

    public static void main(String[] args) {
        Selector selector = null;
        SocketChannel sc = null;
        try {
            selector = Selector.open();
            sc = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9933));
            sc.configureBlocking(false);
            sc.register(selector, SelectionKey.OP_READ);
//           for(int i=0;i<100;i++) {
           while (true){
                String message = "nio测试";
                ByteBuffer writeBuffer = ByteBuffer.wrap(message.getBytes("UTF-16"));

                int r = sc.write(writeBuffer);
//            sendMsg("nio测试sdfsdfsdfsdfsdfsdfds二十多分"+i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        new TCPNIOClient(selector);


    }




}
