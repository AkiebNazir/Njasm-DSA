# find the pair of integers in an array/list whose sum equals to zero ....!
def find_pair(mylist):
    i = 0
    j = len(mylist)-1
    if j+1==0:
        return "List you passed is empty...!"
    while i < j:
        if mylist[i] + mylist[j] == 0:
            return f"Got the Pair at index {i, j}"
        elif mylist[i] + mylist[j] < 0:
            i += 1
        else:
            j -= 1
    return "Couldn't find any pair"


# get the unique element of the array/list ... !
def unique_elements(arr:list )-> list:
    arr_len = len(arr)
    i, j = 0, 1
    while  j < arr_len-1:
        if arr[i] == arr[j]:
            j += 1
        else:
            i += 1
            arr[i] = arr[j]
    arr = arr[:i+1]
    return arr




if "__main__" == __name__:
    mylist = [-100, -59, -50, -30, -10, -5, -2, 0, 30, 90]
    u_arr = [1,2, 3, 4, 5, 6, 7, 8,8, 8, 9, 19, 19, 19]
    print(find_pair(mylist))
    print(unique_elements(u_arr))