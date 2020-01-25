package albertgame.avg.action;

import afengine.core.AppState;
import afengine.core.WindowApp;
import afengine.core.util.Debug;
import afengine.core.window.IGraphicsTech;
import afengine.core.window.ITexture;
import afengine.part.sound.SoundCenter;
import albertgame.avg.AvgConfig;
import albertgame.avg.IStoryAction;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class BgmAction implements IStoryAction{
    
    private static final Map<String,Long> midiMap=new HashMap<>();
    /*
        bgm prepare name path
        bgm play name
    */

    @Override
    public void action(String... args) {
        if(args[0].equals("bgm"))return;
        
        if(args.length==4){
            if(args[1].equals("prepare")){
                prepare(args);
            }
        }else if(args.length==3){
            if(args[1].equals("play")){
                show(args);
            }
        }        
    }    
    //bgm prepare name path
    private void prepare(String ... args){
        String name=args[2];
        String path=args[3];
        long id=SoundCenter.getInstance().addMidi(path);
        midiMap.put(name, id);
    }
    //bgm play name
    private void show(String ... args){
        String name=args[2];
        Long id=midiMap.get(name);
        AvgConfig config=AvgConfig.getInstance();
        config.setMidiId(0);
        SoundCenter.getInstance().playMidi(id, true);
    }    
}
