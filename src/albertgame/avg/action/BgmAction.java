package albertgame.avg.action;

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
    private static final Map<String,String> midiPathMap=new HashMap<>();
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
        midiPathMap.put(name,path);
    }
    //bgm play name
    private void show(String ... args){
        String name=args[2];
        Long id=midiMap.get(name);
        AvgConfig config=AvgConfig.getInstance();
        config.setMidipath(midiPathMap.get(name));
        SoundCenter.getInstance().playMidi(id, true);
    }    
    @Override
    public String getType() {
        return "bgm";
    }
    
}
