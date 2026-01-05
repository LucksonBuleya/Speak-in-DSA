class HashTable:
    def __init__(self, input_string):
        # Remove leading/trailing whitespace and convert to lowercase
        self.input_string = input_string.strip().lower()
        
        # Split the string into words
        self.words = self.input_string.split()
        
        # Create a dictionary mapping characters to their respective weights
        self.char_to_weight = {chr(i): i - ord('a') + 1 for i in range(ord('a'), ord('z') + 1)}
        
        # Initialize an empty hash table (dictionary)
        self.hash_table = {}
        
        # Calculate the length of the string (excluding spaces)
        self.string_length = len(self.input_string.replace(" ", ""))
        
        # Populate the hash table
        self.create_hash_table()

    def hash_function(self, word):
        word_weight = sum(self.char_to_weight.get(char, 0) for char in word)
        return word_weight % self.string_length

    def create_hash_table(self):
        for word in self.words:
            hash_value = self.hash_function(word)
            if hash_value in self.hash_table:
                self.hash_table[hash_value].append(word)
            else:
                self.hash_table[hash_value] = [word]

    def display(self):
        print("Hash Table:")
        for key, value in self.hash_table.items():
            if len(value) > 1:
                print(f"Hash {key}: {value} ---- Collision")
            else:
                print(f"Hash {key}: {value}")

# example
input_string = "I LOVE DATA"
hash_table = HashTable(input_string)
hash_table.display()