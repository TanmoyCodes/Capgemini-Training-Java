





/*
 * CAR
 * Brand(get)
 * Milage(set)
 * Color(get/set)
 * Speed(get/set)
 * Engine(get/set)
 */

class Brand
{
	private String brand = "BMW";
	
	public String getBrand()
	{
		return brand;
	}
}

class Milage
{
	private String milage = "10 km/hr";
	
	public String getMilage()
	{
		return milage;
	}
	
	public void setMilage(String milage)
	{
		this.milage = milage;
	}
}

class Color
{
	private String color;
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
}

class Speed
{
	private String speed;
	
	public String getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(String speed)
	{
		this.speed = speed;
	}
}

class Engine
{
	private String engine;
	
	public String getEngine()
	{
		return engine;
	}
	
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
}


public class Car {

	public static void main(String[] args) {
		
		Brand brand = new Brand();
		Milage mil = new Milage();
		Color color = new Color();
		Speed speed = new Speed();
		Engine engine = new Engine();
		
		mil.setMilage("10 km/hr");
		color.setColor("Black");
		speed.setSpeed("250 km/hr");
		engine.setEngine("Turbo V12");
		
		System.out.println("Car Brand: " + brand.getBrand());
		System.out.println("Milage: " + mil.getMilage());
		System.out.println("Color: " + color.getColor());
		System.out.println("Top Speed: " + speed.getSpeed());
		System.out.println("Engine: "+ engine.getEngine());
	}
}