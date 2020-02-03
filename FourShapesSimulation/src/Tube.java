
import java.lang.Math;
public class Tube {
	private static final double RADIUS = 1.5;
	private double height;

	public Tube(double h) {
		height = h;
	}

	protected double getVolume() {
		return (Math.PI * Math.pow(RADIUS, 2) * height);
	}

	protected static double getRadius() {
		return RADIUS;
	}

	protected double getHeight() {
		return height;
	}

	protected double getVolumeAroundTube() {
		return ((Math.pow(Plant.HEIGHT + RADIUS, 2) * (height + Plant.HEIGHT) * Math.PI) - getVolume());
	}
	protected double getTotalVolume() {
		return (getVolume() + getVolumeAroundTube());
	}

	protected int getMaxNumPlants() {
		int volumeMaxNum = (int) (getVolumeAroundTube() / Plant.VOLUME);

			System.out.println("The number of plants this time is " + volumeMaxNum);
			System.out.println("__________________________________________________");
			System.out.println();
			System.out.println();
			return volumeMaxNum;

	
	}

}
