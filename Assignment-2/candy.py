def max_candies(candyType):
    unique_types = len(set(candyType))
    max_candies = len(candyType) // 2
    return min(unique_types,max_candies)
candyType = [1, 1, 2, 2, 3, 3]
print(max_candies(candyType))