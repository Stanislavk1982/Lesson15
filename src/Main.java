import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        FabricaFigure fabricaFigure = new FabricaFigure();
        Figure figure = fabricaFigure.makeFigure(input);

        figure.makeFigure();
    }
}
