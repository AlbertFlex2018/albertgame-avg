package albertgame.avg;

import java.util.Map;

/**
 *
 * @author Albert Flex
 */
public class StoryStage {
    private final Map<String,Story> storyMap;
    private final Map<String,Player> playerMap;

    public StoryStage(Map<String, Story> storyMap, Map<String, Player> playerMap) {
        this.storyMap = storyMap;
        this.playerMap = playerMap;
    }

    public Map<String, Story> getStoryMap() {
        return storyMap;
    }
    
    public Story getStoryByIndex(String index){
        return storyMap.get(index);
    }
    public Map<String, Player> getPlayerMap() {
        return playerMap;
    }    
    public Player getPlayerByName(String name){
        return playerMap.get(name);
    }
}
