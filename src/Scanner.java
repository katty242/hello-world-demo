public class Scanner {

    public static void main(String[] args) {
}
    {
        java.util.Scanner input=new java.util.Scanner(System.in); //Object
        int d1=input.nextInt();
        char operation=input.next().charAt(0);
        int d2=input.nextInt();

        if (operation =='+'){
        System.out.println(d1+d2);

        }
        if (operation=='-'){
        System.out.println(d1-d2);

        }
        if (operation=='*'){
        System.out.println(d1*d2);
        }
        if (operation=='/'){
        System.out.println(d1/d2);
        }else{
        System.out.println("Invalid Number");
        }

        }




    }

