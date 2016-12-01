/classpath lib/aplu5.jar 
import ch.aplu.turtle.*;

Turtle t1 = new Turtle();

void drawTriangle(int size){
for(int i=0; i<3;i++){
	t1.forward(size);
	t1.left(120);
}
}
t1.clear();
drawTriangle(150);