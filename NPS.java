interface sup1{
	public final int x=10;
	public abstract void getx();
}

interface sup2{
	public final int y=20;
	public abstract void gety();
}

class Sub1 implements sup1,sup2{
	public void getx() {
		System.out.println("x value= "+x);
	}

	public void gety() {
		System.out.println("y value= "+y);
	}

	public void sum() {
		System.out.println("Addition="+(x+y));
	}



	public static void main(String ags[]) {
		Sub1 obj= new Sub1();
		obj.getx();
		obj.gety();
		obj.sum();
	}
}






interface sup1{
	public final int x=10;
	public abstract void getx();
}

interface sup2{
	public final int y=20;
	public abstract void gety();
}

class Sub1 implements sup1,sup2{
	public void getx() {
		System.out.println("x value= "+x);
	}

	public void gety() {
		System.out.println("y value= "+y);
	}

	public void sum() {
		System.out.println("Addition="+(x+y));
	}



	public static void main(String ags[]) {
		Sub1 obj= new Sub1();
		obj.getx();
		obj.gety();
		obj.sum();
	}
}
