
import java.util.*;

class Project {

	String projName;
	int teamSize;
	int duration;

	Project(String projName, int teamSize, int duration){
		this.projName=projName;
		this.teamSize=teamSize;
		this.duration=duration;
	}

	public String toString(){
		return projName+" "+teamSize+" "+duration;
	}

}

class SortByName implements Comparator {

	public int compare(Object obj1, Object obj2){
		return ((Project)obj1).projName.compareTo(((Project)obj2).projName);
	}
}

class Client {

	public static void main(String[] args){
		
		PriorityQueue pq = new PriorityQueue(10,new SortByName());

		pq.offer(new Project("X",7,60));
		pq.offer(new Project("A",8,90));
		pq.offer(new Project("B",5,30));
	
		System.out.println(pq);
	}	
}
