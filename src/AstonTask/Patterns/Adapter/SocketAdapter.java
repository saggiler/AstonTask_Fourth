package AstonTask.Patterns.Adapter;

public class SocketAdapter implements Charger{

    private AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket socket) {
        this.americanSocket = socket;
    }

    public void charge() {
        americanSocket.plugIn();
    }
}
