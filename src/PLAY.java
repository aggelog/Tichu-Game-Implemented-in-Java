import tichuGui.GraphicTichuGame;
import tichuGui.TICHUListener;
import tichugame.Player;

/**
 *
 * @author AggelogTowerStation
 */
public class PLAY{
    
        /**
        * Accessors
        * 
        * Method which notifies the listeners for
        * any change in the TichuGame
        * 
        * @param tichuWindow the Graphics of the TichuGame
        */
        public static void NotifyStart(GraphicTichuGame tichuWindow)
        {
            for (TICHUListener Listener : tichuWindow.getTichuGame().getTichuListeners())
            {
                Listener.GameStatusChanged(tichuWindow);         
            }
        }
        
        /**
        * Accessors
        * 
        * Method which notifies the listeners for
        * any change in the TichuGame
        * 
        * @param tichuWindow the Graphics of the TichuGame
        * @param PreviousPlayer the previous Player
        */
        public static void NotifyEnd(GraphicTichuGame tichuWindow, Player PreviousPlayer)
        {
            for (TICHUListener Listener : tichuWindow.getTichuGame().getTichuListeners())
            {
                Listener.ResetPreviousPlayer(tichuWindow, PreviousPlayer);
            }
        } 
        
        /**
     *
     * @param args
     */
    @SuppressWarnings("empty-statement")
        /**
        * Main
        * 
        * The Main and runnable method of the game
        * 
        * @param args unused
        */
	public static void main(String[] args) {
            
            try{
                    GraphicTichuGame TICHUWindow = new GraphicTichuGame();
                
                    Player PreviousPlayer;
                    
                    while(true)
                    {
                        NotifyStart(TICHUWindow);
                        PreviousPlayer = TICHUWindow.getTichuGame().getPlayingPlayer();
                        
                        while(PreviousPlayer == TICHUWindow.getTichuGame().getPlayingPlayer() )
                        {              
                            System.out.print("");
                            System.out.print("");
                            if(TICHUWindow.getPrevious())
                            {
                                break;
                            }
                        }
                        
                        NotifyEnd(TICHUWindow, PreviousPlayer);
                        
                        if(TICHUWindow.getPrevious())
                        {
                            NotifyEnd(TICHUWindow, TICHUWindow.getTichuGame().getPlayingPlayer());
                            TICHUWindow.setVisible(false);
                            TICHUWindow.InitializeModel();
                        }
                    }
                
            }catch(Exception e){
                System.out.println("Program Terminated");
                System.exit(0);
            };
	}
}