public class Loader extends Thread {
    public void run() {
        System.out.println("hello");
    }
}

class Meclass {
    public static void main(String[] args) {
        Loader obj = new Loader();
        obj.start();
    }
}


