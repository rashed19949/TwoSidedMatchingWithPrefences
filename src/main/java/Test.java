public class Test {
    public static void main(String[] args) {
        StudentPreference stu1Pref = new StudentPreference(1, new int[]{1}, new int[]{2}, new int[]{3}, new int[]{4}, new int[]{5});
        SeminarPreference sem1Pref = new SeminarPreference(1, new int[]{1}, new int[]{2}, new int[]{3}, new int[]{4}, new int[]{5});

        StudentSeminarPreferences ssp = new StudentSeminarPreferences(new StudentPreference[]{stu1Pref}, new SeminarPreference[]{sem1Pref});

    }
}
