import java.util.Scanner;
public class FinalProject {
    public static void main(String[] args) {
        System.out.println("Hello welcome to food app");
        System.out.println("please create a password:");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("Your password is now;" + pass1);

        System.out.println("Please enter you password");
        String pass = scan.next();

        while (!pass.equals(pass1)) {
            System.out.println("This is not right password please try again");
            pass = scan.next();
        }
        System.out.println("access granted");
        System.out.println("Are you hungry Yes or No");
        String ans1 = scan.next();

        if (ans1.equals("Yes")) {
            System.out.println("Choose what you want to eat between pizza burger or fish");
            String ans2 = scan.next();

            while (!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")) {
                System.out.println("sorry we do not have it what would you like between pizza burger or fish");
                ans2 = scan.next();
            }
            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish")) ;
            {
                System.out.println("Do you want something to drink?Yes or No:");
                String ans3 = scan.next();

                if (ans3.equals("Yes")) {
                    System.out.println("what would you like to drink coke or juice?:");
                    String ans4 = scan.next();

                    while (!ans4.equals("coke") && !ans4.equals("juice")) {
                        System.out.println("sorry we dont have it what would you like between coke and juice");
                        ans4 = scan.next();
                    }
                    if (ans4.equals("coke") || ans4.equals("juice")) {
                        System.out.println("Great you have ordered \n" + ans2 + "\n and \n" + ans4);

                    }
                    System.out.println("please confirm your password");
                    pass = scan.next();
                    while (!pass.equals(pass1)) {
                        System.out.println("This is not right password please try again");
                        pass = scan.next();
                    }
                    System.out.println("Thank you! your order is on its way");
                } else {
                    System.out.println("you have ordered " + ans2);

                    System.out.println("please confirm your password");
                    pass = scan.next();
                    while (!pass.equals(pass1)) {
                        System.out.println("This is not right password please try again");
                        pass = scan.next();
                    }
                }

            }
        } else {
            System.out.println("Alright have a great day");
        }


    }


}
