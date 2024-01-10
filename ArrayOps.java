public class ArrayOps {
    public static void main(String[] args) {
        //System.out.println(findMissingInt( new int[] {1, 0, 3}));
        //System.out.println(secondMaxValue( new int [] {2, 8, 3, 7, 8}));
        //System.out.println(containsTheSameElements( new int [] {1, 3, 5, 3, 4}, new int [] {1, 3, 4, 5}));
        //System.out.println(isSorted( new int [] {5, 4, 3, 1, 1}));
    }


    public static int findMissingInt(int[] array) {
        int[] newArr = new int[array.length + 1];

        for (int i = 0; i < newArr.length; i++)
        {
            newArr[i] = i;
        }
        int missingInt = 0;
        boolean isMissing;
        for (int i = 0; i < newArr.length; i++)
        {
             isMissing = true;
            for (int j = 0; j < array.length; j++)
            {
                if (newArr[i] == array[j])
                {
                    isMissing = false;
                }
            }
            if (isMissing == true)
            {
                missingInt = i;
            }

        }
        return missingInt;
    }


    public static int secondMaxValue(int[] array)
    {
        int Max = array[0];
        int secondMax = 0;
      for (int i = 1; i < array.length; i++)
      {
          if ( array[i] > Max)
          {
              Max = array[i];
          }
      }

      for (int j = 0; j < array.length; j++)
      {
         if (array[j] > secondMax && array[j] < Max)
         {
             secondMax = array[j];
         }
      }
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2)
    {
      boolean sameElements = true;
      boolean similarity = true;

      if (array1.length > array2.length)
      {
          for (int i = 0; i < array1.length; i++)
          {
              sameElements = false;
             for (int j = 0; j < array2.length; j++)
             {
                 if(array1[i] == array2[j])
                 {
                     sameElements = true;
                     break;

                 }
             }
              if(sameElements == false)
              {
                  similarity = false;
              }
          }
      }
        else {
          for (int i = 0; i < array2.length; i++)
          {
              for (int j = 0; j < array1.length; j++)
              {
                  sameElements = false;
                  if (array1[i] == array1[j])
                  {
                      sameElements = true;
                      break;
                     }
                  }
              if(sameElements == false)
              {
                  similarity = false;
              }
          }
      }

        return similarity;
    }

    public static boolean isSorted(int[] array)
    {
        int temp;
       boolean decrease = true;
       boolean increase = true;
       for (int i = 0 ; i < array.length - 1; i++)
        {
            temp = array[i];
            if (array[i+1] > temp)
            {
                decrease = false;
            }
        }
       for (int i = 0; i < array.length - 1 ; i++)
        {
            temp = array[i];
            if (array[i+1] < temp)
            {
                increase = false;
            }
        }
       boolean isSorted = (increase || decrease);
       return isSorted;
    }
}



