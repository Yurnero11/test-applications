public class Main {
    public static void main(String[] args) {
        //Заповнення кожних даних йде в конструкторі
        SportTraining[] products = new SportTraining[4];
        products[0] = new Running(90.0, 60.0, 70.0, 10.0);
        products[1] = new Running(90.0, 20.0, 70.0, 5.0);
        products[2] = new Crossfit(80, 70, 30, 70);
        products[3] = new Boxing(90.0, 120.0, 70.0);

        products[0].printMessage();
        System.out.println();
        products[1].printMessage();
        System.out.println();
        products[2].printMessage();
        System.out.println();
        products[3].printMessage();
    }
}


