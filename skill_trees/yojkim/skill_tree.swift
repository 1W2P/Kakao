import Foundation

func validateSkillTree(with skill: [Character], skillDict: [Character:Bool], skillTree: String) -> Bool {
    var stack = skill
    var dict = skillDict
    
    for s in skillTree {
        guard let top = stack.first else { return true }
        guard let _ = dict[s] else { continue }
        if s == top {
            stack.removeFirst()
        } else {
            return false
        }
    }
    return true
}

func solution(_ skill:String, _ skill_trees:[String]) -> Int {
    let skillArray = Array(skill)
    var skillDict = [Character:Bool]()
    for e in skillArray {
        skillDict[e] = true
    }
    
    return skill_trees
        .filter { validateSkillTree(with: skillArray, skillDict: skillDict, skillTree: $0) }
        .count
}