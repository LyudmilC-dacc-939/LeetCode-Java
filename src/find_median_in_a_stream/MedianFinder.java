package find_median_in_a_stream;

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    List<Integer> numbers = new ArrayList<>();
    float averageOfNumbers;

    public MedianFinder() {
    }

    protected void addNum(int addNum) {
        this.numbers.add(addNum);
    }

    protected void sumOfNumbers() {
        this.averageOfNumbers = 0;
        for (int number : this.numbers) {
            averageOfNumbers += number;
        }
    }

    protected float findMedian() {
        sumOfNumbers();
        return averageOfNumbers / numbers.size();
    }

}
