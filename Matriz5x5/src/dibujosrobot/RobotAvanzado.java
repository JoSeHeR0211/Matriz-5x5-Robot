package dibujosrobot;

public class RobotAvanzado {
    public char[][] figura = {
        {' ', '[', 'O', 'O', ']'},
        {' ', '|', '=', '|', ' '},
        {' ', '|', ' ', '|', ' '},
        {'/', '|', ' ', '|', '\\'},
        {' ', '/', '_', '\\', ' '}
    };

    public void mostrar() {
        System.out.println("Robot Avanzado:");
        for (char[] fila : figura) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

