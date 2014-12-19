/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tichugame;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author AggelogTowerStation
 */
public class AllPlayers {
    
    private int max_player = 2;
    private int num_of_teams = 2;
    private ArrayList<Player> players_1;
    private ArrayList<Player> players_2;
    private int pointsTeam1;
    private int pointsTeam2;
    private String exitOrder;
  
    
    /**
     * <b>Constructor</b>: 
     * 
     * of class AllPlayers which creates 2 ArrayLists
     * players_1 for first team and players_2 for second
     * team.It also creates all players of the game and a
     * String exitOrder which indicates who player finish
     * first,second,third
     */
    public AllPlayers()
    {
        players_1 = new ArrayList<>(max_player);
        players_2 = new ArrayList<>(max_player);
        this.exitOrder="";
        players_1.add(new Player("Player-1-",1,1));
        players_2.add(new Player("Player-2-",1,2));
        players_1.add(new Player("Player-3-",1,3));
        players_2.add(new Player("Player-4-",1,4));
    }
    
    /**
     * Accessors
     * 
     * Method returns a substring which indicates
     * the id of the player who finish first
     * 
     * @return a substring id of a player
     */
    public String getExitOrder()
    {
        return ""+this.exitOrder.charAt(0);
    }
    /**
     * Transformer
     * 
     * Method which adds to exitOrder String
     * a players id
     *
     * @param id the players id
     */
    public void setExitOrder(int id)
    {
        this.exitOrder += Integer.toString(id);
    }
    
    /**
     * Accessors
     * 
     * Method returns the ArrayList players_1
     * which contains Players of Team 1
     * 
     * @return the players_1 ArrayList
     */
    public ArrayList getTeam1()
    {
        return this.players_1;
    }
    
    /**
     * Accessors
     * 
     * Method returns the ArrayList players_2
     * which contains Players of Team 2
     * 
     * @return the players_2 ArrayList
     */
    public ArrayList getTeam2()
    {
        return this.players_2;
    }
    
    /**
     * Accessors
     * Method returns a Player from a given
     * number of ArrayList and a given number of
     * position
     * 
     * @param Team integer which indicates the Team 1 or 2
     * @param pos integer which indicates the Player
     * @return the players_2 ArrayList
     */
    public Player getPlayer(int Team,int pos)
    {
        if(Team == 1)
        {
            return players_1.get(pos);
        }
        else
        {
            return players_2.get(pos);
        }
    }
    /** 
     * Transformer
     * This Method sets the points of both teams 
     * winnerTeam and loserTeam
     * 
     * @param winnerTeam the ArrayList with the Players of the winning team
     * @param loserTeam the ArrayList with the Players of the losing team
     * @param points 
     */
    public void setPoints(ArrayList winnerTeam,ArrayList loserTeam,int points)
    {
        int winnerTeamPoints=0,loserTeamPoints=0;
        if(this.teamStatus((Player)winnerTeam.get(0),(Player)winnerTeam.get(1))== 0)//1-2
        {
            winnerTeamPoints += 200;
            
        }
        else
        {
            for(Iterator<Player> winnerPlayersIter = winnerTeam.iterator(); winnerPlayersIter.hasNext();)
            {
                Player player_tmp = winnerPlayersIter.next();
                player_tmp.printBaza(player_tmp.getBaza());
                for(Iterator<Card> bazaIter = player_tmp.getBaza().iterator(); bazaIter.hasNext();)
                {
                        Card card_tmp = bazaIter.next();
                        if(card_tmp.getID()==5)
                        {
                            winnerTeamPoints+=5;
                        }
                        else if(card_tmp.getID()==10)
                        {
                            winnerTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==13)
                        {
                            winnerTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==-2)
                        {
                            winnerTeamPoints+=25;
                        }
                        else if(card_tmp.getColor()!= null)
                        {
                            if((card_tmp.getColor()).equals("grey"))
                            {
                                winnerTeamPoints-=25;
                            }
                        }
                }
            }
            if((this.teamStatus((Player)loserTeam.get(0),(Player)loserTeam.get(1))==1))//baza kai hand tou teleutaiou paixth ths xamenhs omadas
            {
                Player playerAlive,looserPlayerOut;
                if(((Player)loserTeam.get(0)).getStatus()==1)
                {
                    playerAlive = (Player)loserTeam.get(0);
                }
                else
                {
                    playerAlive = (Player)loserTeam.get(1);
                }
                if(((Player)loserTeam.get(0)).getStatus()==0)
                {
                    looserPlayerOut = (Player)loserTeam.get(0);
                }
                else
                {
                    looserPlayerOut = (Player)loserTeam.get(1);
                }
                playerAlive.printBaza(playerAlive.getBaza());
                playerAlive.printHand();
                looserPlayerOut.printBaza(looserPlayerOut.getBaza());
                for(Iterator<Card> bazaIter = playerAlive.getBaza().iterator(); bazaIter.hasNext();)
                {
                        Card card_tmp = bazaIter.next();
                        if(card_tmp.getID()==5)
                        {
                            winnerTeamPoints+=5;
                        }
                        else if(card_tmp.getID()==10)
                        {
                            winnerTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==13)
                        {
                            winnerTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==-2)
                        {
                            winnerTeamPoints+=25;
                        }
                        else if(card_tmp.getColor()!= null)
                        {
                            if((card_tmp.getColor()).equals("grey"))
                            {
                                winnerTeamPoints-=25;
                            }
                        }
                }
                for(Iterator<Card> handIter = playerAlive.getHand().iterator(); handIter.hasNext();)
                {
                        Card card_tmp = handIter.next();
                        if(card_tmp.getID()==5)
                        {
                            winnerTeamPoints+=5;
                        }
                        else if(card_tmp.getID()==10)
                        {
                            winnerTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==13)
                        {
                            winnerTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==-2)
                        {
                            winnerTeamPoints+=25;
                        }
                        else if(card_tmp.getColor()!= null)
                        {
                            if((card_tmp.getColor()).equals("grey"))
                            {
                                winnerTeamPoints-=25;
                            }
                        }
                }
                for(Iterator<Card> bazaIter = looserPlayerOut.getBaza().iterator(); bazaIter.hasNext();)
                {
                        Card card_tmp = bazaIter.next();
                        if(card_tmp.getID()==5)
                        {
                            loserTeamPoints+=5;
                        }
                        else if(card_tmp.getID()==10)
                        {
                            loserTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==13)
                        {
                            loserTeamPoints+=10;
                        }
                        else if(card_tmp.getID()==-2)
                        {
                            loserTeamPoints+=25;
                        }
                        else if(card_tmp.getColor()!=null)
                        {
                                if(card_tmp.getColor().equals("grey"))
                            {
                                loserTeamPoints-=25;
                            }
                        }
                }
            }
        }
        if(((Player)winnerTeam.get(0)).getpressedTichu())
        {
            if(Integer.toString(((Player)winnerTeam.get(0)).getID()).equals(this.getExitOrder()))
            {
                 winnerTeamPoints += 100;
            }
            else
            {
                winnerTeamPoints -= 100;
            }
        }
        if(((Player)winnerTeam.get(1)).getpressedTichu())
        {
            if(Integer.toString(((Player)winnerTeam.get(1)).getID()).equals(this.getExitOrder()))
            {
                 winnerTeamPoints += 100;
            }
            else
            {
                winnerTeamPoints -= 100;
            }
        }
        if(((Player)loserTeam.get(0)).getpressedTichu())
        {
            if(Integer.toString(((Player)loserTeam.get(0)).getID()).equals(this.getExitOrder()))
            {
                 loserTeamPoints += 100;
            }
            else
            {
                loserTeamPoints -= 100;
            }
        }
        if(((Player)loserTeam.get(1)).getpressedTichu())
        {
            if(Integer.toString(((Player)loserTeam.get(1)).getID()).equals(this.getExitOrder()))
            {
                 loserTeamPoints += 100;
            }
            else
            {
                loserTeamPoints -= 100;
            }
        }
        if(((Player)winnerTeam.get(0)).getpressedGrand())
        {
            if(Integer.toString(((Player)winnerTeam.get(0)).getID()).equals(this.getExitOrder()))
            {
                 winnerTeamPoints += 200;
            }
            else
            {
                winnerTeamPoints -= 200;
            }
        }
        if(((Player)winnerTeam.get(1)).getpressedGrand())
        {
            if(Integer.toString(((Player)winnerTeam.get(1)).getID()).equals(this.getExitOrder()))
            {
                 winnerTeamPoints += 200;
            }
            else
            {
                winnerTeamPoints -= 200;
            }
        }
        if(((Player)loserTeam.get(0)).getpressedGrand())
        {
            if(Integer.toString(((Player)loserTeam.get(0)).getID()).equals(this.getExitOrder()))
            {
                 loserTeamPoints += 200;
            }
            else
            {
                loserTeamPoints -= 200;
            }
        }
        if(((Player)loserTeam.get(1)).getpressedGrand())
        {
            if(Integer.toString(((Player)loserTeam.get(1)).getID()).equals(this.getExitOrder()))
            {
                 loserTeamPoints += 200;
            }
            else
            {
                loserTeamPoints -= 200;
            }
        }
        switch (((Player)winnerTeam.get(0)).namePlayer()) {
            case "Player-1-":
                this.pointsTeam1 += winnerTeamPoints;
                this.pointsTeam2 += loserTeamPoints;
                break;
            case "Player-2-":
                this.pointsTeam2 += winnerTeamPoints;
                this.pointsTeam1 += loserTeamPoints;
                break;
        }
        System.out.println("Points team1 "+this.getPointsTeam1()+"\n"+"Points team2 "+this.getPointsTeam2());
    }
    
    /**
     * Accessors
     * Method returns an integer pointsTeam1
     * which is the points gathered from team 1
     * 
     * @return this.pointsTeam1 the points of team 1
     */
    public int getPointsTeam1()
    {
        return this.pointsTeam1;
    }
    
    /**
     * Accessors
     * Method returns an integer pointsTeam2
     * which is the points gathered from team 2
     * 
     * @return this.pointsTeam2 the points of team 2
     */
     public int getPointsTeam2()
    {
        return this.pointsTeam2;
    }
    
     /**
      * Observer
      * 
      * Method which checks the status of 2 players of
      * the same team and if they are both inactive the returns
      * 0 else 1
      * 
      * @param player1 the first player of a team
      * @param player2 the second player of a team
      * @return 0 if both players of team are inactive else 1
      */
    public int teamStatus(Player player1,Player player2)
    {
        if((player1.getStatus()== 0) && (player2.getStatus()== 0) )
        {
            return 0;
        }
        else
        {
            return 1; 
        }
    }
}