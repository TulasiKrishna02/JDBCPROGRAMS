package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestingReflection {

	public static void main(String[] args) {

		Class reflectClass = UFOEnemyShip.class;

		String className = reflectClass.getName();

		System.out.println("Class Name : " + className);

		int classModifiers = reflectClass.getModifiers();

		// isAbstract, isPrivate, isStatic, isVolatile, isFinal, isInterface,
		// isProtected etc ..
		
		System.out.println(classModifiers);

		System.out.println(Modifier.isPublic(classModifiers));

		Class[] interfaces = reflectClass.getInterfaces();
		
		for (Class class1 : interfaces) {
			System.out.println(class1.getName());
		}

		Class<?> superClass = reflectClass.getSuperclass();

		System.out.println("Superclass name is : " + superClass.getName()
				+ "\n");

		Method[] classMethods = reflectClass.getMethods();

		for (Method method : classMethods) {
			System.out.println("Method name: " + method.getName());

			if (method.getName().startsWith("get")) {
				System.out.println("Getter Method");
			} else if (method.getName().startsWith("set")) {
				System.out.println("Setter Method");
			}

			System.out.println("return type: " + method.getReturnType());

			Class[] parameterTypes = method.getParameterTypes();

			System.out.print("Parameters : ");
			for (Class parameter : parameterTypes) {
				System.out.print(parameter.getName() + " ");
			}
			System.out.println("\n");
		}

		Constructor constructor = null;
		Object constructor2 = null;

		try {
			constructor = reflectClass
					.getConstructor(new Class[] { EnemyShipFactory.class });
			constructor2 = reflectClass.getConstructor(int.class, String.class)
					.newInstance(12, "Random value");

		} catch (NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Class[] constructParameters = constructor.getParameterTypes();

		for (Class parameters : constructParameters) {
			System.out.println(parameters.getName());
		}

		UFOEnemyShip newEnemyShip = null;

		EnemyShipFactory shipFactory = null;

		try {
			newEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		newEnemyShip.setName("XT-1000");

		System.out.println("Enemy Ship name: " + newEnemyShip.getName());

		Field privateStringName = null;

		UFOEnemyShip enemyShipPrivate = new UFOEnemyShip(shipFactory);

		try {
			String idCodeString = "idCode";
			privateStringName = UFOEnemyShip.class
					.getDeclaredField(idCodeString);
			privateStringName.setAccessible(true);

			String valueOfName;
			valueOfName = (String) privateStringName.get(enemyShipPrivate);

			System.out.println("Private Field Name : " + valueOfName);

			String methodName = "getPrivate";
			Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(
					methodName, null);

			privateMethod.setAccessible(true);

			String privateReturnValue = (String) privateMethod.invoke(
					enemyShipPrivate, null);

			System.out.println("Private Method: " + privateReturnValue);
			
			Class[] methodParameters =new Class[]{Integer.TYPE,String.class};
			
			Object[] params = new Object[]{new Integer(100),new String("Random")};
			
			privateMethod = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivate", methodParameters);
			
			privateMethod.setAccessible(true);
			
			privateReturnValue = (String) privateMethod.invoke(enemyShipPrivate, params);
			
			System.out.println("Other Private Method: " + privateReturnValue);
			
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException
				| NoSuchMethodException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


/*
 * Three way how we can create object in Java 
 
  Class c = Class.forName("ConcreteClass"); 
  
  ConcreteClass cc = new ConcreteClass(); 
  Class c = cc.getClass();
  
  Class c = ConcreteClass.class;
  
 
 */