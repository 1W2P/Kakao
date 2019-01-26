package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author manki.kim
 */
public class SkillTree {

	public int solution(String skill, String[] skill_trees) {
		List<String> skillTrees = new ArrayList<>(Arrays.asList(skill_trees));
		Iterator<String> it = skillTrees.iterator();

		skillTrees.removeIf(sk -> sk.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0);

		return skillTrees.size();
	}
}
