#include<stdio.h>
int main(){
    int marks[100];
    int total = 0, max = 0;
    int n, i, choice;
    float avg;

    printf("Enter choice (1-Enter, 2-Average, 3-Max): ");
    scanf("%d", &choice);

    switch(choice){

        case 1:
            printf("Enter number of students: ");
            scanf("%d", &n);
            total = 0;

            for(i = 0; i < n; i++){
                printf("Enter marks of student %d: ", i+1);
                scanf("%d", &marks[i]);
                total += marks[i];
            }
            break;

        case 2:
            printf("Enter number of students: ");
            scanf("%d", &n);
            total = 0;

            for(i = 0; i < n; i++){
                printf("Enter marks of student %d: ", i+1);
                scanf("%d", &marks[i]);
                total += marks[i];
            }

            avg = (float)total / n;
            printf("Average marks: %.2f\n", avg);
            break;

        case 3:
            printf("Enter number of students: ");
            scanf("%d", &n);

            for(i = 0; i < n; i++){
                printf("Enter marks of student %d: ", i+1);
                scanf("%d", &marks[i]);
            }

            max = marks[0];
            for(i = 1; i < n; i++){
                if(marks[i] > max){
                    max = marks[i];
                }
            }

            printf("Maximum marks: %d\n", max);
            break;

        default:
            printf("Invalid choice");
    }

    return 0;
}