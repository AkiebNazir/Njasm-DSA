print("Frequecy Counter uses python Dictionary to reduce time complexiy from O(n2) --> O(n)")


def freq_count(l1:list, l2:list) -> bool:
    if len(l1) != len(l2):
        return False
    d_l1 = dict()
    d_l2 = dict()
    for v1 in l1:
        d_l1[v1] = d_l1[v1] + 1 if v1 in d_l1 else 1
    for v2 in l2:
        d_l2[v2] = d_l2[v2] + 1 if v2 in d_l2 else 1
    print(d_l1)
    print(d_l2)
    for key, value in d_l1.items():
        if d_l2[(key ** 2)] != value:
            return False
    return True

l1 = [1,1,1,1,1]
l2 = [1,1,1,1,1]

print(freq_count(l1, l2))

print("I am here")