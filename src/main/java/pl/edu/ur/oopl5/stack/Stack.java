package pl.edu.ur.oopl5.stack;

/**
 */
public class Stack extends AbstractStack {
    int n;
    int[] stos=new int[n];
    int index;

    int i;

    public Stack(int i) {
        stos = new int[i];
        index = 0;
    }

    @Override
    public void push(int i) throws ArrayIndexOutOfBoundsException {
        if (index < stos.length) {
            stos[index] = i;
            index++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Stos jest pe³ny!");
        }

    }

    @Override
    public int pop() throws IndexOutOfBoundsException {
        if (index <= 0) {
            throw new IndexOutOfBoundsException("Stos jest pusty!");
        }

        int temp = stos[index - 1];
        index--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        } else {
            return false;
        }

    }

}
