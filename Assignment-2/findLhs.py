from collections import Counter

def findLHS(nums):
    counter = Counter(nums)
    max_length = 0

    for num in counter:
        if num + 1 in counter:
            length = counter[num] + counter[num + 1]
            max_length = max(max_length, length)

    return max_length
nums = [1, 3, 2, 2, 5, 2, 3, 7]
print(findLHS(nums))