package org.col;
import org.stu.Student;
import org.staff.Staff;
public class College {

	public void colegeName() {
		System.out.println("colege");
}
	public static void main (String[]args) {
		College c = new College();
		Student s = new Student();
		Staff t = new Staff();
		
		c.colegeName();
		s.stuId();
		s.stuName();
		s.stuDept();
		t.stfId();
		t.stfName();
		t.stfDept();
	}
}