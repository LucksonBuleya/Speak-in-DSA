import string

def is_palindrome(text):
    # Convert to lowercase and remove non-alphanumeric characters
    cleaned_text = ''.join(char.lower() for char in text if char.isalnum())
    # Check if cleaned text equals its reverse
    return cleaned_text == cleaned_text[::-1]

def main():
    print("Palindrome Checker ")
    print("Type 'quit' to exit.\n")
    
    while True:
        text = input("Enter a word or phrase: ")
        if text.lower() == 'quit':
            print("Goodbye!")
            break
        
        if is_palindrome(text):
            print(f"Exactly, '{text}' is a palindrome!\n")
        else:
            print(f"'{text}' is not a palindrome.\n")

if __name__ == "__main__":
    main()
