package collections.comparator;

import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        o1 > o2 => 1;
        o1 < o2 => -1;
        o1 == o2 => 0;
         */
        return Integer.compare(o1.length(), o2.length());
    }
}
