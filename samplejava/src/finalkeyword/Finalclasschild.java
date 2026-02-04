package finalkeyword;

public final class Finalclasschild extends Finalclassparent {
public void display() {
	        System.out.println("This is Child class");
	    }


	    public static void main(String[] args) {
	    	Finalclasschild obj = new Finalclasschild();
	        obj.show();
	        obj.display();
	    }

		private void show() {
		
			  System.out.println("This is Parent class");
		}
	}


