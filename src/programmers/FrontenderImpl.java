package programmers;

import programmers.interfaces.Frontender;

public class FrontenderImpl implements Frontender {
    private FrontendTask task;
    @Override
    public void input(DevelopingTask technicalTask){
        if (technicalTask instanceof FrontendTask frontendTask) {
            task = frontendTask;
        }
    }
    @Override
    public boolean canDevelop(){
        return task != null;
    }
    @Override
    public Gui developGui(){
        if (canDevelop()) {
            return new Gui() {
            };
        }
        return null;
    }
}