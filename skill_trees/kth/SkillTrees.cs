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
        private bool IsRightSkillTree(string skill, string target)
        {
            foreach(var ch in target)
            {
                if (skill.Contains(ch))
                {
                    if (skill.First() == ch)
                        return true;
                    else
                        return false;
                }
            }
            return true;
        }
        public int solution(string skill, string[] skill_trees)
        {
            int answer = 0;
            var list = new List<char>();
            foreach (var sk in skill_trees)
            {
                foreach (var ch in sk)
                {
                    if (skill.Contains(ch))
                        list.Add(ch);
                }
                var comp = new string(list.ToArray());
                if (IsRightSkillTree(skill, comp))
                    answer++;
                list.Clear();
            }
            return answer;
        }
    }

}
