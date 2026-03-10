#include<stdio.h>
#include<string.h>

void convertdigittoword(int n)
{
    const char *ones[] = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };
    const char *tens[] = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    if (n == 0) {
        printf("Zero\n");
        return;
    }
    if (n < 0 || n > 9999) {
        printf("Please enter a number between 0 and 9999\n");
        return;
    }
    if (n >= 1000) {
        int thousand = n / 1000;
        printf("%s Thousand ", ones[thousand]);
        n %= 1000;
    }
    if (n >= 100) {
        int hundred = n / 100;
        printf("%s Hundred ", ones[hundred]);
        n %= 100;
    }
    if (n > 0) {
        if (n < 20) {
            printf("%s", ones[n]);   
        } else {
            printf("%s", tens[n / 10]);
            if (n % 10) {
                printf(" %s", ones[n % 10]);
            }
        }
    }
    printf("\n");
}

int main()
{
    int n;
    scanf("%d", &n);
    convertdigittoword(n);
    return 0;
}