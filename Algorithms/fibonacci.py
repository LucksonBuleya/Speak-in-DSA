def fibonacci(n):
    """
    Generate the first n numbers in the Fibonacci sequence.
    
    Args:
        n: The number of Fibonacci numbers to generate
        
    Returns:
        A list containing the first n Fibonacci numbers
    """
    # Initialize the list with the first two Fibonacci numbers (0 and 1)
    # These serve as the base cases for the sequence

    fib = [0,1]
    for i in range(2, n):
        fib.append(fib[i-1] + fib[i-2])
    return fib[:n]

# Test the function by generating the first 10 Fibonacci numbers
# Expected output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
print(fibonacci(10))
