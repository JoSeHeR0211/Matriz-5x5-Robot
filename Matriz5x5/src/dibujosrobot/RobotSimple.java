package dibujosrobot;

public class RobotSimple {
    public char[][] figura = {
        {' ', 'O', 'O', 'O', ' '},
        {' ', '|', '-', '|', ' '},
        {' ', '|', ' ', '|', ' '},
        {'/', ' ', ' ', ' ', '\\'},
        {' ', '/', ' ', '\\', ' '}
    };

    public void mostrar() {
        System.out.println("Robot Simple:");
        for (char[] fila : figura) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
