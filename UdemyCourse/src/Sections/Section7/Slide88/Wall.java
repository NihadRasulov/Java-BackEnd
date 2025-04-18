package Sections.Section7.Slide88;

public class Wall {

    private double width;
    private double height;

    public Wall() {}
    public Wall(double width, double height) {
        if(width<0 && height<0) {
            this.width = 0;
            this.height = 0;
        }
        else if(width<0 && height>0) {
            this.width = 0;
            this.height = height;
        }
        else if(height<0 && width>0) {
            this.height = 0;
            this.width = width;
        }
        else {
            this.width = width;
            this.height = height;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        if(width<0) {
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if(height<0) {
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }
    public double getArea() {
        return width*height;
    }

    public static void main(String[] args) {

        Wall wall = new Wall();
        wall.setWidth(10);
        wall.setHeight(5);
        System.out.println(wall.getArea());
    }
}
