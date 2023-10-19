package programmers;

import programmers.interfaces.Backender;
import programmers.interfaces.Frontender;

public class FullstackDeveloper implements Backender, Frontender {
    private final Backender backender;
    private final Frontender frontender;
    public FullstackDeveloper(){
        backender = new BackenderImpl();
        frontender = new FrontenderImpl();
    }
    @Override
    public void input(DevelopingTask technicalTask){
        backender.input(null);
        frontender.input(null);
        if (technicalTask instanceof BackendTask backendTask) {
            backender.input(backendTask);
        } else if (technicalTask instanceof FrontendTask frontendTask) {
            frontender.input(frontendTask);
        }
    }
    @Override
    public boolean canDevelop(){
        return frontender.canDevelop() || backender.canDevelop();
    }
    @Override
    public Gui developGui(){
        return frontender.developGui();
    }
    @Override
    public ServerApi develoServerApi(){
        return backender.develoServerApi();
    }
}