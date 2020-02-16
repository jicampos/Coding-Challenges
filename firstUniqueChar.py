def firstUniqueChar(a_str):
	"""Given a string, find the first non-repeating 
	character and return its index. Otherwise return -1."""
	char_dict = {}

	for i, char in enumerate(a_str):
		if char in char_dict.keys():
			return char_dict[char]
		else:
			char_dict[char] = i

	return -1

if __name__ == "__main__":
	print(firstUniqueChar("abscaaaaa"))
	print(firstUniqueChar("Testing"))