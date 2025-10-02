package dibujosrobot;

public class RobotFuturista {
    public char[][] figura = {
        {'<', 'O', 'O', 'O', '>'},
        {'|', '#', '=', '#', '|'},
        {'|', ' ', '@', ' ', '|'},
        {'|', '/', ' ', '\\', '|'},
        {' ', '/', ' ', '\\', ' '}
    };

    public void mostrar() {
        System.out.println("Robot Futurista:");
        for (char[] fila : figura) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

