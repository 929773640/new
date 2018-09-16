package test;

public class St2 {
	
	int id;
	String name;
	int age;
	
	Computer comp;//computer
	
	void Study() {
		System.out.println("learn!"+comp.brand);
	}
	
	St2(int _id,String _name,int _age){
		id=_id;
		name=_name;
		age=_age;
	}
	
	St2(){
	}
	
	St2(int _id){
		id=_id;
	}
	
	public static void main(String[] args) {
		St2 stu=new St2(101,"张三",18);
		
		Computer ci=new Computer();
		ci.brand="联想";
		
		stu.comp=ci;
		stu.Study();
	}
}

class Computer {
	String brand;
}