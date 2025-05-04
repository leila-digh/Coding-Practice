/************************************************************************************************/
/* This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new 
array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5],
the expected output would be [120, 60, 40, 30, 24]. 

If our input was [3, 2, 1], the expected output would be [2, 3, 6].



/************************************************************************************************/


#include <stdio.h>

void productExceptI(int a[], int answer[], int size);
void printArray(int array[], int size);

int main(){
    int arr1[] = {3, 2, 1};
    int arr2[] = {1, 2, 3, 4, 5};
    int arr1size = sizeof(arr1) / sizeof(int);
    int arr2size = sizeof(arr2) / sizeof(int);

    int answer[10];

    productExceptI(arr1, answer, arr1size);
    printArray(answer,arr1size);
    
    
    productExceptI(arr2, answer, arr2size);
    printArray(answer,arr2size);

    return 0;

}

void productExceptI(int a[], int answer[], int size){
    for(int i=0; i < size; i++){
        int product = 1;
        for(int j=0; j < size; j++){
            if(i != j){
                product *= a[j];
        }
    }
    answer[i] = product;
}
}

void printArray(int array[], int size){
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

}


/************************************************************************************************/
/*my implementation:
    How it works: 
    array is [3, 2, 1]
    for each element(i) in array, until the end{
        intialise each time the product = 1; (not 0 because anything by zero is zero)
        for each element(j) in array, until the end{
                if that element j is NOT i
                    update product to be all j by whatever is currently in product so 
                    0; (not happening)
                    1; (product(1) * 2) = 2
                    2; (product(2) * 1) = 2 
            }

            answer[i] = procuct; (index 0 of answer is = 2)
            update i to 1 and the loop restarts.
    }

/************************************************************************************************/