package me.srgantmoomoo.postman.module.modules.client;

import java.awt.Color;
import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import me.srgantmoomoo.api.util.render.JColor;
import me.srgantmoomoo.postman.module.Category;
import me.srgantmoomoo.postman.module.Module;
import net.minecraft.util.text.TextFormatting;

public class ColorMain extends Module {
	
	public ColorMain() {
		super ("colorMain", "world of colors", Keyboard.KEY_NONE, Category.CLIENT);
	}

		public void setup() {
			ArrayList<String> tab = new ArrayList<>();
			tab.add("Black");
			tab.add("Dark Green");
			tab.add("Dark Red");
			tab.add("Gold");
			tab.add("Dark Gray");
			tab.add("Green");
			tab.add("Red");
			tab.add("Yellow");
			tab.add("Dark Blue");
			tab.add("Dark Aqua");
			tab.add("Dark Purple");
			tab.add("Gray");
			tab.add("Blue");
			tab.add("Aqua");
			tab.add("Light Purple");
			tab.add("White");
			ArrayList<String> models=new ArrayList<>();
			models.add("RGB");
			models.add("HSB");
		}

		public void onEnable(){
			this.disable();
		}
		
		private static TextFormatting settingToFormatting () {
				return TextFormatting.AQUA;
		}

		public static TextFormatting getFriendColor(){
			return settingToFormatting();
		}

		public static TextFormatting getEnemyColor() {
			return settingToFormatting();
		}

		public static TextFormatting getEnabledColor(){return settingToFormatting();}

		public static TextFormatting getDisabledColor(){return settingToFormatting();}
		
		private static Color settingToColor () {
				return Color.cyan;
		}

		public static JColor getFriendGSColor(){
			return new JColor(0xffffffff);
		}

		public static JColor getEnemyGSColor(){
			return new JColor(0xffffffff);
	}

}
