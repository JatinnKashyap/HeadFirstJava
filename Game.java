package DotComGame;
import java.util.Scanner;
public class Game {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your gaming journey begins. Best of Luck!\n\n Enter Your name: ");
        Player player = new Player(sc.nextLine());
        System.out.print("The tagline that best describes you : ");
        player.setTagLine(sc.nextLine());
        System.out.println("\nThe game begins!! Behold the Mighty dotcoms vs the persistant " + player.getName()+"\n\n");

        Grid grid = new Grid(player);
        grid.initializeGameboard();
        boolean gameRunning = true;
        while(gameRunning){
            grid.currentgameInfo();
            int row=0,col=0;
            System.out.print(player.getName()+" enter \"info\" to get current game info, \"q\" to quit the game or \"p\" to play : ");
            String input = sc.nextLine();
            boolean successfullParse = true;
            if(input.equals("info")) {
                grid.currentgameInfo();
                continue;
            }
            else if(input.equals("p")){
                System.out.print("row : ");
                String r = sc.nextLine();
                System.out.print("column : ");
                String c = sc.nextLine();
                try{
                    row = Integer.parseInt(r);
                }
                catch(NumberFormatException e){
                    successfullParse = false;
                }
                try{
                    col = Integer.parseInt(c);
                }
                catch(NumberFormatException e){
                    successfullParse = false;
                }
            }
            else if(input.equals("q")){
                grid.endingGameInfo();
                gameRunning = false;
                continue;
            }
            else if(input.equals("board")){
                grid.displayGameBoard();
                successfullParse = false;
            }
            else{
                successfullParse = false;
            }
            if(successfullParse){
                if(row < grid.getGridSize() && col < grid.getGridSize() && row >=0 && col >=0)
                    grid.attack(row,col);
                else
                    System.out.println("Invalid Input!");
            }
            else{
                System.out.println("Invalid Input!");
            }

        }

    }
}
