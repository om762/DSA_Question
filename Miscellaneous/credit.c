#include <cs50.h>
#include <stdio.h>

int main(void)
{
    // Prompt the user for a long credit card number greater than zero.
    long num;
    do
    {
        num = get_long("Number: ");
    }
    while (num < 0);

    // Duplicate the copy of the number.
    long temp = num;

    // Sum of digits according to Luhn's algorithm, and count is the number of digits.
    int sum = 0;
    int count = 0;
    int product;

    while (num > 0)
    {
        // If the digit is at an even position from right to left.
        if (count % 2 == 0)
        {
            sum += num % 10;
        }

        // If the digit is at an odd position from right to left.
        else
        {
            product = 2 * (num % 10);

            if (product >= 10)
            {
                // if product is two digit then add first and second digit to sum.
                sum += product % 10; // Gives second digit
                sum += 1;            // first digit is alway one
            }

            else
            {
                sum += product;
            }
        }

        count++;
        num = num / 10; // Discard the last digit.
    }

    // Divide temp by 10 (count - 2) times to obtain the first_two_digit.
    for (int i = 0; i < count - 2; i++)
    {
        temp = temp / 10;
    }

    int first_two_digit = temp;

    // printf("Sum %i\n", sum);
    // printf("Count %i\n", count);
    // printf("First two digits: %i\n", first_two_digit);

    // Check if the card number is valid
    if (sum % 10 == 0)
    {
        // Determine card type based on starting digits
        if ((count == 13 || count == 16) && first_two_digit / 10 == 4)
        {
            printf("VISA\n");
        }
        else if (count == 16 && first_two_digit >= 51 && first_two_digit <= 55)
        {
            printf("MASTERCARD\n");
        }
        else if (count == 15 && (first_two_digit == 34 || first_two_digit == 37))
        {
            printf("AMEX\n");
        }
        else
        {
            printf("INVALID\n");
        }
    }
    else
    {
        printf("INVALID\n");
    }
}