package albertgame.avg.stage;

import afengine.core.window.ITexture;
import java.util.Map;

/**
 *
 * @author Albert Flex
 */
public class Player {
    private final String name;
    private final Map<String,ITexture> textureMap;

    public Player(String name, Map<String, ITexture> textureMap) {
        this.name = name;
        this.textureMap = textureMap;
    }
    public ITexture getTexture(String name){
        return textureMap.get(name);
    }

    public String getName() {
        return name;
    }

    public Map<String, ITexture> getTextureMap() {
        return textureMap;
    }    
}
