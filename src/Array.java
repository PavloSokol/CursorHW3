import java.util.Arrays;

public class Array {

    private int[] array;


    public Array(int length) {
        array = new int[length];
    }

    public void printArray() {
        String result = Arrays.toString(array);
        System.out.println(result);
    }

    public void cleanArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public Array firstTask() {
        cleanArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("1.Заповнити масив тільки парними числами:");
        printArray();
        return this;
    }

    public Array secondTask() {
        cleanArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        System.out.println("-----------------------------------------" + "\n2.Заповнити масив рандомними числами:");
        printArray();
        return this;
    }

    public Array thirdTask() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int result = sum / array.length;
        System.out.println("-----------------------------------------" + "\n3. Вивести середнє значення масиву");
        System.out.println(result);
        return this;
    }

    public Array fourthTask() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
            }
        }
        System.out.println("-----------------------------------------" + "\n4. Вивести суму всіх значень кратних 3");
        System.out.println(sum);
        return this;
    }

    public Array fifthTask() {
        System.out.println("-----------------------------------------" + "\n5.Вивести значення всіх парних індексів масиву:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        return this;
    }

    public Array sixthTask() {
        System.out.println("-----------------------------------------" + "\n6.Просортувати масив в порядку зростання:");
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int tmp = array[i];
            while (j >= 0 && array[i] > tmp) {
                array[j + 1] = array[i];
                j = j - 1;
            }
            array[j + 1] = tmp;
        }
        return this;
    }

    public Array seventhTask()
    {
        System.out.println("-----------------------------------------" + "\n7. Вивести найменше значення в масиві:");
        int minimal=array[0];
        for (int i=1; i<array.length; i++)
        {
                for (int j=0;j< array.length;j++)
                {
                    if(array[j]<minimal)
                    {
                        minimal=array[j];
                    }
                }
        }
        System.out.println(minimal);
        return this;
    }

    public Array eightTask()
    {
        int max = array[0];
        System.out.println("-----------------------------------------" + "\n8.Вивести найбільше значення в масиві:");
        for(int i=1; i<array.length;i++)
        {
            for (int j=1; i<array.length-1;i++)
            {
                if (max<array[j])
                {
                    max=array[j];
                }
            }
        }
        System.out.println(max);
        return this;
    }

    public Array ninethTask()
    {
        int summa=0;
        int i;
        System.out.println("-----------------------------------------" + "\ng 9. Вивести значення парних індексів масиву:");
        for (i=0; i<array.length; i+=2)
        {
            summa+=array[i];
        }
        System.out.println(summa);
        return this;
    }

    public Array tenthTask(){
        System.out.println("-----------------------------------------" + "\n10. Вивести перші 20 символів з таблиці ASCII");
        for (int c=32; c<53; c++) {
            System.out.print( (char)c +" ");
        }
        return this;
    }

}
