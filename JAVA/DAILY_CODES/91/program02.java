
import java.util.*;

class Project implements Comparable {

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

	public int compareTo(Object obj){
		return projName.compareTo(((Project)obj).projName);
	}
}

class Client {

	public static void main(String[] args){
		
		PriorityQueue pq = new PriorityQueue();

		pq.offer(new Project("X",7,60));
		pq.offer(new Project("A",8,90));
		pq.offer(new Project("B",5,30));
	
		System.out.println(pq);
	}	
}
