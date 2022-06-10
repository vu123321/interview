package homework;

import java.util.ArrayList;
import java.util.List;

public class App extends EmailException {

    private String handle;

    public App(String name, String handle) throws IndexOutOfBoundsException {
        super(name);
    }

    public static void main(String[] args) {
        App app = new App("", "");
        try {
            List<App> apps = new ArrayList<>();
            apps.add(app);
            for (int i = 0; i <= apps.size(); i++) {
                System.out.println(apps.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }
    }
}




