import java.util.Scanner;
public class InsertElement

{
            public static void main(String[] args)
{
                        int num,pos,element;
                        Scanner s= new Scanner(System.in);
                        System.out.print("Enter the no of elements");
                        num=s.nextInt();
                        int a[]= new int[num];
                        System.out.print("Enter the elements:");
                        for(int i=0;i<num;i++)
                        {
                            a[i]=s.nextInt();                          
                        }
                        System.out.print("Enter the position of new element:");
                        pos=s.nextInt();
                        System.out.print("Enter the element");
                        element=s.nextInt();
                        for(int i=(num-1);i>pos-1;i--)
                        {
                             a[i]=a[i-1];
                        }
                        a[pos-1]=element;
                        System.out.print("Array after insertion is:");
                        for(int i=0;i<num;i++)
                        {
                            System.out.print(a[i]+"");
                        }
            }
}

