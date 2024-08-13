#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>

int main() {
    int res, n;
    char buffer[100];
    res = open("fifo1", O_RDONLY);
    if (res < 0) {
        perror("open");
        return 1;
    }
    n = read(res, buffer, 100);
    if (n < 0) {
        perror("read");
        close(res);
        return 1;
    }
    buffer[n] = '\0'; // Null terminate the string
    printf("Reader process having PID %d started\n", getpid());
    printf("Data received by receiver %d is: %s\n", getpid(), buffer);
    close(res);
    return 0;
}
