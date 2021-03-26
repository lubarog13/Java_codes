package lubarog13;
import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;


public class RMP {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            /*System.out.println("Hi, dude!");
            int num = 20;
            Scanner textMe = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = JOptionPane.showInputDialog("What is your name?");
            JOptionPane.showMessageDialog(null, "Your name " + name);
            System.out.println("Your name " + name);*/
            /*Task
            In this challenge, you must read 3 integers from stdin and then print them
            to stdout. Each integer must be printed on a new line. To make the problem a
            little easier, a portion of the code is provided for you in the editor below.
            Scanner scan = new Scanner(System.in);*/
            /*int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
             */
            /*Task
            Given an integer, , perform the following conditional actions:

            If n is odd, print Weird
            If n is even and in the inclusive range of 2 to 5, print Not Weird
            If n is even and in the inclusive range of 6 to 20, print Weird
            If n is even and greater than 20, print Not Weird
            Complete the stub code provided in your editor to print whether or not  is weird.*/
       /*     int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if ((N>=2)&&(N<=5)){
            System.out.println("Not Weird");
        }
        else if ((N>=6)&&(N<=20)){
            System.out.println("Weird");
        }
        else {System.out.println("Not Weird");}
        scanner.close();*/
            /*Input Format

            There are three lines of input:

            The first line contains an integer.
            The second line contains a double.
                    The third line contains a String.
                    Output Format

            There are three lines of output:

            On the first line, print String: followed by the unaltered String read from stdin.
            On the second line, print Double: followed by the unaltered double read from stdin.
            On the third line, print Int: followed by the unaltered integer read from stdin.
            To make the problem easier, a portion of the code is already provided in the editor.*/
            /*Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);*/
            /*Input Format

            Every line of input will contain a String followed by an integer.
            Each String will have a maximum of 10 alphabetic characters, and each integer
            will be in the inclusive range from 0 to 999.

            Output Format

            In each line of output there should be two columns:
            The first column contains the String and is left justified using exactly 15 characters.
            The second column contains the integer, expressed in exactly 3 digits;
            if the original input has less than three digits, you must pad your output's leading digits with zeroes.*/
            /*Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");*/
            /*Task
            Given an integer,N , print its first 10 multiples. Each multiple Nxi
            (where 1<=i<=10) should be printed on a new line in the form: N x i = result*/

            /*int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for(int i=1;i<=10;i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
            scanner.close();*/
            /*Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int s = a;
                for(int j=0;j<n;j++){
                    for(int k=0;k<=j;k++){
                        s+=Math.pow(2, k)*b;
                    }
                    System.out.print(s+" ");
                    s=a;
                }
                System.out.println();
            }

            in.close();*/
                /*Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                String line = "burg";
                if(line.equals(str.substring(str.length()-4,str.length()))) System.out.println(true);
                else System.out.println(false);*/
                /*package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int m_water = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int m_milk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int m_beans = scan.nextInt();
        System.out.print("Write how many cups of coffee you will need: \n");
        int cups = scan.nextInt();
        int max_cup = m_water/200;
        int max = m_milk/50;
        max_cup = max_cup<max?max_cup:max;
        max = m_beans/15;
        max_cup = max_cup<max?max_cup:max;
        if(max_cup<cups) System.out.println("No, I can make only " + max_cup + " cup(s) of coffee");
        else if (max_cup==cups) System.out.println("Yes, I can make that amount of coffee");
        else System.out.println("Yes, I can make that amount of coffee (and even " + (max_cup-cups) + " more than that)");

    }
}*/
                /*int water = 400;
                int milk  = 540;
                int beans = 120;
                int cups = 9;
                int money = 550;
                String action = "";

        Scanner scan = new Scanner(System.in);
                while (action!="exit"){
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                action = scan.next();
                switch (action) {
                        case "buy":
                                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                                String buy = scan.next();
                                switch (buy) {
                                        case "1":
                                                if(water>=250 && beans>=16 && cups>=1){
                                                water -= 250;
                                                beans -= 16;
                                                cups -= 1;
                                                money += 4;
                                                System.out.println("I have enough resources, making you a coffee!");}
                                                else if (water<250) System.out.println("Sorry, not enough water!");
                                                else if (beans<16) System.out.println("Sorry, not enough coffee beans!");
                                                else if (cups<1) System.out.println("Sorry, not enough disposable cups!");
                                                break;
                                        case "2":
                                                if(water>=350 && beans>=20 && cups>=1 && milk>=75){
                                                water -= 350;
                                                beans -= 20;
                                                milk -= 75;
                                                cups -= 1;
                                                money += 7;}
                                                else if (water<350) System.out.println("Sorry, not enough water!");
                                                else if (milk<75) System.out.println("Sorry, not enough milk!");
                                                else if (beans<20) System.out.println("Sorry, not enough coffee beans!");
                                                else if (cups<1) System.out.println("Sorry, not enough disposable cups!");
                                                break;
                                        case "3":
                                                if(water>=200 && beans>=12 && cups>=1 && milk>=100){
                                                water -= 200;
                                                beans -= 12;
                                                milk -= 100;
                                                cups -= 1;
                                                money += 6;}
                                                else if (water<200) System.out.println("Sorry, not enough water!");
                                                else if (milk<100) System.out.println("Sorry, not enough milk!");
                                                else if (beans<12) System.out.println("Sorry, not enough coffee beans!");
                                                else if (cups<1) System.out.println("Sorry, not enough disposable cups!");
                                                break;
                                        default:
                                                break;
                                }
                                break;
                        case "fill":
                                System.out.println("Write how many ml of water do you want to add: ");
                                water += scan.nextInt();
                                System.out.println("Write how many ml of milk do you want to add: ");
                                milk += scan.nextInt();
                                System.out.println("Write how many grams of coffee beans do you want to add: ");
                                beans += scan.nextInt();
                                System.out.println("Write how many disposable cups of coffee do you want to add:");
                                cups += scan.nextInt();
                                break;
                        case "take":
                                System.out.println("I gave you $" + money);
                                money = 0;
                                break;
                        case "remaining":
                                System.out.println("The coffee machine has:\n" + water +
                                        " of water\n" + milk +
                                        " of milk\n" + beans +
                                        " of coffee beans\n" + cups +
                                        " of disposable cups\n" + money +
                                        " of money");
                                break;
                        case "exit":
                                System.exit(0);

                }

        }*//*CoffeeMachine coffeeMachine = new CoffeeMachine();
                Scanner scan = new Scanner(System.in);
                String action="";
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                while (!action.equals("exit")){
                        action = scan.next();
                        coffeeMachine.coffeeMake(action);
                }*/
                /*int a, b, c;
                double square=0;
                Scanner scan = new Scanner(System.in);
                String form = scan.next();
                switch(form){
                        case "triangle":
                                a = scan.nextInt();
                                b = scan.nextInt();
                                c = scan.nextInt();
                                double p = (a+b+c)*0.5;
                                System.out.println(p);
                                square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                                break;
                        case "rectangle":
                                a = scan.nextInt();
                                b = scan.nextInt();
                                square = a*b;
                                break;
                        case "circle":
                                a = scan.nextInt();
                                square=3.14*a*a;
                                break;
                }
                System.out.println(square);*/
                /*System.out.printf("Enter cells:\n");
                String user = "         ";
                char[][] feld = new char[3][3];
                String end = null;
                for ( int i = 0; i < 3; i++ ) {
                        for ( int j = 0; j < 3; j++ ) {
                                feld[i][j] = user.charAt(3 * i + j);

                        }
                }
                System.out.printf("---------\n");
                System.out.printf("| %c %c %c |\n", feld[0][0], feld[0][1], feld[0][2]);
                System.out.printf("| %c %c %c |\n", feld[1][0], feld[1][1], feld[1][2]);
                System.out.printf("| %c %c %c |\n", feld[2][0], feld[2][1], feld[2][2]);
                System.out.printf("---------\n");
                String input1 = "";
                String input2 = "";
                int counter=1;
                while (end == null) {
                        boolean is_int = false;
                        while (is_int == false) {
                                System.out.print("Enter the coordinates: ");
                                input1 = scanner.next();
                                input2 = scanner.next();
                                is_int = true;
                                for ( int i = 0; i < input1.length(); i++ ) {
                                        if (input1.charAt(i) <= '0'
                                                && input1.charAt(i) >= '9') {
                                                is_int = false;
                                        }
                                }
                                for ( int i = 0; i < input2.length(); i++ ) {
                                        if (input2.charAt(i) <= '0'
                                                && input2.charAt(i) >= '9') {
                                                is_int = false;
                                        }
                                }
                                if (!is_int) System.out.println("You should enter numbers!");
                                else {
                                        int a = Integer.parseInt(input1);
                                        int b = Integer.parseInt(input2);
                                        if (a > 3 || a < 1 || b > 3 || b < 1) {
                                                System.out.println("Coordinates should be from 1 to 3!");
                                                is_int = false;
                                        } else if (feld[a - 1][b - 1] != ' ') {
                                                System.out.println("This cell is occupied! Choose another one!");
                                                is_int = false;
                                        } else if (counter%2==1){ feld[a-1][b-1] = 'X'; counter++;}
                                        else { feld[a-1][b-1] = 'O'; counter++;}
                                }
                        }
                        System.out.printf("---------\n");
                        System.out.printf("| %c %c %c |\n", feld[0][0], feld[0][1], feld[0][2]);
                        System.out.printf("| %c %c %c |\n", feld[1][0], feld[1][1], feld[1][2]);
                        System.out.printf("| %c %c %c |\n", feld[2][0], feld[2][1], feld[2][2]);
                        System.out.printf("---------\n");

                        char[] x = {'X', 'X', 'X'};
                        char[] o = {'O', 'O', 'O'};
                        char[] str = new char[3];
                        char[] str1 = new char[3];
                        for ( int i = 0; i < 3; i++ ) {
                                for ( int j = 0; j < 3; j++ ) {
                                        str[j] = feld[j][i];
                                        str1[j] = feld[i][j];
                                }
                                if (Arrays.equals(x, str)) {
                                        end = "X wins";
                                } else if (Arrays.equals(o, str)) {
                                        end = "O wins";
                                }
                                if (Arrays.equals(x, str1)) {
                                        end = "X wins";
                                } else if (Arrays.equals(o, str1)) {
                                        end = "O wins";
                                }
                        }
                        if (feld[0][0] == 'X' && feld[1][1] == 'X' && feld[2][2] == 'X') {
                                end = "X wins";
                        } else if (feld[0][0] == 'O' && feld[0][1] == 'O' && feld[2][2] == 'O') {
                                end = "O wins";
                        }
                        if (feld[0][2] == 'X' && feld[1][1] == 'X' && feld[2][0] == 'X') {
                                end = "X wins";
                        } else if (feld[0][2] == 'O' && feld[1][1] == 'O' && feld[2][0] == 'O') {
                                end = "O wins";
                        }
                        boolean not_finished = false;
                        for ( int i = 0; i < 3; i++ ) {
                                for ( int j = 0; j < 3; j++ ) {
                                        if (feld[i][j] == ' ') not_finished = true;
                                }
                        }
                        if (!not_finished) end = "Draw";
                        if (end != null) System.out.println(end);*/
                /*int a=0, c=0;
                try {
                        a= scanner.nextInt();
                }catch (Exception e){
                        System.out.println("error");
                        System.exit(0);
                }
                String s = scanner.next();
                boolean t = true;
                for(int i=0;i<s.length();i++){
                        if(!((s.charAt(i)>='0')&&(s.charAt(i)<='9'))||(s.charAt(i)>='a'&&s.charAt(i)<='z')||s.charAt(i)=='.') t=false;
                        if(s.charAt(i)>'a'-11+a&&s.charAt(i)!=) t=false;
                }
                String[] s1 = s.split("\\.");
                char[] alph = {'a', 'b', 'c', 'd', 'e','f','g', 'h','i','j','k','l','m' ,'n','o','p','q','r','s','t','u','v','w','x','y','z'};
               String b = s1[0];
               if(t){
               try {
                       c = scanner.nextInt();
               } catch (Exception e){
                       System.out.println("error");
               }}
               Integer k=0;
               Integer p;
               Double d=0.0;
               if(a<=0 || a>36||c<=0||c>36||t==false||s.equals(null)){
                       System.out.println("error");
               }
               else {
                       if (a != 1) p = Integer.parseInt(b, a);
                       else {
                               p = Integer.parseInt(b);
                               while (p != 0) {
                                       k += 1;
                                       p /= 10;
                               }
                               p = k;
                       }
                       String h = "";
                       if (c != 1) h = Integer.toString(p, c);
                       else {
                               for ( int i = 0; i < p; i++ ) {
                                       h += "1";
                               }
                       }
                       if (a != 1 && s1.length > 1) {
                               if (a != 10) {
                                       int x = 0;
                                       for ( int i = 1; i <= s1[1].length(); i++ ) {
                                               if (s1[1].charAt(i - 1) >= 'a') {
                                                       for ( int j = 0; j < alph.length; j++ ) {
                                                               if (alph[j] == s1[1].charAt(i - 1))
                                                                       d += ((10 + j) / (Math.pow(a, i)));
                                                               ;
                                                       }
                                               } else {
                                                       d += (Integer.parseInt(String.valueOf(s1[1].charAt(i - 1))) / Math.pow(a, i));
                                               }
                                       }
                               } else d = Double.parseDouble("0." + s1[1]);
                               h += ".";
                               for ( int i = 0; i < 5; i++ ) {
                                       String n = String.valueOf(d * c).split("\\.")[0];
                                       if (Integer.parseInt(n) > 9) {
                                               h += alph[Integer.parseInt(n) - 10];
                                       } else h += n.charAt(0);
                                       d = Double.parseDouble("0." + String.valueOf(d * c).split("\\.")[1]);
                               }
                       }
                       System.out.println(h);
               }
        }
}
class CoffeeMachine{
        String last_position = "hello";
        int water = 400;
        int milk  = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        public void coffeeMake(String s){
                if (s.equals("remaining")){
                        System.out.println("The coffee machine has:\n" + water +
                                " of water\n" + milk +
                                " of milk\n" + beans +
                                " of coffee beans\n" + cups +
                                " of disposable cups\n" + money +
                                " of money");
                        last_position="hello";
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                }
                else if(s.equals("buy")){
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                        last_position="buy";
                } else if (last_position.equals("buy")) {
                        last_position="hello";
                        switch (s){
                                case "1":
                                        if(water>=250 && beans>=16 && cups>=1){
                                                water -= 250;
                                                beans -= 16;
                                                cups -= 1;
                                                money += 4;
                                                System.out.println("I have enough resources, making you a coffee!");}
                                        else if (water<250) System.out.println("Sorry, not enough water!");
                                        else if (beans<16) System.out.println("Sorry, not enough coffee beans!");
                                        else if (cups<1) System.out.println("Sorry, not enough disposable cups!");
                                        break;
                                case "2":
                                        if(water>=350 && beans>=20 && cups>=1 && milk>=75){
                                                water -= 350;
                                                beans -= 20;
                                                milk -= 75;
                                                cups -= 1;
                                                money += 7;
                                                System.out.println("I have enough resources, making you a coffee!");}
                                        else if (water<350) System.out.println("Sorry, not enough water!");
                                        else if (milk<75) System.out.println("Sorry, not enough milk!");
                                        else if (beans<20) System.out.println("Sorry, not enough coffee beans!");
                                        else if (cups<1) System.out.println("Sorry, not enough disposable cups!");
                                        break;
                                case "3":
                                        if(water>=200 && beans>=12 && cups>=1 && milk>=100){
                                                water -= 200;
                                                beans -= 12;
                                                milk -= 100;
                                                cups -= 1;
                                                money += 6;
                                                System.out.println("I have enough resources, making you a coffee!");}
                                        else if (water<200) System.out.println("Sorry, not enough water!");
                                        else if (milk<100) System.out.println("Sorry, not enough milk!");
                                        else if (beans<12) System.out.println("Sorry, not enough coffee beans!");
                                        else if (cups<1) System.out.println("Sorry, not enough disposable cups!");
                                        break;
                                default:
                                        break;

                        }
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (s.equals("take")) {
                        System.out.println("I gave you $" + money);
                        money = 0;
                        last_position="hello";
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                } else if (s.equals("fill")) {
                        System.out.println("Write how many ml of water do you want to add: ");
                        last_position="fill";
                } else if(last_position.equals("fill")){
                        water += Integer.parseInt(s);
                        System.out.println("Write how many ml of milk do you want to add: ");
                        last_position="add water";

                } else if(last_position.equals("add water")){
                        milk += Integer.parseInt(s);
                        System.out.println("Write how many grams of coffee beans do you want to add: ");
                        last_position="add milk";
                } else if(last_position.equals("add milk")){
                        beans += Integer.parseInt(s);
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        last_position="add beans";
                } else if(last_position.equals("add beans")){
                        cups+=Integer.parseInt(s);
                        last_position="hello";
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                }*/

        }
}
