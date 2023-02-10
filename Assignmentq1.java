package StaticVariable.java;

class Emp {
	 int id;
	 String name;

	 Emp(int id, String name) {
	  this.id = id;
	  this.name = name;
	 }
	 void show() {
	  System.out.println(id + " " + name);
	 }
	 public class Assignmentq1{
	 public static void main(String args[]) {
	  Emp e1 = new Emp(1006, "Monu");
	  Emp e2 = new Emp(1008, "Tinku");
	  e1.show();
	  e2.show();
	 }
	}
}


