package computer;
public class CPU {
		private int speed;
		String brand;
		private double sad;
		
		int getSpeed(){
			return speed;
		}
		double getSad() {
			return sad;
		}
		String getBrand() {
			return brand;
		}
		
		public void setSpeed(int speed){
			this.speed=speed;
		}
		public void setSad(double sad) {
			if(sad>5.0&&sad<7.0)
			this.sad=sad;
		}
}
