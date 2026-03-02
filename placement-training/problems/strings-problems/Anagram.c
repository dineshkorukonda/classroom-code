#include <stdio.h>
#include <string.h>

int isAnagram(char a[], char b[]) {
    if(strlen(a) != strlen(b))
        return 0;

    int count[256] = {0};

    for(int i = 0; a[i]; i++) {
        count[a[i]]++;
        count[b[i]]--;
    }

    for(int i = 0; i < 256; i++)
        if(count[i] != 0)
            return 0;

    return 1;
}

int main() {
    char str1[100], str2[100];
    scanf("%s %s", str1, str2);

    if(isAnagram(str1, str2))
        printf("Anagram\n");
    else
        printf("Not Anagram\n");

    return 0;
}