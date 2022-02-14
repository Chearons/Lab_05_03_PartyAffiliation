public class Main
{
    public static void main(String[] args)
    {
        String partyAfil = "O";
        System.out.println("Enter your part affiliation D) Democrat , R)Republican, I) Independent, or O) Other [DRIO]: ");
        System.out.println(partyAfil);
        if (partyAfil == "D")
        {
            System.out.println("You get a democratic donkey. ");
        }
        else if (partyAfil == "R")
        {
            System.out.println("You get a republican elephant. ");
        }
        else if (partyAfil == "I")
        {
            System.out.println("You get an independent man. ");
        }
        else if (partyAfil == "O")
        {
            System.out.println("You chose another party");
        }
        else
        {
            System.out.println("Incorrect party affiliation. ");
        }

    }
}
