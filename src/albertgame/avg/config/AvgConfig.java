package albertgame.avg.config;

import albertgame.avg.stage.StoryStage;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Albert Flex
 */
public class AvgConfig {
    private final Map<String,StoryStage> stageMap;
    private String stageIndex;
    private String storyIndex;
    private int    actionIndex;

    public AvgConfig(Map<String, StoryStage> stageMap, String stageIndex, String storyIndex, int actionIndex) {
        this.stageMap = stageMap;
        this.stageIndex = stageIndex;
        this.storyIndex = storyIndex;
        this.actionIndex = actionIndex;
    }

    public AvgConfig(String stageIndex, String storyIndex, int actionIndex) {
        this(new HashMap<>(),stageIndex,storyIndex,actionIndex);
    }
    
    public String getStageIndex() {
        return stageIndex;
    }

    public void setStageIndex(String stageIndex) {
        this.stageIndex = stageIndex;
    }

    public String getStoryIndex() {
        return storyIndex;
    }

    public void setStoryIndex(String storyIndex) {
        this.storyIndex = storyIndex;
    }

    public int getActionIndex() {
        return actionIndex;
    }

    public void setActionIndex(int actionIndex) {
        this.actionIndex = actionIndex;
    }

    public Map<String, StoryStage> getStageMap() {
        return stageMap;
    }    
}
