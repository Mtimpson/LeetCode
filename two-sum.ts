// Leet Code Problem 1: Two Sum

// Brute Force Solution - O(n^2)
function twoSumBruteForce(nums: number[], target: number): number[] {
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j <nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return [i, j];
            }
        }
    }
    return null;
};

// One-pass Hash Table - O(n)
function twoSumOnePass(nums: number[], target: number): number[] {
    let myMap = new Map<number, number>();
    for (let i = 0; i < nums.length; i++) {
        let complement = target - nums[i];

        if (myMap.has(complement)) {
            return [myMap.get(complement), i];
        }

        myMap.set(nums[i], i);
    }
    return null;
}
