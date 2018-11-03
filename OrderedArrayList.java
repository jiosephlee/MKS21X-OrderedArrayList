import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int start){
    super(start);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("Error: Argument cannot be null");
    } else {
    T output = get(index);
    remove(index);
    add(value);
    return output;
  }
  }

  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("Error: Argument cannot be null");
    } else {
    boolean added = false;
    for (int x = 0; x < size() ; x++){
      if (get(x).compareTo(value) >= 0 && !added){
        super.add(x,value);
        added = true;
      }
    }
    if (!added){
      super.add(value);
    }
  }
    return true;
  }

  public void add(int index, T value){
    add(value);
  }

}
