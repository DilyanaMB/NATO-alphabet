student_dict = {
    "student": ["Angela", "James", "Lily"],
    "score": [56, 76, 98]
}

#Looping through dictionaries:
for (key, value) in student_dict.items():
    #Access key and value
    pass

import pandas
student_data_frame = pandas.DataFrame(student_dict)

#Loop through rows of a data frame
for (index, row) in student_data_frame.iterrows():
    #Access index and row
    #Access row.student or row.score
    pass

# Keyword Method with iterrows()
# {new_key:new_value for (index, row) in df.iterrows()}

nato_alphabet_df = pandas.read_csv("nato_phonetic_alphabet.csv")

nato_alphabet_dict= {raw.letter:raw.code for (index, raw) in nato_alphabet_df.iterrows()}

def generate_phonetic():
    user_word = input("Enter a word: ").upper()
    try:
        user_letters = [nato_alphabet_dict[letter] for letter in user_word]
    except KeyError:
        print('Sorry, only letters in the alphabet please.')
        generate_phonetic()
    else:
        print(user_letters)

generate_phonetic()