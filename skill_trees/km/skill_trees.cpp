#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(string skill, vector<string> skill_trees)
{
	int answer = 0;

	int tree_size = skill_trees.size();

	for (auto i = 0; i < tree_size; ++i)
	{
		auto current = 0;
		auto skill_tree_size = skill_trees[i].size();

		for (auto j = 0; j < skill_tree_size; ++j)
		{
			auto iter = find(skill.begin(), skill.end(), skill_trees[i][j]);

			if (iter != skill.end())
			{
				if (*iter == skill[current])
				{
					current++;
				}
				else if (*iter != skill[current])
				{
					break;
				}
			}

			if (j == skill_tree_size - 1)
			{
				answer++;
			}
		}
	}

	return answer;
}

int main(void)
{
	vector<string> skill_trees;

	skill_trees.push_back("BACDE");
	skill_trees.push_back("CBADF");
	skill_trees.push_back("AECB");
	skill_trees.push_back("BDA");

	printf("%d\n", solution("CBD", skill_trees));

	return 0;
}