import java.util.Scanner;
public class game
{
    public static String randomWord()
    {
        double a = Math.random()*2;
        int b=(int)a;
        if (b==0)
        {
            return "rock";

        }
        if (b==1)
        {
            return "paper";

        }
        if (b==2)
        {
            return "scissor";

        }
        return "0";
    }
        public static void main(String[] args)
        {
            String cch=randomWord();
            Scanner sc = new Scanner(System.in);
            System.out.println("Let's play Rock Paper Scissors");
            System.out.println("When I say 'shoot', Choose: rock, paper, or scissors\nAre you ready? Write 'yes' if you are\n");
            String ab=sc.nextLine();
            if (ab.equals("yes"))
            {
                System.out.println("great");
                System.out.println("rock -- paper -- scissors, shoot!");
                String ch=sc.nextLine();
             System.out.println("you chose "+ch);
             System.out.println("computer chose "+cch);
             if(ch.equals("rock")&&cch.equals("scissor"))
             {
                 System.out.println("you won");
             }
            else if(ch.equals("paper")&&cch.equals("rock"))
            {
                System.out.println("you won");
            }
            else if(ch.equals("scissor")&&cch.equals("paper"))
            {
                System.out.println("you won");
            }
            else if(ch.equals("rock")&&cch.equals("rock"))
            {
                System.out.println("Its a draw!");
            }
            else if(ch.equals("scissor")&&cch.equals("scissor"))
            {
                System.out.println("Its a draw!");
            }
            else if(ch.equals("paper")&&cch.equals("paper"))
            {
                System.out.println("Its a draw!");
            }
            else
            {
                System.out.println("computer won");
            }
            }
            else
            {
                System.out.println("Darn, some other time... ");
            }

        }
    }