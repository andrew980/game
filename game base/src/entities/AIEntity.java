package entities;

import javafx.scene.image.Image;

public class AIEntity extends CharacterEntity {
			
	public AIEntity(
			float initXpos, 
			float initYpos, 
			int initXsize, 
			int initYsize,
			Image initLeftImage,
			Image initRightImage) {
		
		super(
			initXpos, 
			initYpos, 
			initXsize, 
			initYsize,
			false,
			initLeftImage,
			initRightImage);
		
	}
	
	
}
