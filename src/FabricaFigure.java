public class FabricaFigure  {
    public Figure makeFigure(String type) {
        Figure figure;

        switch (type) {
            case "circle":
                figure = new Circle("Circle",10);
                break;
            case "square":
                figure=new Square("Square", 11);
                break;
            case "rectangle":
                figure = new Rectangle("Rectangle", 12,20);
                break;
            default:
                figure=null;

        }
        return figure;
    }
}
