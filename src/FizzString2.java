public class FizzString2 {
    public void fizzString2(int n) {
        if(n%3 == 0 && n%5 == 0)
        {
            System.out.println("FizzBuzz"+ "!");
        }
        else if(n%3 == 0)
        {
            System.out.println("Fizz"+ "!");
        }
        else if(n%5 == 0)
        {
            System.out.println("Buzz"+ "!");
        }
        else
        {
            System.out.println(n+ "!");
        }
    }

}
