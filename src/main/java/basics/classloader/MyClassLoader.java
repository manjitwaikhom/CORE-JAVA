package basics.classloader;

public class MyClassLoader {
	 public static void main(String[] args){

		    ClassLoader classLoader = MyClassLoader.class.getClassLoader();

		    try {
		        Class aClass = classLoader.loadClass("basics.classloader.Hello");
		        System.out.println("aClass.getName() = " + aClass.getName());
		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }

}
}