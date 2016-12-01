/classpath lib/aplu5.jar 
import ch.aplu.turtle.*;

Turtle t1 = new Turtle();

void drawStar(int size){
for(int i=0; i<5;i++){
	t1.forward(size);
	t1.left(144);
	
}
}
t1.clear();
drawTriangle(150);