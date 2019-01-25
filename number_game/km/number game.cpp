#include <algorithm>
#include <vector>

using namespace std;

int solution(vector<int> A, vector<int> B) 
{
	int answer = 0;

	sort(A.begin(), A.end());
	sort(B.begin(), B.end());

	int a_point = 0;
	int b_point = 0;
	int size = A.size();

	while (a_point != size && b_point != size)
	{
		if (A[a_point] < B[b_point])
		{
			a_point++;
			b_point++;
			answer++;
		}
		else
		{
			b_point++;
		}
	}

	return answer;
}

int main(void)
{
	vector<int> a;
	vector<int> b;

	// [5,1,3,7] [2,2,6,8]
	// [2,2,2,2] [1,1,1,1]

	a.push_back(5);
	a.push_back(1);
	a.push_back(3);
	a.push_back(7);

	b.push_back(2);
	b.push_back(2);
	b.push_back(6);
	b.push_back(8);


	printf("%d", solution(a, b));
	return 0;
}