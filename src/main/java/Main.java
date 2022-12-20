public class Main {
    final static int PORT = 9999;
    final static int THREAD_POOL_SIZE = 64;

    public static void main(String[] args) {
        Server server = new Server(THREAD_POOL_SIZE);
        server.runServer(PORT);
    }
}