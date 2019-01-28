public class ArrayList1 implements List {
    private Integer[] mas = new Integer[0];


    @Override
    public void add(Integer elem) {
        Integer[] tmp = new Integer[mas.length + 1];
//        for(int i = 0; i< mas.length; i++ ){
//            tmp [i]= mas[i];
//
//        }
        System.arraycopy(mas, 0, tmp, 0, mas.length);
        tmp[tmp.length - 1] = elem;
        mas = tmp;
    }

    @Override
    public void add(int index, Integer elem) {
        Integer[] tmp = new Integer[mas.length + 1];
        System.arraycopy(mas, 0, tmp, 0, index);
        tmp[index] = elem;
        System.arraycopy(mas, index, tmp, index + 1, mas.length - index);

        mas = tmp;

    }

    @Override
    public Integer remove(int index) {
        Integer[] tmp = new Integer[mas.length - 1];
        System.arraycopy(mas, 0, tmp, 0, index);
        System.arraycopy(mas, index + 1, tmp, index, mas.length - 1 - index);
        Integer out = mas[index];
        mas = tmp;
        return out;

    }

    @Override
    public void set(int index, Integer elem) {
        mas[index] = elem;
    }

    @Override
    public Integer get(int index) {
        return mas[index];
    }

    @Override
    public void clear() {
        Integer[] tmp = new Integer[0];
        mas = tmp;
    }

    @Override
    public int size() {
        return mas.length;
    }

    @Override
    public boolean isempty() {
        return mas.length == 0;

    }

    @Override
    public boolean contains(Integer elem) {


        for (int i = 0; i < mas.length; i++)
            if (mas[i] == elem) {
                return true;
            }

        return false;

    }

    @Override
    public int indexof(Integer elem) {
        Integer[] tmp = new Integer[mas.length];
        mas = tmp;
        for (int i = 0; i < mas.length; i++)
            if (i == elem) {
                return i;
            }
        return -1;
    }

    @Override
    public int lastindexof(Integer elem) {


        for (int i = mas.length - 1; i >= 0; i--)
            if (mas[i] == elem) {
                return i;
            }

        return -1;
    }

}