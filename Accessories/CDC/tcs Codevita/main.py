def find_matching_digits(valid_mapping, faulty_digit):   
    possible_digits = []
    for digit, valid in valid_mapping.items():     
        mismatch_count = sum(1 for a, b in zip(faulty_digit, valid) if a != b)
        if mismatch_count == 0:
            possible_digits.append(digit)
        elif mismatch_count == 1:  
            possible_digits.append(digit)
    return possible_digits


def compute_total_sum():    
    segment_digits = [input().strip() for _ in range(3)]  
    faulty_segments = [input().strip() for _ in range(3)]   
   
    valid_mapping = {}
    for i in range(10):
        valid_mapping[i] = ''.join(segment_digits[j][i*3:(i+1)*3] for j in range(3))   
   
    faulty_number_digits = []
    for i in range(len(faulty_segments[0]) // 3):
        faulty_digit = ''.join(faulty_segments[j][i*3:(i+1)*3] for j in range(3))
        possible_digits = find_matching_digits(valid_mapping, faulty_digit)
        if not possible_digits:
            print("Invalid", end='')
            return
        faulty_number_digits.append(possible_digits) 


    from itertools import product
    total_sum = 0
    for digit_combination in product(*faulty_number_digits):
        total_sum += int(''.join(map(str, digit_combination)))    
    print(total_sum, end='')

compute_total_sum()
