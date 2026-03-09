#include <stdio.h>
#include<string.h>
void removesubstring(char * str1, char * str2)
{
    int len2 = strlen(str2);
    int n = 0;
    char* ptr = strstr(str1, str2);
    if (ptr != NULL) {
        n = ptr-str1;
    }
    for(int i = 0; str1[i] != '\0'; i++)
        {
            if(i >= n && i < n+len2)
            {
                continue;
            }
            printf("%c", str1[i]);
        }
        printf("\n");
}
int main()
{
    char str1[256];
    char str2[256];
    fgets(str1,sizeof(str1),stdin);
    scanf("%s",str2);
    removesubstring(str1, str2);
}