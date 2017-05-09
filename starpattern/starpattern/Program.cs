using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace starpattern
{
    class Program
    {

        Dictionary<char, int> ht = new Dictionary<char, int>();

        Program()
        {

            ht.Add(' ', 00000);
            ht.Add('A', 75755);
            ht.Add('B', 75657);
            ht.Add('C', 74447);
            ht.Add('D', 65556);
            ht.Add('E',74647);
             ht.Add('F',74644);
             ht.Add('G',74557);
             ht.Add('H',55755);
             ht.Add('I',72227);
             ht.Add('J',72226);
             ht.Add('K',56465);
             ht.Add('L',44447);
             ht.Add('M',89388);
             ht.Add('N',11111);
             ht.Add('O',25552);
             ht.Add('P',65644);
             ht.Add('Q',25521);
             ht.Add('R',65665);
             ht.Add('S',74217);
             ht.Add('T',72222);
             ht.Add('U',55557);
             ht.Add('V',55552);
             ht.Add('W',88398);
             ht.Add('X',55255);
             ht.Add('Y',55222);
             ht.Add('Z',71247);
           
            
           
           


        }
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Your String");
            Program p = new Program();
         int[] num1 = p.initValues();
         num1=p.reversdigit(num1);
          p.getWord(num1);


            Console.ReadKey();
        }

        public int[] initValues()
        {
            String s = Console.ReadLine();
            s=s.ToUpper();
            int i = 0;
            char[] str = s.ToCharArray();
            int[] num1 = new int[str.Length];

            for (i = 0; i <= str.Length - 1; i++)
            {
                Console.Write(str[i]);
              //  string ss = ht[str[i]].ToString();

                num1[i] = ht[str[i]];
            }
            Console.Write("\n");
            return num1;

        }
        public int[] reversdigit(int[] num)
        {
            int i;
          
            for (i = 0; i <= num.Length - 1;i++ )
            {
                int reverse = 0;
                int remainder = 0;
                while (num[i]> 0)
                {
                    remainder = num[i] % 10;
                    reverse = (reverse * 10) + remainder;
                    num[i] = num[i] / 10;
                }
                num[i] = reverse;
            }


                return num;
        }
        public void getWord(int[] num)
        {



            int i = 0,j;
            int temp;
            int nvalue=11111;
           for (i = 0; i <= 5; i++)
            {
               for (j = 0; j <= num.Length-1; j++)
                {


                    if (num[j] == nvalue)
                    {
                        switch(nvalue)
                        {
                            case 11111: Console.Write("*   *"); break ;
                            case 1111:  Console.Write("**  *"); break;
                            case 111:   Console.Write("* * *"); break;
                            case 11:    Console.Write("*  **"); break;
                            case 1:     Console.Write("*   *"); break;
                        }
                        Console.Write(" ");
                        num[j] = num[j] / 10;
                        
                    }
                    else
                    {
                        temp = num[j] % 10;
                        num[j] = num[j] / 10;
                        //Console.Write(num[j]);
                        switch (temp)
                        {

                            case 1: Console.Write("  *"); break;
                            case 2: Console.Write(" * "); break;
                            case 4: Console.Write("*  "); break;
                            case 5: Console.Write("* *"); break;
                            case 6: Console.Write("** "); break;
                            case 7: Console.Write("***"); break;
                            case 0: Console.Write("   "); break;
                            case 3: Console.Write("* * *"); break;
                            case 9: Console.Write("** **"); break;
                            case 8: Console.Write("*   *"); break;

                        }
                        Console.Write(" ");
                    }
                   
                }
               Console.Write("\n");
               nvalue = nvalue / 10;
               

            }

        }
    }
}


