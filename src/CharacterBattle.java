import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();

        int oddNo;

        while (true){
            System.out.println("Enter odd number of rounds: ");
            oddNo = scnr.nextInt();
            if (oddNo % 2 != 0) {
               break;
            }else {
                System.out.println("Please enter an odd number");
//                System.out.println("Enter odd number of rounds: ");
            }
        }

        int hpNo1, hpNo2, moviePower1, moviePower2, attackSpeed1, attackSpeed2, count1 = 0, count2 = 0;
        String name1, name2;


        for (int i = 0; i < oddNo; i++) {
            System.out.printf("Round %d : \n", (i + 1));
            System.out.println("-----------------");

                //------------------------PLAYER ONE --------------------------------------
                System.out.println("Player 1: Select a Character and enter its stats");

                System.out.println("Enter name1:");
                name1 = scnr.next();

                System.out.println("Enter HP:");
                hpNo1 = scnr.nextInt();

                System.out.println("Enter movie name1:");
                String moviename1 = scnr.next();

                System.out.println("Enter movie's power:");
                moviePower1 = scnr.nextInt();

                System.out.println("Enter attack speed:");
                attackSpeed1 = scnr.nextInt();

//------------------------PLAYER TWO --------------------------------------
                System.out.println("Player 2: Select a Character and enter its stats");

                System.out.println("Enter name2:");
                name2 = scnr.next();

                System.out.println("Enter HP:");
                hpNo2 = scnr.nextInt();

                System.out.println("Enter movie name2:");
                String moviename2 = scnr.next();

                System.out.println("Enter movie's power:");
                moviePower2 = scnr.nextInt();

                System.out.println("Enter attack speed:");
                attackSpeed2 = scnr.nextInt();


                while (hpNo1 > 0 && hpNo2 > 0) {
                    if (attackSpeed1 > attackSpeed2)
                    {
                        hpNo2 -= moviePower1;
                        if (hpNo2 > 0) {
                            System.out.println("Player 1 " + name1 + " wins this round!");
                            count1++;
                        }
                        hpNo1 -= moviePower2;
                        if (hpNo1 > 0) {
                            System.out.println("Player 2 " + name2 + " wins this round!");
                            count2++;
                        }

                    } else if (attackSpeed2 > attackSpeed1) {
                        hpNo1 -= moviePower2;
                        if (hpNo1 > 0) {
                            System.out.println("Player 2 " + name2 + " wins this round!");
                            count2++;
                        }
                        hpNo2 -= moviePower1;
                        if (hpNo2 > 0) {
                            System.out.println("Player 1 " + name1 + " wins this round!");
                            count1++;
                        }

                    } else {
                        int randomNo = rand.nextInt(2);
                        if (randomNo == 0) {
                            hpNo2 -= moviePower1;
                            if (hpNo2 > 0) {
                                System.out.println("Player 1 " + name1 + " wins this round!");
                                count1++;
                            }
                            hpNo1 -= moviePower2;
                            if (hpNo1 > 0) {
                                System.out.println("Player 2 " + name2 + " wins this round!");
                                count2++;
                            }
                        } else {
                            hpNo1 -= moviePower2;
                            if (hpNo1 > 0) {
                                System.out.println("Player 2 " + name2 + " wins this round!");
                                count2++;
                            }
                            hpNo2 -= moviePower1;
                            if (hpNo2 > 0) {
                                System.out.println("Player 1 " + name1 + " wins this round!");
                                count1++;
                            }
                        }
                    }
            }

            System.out.println();
            System.out.println("wins:");
            System.out.println("Player 1 Wins: " + count1);
            System.out.println("Player 2 Wins: " + count2);
        }

        System.out.println();
        System.out.println("Final Scores:");
        System.out.println("Player 1 Wins: " + count1);
        System.out.println("Player 2 Wins: " + count2);
        if (count1 < count2){
            System.out.println("Player 2 has won the game! ");
        } else if (count2 < count1) {
            System.out.println("Player 1 has won the game! ");
        }
    }
}
