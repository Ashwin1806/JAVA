package dacPre1;
interface Game
{
	void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("Playing Cricket");
	}
}
class Football implements Game
{
	public void play()
	{
		System.out.println("Playing Football");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("Playing Tenis");
	}
}
class play<T extends Game>
{
	void call(T ref)
	{
		ref.play();
	}
}
public class demoPlay {

	public static void main(String[] args) {
		play<Game> p= new play<Game>();
		p.call(new Cricket());
		p.call(new Football());
		p.call(new Tennis());
	}

}
