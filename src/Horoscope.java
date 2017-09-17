import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("What is your Zodiac sign?");
	if (x.equals("Picses")) {
		JOptionPane.showMessageDialog(null, "You are likable, energetic, passionate, and sensitive.");
	}
	else if (x.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "You are courageous, energetic, willful, commanding, and leading");
	}
	else if (x.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "You are pleasure seeking, dependable, highly sensual in nature, and you are provoked slowly.");
	}
	else if (x.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "You are cerebral, chatty, charming, adventurous, and loves learning and education.");
	}
	else if (x.equals("Cancer")) {
		JOptionPane.showMessageDialog(null, "You are emotional, group oriented, and you seek security.");
	}
	else if (x.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "You are generous, organized, protective, and beautiful.");
	}
	else if (x.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "You are particular, logical, practical, and critical");
	}
	else if (x.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "You are balanced, you seeks beauty, and you have a sense of justice");
	}
	else if (x.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "You are passionate, exacting, combative, reflective, and you love extremes.");
	}
	else if (x.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "You are happy, absent minded, creative, and adventurous.");
	
	}
	
	
	else if (x.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "You are timeless, driven, calculating, and ambitious."); 			
	}
	else if (x.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "You are communicative, people oriented, stubborn, generous, and dedicated.");
	}else { 
		JOptionPane.showMessageDialog(null, "That's not a zodiac sign! You are dumb...");
	}
	}
}

