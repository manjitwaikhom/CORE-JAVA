package basics.classloader;

public class ClassLoadForNameArgumented {
	public static void main(String[] args) {
		ClassLoader load = ClassLoadForNameArgumented.class.getClassLoader();
		try {
			Class.forName("basics.classloader.Hello",true,load);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
