#include<stdio.h>
#include<string.h>

void swap(char *a, char *b)
{
    char temp = *a;
    *a = *b;
    *b = temp;
}
void permutations(char *str, int l)
{
    int len = strlen(str);

    if(l == len)
    {
        printf("%s\n", str);
        return;
    }

    for(int i = l; i < len; i++)
    {
        swap(&str[l], &str[i]);
        permutations(str, l+1);
        swap(&str[l], &str[i]);
    }
}
int main()
{
    char str[256];
    fgets(str, sizeof(str), stdin);
    str[strcspn(str,"\n")] = '\0';
    permutations(str,0);
    return 0;
}