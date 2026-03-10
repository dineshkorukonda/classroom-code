#include<stdio.h>
#include<string.h>

void findsmallorlarge(char *str)
{
    int i = 0, j = 0;
    char word[256];
    char smallest[256], largest[256];
    int min = 1000, max = 0;
    while(1)
    {
        if(str[i] == ' ' || str[i] == '\0')
        {
            word[j] = '\0';
            int len = strlen(word);
            if(len > 0)
            {
                if(len < min)
                {
                    min = len;
                    strcpy(smallest, word);
                }

                if(len > max)
                {
                    max = len;
                    strcpy(largest, word);
                }
            }
            j = 0;
            if(str[i] == '\0')
                break;
        }
        else
        {
            word[j++] = str[i];
        }
        i++;
    }
    printf("Smallest word: %s\n", smallest);
    printf("Largest word: %s\n", largest);
}

int main()
{
    char str[256];
    fgets(str, sizeof(str), stdin);
    str[strcspn(str,"\n")] = '\0';
    findsmallorlarge(str);
}