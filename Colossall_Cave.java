import java.util.Scanner;

public class Colossall_Cave{
    private static boolean isGameOver = false;
    public static void main(String[] args){
        do {
            if(isGameOver){
                System.out.println("Would you like to play again? (Y/N)");
                String playAgain = System.console().readLine(); playAgain = playAgain.toUpperCase();
                if(playAgain.equals("N")){  
                    isGameOver = true;
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                }
            }
             System.out.println("Hello, welcome to the Colossal Cave Adventure Game!");
            System.out.println("What is your name?");
            String name = System.console().readLine();
            System.out.println("Hello " + name + "!");
            Entity player = new Entity(name, 100, 1, 2, 10, 0);
            start_scene(player);
        } while(!isGameOver);
    }
    public static void start_scene(Entity player){
        String input;
        System.out.println("You fell into a deep dark cave! Your bones seem to be broken but you can still move.");
        System.out.println("You see a light in the distance, do you want to go towards it? (y/n)");
        input = System.console().readLine().toLowerCase();
            if (input.equals("n")) {
            System.out.println("You bled out on the spot and got eaten by a vampire");
            isGameOver = true;
            main(null);
            }
        stage_one(player); 
    }
    public static void stage_one(Entity player){
        Scanner Num = new Scanner(System.in);
        String input;
        System.out.println("you look back into the room and you see you lucky escaped a brutale vampire that was waiting for you \n You see three small holes in the dimly lit room that you are in would you like to investigate? !");
        System.out.println("Do you want to investigate the holes? (y/n)");
        input = System.console().readLine().toLowerCase();
        if (input.equals("y")) {
            System.out.println("Which hole would you like to investigate? (1/2/3)");
            int hole = Num.nextInt();
            switch (hole) {
                case 1 :
                Traps xBow = new Traps("Cross bow", 10, 3);
                    for (int index = 1; index < xBow.getTrapfirerate(); index++) {
                       player.health = player.health - xBow.getTrapdamage();
                    }
                    stage_two(hole, player);
                    Num.close();
                    break;
                case 2 :
                Monster vampire = new Monster("Ronald", "Vampire", 100, 10, 2, 10, 10);
                vampireknife knife = new vampireknife("Vampire Knife", 15, 3);
                    System.out.println("You see a vampire in the hole! Do you want to fight it? (y/n)");
                    input = System.console().readLine().toLowerCase();
                    if (input.equals("y")) {
                        System.out.println(vampire.getName()+ ": " + "you have chosen a fight with the wrong vampire! You are a fool and you have to pay for it \n Prepare to die!"); 
                        System.out.println("You have " + player.getHealth() + " health" + " and " +vampire.getName() + " has " + vampire.getHealth() + " health");
                        while (player.getHealth() <= 0 || vampire.getHealth() <= 0) {
                            if (player.getAttackSpeed() > vampire.getAttackSpeed()) {
                                vampire.health = vampire.getHealth() - player.getAttackDamage();
                            }else if(player.getAttackSpeed() < vampire.getAttackSpeed()){
                                player.health = player.getHealth() - vampire.getAttackDamage();
                            }
                        }
                        if (vampire.health <= 0) {
                            System.out.println("You have killed the vampire! You have gained " + vampire.getExpereince() + " expereince");
                            player.health = player.getHealth() + vampire.getExpereince();
                            System.out.println("The vampiire dropped a vampire knife! Do you want to pick it up? (y/n)");
                            input = System.console().readLine().toLowerCase();
                            if (input.equals("y")) {
                                System.out.println("You have picked up the vampire knife! You have gained " + knife.getAttackDamage() + " attack damage");
                                player.attackDamage = kinfe.attackDamage;
                            }
                        }
                    }
                    stage_two(hole, player);
                    Num.close();
                    break;
                case 3 :
                    stage_two(hole, player);
                    Num.close();
                    break;    
                default :
                       hole = Num.nextInt(); 
                       Num.close();
                    break;
            }
        }
    }
    public static void stage_two(int hole, Entity player){
    
    }
    public static void stage_three(){

    }
    public static void stage_four(){

    }
    public static void stage_five(){

    }
    public static void stage_six(){

    }
    public static void stage_seven(){

    }
    public static void stage_eight(){

    }
    public static void stage_nine(){

    }
    public static void stage_ten(){

    }
    public static void stage_eleven(){

    }
    public static void stage_twelve(){

    }
    public static void stage_thirteen(){

    }
    public static void stage_fourteen(){

    }
    public static void stage_fifteen(){

    }
}