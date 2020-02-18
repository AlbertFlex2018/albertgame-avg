package albertgame.avg;

import afengine.core.window.ITexture;
import albertgame.avg.story.AvgStage;
import albertgame.avg.story.IStoryAction;
import java.util.HashMap;
import java.util.Map;

public class AvgData {    
    
    
    private static AvgData data;

    public static AvgData getInstance(){
        if(data==null)
            data=new AvgData();
        return data;
    }
    
    
    //backaction,bgmaction,playeraction,wordaction
    private final Map<String,IStoryAction> actionMap;
    
    //stage-name,story-name,action-index    
    //display-left,display-center,display-right
    //left-name,left-state,center-name,center-state,right-name,right-state
    //word
    //midi-path
    private final Map<String,String> dataMap;
    
    //stage - story - action
    //load stage to this map for stage    
    private final Map<String,AvgStage> stageMap;    
    
    private ITexture back;
        
    private AvgData(){
        actionMap=new HashMap<>();
        dataMap=new HashMap<>();

        dataMap.put("stage-name","");
        dataMap.put("story-name","");
        dataMap.put("action-index","");

        dataMap.put("display-left","false");        
        dataMap.put("display-center","false");
        dataMap.put("display-right","false");

        dataMap.put("left-name","");
        dataMap.put("center-name","");
        dataMap.put("right-name","");

        dataMap.put("left-state","");
        dataMap.put("center-state","");
        dataMap.put("right-state","");

        dataMap.put("word","");
        dataMap.put("midipath","");

        stageMap=new HashMap<>();
    }

    public Map<String, IStoryAction> getActionMap() {
        return actionMap;
    }

    public Map<String, String> getDataMap() {
        return dataMap;
    }

    public Map<String, AvgStage> getStageMap() {
        return stageMap;
    }                

    public ITexture getBack() {
        return back;
    }

    public void setBack(ITexture back) {
        this.back = back;
    }    
}
