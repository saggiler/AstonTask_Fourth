package AstonTask.Patterns.Proxy;

public class ProxyExampleMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        // Изображение загружается только при первом вызове
        image.display();
        System.out.println("-----");
        image.display();
    }
}
