import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        String n1 = s.nextLine();
        String n2 = s.nextLine();
        String n3 = s.nextLine();

        if(n1.equals("vertebrado") && n2.equals("ave") && n3.equals("carnivoro")){
            System.out.println("aguia");
        }
        if(n1.equals("vertebrado") && n2.equals("ave") && n3.equals("onivoro")){
            System.out.println("pomba");
        }if(n1.equals("vertebrado") && n2.equals("mamifero") && n3.equals("onivoro")){
            System.out.println("homem");
        }if(n1.equals("vertebrado") && n2.equals("mamifero") && n3.equals("herbivoro")){
            System.out.println("vaca");
        }if(n1.equals("invertebrado") && n2.equals("inseto") && n3.equals("hematofago")){
            System.out.println("pulga");
        }if(n1.equals("invertebrado") && n2.equals("inseto") && n3.equals("herbivoro")){
            System.out.println("lagarta");
        }if(n1.equals("invertebrado") && n2.equals("anelideo") && n3.equals("hematofago")){
            System.out.println("sanguessuga");
        }if(n1.equals("invertebrado") && n2.equals("anelideo") && n3.equals("onivoro")){
            System.out.println("minhoca");
        }
}
}