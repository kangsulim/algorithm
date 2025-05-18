package string.SubString;

public class SubString {
    public int subString(String A, String B) {
        for (int i = 0; i < A.length() ; i++) {
            if ((A.substring(A.length() - i) + A.substring(0, A.length() - i)).equals(B)) {
                return i;
            }
        }

        return -1;
    }
}
