#include <stdio.h>
#include <string.h>

void reverse(char *start, char *end) {
    while(start < end) {
        char temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

void reverseWords(char str[]) {
    char *word_start = str;
    char *temp = str;

    while(*temp) {
        if(*temp == ' ' || *temp == '\0') {
            reverse(word_start, temp - 1);
            word_start = temp + 1;
        }
        temp++;
    }
    reverse(word_start, temp - 1);
}

int main() {
    char str[200];
    fgets(str, sizeof(str), stdin);

    reverseWords(str);
    printf("%s", str);

    return 0;
}