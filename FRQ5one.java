import java.util.Random;

public class FRQ5one {

   private static int passwordsGenerated =0;

   private static Random random = new Random();

   private String prefix;

   private int length;

   public FRQ5one(int length,String prefix) {

       this.prefix = prefix;

       this.length = length;

   }

   public FRQ5one(int length) {

       this.prefix = "A";

       this.length = length;

   }

   public String pwGen(){

       String pwd= this.prefix+".";

       for(int i=1;i<=this.length;i++){

           pwd+=random.nextInt(10);

       }

       passwordsGenerated+=1;

       return pwd;

   }

   public int pwCount(){

       return passwordsGenerated;

   }

}