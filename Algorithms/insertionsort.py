def insertion_sort(arr):
    """
        Sorts a list in ascending order using the Insertion Sort algorithm.

        - It builds the final sorted array one item at a time.
        - It is efficient for small or nearly sorted datasets.

        Time Complexity:
            Best Case: O(n)      --> when the list is already sorted
            Average Case: O(n^2)
            Worst Case: O(n^2)   --> when the list is reverse sorted

        Space Complexity:
            O(1) --> Sorting is done in place (no extra list created)

        :param arr: List of comparable elements (numbers, etc.)
        :return: None (the list is sorted in place)
        """

    for i in range(1, len(arr)):

        # The current element we want to insert into the sorted portion
        key = arr[i]

        # Index of the last element in the sorted portion of the array
        j = i - 1

        # Move elements of arr[0..i-1], that are greater than 'key',
        # one position to the right to make space for 'key'
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1

        # Place the key in its correct sorted position    
        arr[j + 1] = key

#  Example usage
if __name__ == "__main__":
    arr = [10, 7, 2, 8, 6, 5]
    insertion_sort(arr)
    print("Sorted array is:", arr)
