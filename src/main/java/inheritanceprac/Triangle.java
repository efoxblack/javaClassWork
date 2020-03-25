package inheritanceprac;

public class Triangle {
    private Integer height;
    private Integer base;

    public Triangle () {

    }

    public Triangle (Integer height, Integer base) {
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int calculateArea() {
        return (height * base) / 2;
    }

    public int calculateArea (int x) {
        return x * 10;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
