package academy;

public class Main {


    public static void main(String[] args) {

        System.out.println("\n \n \n");
        System.out.println(" ------------ Collor square ------------");
        Shape[] HH = new Shape[3];
        HH[0]= new Square(10);
        HH[1] = new Rectangle(10,10);
        HH[2]= new Circle(10);


        for (int i = 0; i < HH.length; i++) {
            System.out.println(HH[i]);
            if(HH[i] instanceof  Square){
                ((Square) HH[i]).howToColor();
            }


        }

    }
}
