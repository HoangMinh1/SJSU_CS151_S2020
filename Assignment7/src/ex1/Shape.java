package ex1;

import java.io.Serializable;
import java.util.*;

class Shape extends Thread implements Serializable{
	
	private transient Thread executionThread;
	private ArrayList<Shape> shapeList;

	
	Shape(){
		this.shapeList = new ArrayList<Shape>();
	}

	//setter and getters for shapeList
	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	//method to be declared by sub classes
	protected double computeArea() {
		return 0;
	}
	
	//method used by thread
	public synchronized void compute() {
		for(Shape shape : this.shapeList) {  
			System.out.println(shape);
		}
	}
	
	
	@Override
	public String toString() {
		return "shape's " + "area: " +this.computeArea() ;
	}
	
	
	//add and remove
	public void add(Shape e) {
		this.shapeList.add(e);
	}
	
	public void remove(Shape e) {
		this.shapeList.remove(e);
	}
	
	
	//thread's methods
	@Override
	public void run() {
		this.compute();
		System.out.println("Thread stops");
	}
	
	public void start() {
		try{
			this.executionThread = new Thread(this, "thread");
			System.out.println("Thread is starting");
			this.executionThread.run();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	//ex2 method
	public Shape max() {
		Double maxArea = Double.MIN_VALUE;
		int maxIndex = 0;
		for(int index = 0; index < this.shapeList.size(); index++) {
			if(shapeList.get(index).computeArea() > maxArea) {
				maxArea = shapeList.get(index).computeArea();
				maxIndex = index;
			}
		}
		return this.shapeList.get(maxIndex);
	}
	
	public Shape min() {
		Double minArea = Double.MAX_VALUE;
		int minIndex = 0;
		for(int index = 0; index < this.shapeList.size(); index++) {
			if(shapeList.get(index).computeArea() < minArea) {
				minArea = shapeList.get(index).computeArea();
				minIndex = index;
			}
		}
		return this.shapeList.get(minIndex);
	}
}
