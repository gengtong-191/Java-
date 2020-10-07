package computer;
public class PC {
	CPU cpu;
	HardDisk disk;
	private int num;
	
	void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	
	void setHardDisk(HardDisk disk){
		this.disk=disk;	
	}
	int getNum(){
		return num;
	}
	
	void Nesity(){
		System.out.println("CPU品牌："+cpu.getBrand());
		System.out.println("CPU最大超频："+cpu.getSad());
		System.out.println("CPU速度："+cpu.getSpeed());
		System.out.println("硬盘转速："+disk.getNum());
		System.out.println("硬盘容量："+disk.getAmount());
		System.out.println("硬盘品牌："+disk.getBrand());
	}
}