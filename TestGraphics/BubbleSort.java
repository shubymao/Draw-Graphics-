package TestGraphics;

public class BubbleSort<E> {

    public Comparable[] sort(Comparable[] input,DrawArray d) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length -1; j++) {
                if (input[j].compareTo(input[j+1])>0){
                Comparable temp = input[j];
                input[j]=input[j+1];
                input[j+1]=temp;
                try
                {
                Thread.sleep(50);
                }
                catch(InterruptedException ex)
                {
                Thread.currentThread().interrupt();
                }
                d.refresh((Integer[])input);
                }
            }
        }
        return input;
    }

}
