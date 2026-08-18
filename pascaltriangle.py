
# # Pascal's Triangle

# n = int(input("Enter the number of rows: "))

# for i in range(n):
#     num = 1
#     for j in range(n - i - 1):
#         print(" ", end="")

#     for j in range(i + 1):
#         print(num, end=" ")
#         num = num * (i - j) // (j + 1)

#     print()
    
# Fibonacci Series
# n = int(input("Enter the number of terms: "))
# a, b = 0, 1
# for i in range(n):
#     print(a, end=" ")
#     a, b = b, a + b
    
#reversing a list.
# maximum frequency character in a string.
#wap to create a tuple of values inputed by user 
# WAP in python to create a phone directory
# wap a program to create a list of values inputed by user and sort in incresing order 

# a=int(input("Enter the number of values in the list: "))
# list1 = []
# for i in range(a):
#     value = int(input("Enter value {}: ".format(i + 1)))
#     list1.append(value)
# list1.sort()
# print("The sorted list is:", list1)
 
    
    # Phone Directory

# a = int(input("Enter the number of contacts in the phone directory: "))

# phone_directory = {}

# for i in range(a):
#     name = input("Enter contact name {}: ".format(i + 1))
#     phone_number = input("Enter phone number for {}: ".format(name))

#     phone_directory[name] = phone_number

#     if i < a - 1:
#         value = input("Do you want to add another contact? (yes/no): ")

#         if value.lower() != "yes":
#             break

# print("\nPhone Directory:")
# for name, phone_number in phone_directory.items():
#     print(name, ":", phone_number)



# maximum frequency character in a string.

# Maximum frequency character in a string

text = input("Enter a string: ")

frequency = {}

for char in text:
    frequency[char] = frequency.get(char, 0) + 1

max_char = max(frequency, key=frequency.get)

print("Maximum frequency character:", max_char)
print("Frequency:", frequency[max_char])
