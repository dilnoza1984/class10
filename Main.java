class Main {
  public static void main(String[] args) {

System.out.println(generateEmail("gmail.com"));
 System.out.println(generateEmail("yahoo.com"));  
System.out.println (generateEmail("mail.com"));  
    
    
  }
/// Create your method here

  public static String generateEmail(String emailExtension){

    int first = ( 97+ (int) (Math.random() * 26));
 int second = ( 97+ (int) (Math.random() * 26));
 int third = ( 97+ (int) (Math.random() * 26));
 int fourth = ( 97+ (int) (Math.random() * 26));
 int fifth = ( 97+ (int) (Math.random() * 26));
 int six = ( 97+ (int) (Math.random() * 26));
 int seven = ( 97+ (int) (Math.random() * 26));
   int eight = ( 97+ (int) (Math.random() * 26));



    String generateEmail = "" + ((char) first) + ((char) second) + ((char) third) + ((char) fourth) + ((char) fifth ) + ((char) six) + ((char) seven) + ((char) eight);

    return generateEmail + "@" + emailExtension;
  }

  
}