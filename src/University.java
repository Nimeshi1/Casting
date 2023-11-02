public class University {
    String name;
    void batch() {
        System.out.println("Batch 06");
    }
}
class College extends University {
    int grade;
    void batch() {
        System.out.println("Grade 13 Batch");
    }
}
class Test1 {
    public static void main(String[] args) {
        University u = new College();
        u.name = "ICBT Campus";
        College c = (College) u;
        c.grade = 13;
        System.out.println(c.name);
        System.out.println(c.grade);
        c.batch();
    }
}

