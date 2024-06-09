import java.lang.ArrayIndexOutOfBoundsException;

public class JArray<T>{
    
    private int capacity;
    private T[] jArray;

    @SuppressWarnings("unchecked")
    public JArray(int capacity){
        this.capacity = capacity;
        jArray = (T[])new Object[capacity];

    }

    @SuppressWarnings("unchecked")
    public T get(int index)throws ArrayIndexOutOfBoundsException{
        if(index<0 || index>=capacity){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return jArray[index];
        }
    }

    public void set(int index, T obj){
        if(index<0 || index>=capacity){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            jArray[index] = obj;
            return;
        }
    }

    public T[] setSlice(int start, T[] slice, int sliceEnd){
        int sliceCapacity = sliceEnd-start+1;
        System.arraycopy(slice,0,jArray,start,sliceEnd);
        return jArray;
    }

    public void clear(){
        for(int i=0;i<capacity;i++){
            jArray[i]=null;
        }
    }

    public int length(){
        return capacity;
    }

    
}
