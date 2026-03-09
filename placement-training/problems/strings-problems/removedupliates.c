#include <stdio.h>
#include<string.h>


void removechar(char * str)
{
    for(int i = 0; str[i] != '\0' ; i++)
    {
        if(str[i]!=str[i+1])
        printf("%c",str[i]);
    }
}
int main()
{
    char str[256];
    fgets(str,sizeof(str),stdin);
    removechar(str);
    
}