#include <stdio.h>
#include <string.h>

void wordcount(char str[])
{
    int count = 0;

    for(int i = 0; str[i] != '\0'; i++)
    {
        if((i == 0 && str[i] != ' ') || (str[i] != ' ' && str[i-1] == ' '))
        {
            count++;
        }
    }

    printf("%d\n", count);
}

int main()
{
    char str[256];
    fgets(str, sizeof(str), stdin);
    wordcount(str);
}