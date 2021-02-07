#3
def adder(*args):
    print('adder',end='')
    sum = args[0]
    for next in args[1:]:
        sum += next
    return sum

# for func in (adder):
print(adder(2,3,4))
print(adder('spqm','eggs','zhuzhitian'))
print(adder(['a','b'],(['c','d'],(['e','f']))))