def alpha_char_count(s:str):
    r_dict = dict()
    for char in s:
        if char.isalnum() and char not in r_dict:
            r_dict[char] = 1
        elif char.isalnum() and char in r_dict:
            r_dict[char] += 1
        else:
            pass
    return r_dict

print(alpha_char_count("hello World 12343234"))
print("Done... !.... !")