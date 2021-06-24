package com.interview.association;

class Vehicle{
	String name;
	Engine engine;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}

class Engine{
	int engineId;

	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
}
public class Composition {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Car");
		Engine engine = new Engine();
		engine.setEngineId(32242525);
		vehicle.setEngine(engine);
		
		System.out.println(vehicle.getName() + " " + vehicle.getEngine().getEngineId());//Car 32242525

	}

}
