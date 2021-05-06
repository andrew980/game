package userdata;

import entities.CharacterEntity;
import javafx.scene.image.Image;

//import userdata.ButtonLayout;

public class Player extends CharacterEntity {
	
	ButtonLayout buttonLayout = new ButtonLayout();
	
	public Player(
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
			true,
			initLeftImage,
			initRightImage);
	}
}
