def search_for_longest_substring(s:str) -> int:
    longest = 0
    seen = dict()
    start = 0
    for i in range(len(s)):
        char = s[i]
        if char in seen:
            start = max(start, seen[char])
        longest = max(longest, i-start+1)
        seen[char] = i + 1
    return longest
s = "weatamhe"
count_string = search_for_longest_substring(s)
print(count_string)