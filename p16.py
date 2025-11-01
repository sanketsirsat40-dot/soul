s=input("Enter string: ")
v=0
for ch in s:
    if ch.lower() in "aeiou":
        v+=1
print("Vowel count =", v)
