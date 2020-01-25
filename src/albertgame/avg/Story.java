package albertgame.avg;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Albert Flex
 */
public class Story {
    private final List<String> actionList;
    private final String name;

    public Story(String name) {
        this.actionList = new LinkedList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }
        
    public List<String> getActionList() {
        return actionList;
    }
    public String getActionByIndex(int index){
        return actionList.get(index);
    }
}
