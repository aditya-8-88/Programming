def read_segments():
    # Read 7-segment digits from the input
    return [input() for _ in range(3)]

def get_digit_mapping():
    # Create a mapping of the digits from the first 3x9 matrix input
    digit_mapping = {}

    for digit in range(10):
        digit_representation = [
            SEGMENTS[i][digit * 3: digit * 3 + 3] for i in range(3)
        ]
        digit_mapping[digit] = digit_representation

    return digit_mapping

def find_possible_numbers(led_input, digit_mapping):
    num_digits = len(led_input[0]) // 3  # Number of digits in the input
    total_sum = 0
    all_valid = True

    for digit_index in range(num_digits):
        # Extract the 3x3 matrix for the current digit
        digit_segment = [
            led_input[i][digit_index * 3: digit_index * 3 + 3] for i in range(3)
        ]

        # Check if the segment matches or can toggle to a valid digit
        possible_digits = []
        for digit, original_segment in digit_mapping.items():
            # Count mismatched LEDs
            mismatch_count = sum(
                1 for i in range(3) for j in range(3)
                if digit_segment[i][j] != original_segment[i][j]
            )
            if mismatch_count <= 1:  # Allow up to 1 mismatch (toggling 1 LED)
                possible_digits.append(digit)

        # If no valid digit can be formed, it's invalid
        if not possible_digits:
            return "Invalid"

        # Update the total sum based on possible numbers
        total_sum += sum(
            num * (10 ** (num_digits - digit_index - 1))
            for num in possible_digits
        )

    return total_sum

# Read inputs
SEGMENTS = read_segments()
DIGIT_MAPPING = get_digit_mapping()
LED_INPUT = read_segments()

# Solve the problem
result = find_possible_numbers(LED_INPUT, DIGIT_MAPPING)
print(result)
