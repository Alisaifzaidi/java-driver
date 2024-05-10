import java.util.*;
 class Selectr{ 
    int select;
    int Selectnum(){
        System.out.println("Player Select the Number");
        Scanner sc=new Scanner(System.in);
        select=sc.nextInt();
        return select;
    }
}
 class Player{
    int guessnum;
    int guess(){
        System.out.println("Player Guess the Number");
        Scanner sc=new Scanner(System.in);
        guessnum=sc.nextInt();
        return guessnum;
      
    } 
}

class Umpir {
    int Selectornum;
    int Player1num;
    int Player2num;
    int Player3num;
    
    void fromselector(){
        Selectr s=new Selectr();
        Selectornum=s.Selectnum();
    }
    void fromplayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        Player1num=p1.guess();
        Player2num=p2.guess();
        Player3num=p3.guess();
    }
    void compare(){
        if(Selectornum==Player1num){
            System.out.println("Player 1 won the match");
        }else if (Selectornum==Player2num) {
            System.out.println("Player 2 won the match");
        } else if (Selectornum==Player3num) {
            System.out.println("player 3 won the match");
        } else {
            System.out.println("No one won the match");
        } {
            
        }
    }
}

public class Game{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Guesser Game Loading....");
        Umpir u=new Umpir();
        u.fromselector();
        u.fromplayer();
        u.compare();
        sc.close();
        
    }
}