package csm.comtech;

public class Rectangle {
       private int height;
       private int width;
        public Rectangle(int height,int width){
        	this.height=height;
        	this.width=width;
        }
       
        public int Area() {
        	return height*width;
        }
        public  int Perimeter() {
        	return 2*(height+width);
        }
}
