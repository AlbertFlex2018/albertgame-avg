package albertgame.avg.action;

import afengine.core.AppState;
import afengine.core.WindowApp;
import afengine.core.util.Debug;
import afengine.core.window.IGraphicsTech;
import afengine.core.window.ITexture;
import albertgame.avg.AvgConfig;
import albertgame.avg.IStoryAction;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class BackAction implements IStoryAction{

    /*
        back prepare name path        
        back show name        
    */
    private static final Map<String,ITexture> TextureMap=new HashMap<>();
    @Override
    public void action(String... args) {
        if(args[0].equals("back"))return;
        
        if(args.length==4){
            if(args[1].equals("prepare")){
                prepare(args);
            }
        }else if(args.length==3){
            if(args[1].equals("show")){
                show(args);
            }
        }
        
    }   
    //back prepare name path
    private void prepare(String ... args){
        String name=args[2];
        String path=args[3];
        IGraphicsTech tech=((WindowApp)AppState.getRunningApp()).getGraphicsTech();
        ITexture texture=tech.createTexture(path);
        if(texture==null){
            Debug.log("texture prepare failed!");
            return;
        }
        TextureMap.put(name, texture);
    }
    //back show name
    private void show(String ... args){
        String name=args[2];
        ITexture texture=TextureMap.get(name);
        if(texture==null){
            Debug.log("texture show failed,not prepared..");
            return;
        }
        AvgConfig config=AvgConfig.getInstance();
        config.setBackAcg(texture);
    }
}
