import java.util.HashMap;

import org.lwjgl.util.Color;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;


public class GameManager extends StateBasedGame
{
	private static HashMap<String, String> _options = OptionsReaderSetter.get();
	
	private static String _titre = "Pongy";
	public GameManager()
	{
		super(_titre);
		
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException
	{
		this.addState(new GameMenu());
		this.addState(new GameWindow());
		
	}
	 public static void main(String[] args) throws SlickException
	{
		 AppGameContainer container = new AppGameContainer(new GameManager());
		 container.setDisplayMode(Integer.parseInt(_options.get("window_size_x")), Integer.parseInt(_options.get("window_size_y")), false); // fen�tre de 1280*768 fullscreen =false !! 
		 container.setVSync(true);
		 container.setMultiSample(64);
		 container.setTargetFrameRate(Integer.parseInt(_options.get("fps")));
		 container.setVerbose(true);
		 container.start();
	}



}
