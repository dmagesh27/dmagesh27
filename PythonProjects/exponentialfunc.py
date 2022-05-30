def exponen(base, pow):
    result=1
    for index in range(pow):
        result=result*base
    return result

print(exponen(2, 4))