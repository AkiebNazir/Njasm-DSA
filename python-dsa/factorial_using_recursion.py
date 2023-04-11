
import time
def num_fact(num):
    if num == 1:
        return 1
    return num * num_fact(num-1)

def num_fact_for(num):
    result = 1
    for i in range(1, num+1):
        result *= i
    return result

start = time.time()
num_fact(500)
end = time.time()
print(f"time taken recursive: {end-start}")

start = time.time()
num_fact_for(500)
end= time.time()
print(f"time taken recursive: {end-start}")


