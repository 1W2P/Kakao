import Foundation

func solution(_ a:[Int], _ b:[Int]) -> Int {
    var aTemp = a
    var bTemp = b
    var score = 0
    var aPt = 0
    var bPt = 0
    
    aTemp.sort()
    bTemp.sort()
    
    while aPt != aTemp.count && bPt != bTemp.count {
        if aTemp[aPt] < bTemp[bPt] {
            aPt += 1
            bPt += 1
            score += 1
        } else {
            bPt += 1
        }
    }
    return score
}

