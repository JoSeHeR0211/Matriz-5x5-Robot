package dibujosrobot;

public class main {
    public static void main(String[] args) {
        RobotSimple r1 = new RobotSimple();
        RobotAvanzado r2 = new RobotAvanzado();
        RobotFuturista r3 = new RobotFuturista();

        r1.mostrar();
        System.out.println();
        r2.mostrar();
        System.out.println();
        r3.mostrar();
    }
}
