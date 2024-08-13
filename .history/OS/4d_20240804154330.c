// d) Write a C program that illustrate the suspending and resuming process using signal
// PROGRAM:

#include<stdio.h>
#include<signal.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<unistd.h>


int main(){
    int pid = fork();
    if(pid == -1)printf("\n Child not created");

    if(pid == 0)printf("\n child created");

    else{
        printf("\n parent process\n");
        kill(pid,SIGSTOP);
        sleep(5);
        kill(pid,SIGCONT);
        sleep(10);
        printf("\n Parent got control back");
        kill(pid,SIGKILL);
        wait(NULL);
        return 0;
    }
}