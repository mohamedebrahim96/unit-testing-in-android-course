// java
package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

public class IntervalsAdjacencyDetector {

    /**
     * @return true if the intervals are adjacent, but don't overlap
     */
    public boolean isAdjacent(Interval interval1, Interval interval2) {
        if (interval1 == null || interval2 == null) return false;

        int s1 = interval1.getStart();
        int e1 = interval1.getEnd();
        int s2 = interval2.getStart();
        int e2 = interval2.getEnd();

        // identical intervals are not adjacent
        if (isSameIntervals(interval1, interval2)) return false;

        // require non-empty intervals (prevent point-interval overlap being treated as adjacency)
        if (s1 >= e1 || s2 >= e2) return false;

        // adjacent if one ends exactly where the other starts (either direction)
        return e1 == s2 || e2 == s1;
    }

    private boolean isSameIntervals(Interval interval1, Interval interval2) {
        return interval1.getStart() == interval2.getStart() && interval1.getEnd() == interval2.getEnd();
    }

}