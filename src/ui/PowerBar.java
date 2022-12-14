package ui;

import java.awt.Graphics;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import utilz.LoadSave;

import static utilz.Constants.UI.PowerBar.*;

public class PowerBar {
	private int xPos, yPos, rowIndex;
	public int index = 0;
	private int xOffsetCenter = PB_WIDTH / 2;
	private BufferedImage[] imgs;
	private int spriteCounter = 0;
	public boolean up = true;
	
	public PowerBar(int xPos, int yPos, int rowIndex) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rowIndex = rowIndex;
		loadImgs();
	}
	

	private void loadImgs() {
		imgs = new BufferedImage[14];
		BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.POWER_BAR);
		for(int i = 0; i < imgs.length; i++) {
			imgs[i] = temp.getSubimage(i * PB_WIDTH_DEFAULT, rowIndex * PB_HEIGHT_DEFAULT, PB_WIDTH_DEFAULT, PB_HEIGHT_DEFAULT);
			
		}
	}
	
	public void draw(Graphics g) {
		g.drawImage(imgs[index], xPos - xOffsetCenter, yPos, PB_WIDTH, PB_HEIGHT, null);
	}
	
	public void update() {
		spriteCounter++;
		if(spriteCounter > 3) {
			if(up) {
				if(index == 0)
					index = 1;
				else if(index == 1)
					index = 2;
				else if(index == 2)
					index = 3;
				else if(index == 3)
					index = 4;
				else if(index == 4)
					index = 5;
				else if(index == 5)
					index = 6;
				else if(index == 6)
					index = 7;
				else if(index == 7)
					index = 8;
				else if(index == 8)
					index = 9;
				else if(index == 9)
					index = 10;
				else if(index == 10)
					index = 11;
				else if(index == 11)
					index = 12;
				else if(index == 12)
					index = 13;
				else if(index == 13) {
					up = false;
				}
				spriteCounter = 0;
			}
			if(up == false) {
				if(index == 0) {
					up = true;
				}
				else if(index == 1)
					index = 0;
				else if(index == 2)
					index = 1;
				else if(index == 3)
					index = 2;
				else if(index == 4)
					index = 3;
				else if(index == 5)
					index = 4;
				else if(index == 6)
					index = 5;
				else if(index == 7)
					index = 6;
				else if(index == 8)
					index = 7;
				else if(index == 9)
					index = 8;
				else if(index == 10)
					index = 9;
				else if(index == 11)
					index = 10;
				else if(index == 12)
					index = 11;
				else if(index == 13) {
					index = 12;
				}
				spriteCounter = 0;
			}
		}
		
	}
	
}
