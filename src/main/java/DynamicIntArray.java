public class DynamicIntArray {

    protected int[] array;
    protected int elements;
    public DynamicIntArray(int initialSize){
        this.array = new int[initialSize];
        this.elements = 0;
    }

    private void resize(){
        int[] nextArr = new int[this.elements * 2];
        for(int i = 0; i < this.array.length; i++){
            nextArr[i] = this.array[i];
        }
        this.array = nextArr;
    }

    public void append(int num){
        if (this.elements +1 > this.array.length){
            resize();
        }
        this.array[this.elements] = num;
        this.elements ++;
    }

    public int popIndex(int index){
        if (index >= this.elements){
            throw new IndexOutOfBoundsException();
        }
        int popped = this.array[index];
        for (int i = index; i < this.array.length -1; i++){
            this.array[i] = this.array[i + 1];
        }
        this.elements--;
        return popped;
    }

    public int size(){
        return this.elements;
    }
}