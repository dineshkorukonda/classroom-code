#include <stdio.h>
#include <string.h>

void checkpanagram(char str[])
{
    int freq[26] = {0};

    for(int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] >= 'a' && str[i] <= 'z')
            freq[str[i] - 'a'] = 1;

        else if(str[i] >= 'A' && str[i] <= 'Z')
            freq[str[i] - 'A'] = 1;
    }
    for(int i = 0; i < 26; i++)
    {
        if(freq[i] == 0)
        {
            printf("Not Pangram");
            return;
        }
    }

    printf("Pangram");
}

int main()
{
    char str[256];
    fgets(str, sizeof(str), stdin);
    checkpanagram(str);
}