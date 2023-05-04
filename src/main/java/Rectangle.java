public class Rectangle extends Shape{
    private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public int computeArea() {
        return this.height * this.width;
    }
}
