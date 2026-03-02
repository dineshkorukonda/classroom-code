#include <stdio.h>
#include <string.h>

int countSubstring(char mainStr[], char subStr[]) {
    int count = 0;
    int mainLen = strlen(mainStr);
    int subLen = strlen(subStr);

    for(int i = 0; i <= mainLen - subLen; i++) {
        if(strncmp(&mainStr[i], subStr, subLen) == 0)
            count++;
    }

    return count;
}

int main() {
    char mainStr[200], subStr[100];
    scanf("%s %s", mainStr, subStr);

    int result = countSubstring(mainStr, subStr);

    if(result > 0)
        printf("Found %d times\n", result);
    else
        printf("Not Found\n");

    return 0;
}