
public class HeapSort {
  private static int heapSize;

  public void sortNumbers(int[] A) {
    HeapSort(A);
  }

  private void HeapSort(int[] A) {
    heapSize = A.length;
    BuildMaxHeap(A);
    for (int i = A.length - 1; i > 0; i--) {
      // exchange biggest number with the current last one
      int temp = A[0];
      A[0] = A[i];
      A[i] = temp;
      heapSize--;
      MaxHeapify(A, 0);
    }
  }

  private void BuildMaxHeap(int[] A) {
    for (int i = A.length / 2 - 1; i >= 0; i--) {
      MaxHeapify(A, i);
    }
  }

  private void MaxHeapify(int[] A, int i) {
    int l = Left(i); // lets find left child of the given index.
    int r = Right(i);// lets find right child of the given index.
    int max;
    if (l < heapSize) {
      if (A[l] > A[i]) {
        max = l;
      } else {
        max = i;
      }
    } else {
      max = i;
    }
    if (r < heapSize) {
      if (A[r] > A[max]) {
        max = r;
      }
    }
    if (max != i) {
      int temp = A[i];
      A[i] = A[max];
      A[max] = temp;
      MaxHeapify(A, max);
    }
  }

  private int Left(int i) {
    return 2 * i;
  }

  private int Right(int i) {
    return (2 * i) + 1;
  }

  public static void main(String[] args) {
    int[] list = { 156, 344, 54, 546, 767, 23, 34, 64, 234, 654, 234,
        65, 234, 65, 87, 3, 5, 76, 24, 2, 3, 7, 9, 5, 34, 32,
        4525, 345, 0 };

    HeapSort hs = new HeapSort();
    hs.sortNumbers(list);
    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }
  }

}
