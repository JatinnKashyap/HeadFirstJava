package DotComGame;

class shape
{
    public static void main(String args[]){
        shape16();
    }
    static void shape1()
    {
        int i,j,k;
        for(i=9;i>=0;i--)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape2()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=8;j>=i;j--)
            {
                for(k=0;k<=j;k++)
                    System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=8;j>=i;j--)
            {
                for(k=0;k<=j;k++)
                    System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape3()
    {
        int i,j,k;
        for(i=9;i>=0;i--)
        {
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=8;j>=i;j--)
            {
                for(k=0;k<=j;k++)
                    System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=8;j>=i;j--)
            {
                for(k=0;k<=j;k++)
                    System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape4()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape5()
    {
        int i,j,k;
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape6()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape7()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape8()
    {
        int i,j,k;
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape9()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=1;j<=126;j++)System.out.print(" ");
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=1;j<=63;j++)System.out.print(" ");
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=1;j<=63;j++)System.out.print(" ");
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=1;j<=126;j++)System.out.print(" ");
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape10()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape11()
    {
        int i,j,k;
        for(i=0;i<=9;i++)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=0;j<=9;j++)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape12()
    {   int i,j,k;
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape13()
    {   int i,j,k;
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape14()
    {   int i,j,k;
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void shape15()
    {   int i,j,k;
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<=6;i++)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                else
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=6;i>=0;i--)
        {
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=6;j++)
            {
                if(j>=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=6;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void shape16()
    {
        int i,j,k;

        for(i=0;i<=9;i++)
        {
            for(j=9;j>=0;j--)
            {
                if(j<=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=9;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(i==9)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(i==9)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(i==9)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=9;i>=0;i--)
        {
            for(j=9;j>=0;j--)
            {
                if(j<=i)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=9;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(i==9)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }

            for(j=9;j>=0;j--)
            {
                if(i==9)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }
            for(j=0;j<=9;j++)
            {
                if(i==9)
                    for(k=j;k>=0;k--)
                        System.out.print(k);
                else
                    for(k=j;k>=0;k--)
                        System.out.print(" ");
                System.out.print(" ");
            }

            for(j=9;j>=0;j--)
            {
                if(j>i)
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                else
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                System.out.print(" ");
            }
            for(j=9;j>=0;j--)
            {
                if(j>=i)
                    for(k=0;k<=j;k++)
                        System.out.print(k);
                else
                    for(k=0;k<=j;k++)
                        System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void shape17(int n)
    {
        int i,j,k,r;
        for(r=1;r<=n;r++)
        {
            for(i=1;i<=5;i++)
            {
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=5;j>=1;j--)
                    {
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=1;i<=5;i++)
            {
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=5;j>=1;j--)
                    {
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    static void shape18(int n)
    {
        int i,j,k,r,v;
        for(r=1,v=0;r<=n;r++,v+=38)
        {
            for(i=1;i<=5;i++)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=5;j>=1;j--)
                    {
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    static void shape19(int n)
    {
        int i,j,k,r,v;
        for(r=1,v=0;r<=n/2;r++,v+=38)
        {
            for(i=1;i<=5;i++)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    for(k=j;k>=1;k--)
                    {
                        if(i==5)
                            System.out.print(k);
                        else
                            System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=1;j<=5&&i!=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=1;j<=5;j++)
                    {
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i&&i!=5)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        v-=38;
        for(r=n/2;r>=1;r--,v-=38)
        {
            for(i=1;i<=5;i++)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5&&i!=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=1;j<=5;j++)
                    {
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i&&i!=5)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    for(k=j;k>=1;k--)
                    {
                        if(i==5)
                            System.out.print(k);
                        else
                            System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print("  ");
                    System.out.print("  ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    static void shape20(int n)
    {
        int i,j,k,r,v=(n/2-1)*38;
        for(r=n/2;r>=1;r--,v-=38)
        {
            for(i=1;i<=5;i++)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5&&i!=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=1;j<=5;j++)
                    {
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i&&i!=5)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    for(k=j;k>=1;k--)
                    {
                        if(i==5)
                            System.out.print(k);
                        else
                            System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print("  ");
                    System.out.print("  ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        for(r=1,v=0;r<=n/2;r++,v+=38)
        {
            for(i=1;i<=5;i++)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    for(k=j;k>=1;k--)
                    {
                        if(i==5)
                            System.out.print(k);
                        else
                            System.out.print(" ");
                    }
                    System.out.print(" ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=1;j<=5&&i!=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                if(i==5)
                {
                    for(j=1;j<=5;j++)
                    {
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                        System.out.print(" ");
                    }
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i&&i!=5)
                        for(k=j;k>=1;k--)
                            System.out.print(" ");
                    else
                        for(k=j;k>=1;k--)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(i=5;i>=1;i--)
            {
                for(k=1;k<=v;k++)System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    for(k=1;k<=j;k++)
                        System.out.print(" ");
                    System.out.print(" ");
                }
                for(j=5;j>=1;j--)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                for(k=1;k<=78*(n/2-r)-2;k++)
                    System.out.print(" ");
                for(j=1;j<=5;j++)
                {
                    if(j>i)
                        for(k=1;k<=j;k++)
                            System.out.print(" ");
                    else
                        for(k=1;k<=j;k++)
                            System.out.print(k);
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}