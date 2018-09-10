package com.example.core.java.testjava8.staticdefaultInterfaceMethods;

/*
 * Prior to java 8 interfaces could not have implemented code. Methods defined in interface are considered as API methods which API methods needs to be implemented by classes which implements the interface. That is still true
 * But now there are two ways where you implements the methods in interfaces
 * 
 * Static methods in interface - till java 7 static methods can only be used in clasees in java 8 you can create them in interfaces
 * <interfaceName>.<methodName>
 * 
 * usage 
 * 
 *  Static Methods are the utility(util) methods which are associated to an Interface. So, in case you need any util methods which can operate on an Interface’s implementing class’s instances, then add that as a static method to the Interface itself.
 *  
 *  Until Java 7, the general practice was to have such util methods in a separate utility class which contains all the static methods which can be invoked on an interface’s implementation’s instance.
 * For example: Collections class has a sort method –static <T> void sort(List<T> list, Comparator<? super T> c).
 * This is how any list was sorted till Java 7. The sorting util methods is present in the Collections Class as a static method.
 * 
 * From Java 8 onwards, since Interfaces can have static methods, it makes the design more cohesive by keeping these static util methods inside List itself. The Java designers also thought of the same and added a static method sort() to List –
 * default void sort(Comparator<? super E> c)
 * To summarize, whenever you need a static utility method for interface’s implementors, add that static utility method in Interface itself as a static method.
 * 
 * 
 * Default methods in interface - deafult methods are methods which are non abstract menthods and are marked a default
 * <instanceName>.<methodName>
 * usage 
 * 
 * Default methods are used when a feature is added to an existing hierarchy of classes which is not needed for the whole hierarchy.In that case, making that method an abstract method makes it mandatory for all the classes in the hierarchy to implement. This is an unnecessary overhead and a maintenance nightmare.
 * 
 * In this scenario, it is much simpler to add that method as a default method so that any Interface implementation which wants to use it can do so and the rest of the implementations can just ignore it. In effect making the functionality implemented through default methods an optional feature rather than a mandatory one.
 * 
 * How is it useful
 * 
 * Default methods are useful in a big way for API designers and indirectly for API implementors. Lets see how. Lets say we define an interface for a group of handheld devices called DeviceAPI. It has methods like getOS(), getMaxResolution() and getBrand() – all abstract. Our interface DeviceAPI would then look like this –
 * 
 * public interface DeviceAPI{
	   public String getOS();
	  public String getMaxResolution();
	  public String getBrand();
	 }
 *  Now, over a period of time many devices are rolled out and for each new device we implement the DeviceAPI interface and hence, we also implement all the abstract methods. Its all going fine when we come to know that a wearable device has come out which needs to have a check for whether bluetooth is enabled on the device.
 *  
 *  We promptly write a method isBlueToothEnabled() in the interface DeviceAPI. But then we notice that DeviceAPI has had more than a few, infact 20-30 implementations, many of these implementations were done by device vendors using this API and we have no access to their source code. If we go ahead and add this new method isBlueToothEnabled() to DeviceAPI, everything will be fine for the vendors till they do not recompile their implementation class along with the new DeviceAPI. Then their code will start failing as compiler will not find the new method in their implementation. Secondly, we will have to change all of the 20-30 implementations. Even though that device maybe a wearable type of device or not.
 *  
 *  How to overcome the issue of adding a new functionality to the API without breaking the code
 *  Till Java 7 this kind of new functionality was very difficult to introduce due to the problems we noted above. But in Java 8 we have a solution for this. We can implement this isBlueToothEnabled() method as a default method in DeviceAPI. This implementation will then automatically be available to all the classes which implement DeviceAPI.
 *
 * public interface DeviceAPI{
		 default boolean isBlueToothEnabled(){
		  //default method implementation goes here
		 }
		 public String getOS();
		 public String getMaxResolution();
		 public String getBrand();
	}
 * 	
 * 
	 

 * 
 */

public interface InterfaceWithStaticAndDefault {

	public static String staticMethod(String param) {
		return "Static method from interface has been used to add param "+param;
	}
	
	public default String defaultMethod(String param) {
		return "Deafult method from interface has been used to add param "+param;
	}
	
	
}
