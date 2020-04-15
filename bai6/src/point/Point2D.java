package point;

public class Point2D {
    private float x = 0;
    private float y = 0;

    Point2D(){
    }
    Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
       this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[]arr = {this.x,this.y};
        return arr;
    }
    public String toString(){
        return "X : "+this.x +"\n"+"Y : "+this.y;
    }

}
