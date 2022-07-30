package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure figure = new Figure();

        for (int i = 0; i < 3; i++) {
            figureSupplier.getRandomFigure().draw();
        }

        for (int i = 0; i < 3; i++) {
            figureSupplier.getDefaultFigure().draw();
        }
    }
}
