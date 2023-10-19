package programmers;

import programmers.interfaces.Developer;
import programmers.interfaces.Frontender;

public class Main {
    public static void main(String[] args) throws Exception {

        Developer[] developers = new Developer[] {

                new FrontenderImpl(),
                new BackenderImpl(),
                new FullstackDeveloper()
        };

        loadFrontendersOnly(developers, new FrontendTask());

        for (Developer developer : developers) {
            if (developer instanceof Frontender frontender) {
                if (frontender.canDevelop()) {

                    Gui result = frontender.developGui();

                    System.out.println(result.getDescription());
                }
            }
        }

    }

    static void loadFrontendersOnly(Developer[] developers, FrontendTask task) {
        assert developers != null;
        assert task != null;

        for (Developer developer : developers) {
            if (developer instanceof Frontender frontender) {
                frontender.input(task);
            }
        }
    }
}