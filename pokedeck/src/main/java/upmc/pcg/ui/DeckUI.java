/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.ui;
import java.util.*;
import upmc.pcg.game.*;

import org.json.simple.*;
import java.util.*;

/**
 *
 * @author jerom
 */
public class DeckUI {
    private final Scanner console = new Scanner(System.in);
    private JSONObject indiv_deck;
    private ArrayList<Deck> deck = new ArrayList();
        
    public void PrintDeckMenu(JSONObject name_deck){
        this.indiv_deck = name_deck;
        System.out.println(this.indiv_deck);
        System.out.println("    (1) Add Card \n    (2) Update Card \n    (3) Remove Card \n    (4) View All card \n    (5) View a Card  \n    (6) Back ");
        ChoiceUserDeckMenu();
    }
    
     public void ChoiceUserDeckMenu(){
        String choice_user = console.nextLine();
        
        if(choice_user.equals("1")){
            CardUI card = new CardUI();
            this.indiv_deck.put("carte", card.create_card());

        }else if(choice_user.equals("2")){

        }else if(choice_user.equals("3")){

        }else if(choice_user.equals("4")){

        }else if(choice_user.equals("5")){

        }else if(choice_user.equals("6")){
            GameUI game_ui = new GameUI();
            game_ui.PrintMenu();
        }else{
            System.out.println("Bad Selection ");
            ChoiceUserDeckMenu();
        }
    }         
}
