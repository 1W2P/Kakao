class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] skillArr = skill.split("");

        for (String skillTree : skill_trees) {
            int beforeIndex = -1;
            int afterIndex = -1;
            for (String s : skillArr) {
                beforeIndex = afterIndex;
                afterIndex = skillTree.indexOf(s);
                if(afterIndex == -1) afterIndex = skillTree.length() + 1;
                if(beforeIndex > afterIndex) break;
            }
            if(beforeIndex <= afterIndex) answer++;
        }

        return answer;
    }
}
