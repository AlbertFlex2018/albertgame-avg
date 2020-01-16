package albertgame.avg;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Albert Flex
 */
public class Story {
    private final List<IStoryAction> actionList;
    private final String name;

    public Story(String name) {
        this.actionList = new LinkedList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }
        
    public List<IStoryAction> getActionList() {
        return actionList;
    }
    public IStoryAction getActionByIndex(int index){
        return actionList.get(index);
    }
}
