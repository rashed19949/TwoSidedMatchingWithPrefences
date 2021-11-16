public class SeminarPreference {
    private final int seminarId;

    //arrays with student id's
    private final int[] P1;
    private final int[] P2;
    private final int[] P3;
    private final int[] P4;
    private final int[] P5;

    public SeminarPreference(int seminarId, int[] p1, int[] p2, int[] p3, int[] p4, int[] p5) {
        this.seminarId = seminarId;
        P1 = p1;
        P2 = p2;
        P3 = p3;
        P4 = p4;
        P5 = p5;
    }
}
