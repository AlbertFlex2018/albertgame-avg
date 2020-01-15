package albertgame.avg.stage;

import java.util.List;

/**
 *
 * @author Albert Flex
 */
public class Story {
    private final List<IStoryAction> actionList;
    private final String name;

    public Story(List<IStoryAction> actionList, String name) {
        this.actionList = actionList;
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
