package singleton;

public class Cliente {
    public static void main(String[] args) {
        var segredo = "Palmeiras tem mundial";

        var singleton = Singleton.getInstance();
        singleton.setSegredo(segredo);

        // Mil milhões de anos depois....
        System.out.println(
            Singleton.getInstance().getSegredo()
        );

    }
}