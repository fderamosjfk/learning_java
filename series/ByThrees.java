package series;

class ByThrees implements Series {
  int start;
  int val;
  int prev;

  ByThrees() {
    start = 0;
    val = 0;
    prev = -3;
  }

  public int getNext() {
    prev = val;
    val += 3;
    return val;
  }

  public void reset() {
    val = start;
    prev = start - 3;
  }

  public void setStart(int x) {
    start = x;
    val = x;
    prev = x - 3;
  }

  // Additonal member of its own.
  // Not defined by Series.
  int getPrevious() {
    return prev;
  }
}
