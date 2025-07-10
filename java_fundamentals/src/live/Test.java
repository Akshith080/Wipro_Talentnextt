package live;
import music.string.*;
import music.wind.*;
import music.Playable;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
	}

}
