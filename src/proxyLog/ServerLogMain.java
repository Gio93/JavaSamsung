package proxyLog;

public final class ServerLogMain {
    private ServerLogMain() {
    }

    public static void main(String[] args) {
        Service sl = new ServerLog();
        for (int i = 0; i < 10; i++) {
            sl.service();
        }
    }

}
