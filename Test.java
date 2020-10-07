package computer;
public class Test {
	public static void main(String[] args) {
		CPU cpu =new CPU();
		cpu.setSpeed(2200);
		cpu.brand="Intel";
		cpu.setSad(6.5);
		HardDisk disk=new HardDisk();
		disk.brand="DELL";
		disk.setNum(4);
		disk.setAmount(200);
		PC pc=new PC();
		pc.setHardDisk(disk);
		pc.setCPU(cpu);
		pc.Nesity();
	}
}
