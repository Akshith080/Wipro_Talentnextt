package OOPS;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		b.volume();

	}

}
class Box{
    float width;
    float height;
    float depth;
    public Box(float width,float height,float depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
        
    }
    public float volume(){
        float volume=width*height*depth;
        System.out.println("Volume of Box is: "+volume);
        return volume;
    }
}