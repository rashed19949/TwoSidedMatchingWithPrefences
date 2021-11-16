public class StudentPreference {
    private final int studentId;

    //arrays with seminar ids
    private final int[] P1;
    private final int[] P2;
    private final int[] P3;
    private final int[] P4;
    private final int[] P5;

    public StudentPreference(int studentId, int[] p1, int[] p2, int[] p3, int[] p4, int[] p5) {
        this.studentId = studentId;
        P1 = p1;
        P2 = p2;
        P3 = p3;
        P4 = p4;
        P5 = p5;
    }
}
