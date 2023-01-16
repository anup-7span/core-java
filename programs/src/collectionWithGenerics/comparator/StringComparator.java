package collectionWithGenerics.comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s, String s1) {
        int l1 = s.length();
        int l2 = s1.length();
        if (l1 < l2) {
            return -1;
        } else if (l1 > l2) {
            return 1;
        } else {
            return s.compareTo(s1);
        }
    }
}
