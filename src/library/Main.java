package library;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Controller ctrl = new Controller();
        while (true) {
            boolean test = true;
            switch (ctrl.getHome()) {
                case 1:
                    ctrl.addAuthor();
                    break;
                case 2:
                    ctrl.addPC();
                    break;
                case 3:
                    ctrl.addBook();
                    break;
                case 4:
                    ctrl.infoAuthor();
                    break;
                case 5:
                    ctrl.infoPublish();
                    break;
                case 6:
                    ctrl.infoBook();
                    break;
                case 7:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + ctrl.getHome());
            }
        }
    }
}
