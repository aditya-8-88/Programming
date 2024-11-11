MOD = 1_000_000_007

def get_num_perfect_packaging(prices):
    n = len(prices)
    if n == 0:
        return 0

    # dp[i][j] represents number of ways to label up to i with j as last label
    dp = [[0] * 6 for _ in range(n)]
    
    # Initialize dp for the first parcel
    for j in range(1, 6):
        dp[0][j] = 1

    # Fill the dp array
    for i in range(1, n):
        if prices[i] > prices[i - 1]:  # Current price is greater
            for j in range(2, 6):
                dp[i][j] = (dp[i][j] + sum(dp[i - 1][1:j])) % MOD
        elif prices[i] < prices[i - 1]:  # Current price is smaller
            for j in range(1, 5):
                dp[i][j] = (dp[i][j] + sum(dp[i - 1][j + 1:6])) % MOD
        else:  # Current price is equal
            for j in range(1, 6):
                dp[i][j] = (dp[i][j] + sum(dp[i - 1][k] for k in range(1, 6) if k != j)) % MOD

    # Sum up all the ways for the last parcel
    result = sum(dp[n - 1][1:6]) % MOD
    return result

# Main method for testing
if __name__ == "__main__":
    # Example test case 1
    prices1 = [1, 2, 3]
    print("Number of perfect packagings for prices1:", get_num_perfect_packaging(prices1))
    # Expected output: 10

    # Example test case 2
    prices2 = [3, 1 , 1]
    print("Number of perfect packagings for prices2:", get_num_perfect_packaging(prices2))
    # This will output the valid number of packagings based on the rules

    # Additional test case with descending values
    prices3 = [2]
    print("Number of perfect packagings for prices3:", get_num_perfect_packaging(prices3))
    # This will output the valid number of packagings based on the rules
