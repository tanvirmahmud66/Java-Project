package practicsjava;

class Robot{
	int id;
	Robot(int i){
		id = i;
		Brain b = new Brain();
		b.Think();
	}
	
	private class Brain{
		public void Think() {
			System.out.println(id+" is Thinking");
		}
	}
}

class name{
	String name="Tanvir Mahmud Fahim";
	public void Name() {
		System.out.println(name);
	}
}



public class program {

	public static void main(String[] args) {
		Robot r = new Robot(1);
		name n = new name();
		n.Name();
	}

}
