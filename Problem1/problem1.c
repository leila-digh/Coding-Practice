/************************************************************************************************/
/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
/************************************************************************************************/



#include <stdio.h>

int listCheck(int a[], int size, int k);

int main(){
    int a []= {10, 15, 3, 7};
    int k = 17;
    int size = sizeof(a) / sizeof(int);
    int flag = listCheck(a, size,k);

    if (flag) {
        printf("Pair found\n");
    } else {
        printf("No pair found\n");
    }

    return 0;
}

int listCheck(int a[], int size, int k){
    for(int i=0; i<size;i++){
        for(int j=i+1; j<size;j++){
            printf("checking: (%d,%d);\n",a[i],a[j]);
            if (a[i] + a[j] == k) {
                 printf("**(%d,%d) sum to k**\n\n",a[i],a[j]);
                 return 1; 
            }else{
                 printf("(%d,%d) do NOT sum to k\n\n",a[i],a[j]);
            }
        }   
    }

}

/************************************************************************************************/
/*my implementation:
    How it works: 
    (10,15); (10,3); (10,7);
    (15,3); (15,7); (3,7);
/************************************************************************************************/