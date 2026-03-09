#include <stdio.h>
#include <string.h>

void longestsubstring(char *str)
{
    int freq[256] = {0};
    int start = 0;
    int max = 0;
    for(int end = 0; str[end] != '\0'; end++)
    {
        freq[str[end]]++;
        while(freq[str[end]] > 1)
        {
            freq[str[start]]--;
            start++;
        }
        int len = end - start + 1;
        if(len > max)
            max = len;
    }
    printf("%d\n", max);
}

int main()
{
    char str[256];
    fgets(str, sizeof(str), stdin);
    str[strcspn(str,"\n")] = '\0';
    longestsubstring(str);
}