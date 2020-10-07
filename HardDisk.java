package computer;
public class HardDisk {

	private int amount;
	String brand;
	private int num;
	
	int getAmount(){
		return amount;
	}
	String getBrand(){
		return brand;
	}
	
	int getNum(){
		return num;
	}
	
	public void setNum(int num){
		if(num>0&&num<3000)
		this.num=num;
	}

	public void setAmount(int amount){
		if(amount>1&&amount<1000) {
			this.amount=amount;
		}
	}
}

