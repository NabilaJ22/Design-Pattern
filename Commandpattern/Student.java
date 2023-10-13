package Observerpattern;
import java.util.ArrayList;
import java.util.List;

public interface Student {
    void degree();
}

class Graduation {
    public void ssc() {
        System.out.println("S.S.C Passed");
    }

    public void hsc() {
        System.out.println("H.S.C Passed");
    }
    public void honor() {
        System.out.println("Graduation Completed");
    }
}

class Honors implements Student {
    private Graduation grade;

    public Honors(Graduation grade) {
        this.grade = grade;
    }

    @Override
    public void degree() {
        grade.honor();
    }

}


class Hsc implements Student {
    private Graduation grade;

    public Hsc(Graduation grade) {
        this.grade = grade;
    }

    @Override
    public void degree() {
        grade.hsc();
    }

}

class Ssc implements Student 
{
    private Graduation grade;

    public Ssc(Graduation grade) 
    {
        this.grade = grade;
    }

    @Override
    public void degree() 
    {
        grade.ssc();
    }

}

class Result {
    private List<Student> degrees = new ArrayList<Student>();

    public void list(Student student) 
    {
        degrees.add(student);
    }
    public void submit() 
    {
        for (Student student : degrees) 
        {
            student.degree();
        }
        degrees.clear();
    }

}
class Complete {
    public static void main(String[] args)
    {
        Graduation grad = new Graduation();
        Student hsc = new Hsc(grad);
        Student ssc = new Ssc(grad);
        Student honors = new Honors(grad);  
        Result result = new Result();
        result.list(ssc);
        result.list(hsc);
        result.list(honors);
        result.submit();

    }
}