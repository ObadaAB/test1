public class Algorithms
{
    public void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            for (int j = i - 1; j >= 0; j--)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }

    public int getKthMinimum(int[] a, int k)
    {
        if (k < 0 || k >= a.length)
            throw new NoSuchElementException();
        sort(a);
        return a[k];
    }
}
