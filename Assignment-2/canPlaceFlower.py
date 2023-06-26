def canPlaceFlowers(flowerbed, n):
    count = 0
    size = len(flowerbed)
    i = 0

    while i < size:
        if (
            flowerbed[i] == 0
            and (i == 0 or flowerbed[i - 1] == 0)
            and (i == size - 1 or flowerbed[i + 1] == 0)
        ):
            count += 1
            flowerbed[i] = 1
            i += 1

        if count >= n:
            return True

        i += 1

    return False
flowerbed = [1, 0, 0, 0, 1]
n = 1
print(canPlaceFlowers(flowerbed, n))