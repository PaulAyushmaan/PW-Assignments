function firstUniqChar(s) {
    const charCounts = new Map();
    for (let i = 0; i < s.length; i++) {
      const char = s[i];
      charCounts.set(char, (charCounts.get(char) || 0) + 1);
    }
    for (let i = 0; i < s.length; i++) {
      const char = s[i];
      if (charCounts.get(char) === 1) {
        return i;
      }
    }
      return -1;
  }
  console.log(firstUniqChar("leetcode"));
  console.log(firstUniqChar("loveleetcode")); 
  console.log(firstUniqChar("aabb"));