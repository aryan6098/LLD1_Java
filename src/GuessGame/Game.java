package GuessGame;

public class Game {
    int computerGuess;
    Player p1, p2, p3;

    Game(String name1, String name2, String name3) {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    boolean checkWinner(){
        if(p1.getGuess() == this.computerGuess){
            System.out.println(p1.name + " wins");
            return true;
        }
        else if(p2.getGuess() == this.computerGuess){
            System.out.println(p2.name + " wins ");
            return true;
        } else if (p3.getGuess() == this.computerGuess) {
            System.out.println(p3.name + " wins ");
        }
        return false;
    }

    void launch() {
        System.out.println("Welcome to Game Guess");
        this.computerGuess = (int)(Math.random() * 9) +1;

        while (true){
            System.out.println("Computer Guessed " + this.computerGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();

            if(checkWinner() == true) {
                System.out.println("Game Over");
                break;
            }else {
                this.computerGuess = (int)(Math.random()*9) + 1;
            }
        }
    }

}
