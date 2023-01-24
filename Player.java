package DotComGame;

public class Player {
    private String name;
    private int level,rating;
    private String tagline;
    public Player(String name){
        this.name = name;
        this.level = 0;
        this.rating = 0;
    }
    public void PlayerInfo(){
        System.out.println(this.name + " is a force of nature.");
        System.out.println("Their current level is "+ this.level);
        System.out.println("They are currently rated at : "+this.rating);
        System.out.println("The phrase that best describes them : "+this.tagline+ "\n");
    }
    public void setTagLine(String tagline){
        this.tagline = tagline;
    }
    public String getName(){
        return this.name;
    }
    public void increamentPlayerLevel(int moves){
        this.level++;
        this.rating += Math.max(0,50-moves);
    }
}
