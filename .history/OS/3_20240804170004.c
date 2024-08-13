#include<stdio.h>
int main() {
int bt[10]={0},at[10]={0},tat[10]={0},wt[10]={0},ct[10]={0}; int n,sum=0;
float totalTAT=0,totalWT=0;
printf("Enter number of processes "); scanf("%d",&n);
printf("Enter arrival time and burst time for each process\n\n");
for(int i=0;i<n;i++) {
printf("Arrival time of process[%d] ",i+1); scanf("%d",&at[i]);
printf("Burst time of process [%d] ",i+1); scanf("%d",&bt[i]);
printf("\n");
}
//calculate finish time of processes
for(int j=0;j<n;j++)