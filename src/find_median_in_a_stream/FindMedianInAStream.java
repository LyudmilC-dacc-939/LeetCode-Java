package find_median_in_a_stream;

import java.util.ArrayList;
import java.util.List;

public class FindMedianInAStream {

    //Hard 2: Find Median in a Stream
    //Problem:
    //Design a class MedianFinder to continuously find the median from a stream of integers. Implement methods:
    //
    //addNum(num: int) – Add a number.
    //findMedian() -> float – Return the median.
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input:
    //addNum(1)
    //addNum(2)
    //findMedian() -> 1.5
    //addNum(3)
    //findMedian() -> 2
    //Constraints:
    //
    //Up to 10^5 calls for addNum and findMedian.

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(2);
        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }
}
