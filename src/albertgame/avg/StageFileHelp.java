package albertgame.avg;

import afengine.core.AppState;
import afengine.core.WindowApp;
import afengine.core.util.Debug;
import afengine.core.window.IGraphicsTech;
import afengine.core.window.ITexture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.dom4j.Element;

/**
 *
 * @author Albert Flex
 */
public class StageFileHelp {
    
    /*
        <stagename>
            <players>
                <playername>
                    <statename texture=""/>
                    <statename texture=""/>
                </playername>
            </players>
            <stories>
                <storyname actionpath="assets/story1-1.txt"/>
                <storyname actionpath="assets/story1-2.txt"/>
                <storyname actionpath="assets/story1-3.txt"/>
                <storyname actionpath="assets/story1-4.txt"/>
                ...
            </stories>
        </stagename>
    */
    public static StoryStage loadStoryStage(Element element){
        String stagename =element.getName();
        Map<String,Story> storyMap=new HashMap<>();
        Map<String,Player> playerMap=new HashMap<>();        
        Element playerse=element.element("players");
        if(playerse!=null){            
            Iterator<Element> eiter=playerse.elementIterator();
            while(eiter.hasNext()){
                Element ele=eiter.next();
                String playername=ele.getName();
                Iterator<Element> textureiter=ele.elementIterator();
                Player player=new Player(playername);
                while(textureiter.hasNext()){
                    Element playerstate=textureiter.next();
                    String statename=playerstate.getName();
                    String texturepath=playerstate.attributeValue("texture");
                    ITexture texture=loadTexture(texturepath);
                    if(texture!=null){
                        Debug.log("texture for "+texturepath+" is not valid path.");
                    }else{
                        player.getTextureMap().put(statename,texture);
                    }
                }
                playerMap.put(playername, player);
            }            
        }else{
            Debug.log("players for stage not found!!");
        }
        Element stories=element.element("stories");
        if(stories!=null){
            Iterator<Element> eiter=playerse.elementIterator();
            while(eiter.hasNext()){
                Element storye=eiter.next();
                String actionpath=storye.attributeValue("actionpath");                
                if(actionpath!=null){
                    Story story=loadStoryFromTXT(actionpath);
                    storyMap.put(storye.getName(), story);                    
                }else{
                    Debug.log("actionpath for story not found!");
                }
            }
        }else{
            Debug.log("stories for stage not found!");
        }
        return null;
    }
    private static ITexture loadTexture(String texturepath){
        IGraphicsTech tech=((WindowApp)AppState.getRunningApp()).getGraphicsTech();
        return tech.createTexture(texturepath);
    }
    /*
        $name=sss;
        actiontype#arg1#arg2#arg3;
        actiontype#arg1#arg2#arg3;
        actiontype#arg1#arg2#arg3;
        word#show#We are Friend? it's right?;
    */
    public static Story loadStoryFromTXT(String textpath){
        
        return null;
    }    
}
