
package constructorpractice;

class Subject {
    private String subID, name;
    private int mrkObt, maxMrks;

    public Subject(String sid, String n, int mx) {
        subID = sid;
        name = n;
        maxMrks = mx;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSubID() {
        return subID;
    }
    
    public int getMaxMarks() {
        return maxMrks;
    }
    
    public int getMarksObtain() {
        return mrkObt;
    }
    
    public void setMarksObtain(int mo) {
        mrkObt = mo;
    }
    
    public void setMaxMarks(int mx) {
        maxMrks = mx;
    }
    
    boolean isQualified() {
        return mrkObt >= maxMrks / 10 * 4;
    }
    
    public String toString() {
        return "\nSubject ID: " + subID + "\nName: " + name + "\nMarks Obtained: " + mrkObt;
    }
}

class Student {
    private String name, dept, rollNo;
    private int numOfSub;
    private Subject sub[];
    
    public Student(String roll, String n) {
        rollNo = roll;
        name = n;
    }
    
    public Student(String roll, String n, int ns) {
        rollNo = roll;
        name = n;
        numOfSub = ns;
    }
    
    public String getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public int getNoOfSubjects() { return numOfSub; }
    public Subject[] getSubjects() { return sub; }
    
    public void setDept (String dept) {
        this.dept = dept;
    }
    
    public void setSubjects(Subject ...subs) {
        for(int i = 0; i < subs.length; i++)
            sub[i] = subs[i];
    }
    
    public String toString() {
        return "\nRoll: " + rollNo + "\nName: " + name + "\nDept: " + dept;
    }
}

public class ConstructorPractice {

    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "DS", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "Operating Systems", 100);
        
        for(Subject s: subs)
            System.out.println(s);
        
        Student s[] = new Student[4];
        s[0] = new Student("BT101", "Alan", 2);
        s[1] = new Student("BT102", "Becky", 1);
        s[2] = new Student("BT103", "Catherine", 3);
        s[3] = new Student("BT104", "Daisy", 2);
        
        for(int i = 0; i < s.length; i++) {
            s[i].setDept("Computer Science");
        }
        
        for(Student st : s)
            System.out.println(st);
    }
    
}
