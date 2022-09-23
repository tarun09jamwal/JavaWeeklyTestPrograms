public class RandomPassword
{
    public static void main(String[] args)
    {
        String name = "Tarun";
        String randomNumber = String.valueOf((int)(Math.random()*(1000-500+11)+500));
        String password = name + randomNumber;
        System.out.println(password);


    }
}
