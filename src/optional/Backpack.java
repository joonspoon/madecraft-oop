package optional;


public class Backpack {
	
	private Pencil pencil;
	private Ruler ruler;
	private Textbook textbook;

	Backpack(){
		System.out.println("Nice Backpack");
	}
	
	public static void main (String[] args){
		/* Your mission is to get to school, but first you need to get all of your supplies into your backpack. */



	}
	
	public void putInBackpack(Supply supply){
		if (supply instanceof Pencil){
			this.pencil = (Pencil) supply;
			System.out.println("You put your pencil in your Backpack");
		}else if(supply instanceof Ruler){
			this.ruler = (Ruler) supply;
			System.out.println("You put your ruler in your Backpack");
		}else if(supply instanceof Textbook){
			this.textbook = (Textbook) supply;
			System.out.println("You put your textbook in your Backpack");
		}else{
			System.out.println("That isn't a valid school supply");
		}
	}
	
	public void goToSchool(){
		if(pencil == null || ruler == null || textbook == null){
			System.err.println("You are not ready for School");
		}else{
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

class Supply {
	protected String name;
}

class Pencil extends Supply {
	
	Pencil(){
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}
	
	public void write(String writing){
		System.out.println(writing);
	}
}


class Ruler extends Supply {

	Ruler(){
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}
	
	public void measure(){
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply{

	Textbook(){
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}
	
	public void read(){
		System.out.println("The history of Iceland is long and interesting");
	}
}


