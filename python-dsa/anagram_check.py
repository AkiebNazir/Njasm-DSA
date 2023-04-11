# check whether all the characters are present in both the strings

def check_anagram(s1, s2):
    if len(s1) != len(s2):
        return False
    # dictionaries has a property we can't use duplicate keys in a dictionary
    d1 = dict()
    d2 = dict()

    for c in s1:
        d1[c] = d1[c] + 1 if c in d1 else 1
    for c in s2:
        d2[c] = d2[c] + 1 if c in d2 else 1

    for key in d1:
        if d1[key] != d2[key]:
            return False
    
    return True

if '__main__' == __name__:
    s1, s2 = "aakib", "baika"
    print(check_anagram(s1, s2))