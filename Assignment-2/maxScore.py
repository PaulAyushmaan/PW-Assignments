def minimumScore(nums, k):
    min_num = float('inf')
    max_num = float('-inf')

    for num in nums:
        if num - k < min_num:
            min_num = num - k
        if num + k > max_num:
            max_num = num + k

    return 0 if min_num > max_num else max_num - min_num
nums = [1]
k = 0
print(minimumScore(nums, k))