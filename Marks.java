package Project2;
/*We have to calculate the average of marks obtained in three subjects by student A and by student B. Create class
'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks. Provide
implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code*/

public abstract class Marks {
    double grade1;
    double grade2;
    double grade3;

    public Marks(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    abstract double getPercentage();

}
class A extends Marks {


    public A(int grade1, int grade2, int grade3) {
       super(grade1,grade2,grade3);
    }

    @Override
    double getPercentage() {
        double average = (grade1+grade2+grade3)/3;
        return average;
    }
}

class B extends Marks{

    double grade4;

    public B(double grade1, double grade2, double grade3, double grade4) {
        super(grade1,grade2,grade3);
        this.grade4=grade4;
    }

    @Override
    double getPercentage() {
        double average = (grade1+grade2+grade3+grade4)/4;
        return average;
    }
}

class MarksTester{
    public static void main(String[] args) {
        Marks [] arr ={new A(96,93,92),new B(87,90,92,97)};
        for(Marks avg:arr){
            System.out.println(avg.getPercentage());
        }
    }
}
