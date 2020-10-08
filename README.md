#计191耿彤2019310163

##一、实验目的：

(1) 用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。

(2) 掌握构造方法和对象的创建

(3) 了解类与程序的基本结构

(4) 理解类的封装

##二、实验要求：

(1) CPU类：要求getSpeed()返回speed的值，用setSpeed(int n)方法值赋值给speed

(2) HardDisk类：要求getAmount()返回amount的值，用setAmount(int k)方法值赋值给amount

(3) PC类：要求setCPU(CPU a)将参数a的值赋值给cpu,用setHardDisk(HardDisk b)方法将值赋值给HD，用Nesity()方法显示cpu的速度和硬盘的容量

(4) Test主类：main方法中创建CPU对象cpu，cpu 将自己的 speed 设置为2200
            
             main方法中创建HardDisk对象disk，disk将自己的amount设置为200
             
             main方法中创建PC对象pc
             
             pc调用setCPU(CPU a)方法
             
             pc调用setHardDisk(HardDisk )b方法
             
             pc调用Nesity()方法

##附加内容：

(1) 类中定义不少于两个构造方法

(2) 每个类定义不少于2个属性，且属性的类型应该多样化

(3) 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断

(4) 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法

##三、实验方法：

1.首先创建PC、CPU、HardDisk、Test 4个类

2.每个类中使用两个构造方法来给类中变量进行初始化赋值

3.使用private把类中的需要输出的对象封装起来，起到保护作用

4.通过if判断语句，算法约束判断输入的变量是否合理

5.使用set给Test中主类赋值

6.在输出语句中使用get将赋值过的变量输出

##四.核心算法

截取HardDisk主类里有关amount的片段，用到了if判断句和this关键字，最后并输出出来

    private int amount;

    int getAmount(){
	
	return amount;
	
  }
  
	public void setAmount(int amount){
		
    if(amount>1&&amount<1000) {
			
      this.amount=amount;
		
    }
	
  }
  
  		disk.setAmount(200);
  
  		System.out.println("硬盘容量："+disk.getAmount());
      
##五.运行结果

![outcome](https://github.com/gengtong-191/Java-/blob/main/af8488e57b9d65f0413d4f6bf675b6b.png)

##六.实验感想

学会了private的用法，private是限制级别最高的，只能在自己的类里面使用；用get方法获取变量的值，再用if语句进行运算；disk.setAmount进行赋值；关联词this与对象关联，用于指示当前对象；运用system.out.println()等基础代码，在和同学的讨论后中解决了不确定的部分；基本了解了java的基础代码，以后能更加深入的学习java这门语言。
