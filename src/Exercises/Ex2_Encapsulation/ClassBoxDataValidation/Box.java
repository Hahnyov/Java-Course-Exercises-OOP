package Exercises.Ex2_Encapsulation.ClassBoxDataValidation;

public class Box {
    private  double length;
    private  double width;
    private  double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
            return length;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Box length cannot be less than 0");
        } else {
            this.length = length;
        }
    }
    public void setWidth(double width){
            if(width<=0){
                throw new IllegalArgumentException("Box length cannot be less than 0");
            }else {
                this.width = width;
            }
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Box length cannot be less than 0");
        }
        else {
            this.height = height;
        }
    }
    public double calculateSurfaceArea (){
        return 2*length*width+ 2*length*height+2*width*height;
    }
    public double calculateLateralSurfaceArea(){
        return 2*length*height+ 2*width*height;
    }
    public double calculateVolume(){
        return length*width*height;
    }
}
