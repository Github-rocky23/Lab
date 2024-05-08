import java.util.*;
class SwitchCase 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        SwitchCase choice=new SwitchCase();
        int option;
        do 
        {
            System.out.println("Enter your choice: ");
            option=sc.nextInt();
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            switch(option) 
            {
                case 1:
                    choice.checkEvenOrOdd(num);
                    break;
                case 2:
                    choice.checkPrime(num);
                    break;
                case 3:
                    choice.checkArmstrong(num);
                    break;
                case 4:
                    choice.checkPalindrome(num);
                    break;
                case 5:
                    choice.checkPerfect(num);
                    break;
                case 6:
                    choice.checkStrong(num);
                    break;
                case 7:
                    choice.checkFactorial(num);
                    break;
                case 8:
                    choice.checkFibonacci(num);
                    break;
                case 9:
                    choice.printFactors(num);
                    break;
                case 10:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a choice between 1 to 10.");
            }
        }while(option!=10);
    }

    void checkEvenOrOdd(int num) 
    {
        if(num%2==0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    void checkPrime(int num) 
    {
        int i;
        for(i=2;i<=num/2;i++) 
        {
            if(num%i==0) 
            {
                System.out.println(num + " is not prime");
            }
        }
        System.out.println(num + " is prime");
    }

    void checkArmstrong(int num) 
    {
        int r,sum=0,temp;
        temp=num;
        while(num>0) 
        {
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(temp==sum)
            System.out.println(temp + " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");
    }

    void checkPalindrome(int num) 
    {
        int r,sum=0,temp;
        temp=num;
        while(num>0) 
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }

    void checkPerfect(int num) 
    {
        int sum=0;
        for(int i=1;i<num;i++) 
        {
            if(num%i==0)
                sum=sum+i;
        }
        if(sum==num)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }

    int factorial(int num) 
    {
        int fact=1;
        for(int i=1;i<=num;i++) 
        {
            fact*=i;
        }
        return fact;
    }
    

    void checkStrong(int num) 
    {
        int k=num;
        int r,sum=0;
        while(k!=0) 
        {
            r=k%10;
            sum+=factorial(r);
            k=k/10;
        }
        if (sum==num)
            System.out.println(num + " is a strong number.");
        else
            System.out.println(num + " is not a strong number.");
    }

    void checkFactorial(int num) 
    {
        int fact=factorial(num);
        System.out.println("Factorial of " + num + " is : " + fact);
    }

    void checkFibonacci(int num) 
    {
        int n1=0,n2=1,n3;
        System.out.print("Fibonacci series up to " + num + ": ");
        System.out.print(n1 + " " + n2);
        for(int i=2;i<num;i++) 
        {
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }

    void printFactors(int num) 
    {
        System.out.print("Factors of " + num + " are: ");
        for (int i=1;i<=num;i++) 
        {
            if (num%i==0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
