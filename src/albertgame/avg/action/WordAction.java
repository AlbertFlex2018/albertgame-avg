package albertgame.avg.action;

import afengine.core.util.Debug;
import albertgame.avg.AvgConfig;
import albertgame.avg.IStoryAction;

/**
 *
 * @author Admin
 */
public class WordAction implements IStoryAction{

    /*
      word text1
    */
    @Override
    public void action(String... args){
        if(args.length!=2||!args[0].equals("word")){
            Debug.log("action failed:word#text");
            return;
        }
        AvgConfig config=AvgConfig.getInstance();
        config.setWord(args[1]);
    }    
}
