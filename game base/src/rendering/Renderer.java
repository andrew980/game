package rendering;

import java.util.ArrayList;
import java.util.List;

import entities.CharacterEntity;
import entities.StaticRectEntity;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class Renderer {
	Canvas canvas;
	GraphicsContext context;
	
	List<StaticRectEntity> staticRectEntities = new ArrayList<>();
	List<CharacterEntity> characterEntities = new ArrayList<>();
	Image[] deathAnimation = {
			new Image(getClass().getResourceAsStream("/resources/Explosion1.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion2.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion3.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion4.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion5.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion6.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion7.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion8.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion9.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion10.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion11.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion12.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion13.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion14.png")),
			new Image(getClass().getResourceAsStream("/resources/Explosion15.png")),
	};
	
	public void addStaticRectEntity(StaticRectEntity entity) {
		staticRectEntities.add(entity);
	}
	
	public void addCharacterEntity(CharacterEntity entity) {
		characterEntities.add(entity);
	}
	
	public List<CharacterEntity> getCharacterList() {
		return characterEntities;
	}
	
	public Renderer(Canvas canvas) {
		this.canvas = canvas;
		this.context = canvas.getGraphicsContext2D();
	}
	
	public void render() {
		context.save();
		
		for (StaticRectEntity entity : staticRectEntities) {
			context.setFill(entity.color);
			context.fillRect(entity.xpos, entity.ypos, entity.xsize, entity.ysize);
		}
		
		for (CharacterEntity entity : characterEntities) {
			if (!entity.isDead) {
				if (entity.isLookingRight) {
					context.drawImage(entity.rightImage, entity.xpos+2, entity.ypos, entity.xsize, entity.ysize);
				}
				else {
					context.drawImage(entity.leftImage, entity.xpos-2, entity.ypos, entity.xsize, entity.ysize);
				}
			}
			else {
				int i = (int) (entity.deathAnimationTimer * 30);
				if (i < 15) {
					if (entity.ypos < -90) {
						context.drawImage(deathAnimation[i], entity.xpos, entity.ypos, 200, 200);
					}
					else if (entity.xpos > 1599) {
						context.drawImage(deathAnimation[i], entity.xpos-100, entity.ypos-90, 200, 200);
					}
					context.drawImage(deathAnimation[i], entity.xpos, entity.ypos-90, 200, 200);
				}
			}
		}
		context.restore();
	}
	
	public void prepare() {
        //context.setFill(new Color(0.2, 0.4, 0.7, 1.0) );
        //context.fillRect(0,0, canvas.getWidth(), canvas.getHeight());
		context.drawImage(new Image(getClass().getResourceAsStream("/resources/Background.png")), 0, 0, canvas.getWidth(), canvas.getHeight());
    }
	
	
}
