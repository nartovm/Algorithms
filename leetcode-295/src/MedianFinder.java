import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> bigHalf;
    PriorityQueue<Integer> smallHalf;

    public MedianFinder() {
        bigHalf = new PriorityQueue<>();
        smallHalf = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (smallHalf.isEmpty() || num <= smallHalf.peek()) {
            smallHalf.add(num);
        } else {
            bigHalf.add(num);
        }

        if (smallHalf.size() > bigHalf.size()) {
            bigHalf.add(smallHalf.poll());
        }
        else if (bigHalf.size() > smallHalf.size()) {
            smallHalf.add(bigHalf.poll());
        }
    }

    public double findMedian() {
        if (smallHalf.size() > bigHalf.size()) {
            return smallHalf.peek();
        }
        return (smallHalf.peek() + bigHalf.peek()) / 2.0;
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(6);
        mf.addNum(7);
        mf.addNum(2);
        mf.addNum(8);
        mf.addNum(4);
        mf.addNum(3);
        mf.addNum(5);
        System.out.println(mf.findMedian());
        mf.addNum(9);
        System.out.println(mf.findMedian());
    }
}

