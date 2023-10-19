package programmers.interfaces;

import programmers.ServerApi;
import programmers.interfaces.Developer;

public interface Backender extends Developer {
    ServerApi develoServerApi();
}
