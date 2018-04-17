/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    
    int i;
    char *input = "ReverseME";
    char temp;
    int count = 0; 
    while(*input != '\0'){
    printf("%c",*input);
    input++;
    count++;
    }
    
    //this is printing the reverse 
   // printf("\n");
    //while(count-- !=0){
    //input--;
    //printf("%c",*input);
    //}
    //to change the string itself
    while(count--!=0){
        input--;
        temp = *input;
        *input = 
    }
    return 0;
}
