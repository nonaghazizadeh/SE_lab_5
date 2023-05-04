public class Square extends Shape{
    private int edge;
    public void setEdge(int edge) {
        this.edge = edge;
    }
    @Override
    public int computeArea() {
        return this.edge * this.edge;
    }
}
