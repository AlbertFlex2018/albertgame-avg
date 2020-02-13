package scenetest;

import afengine.core.IAppLogic;
import afengine.core.util.Debug;
import afengine.core.util.XMLEngineBoot;
import afengine.part.message.IMessageHandler;
import afengine.part.message.Message;
import albertgame.avg.IStoryAction;
import albertgame.avg.action.BackAction;
import albertgame.avg.action.BgmAction;
import albertgame.avg.action.PlayerAction;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Test2BootLogic implements IAppLogic{
    
    public static void main(String[] args) {
        XMLEngineBoot.bootEngine("test/asset/scenetest-test2-boot.xml");
    }
    
    @Override
    public boolean init() {
        Debug.log("init test2 logic...");
        return true;
    }

    @Override
    public boolean update(long l) {
        return true;
    }

    @Override
    public boolean shutdown() {
        Debug.log("shutdown test2 logic...");
        return true;
    }
    
    public static class ContinueServlet implements IMessageHandler{
        String[] words={
            "back prepare back1 test/asset/back1.jpg",
            "back prepare back2 test/asset/back2.png",
            "back show back1",
            "back show back2",
            "bgm prepare bgm1 test/asset/bgm1.midi",
            "bgm prepare bgm2 test/asset/bgm2.midi",
            "bgm play bgm1",
            "bgm play bgm2",
            "player show left player1 state1",
            "player show center player2 state1",
            "player hide right",
            "player hide center"            
            };
        int i=0;
        Map<String,IStoryAction> actionMap;
        public ContinueServlet() {
            actionMap=new HashMap<>();
            actionMap.put("back",new BackAction());
            actionMap.put("bgm",new BgmAction());
            actionMap.put("player",new PlayerAction());
        }
        
        @Override
        public boolean handle(Message msg) {
            KeyEvent key = (KeyEvent)msg.extraObjs[0];
            int code=key.getKeyCode();
            if(code==KeyEvent.VK_ENTER){
                i=(i+1)%words.length;
                String word=words[i];
                String[] cmds=word.split(" ");
                IStoryAction action=actionMap.get(cmds[0]);
                action.action(cmds);
                return true;
            }
            return false;
        }        
    }
}
