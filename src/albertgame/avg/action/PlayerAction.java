package albertgame.avg.action;

import albertgame.avg.AvgConfig;
import albertgame.avg.IStoryAction;
import albertgame.avg.Player;

/**
 *
 * @author Admin
 */
public class PlayerAction implements IStoryAction{
    
    /*
        player change pos statename
        player show pos playername statename
        player hide pos
    */
    @Override
    public void action(String... args) {
        int length=args.length;
        if(length<3)return;
        String cmd=args[1];
        switch(cmd){
            case "change":
                change(args);
                break;
            case "show":
                show(args);
                break;
            case "hide":
                hide(args);
                break;
            default:break;
        }
    }   
    //        player change pos statename
    private void change(String ... args){
        String pos=args[2];
        String statename=args[3];
        AvgConfig config=AvgConfig.getInstance();
        switch(pos){
            case "left":
                config.setLeftPlayerState(statename);
                break;
            case "center":
                config.setCenterPlayerState(statename);
                break;
            case "right":
                config.setRightPlayerState(statename);
                break;
            default:
                break;
        }
    }
    //player show pos playername statename
    private void show(String ... args){
        String pos=args[2];
        String playername=args[3];
        String statename=args[4];
        AvgConfig config=AvgConfig.getInstance();
        Player player=config.getStageMap().get(config.getStageIndex()).
                getPlayerByName(playername);
        switch(pos){
            case "left":   
                config.setLeftPlayer(player);
                config.setLeftPlayerState(statename);                
                break;
            case "center":
                config.setCenterPlayer(player);
                config.setCenterPlayerState(statename);
                break;
            case "right":
                config.setRightPlayer(player);
                config.setRightPlayerState(statename);
                break;
            default:
                break;
        }        
    }

    //player hide pos
    private void hide(String ... args){
        String pos = args[2];
        AvgConfig config=AvgConfig.getInstance();
        switch(pos){
            case "left":
                config.setLeftPlayer(null);
                break;
            case "center":
                config.setCenterPlayer(null);
                break;
            case "right":
                config.setRightPlayer(null);
                break;
            default:
                break;
        }        
    }
    @Override
    public String getType() {
        return "player";
    }    
}
