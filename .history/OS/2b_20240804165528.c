b) Write a C program to create child process and allow parent process to display "parent" and the child to display "child" on the screen
PROGRAM:
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>
int main()
{
pid_tret_value; printf("\nThe process id is %d\n",getpid()); ret_value fork(); if(ret_value<0)
{
//fork has failed printf("\nFork Failure\n");
} else if(ret_value = 0)
{
//child process
printf("\nChild Process\n"); printf("The process id is %d\n",getpid()); sleep(20);
else
{
//parent process wait(NULL); printf("Parent Process\n"); printf("The process id is %d\n",getpid()); sleep(30);
} return 0;
}