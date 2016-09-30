package in.ac.kletech;

public class UniversityDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College[] c=new College[2];
		College u=new College();
		c[0]=new College("BVB");
		c[1]=new College("KLEIT");
	
		u.maxcollege(c);
		u.display(c);
		
		Department[] d=new Department[4];
		Department v=new Department();
		
		d[0]=new Department(56, 21, "EC");
		d[1]=new Department(65, 19, "CS");
		d[2]=new Department(24, 25, "Mech");
		d[3]=new Department(75, 12, "Civil");
		v.display(d);
		
		System.out.println("\n*** INTAKE CHECK ***\n");
		for(int k=0;k<d.length;k++)
		{
			int temp=v.check(d[k].iNoOfStudents);
			if(temp==0)
				System.out.println("The Dept. " + d[k].sDepartmentName + " has exceeded max students limits with "+ d[k].iNoOfStudents);
			else
				System.out.println("The Dept. " + d[k].sDepartmentName + " is within MAX STAFF limits");
		}
		System.out.println("\n*** STAFF CHECK ***\n");
		for(int k=0;k<d.length;k++)
		{
			int temp=v.check(d[k].iNoOfStaff,d[k].sDepartmentName);
			if(temp==0)
				System.out.println("The Dept. " + d[k].sDepartmentName +" has exceeded max STAFF limits with "+ d[k].iNoOfStaff);
			else
				System.out.println("The Dept. " + d[k].sDepartmentName + " is within MAX STAFF limits");
		}
	}

}
