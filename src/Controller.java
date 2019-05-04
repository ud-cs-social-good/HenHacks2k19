import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Controller {
	
	public Controller(JFrame j) {
		
		View view = new View(); 
		Model model = new Model();
		
		
		view.addKeyInput(new KeyInput); 
		
		
		
	}
	
	class KeyInput implements KeyListener{
		
		String input; 

		@Override
		public void keyPressed(KeyEvent keyEvent) {
			// TODO Auto-generated method stub
			int code = keyEvent.getKeyCode();
			
			switch (code) {
				case 1: 
					 
				case 2:
					
				case 3:
					
				case 4: 		
			}
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
