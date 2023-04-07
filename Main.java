class Main {
  
  public static String puppydog(String name, String breed)
  {
    return name + " is a " + breed; 
  }
  
  public static void main(String[] args) {
    int integer = 0;
    double decimal = 1.4;
    String hello = "Cary Jardin";
    String isawesome = "is awesome";
    System.out.println("Hello world!");
    String cc = hello + " " + isawesome;
    System.out.println(isawesome);
    System.out.println(cc);
    System.out.println(integer);
    System.out.println(decimal);
    for(int i = 0; i < 10; i++)
      {
        System.out.printf("* ");
      }
    while(integer < 5)
      {
        System.out.printf("\\ ");
        integer++;
      }
    int docounter = 4;
    do
      {
        System.out.println("Hello");
        docounter++;
      }
      while(docounter < 10);
    System.out.println(puppydog("Emily", "Golden Retriever"));
  }
}