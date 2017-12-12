package JaugeNaturel;


public class Jauge {
	public enum TypeJauge {
		JaugeDistance, 
        JaugeNaturel,  
        JaugeNegatif,
        JaugeReel         			
	};
	public static Jauge creerJauge(int min, int max) {
		return new JaugeDistance(min, max);
	}
	public static Jauge creerJauge(long min, long max, long val) {
		if (min<0||max<0||val<0)
			return new JaugeNegatif(min, max, val);
		else
			return new JaugeNaturel(min, max, val);
	}
	public static Jauge creerJauge(float min,float max,float val) {
		return new JaugeReel(min, max, val);
	}
	
}
