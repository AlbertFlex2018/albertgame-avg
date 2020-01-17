package albertgame.avg;

import afengine.core.window.ITexture;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Albert Flex
 */
public class AvgConfig {
    private static AvgConfig config=null;
    public static AvgConfig getInstance(){
        if(config==null)
            config=new AvgConfig();
        return config;
    }
    
    //story
    private final Map<String,StoryStage> stageMap;
    private String stageIndex;
    private String storyIndex;
    private int    actionIndex;
    
    //back
    private ITexture backAcg;    
    
    //word
    private String word;
    
    //player display
    private Player leftPlayer,centerPlayer,rightPlayer;
    private String leftPlayerState,centerPlayerState,rightPlayerState;
    
    //backmidi id
    private long midiId;
    private final Map<String,String> attributes;

    private AvgConfig(){
        stageMap=new HashMap<>();
        stageIndex="";
        storyIndex="";
        actionIndex=0;
        attributes=new HashMap<>();
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

    public static AvgConfig getConfig() {
        return config;
    }

    public static void setConfig(AvgConfig config) {
        AvgConfig.config = config;
    }

    public ITexture getBackAcg() {
        return backAcg;
    }

    public void setBackAcg(ITexture backAcg) {
        this.backAcg = backAcg;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Player getLeftPlayer() {
        return leftPlayer;
    }

    public void setLeftPlayer(Player leftPlayer) {
        this.leftPlayer = leftPlayer;
    }

    public Player getCenterPlayer() {
        return centerPlayer;
    }

    public void setCenterPlayer(Player centerPlayer) {
        this.centerPlayer = centerPlayer;
    }

    public Player getRightPlayer() {
        return rightPlayer;
    }

    public void setRightPlayer(Player rightPlayer) {
        this.rightPlayer = rightPlayer;
    }

    public String getLeftPlayerState() {
        return leftPlayerState;
    }

    public void setLeftPlayerState(String leftPlayerState) {
        this.leftPlayerState = leftPlayerState;
    }

    public String getCenterPlayerState() {
        return centerPlayerState;
    }

    public void setCenterPlayerState(String centerPlayerState) {
        this.centerPlayerState = centerPlayerState;
    }

    public String getRightPlayerState() {
        return rightPlayerState;
    }

    public void setRightPlayerState(String rightPlayerState) {
        this.rightPlayerState = rightPlayerState;
    }

    public long getMidiId() {
        return midiId;
    }

    public void setMidiId(long midiId) {
        this.midiId = midiId;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
    
}
