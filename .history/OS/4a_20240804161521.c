// // Experiment 4
// // a) Write a C program that illustrate communication between two unrelated process using named pipes
// // PROGRAM:
// // Mkfifo.c To create a named pipe
// #include<stdio.h>
// #include<sys/types.h>
// #include<sys/stat.h>
// int main()
// {
//     int res;
//     res = mkfifo("fifol", 0777); //creates a named pipe with the name fifol printf("named pipe created\n");
// }


// // Sender.c

// #include <unistd.h>
// #include <stdio.h>
// #include <fcntl.h>
// int main() {
// int res;
// res=open("fifol",O_WRONLY);
// write(res, "Message",7);
// printf("Sender Process having PID %d, sent the data\n",getpid());
// }

// // Receiver.c
// #include <unistd.h>
// #include <stdio.h>
// #include <fcntl.h>
// int main() {
// int res,n;
// char buffer[100];
// res=open("fifo1", O_RDONLY);
// n=read(res, buffer, 100);
// printf("Reader process having PID %d started\n",getpid());

// printf("Data received by reciever %d is : %s\n",getpid(),buffer);

// }




#include <stdio.h>
#include <sys/types.h>
#include <sys/stat.h>

int main() {
    int res;
    res = mkfifo("fifo1", 0777); // Creates a named pipe with the name fifo1
    if (res == 0) {
        printf("Named pipe created successfully\n");
    } else {
        perror("mkfifo");
    }
    return 0;
}



