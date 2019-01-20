using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp8
{
    class Program
    {
        static void Main(string[] args)
        {
            
        }
    }

    public class Solution
    {

        public int solution(int[] A, int[] B)
        {
            int answer = 0;
            var AList = A.OrderBy(x => x).ToList();
            var BList = B.OrderBy(x => x).ToList();
            for(int i=0; i < A.Count(); i++)
            {
                if(AList.Last() >= BList.Last())
                {
                    BList.RemoveAt(0);
                    AList.RemoveAt(AList.Count() - 1);
                }
                else
                {
                    BList.RemoveAt(BList.Count() - 1);
                    AList.RemoveAt(AList.Count() - 1);
                    answer++;
                }
            }
            return answer;
        }
    }

}
