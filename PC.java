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
		System.out.println("CPUƷ�ƣ�"+cpu.getBrand());
		System.out.println("CPU���Ƶ��"+cpu.getSad());
		System.out.println("CPU�ٶȣ�"+cpu.getSpeed());
		System.out.println("Ӳ��ת�٣�"+disk.getNum());
		System.out.println("Ӳ��������"+disk.getAmount());
		System.out.println("Ӳ��Ʒ�ƣ�"+disk.getBrand());
	}
}