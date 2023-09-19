public class FizzBuzz {
    public static void main(String[] args) {
       int db=0;
        for (int i=0;i<100;i++){
            db++;
            if(db%3==0){
                System.out.println("Fizz");
            }else if(db%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(db);
            }
        }
    }
}