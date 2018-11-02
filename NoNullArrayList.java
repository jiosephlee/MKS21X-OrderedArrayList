import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int start){
    super(start);
  }

  public T set(int index, T value){
    T output = get(index);
    if (value == null){
      throw new IndexOutOfBoundsException("Error: Argument cannot be null");
    } else {
    super.set(index, value);
    }
    return output;
  }

  public boolean add(T value){
    if (value == null){
      throw new IndexOutOfBoundsException("Error: Argument cannot be null");
    } else {
      super.add(value);
    }
    return true;
  }

  public void add(int index, T value){
    if (value == null){
      throw new IndexOutOfBoundsException("Error: Argument cannot be null");
    } else {
      super.add(index, value);
    }
  }


}
