#include<stdio.h>

int main(){

    int n, m;

    printf("Enter the number of days andproducts:");

    scanf("%d %d", &m, &n);
     int arr[m][n];

    for(int j=0;j<m;j++){
        printf("Enter day %d 's sales: \n",(j+1));
        for(int i=0;i<n;i++){
             printf("Revenue by productscanf %d:", (i+1)); 
             scanf("%d",&arr[j][i]);
             }
         }
    
     for(int j=0;j<m;j++){
         for(int i=0; i<n;i++){
             if (arr[j][0] < arr[j][i]) { arr[j][0] = arr[j][i];
            }
        }

    printf("The highest revenue on day %d= %d", (j+1), arr[j][0]);
}