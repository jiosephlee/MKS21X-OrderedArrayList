import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int start){
    super(start);
  }

  public T set(int index, T value){
    T output = get(index);
    remove(index);
    add(value);
    return output;
  }

  public boolean add(T value){
    for (int x = 0; x < size() ; x++){
      if (value.compareTo(get(x)) >= 0){
        super.add(x,value);
      }
    }
    return true;
  }

  public void add(int index, T value){
    add(value);
  }

}
