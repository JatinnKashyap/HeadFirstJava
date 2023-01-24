package DotComGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Grid {
    private int level;
    private int gridSize;
    private int dotComlength;
    private int[] dotcoms;
    private int numberOfDotComs;
    private int currentDotComs;
    private int moves;
    private Map<String,Integer> grid;
    private Player player;

    public Grid(Player player) {
        this.player = player;
        this.level = 0;
        this.dotComlength = 3;
        this.numberOfDotComs = 3;
        this.gridSize = 7;
    }

    public void initializeGameboard() {
        this.moves = 0;
        this.grid = new HashMap<String,Integer>();
        this.dotcoms = new int[this.numberOfDotComs];
        Arrays.fill(this.dotcoms, this.dotComlength);
        this.currentDotComs = this.numberOfDotComs;
        for (int i = 0; i < this.numberOfDotComs; ) {
            int startPointx = (int) (Math.random() * this.gridSize);
            int startPointy = (int) (Math.random() * this.gridSize);
            if ((startPointy + startPointx) % 2 == 0) {
                boolean possible = true;
                if (startPointx + this.dotComlength <= this.gridSize) {
                    for (int j = 0; j < this.dotComlength; j++) {
                        if (this.grid.containsKey((startPointx + j) + " " + startPointy)){
                            possible = false;
                            break;
                        }
                    }
                }else possible = false;
                if (possible) {
                    for (int j = 0; j < this.dotComlength ; j++) {
                        this.grid.put((startPointx + j) + " " + startPointy, i+1);
                    }
                    i++;
                }
            }else{
                boolean possible = true;
                if (startPointy + this.dotComlength <= this.gridSize) {
                    for (int j = 0; j < this.dotComlength; j++) {
                        if (this.grid.containsKey(startPointx+" "+(startPointy + j))) {
                            possible = false;
                            break;
                        }
                    }
                }else possible = false;
                if (possible) {
                    for (int j = 0; j < this.dotComlength ; j++) {
                        this.grid.put(startPointx+" "+(startPointy + j), i+1);
                    }

                    i++;
                }
            }
        }
    }
    public void displayGameBoard(){
        System.out.println("The gameboard looks like this \n");
        for(Map.Entry<String, Integer> me : this.grid.entrySet())
            System.out.println("row  column :: "+me.getKey()+" --> has the www."+me.getValue()+".com");
         System.out.println();
    }

    public void incrementLevel(){
        this.level++;
        this.gridSize += 2;
        player.increamentPlayerLevel(this.moves);
        if(this.level % 2 == 0)
            this.dotComlength++;
        if(this.level % 2 == 0)
            this.numberOfDotComs++;
    }
    public void currentgameInfo(){
        System.out.println("Current Grid Size : " + this.gridSize +" x "+this.gridSize );
        System.out.println("Number of DotComs Remaining = " + this.currentDotComs);
        player.PlayerInfo();
    }
    public void endingGameInfo(){
        this.currentgameInfo();
        System.out.println("\nIt's shame you have to leave us.\nYou could have been the greatest, could have been the best.");
        System.out.println("May you grow at a tachyonic speed. Best of luck for your journey ahead!");

    }
    public void attack(int row,int col){
        this.moves++;
        String key = row + " " + col;
        if(this.grid.containsKey(key)){
            System.out.println("Hit!!");
            this.dotcoms[this.grid.get(key)-1]--;
            if(this.dotcoms[this.grid.get(key)-1] == 0){
                System.out.println("boom! www." +this.grid.get(key)+ ".com has been decimated!");
                this.currentDotComs--;
                if(this.currentDotComs == 0){
                    System.out.println("All the dotcoms have been destroyed!!.\nYou move on to the next level.");
                    this.incrementLevel();
                    this.initializeGameboard();
                    this.currentgameInfo();

                }
            }
            this.grid.remove(key);
        }else{
            System.out.println("Miss!!");
        }
    }
    public int getGridSize(){
        return this.gridSize;
    }


}
