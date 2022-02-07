import java.util.Scanner;

public class Main {



  public static void main(String[] args) {
   
    int swValue;
    System.out.println("|        Ava's FRQs   |");
    System.out.println("|        Options:     |");
    System.out.println("                       ");
    System.out.println("|        1. FRQ 2     |");
    System.out.println("|        2. FRQ 3     |");
    System.out.println("|        3. FRQ 4.1   |");
    System.out.println("|        4. FRQ 4.2   |");
    System.out.println("|        5. FRQ 5.1   |");
    System.out.println("|        6. FRQ 5.2   |");
    System.out.println("|        7. FRQ 6.1   |");
    System.out.println("|        8. FRQ 6.2   |");
    System.out.println("|        9. FRQ 7     |");
    System.out.println("|       10. FRQ 8     |");
    System.out.println("|       11. FRQ 9.1   |");
    System.out.println("|       12. FRQ 9.2   |");
    System.out.println("|       13. FRQ 10    |");
    swValue = Keyin.inInt(" Select option: ");

    Scanner sc = new Scanner(System.in); 

    String str = sc.nextLine();

    // Switch construct
    switch (swValue) {
    
    case 1:
      System.out.println("Enter sequence of integers separated by commas");
      String input = sc.nextLine();

      FRQ2 gradShow = new FRQ2(input);
      
      System.out.println("Enter a new sequence of integers separated by commas");
      input = sc.nextLine();
      gradShow.changeSequence(input);
      
      System.out.println("Enter a segment to be inserted into a sequence");
      String segment = sc.nextLine();
      
      System.out.println("Enter an index for insertion");
      int index = sc.nextInt();
      gradShow.insertSegment(segment, index);
      gradShow.display();
      break;

    case 2:
      System.out.print("Are you attending the party? (Enter true or false) ");
      boolean rsvp = sc.nextBoolean();
      System.out.print("Please select your food choice(Number 1-3) ");
      int selection = sc.nextInt();

      FRQ3 frq3 = new FRQ3(rsvp, selection, " ", " ");
      System.out.print("You are ");
      frq3.printAttending();
      System.out.print("and you will be eating "); 
      frq3.printFoodSelection();
      
    break; 
    case 3:
      FRQ4one frq4one = new FRQ4one();
      System.out.println("Enter a string to find the longest streak ");
      String str3 = sc.nextLine();
      String result3 = frq4one.lcp(str3);
      System.out.println("Longest repeating sequence: "+ result3);
      break;

    case 4:
      FRQ4two c = new FRQ4two (10, 20);
        c.playGame();
      break;

    case 5:
      FRQ5one pw1 = new FRQ5one(4,"chs");
       System.out.println(pw1.pwCount());
       System.out.println(pw1.pwGen());
       System.out.println(pw1.pwGen());
       System.out.println(pw1.pwCount());

       FRQ5one pw2 = new FRQ5one(6);
       System.out.println(pw2.pwCount());
       System.out.println(pw2.pwGen());
       System.out.println(pw2.pwCount());
       System.out.println(pw1.pwCount());
      break;

    case 6: 
      FRQ5two frq5 = new FRQ5two();
	

      System.out.print("What is the host name?");    
      String hostName = sc.nextLine();

      System.out.print("What is the address");
      String address = sc.nextLine();

      System.out.print("What is the name?");
      String userName = sc.nextLine();

      System.out.print("What is the host age?");
      String userAge = sc.nextLine();

      System.out.print("Who is being invited?");
      String invited = sc.nextLine();

      int age = Integer.parseInt(userAge);
      
      frq5.getHostName(hostName); 
      frq5.getAddress(address);
      frq5.getName(userName);
      frq5.getAge(age);
      frq5.setAddress(address);
      frq5.invite(invited, address, hostName);
		
      break;

       

    case 7:
    //FRQ6 Q1
      //creating the array using words given by CB
        String words[] = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};

        //for loop to go through array
        // word: words allows to search substring of the strings
        for(String word : words){
            //lastIndexOf method allows to search for strings in array that have the last 3 letters as "ing" to be printed
            if(word.lastIndexOf("ing") == word.length() - 3){
                System.out.println(word);
            }
        }
        break;
    case 8:
      FRQ6 FRQ6 = new FRQ6();
      FRQ6.scanItemSold();
      FRQ6.computeWages(10, 1.5);
      FRQ6.printWages();
      break;
    case 9:
      UserName person1 = new UserName("john","smith");
      System.out.println(person1.possibleNames);
      String[] used = {"harta","hartm","harty"};
      UserName person2 = new UserName("mary","hart");
      System.out.println("possibleNames before removing: "+person2.possibleNames);
      person2.setAvailableUserNames(used);
      System.out.println("possibleNames after removing: "+person2.possibleNames);
      break;
    
    case 11:
      FRQ9 book1 = new FRQ9("Frankenstein", "Mary Shelley");
      FRQ9 book2 = new FRQ9Child("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
      System.out.println(book1.printBookInfo());
      System.out.println(book2.printBookInfo());
    break;
  
    case 13:
      FRQ10 frq10 = new FRQ10();
      Scanner console = new Scanner(System.in);
      System.out.print("What is the first number?");
      int a = console.nextInt();
      System.out.print("What is the second number?");
      int b = console.nextInt();

      int lcm = frq10.LCM(a,b);
      int gcf = frq10.GCF(a,b);

      System.out.println("The Greatest common divisor (GCF) of two numbers are: " + gcf); 
      System.out .println("The Lowest common multiplier (LCM) of two numbers are: " + lcm);

      break;  

    default:
      main(null);
      break; 
    }
  main(null);
  }
}


