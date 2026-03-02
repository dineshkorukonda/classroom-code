#include <stdio.h>

int areBracketsValid(char str[]) {
    char stack[200];
    int top = -1;

    for(int i = 0; str[i]; i++) {
        if(str[i] == '{')
            stack[++top] = '{';
        else if(str[i] == '}') {
            if(top == -1)
                return 0;
            top--;
        }
    }

    return (top == -1);
}

int main() {
    char str[200];
    fgets(str, sizeof(str), stdin);

    if(areBracketsValid(str))
        printf("Valid\n");
    else
        printf("Invalid\n");

    return 0;
}