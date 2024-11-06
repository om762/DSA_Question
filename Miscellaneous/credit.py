def get_card_type(card_number: int) -> str:
    # Convert the card number to a string for easy processing
    card_str = str(card_number)
    
    # Step 1: Implement Luhn's algorithm to validate the card number
    sum_digits = 0
    count = len(card_str)
    
    # Traverse the digits from right to left
    for i in range(count - 1, -1, -1):
        digit = int(card_str[i])
        # Even index (counting from 0) for the Luhn algorithm: double the digit and add the sum of digits if the result is >= 10
        if (count - i) % 2 == 0:
            product = digit * 2
            if product >= 10:
                sum_digits += product % 10 + product // 10
            else:
                sum_digits += product
        else:
            sum_digits += digit
    
    # If sum of digits modulo 10 is not zero, the card is invalid
    if sum_digits % 10 != 0:
        return "INVALID"
    
    # Step 2: Determine card type based on the number of digits and starting digits
    # Get the first two digits of the card number
    first_two_digits = int(card_str[:2])
    
    # Determine the card type based on length and starting digits
    if count == 13 and card_str[0] == '4':
        return "VISA"
    elif count == 16:
        if first_two_digits >= 51 and first_two_digits <= 55:
            return "MASTERCARD"
        elif card_str[0] == '4':
            return "VISA"
    elif count == 15 and (first_two_digits == 34 or first_two_digits == 37):
        return "AMEX"
    
    # If none of the conditions match, return INVALID
    return "INVALID"
