package albertgame.avg.stage;

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
                    <texturename path=""/>
                    <texturename path=""/>
                </playername>
            </players>
            <stories>
                <storyname>
                    <actiontype />
                    <actiontype />
                    <actiontype />
                    ...
                </storyname>
                <storyname actionpath="assets/story1-1.txt"/>
                ...
            </stories>
        </stagename>
    */
    public static StoryStage loadStoryStage(Element element){
        return null;
    }
    /*
        actiontype#arg1#arg2#arg3;;
        actiontype#arg1#arg2#arg3;;
        actiontype#arg1#arg2#arg3;;
        word#show#We are Friend? it's right?;;
    */
    public static Story loadStoryFromTXT(String text){
        return null;
    }
}
