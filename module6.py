#-------------------------------------------------------------------------------
# Name:        module6
# Purpose:
#
# Author:      Swadhyaya
#
# Created:     19/12/2016
# Copyright:   (c) Swadhyaya 2016
# Licence:     <your licence>
#-------------------------------------------------------------------------------
dp={}
dp[0]=0
def min_coins(coins,sum):
    if sum==0: return 0
    for coin in coins:
        if coin<=sum:
            min_coins(coins,sum-coin)

def main():
    coins=[1,3,5]
    min_coin(coins,11)

if __name__ == '__main__':
    main()
