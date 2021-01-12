import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * [SCP.java]
 * The SCP version of the Code-049 game.
 * @author Vivian Dai, Damon Ma, and Edward Yang
 * @version 1.0 on January 11, 2021
 */



public class SCP extends Player{
    /**An arraylist of all SCPs in the game. */
    private ArrayList<SCP0492> scps;
    /**The amount of hume points (SCP currency) that the player has. */
    private int hume;
    /**The game window that the player will use to play the game. */
    private SCPGameWindow gameWindow;

    /**
     * Constructor for a new SCP game
     * @param username The username of the player
     * @param playerClient The client that the player is using the send and receive messages from the server.
     * @param hume The amount of hume points that the player will start off with.
     */
    public SCP(String username, Client playerClient, String opponent, int hume){
        super(username, playerClient, opponent);
        this.hume = hume;
        scps = new ArrayList<SCP0492>();
    }//end of constructor


    /**
     * starts the game as the SCP side.
     */
    public void start(){
        gameWindow = new SCPGameWindow();
        gameWindow.run();
    }


    /**
     * Changes the amount of the player's hume points
     * @param change The amount of hume points that the player will gain or lose.
     */
    public void changeHume(int change){
        this.hume += change;
    }
    
    //TODO: method for client-game transactions


    /**
     * Starts the current turn in the game.
     */
    public void endTurn(){
        System.out.println("Not a functional method yet.");
        //TODO: Not a functional method yet.
    }

    /**
     * Ends the current turn in the game.
     */
    public void startTurn(){
        System.out.println("Not a functional method yet.");
        //TODO: Not a functional method yet.
    }

    /**
     * Creates an SCP event that the player chose to use that is not location-based.
     * @param eventType The name of the event that will be created.
     */
    public void startEvent(String eventType){
        System.out.println("new event!");
    }//end of method

    /**
     * Creates an SCP event that the player chose to use that is location-based.
     * @param eventType The name of the event to be created.
     * @param x The x-value of the event's position.
     * @param y THe y-value of the event's position.
     */
    public void startEvent(String eventType, int x, int y){
        System.out.println("new event!");
    }//end of method



    //start of inner class for the game window
    public class SCPGameWindow extends GameWindow{

        /**
         * Runs the SCP version of the game.
         */
        public void run(){
            JFrame gameWindow = getWindow();
            gameWindow.setSize(50,50); //TODO: Discuss game window sizes
            gameWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

            JPanel gridPanel = getGrid();
            gridPanel.setBounds(0, 0, 0, 0); //TODO: Discuss game window sizes and dimensions of JPanels
            gridPanel.setBorder(BorderFactory.createLineBorder(Color.black));
            gameWindow.add(gridPanel);


            JPanel infoBarPanel = getInfoBar();
            infoBarPanel.setBounds(0,0,0,0); //TODO: Discuss game window sizes and dimensions of JPanels
            infoBarPanel.setBounds(0,0,0,0); //TODO: Discuss game window sizes and dimensions of JPanels
            gameWindow.add(infoBarPanel);
        }

        /**
         * Updates the game screen.
         */
        public void update(){
            System.out.println("Hello");
            //TODO: Not complete yet
        }

    }//end of inner class

}//end of class