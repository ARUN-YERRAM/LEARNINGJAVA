#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>

int main() {
    int res;
    res = open("fifo1", O_WRONLY);
    if (res < 0) {
        perror("open");
        return 1;
    }
    write(res, "Message", 7);
    printf("Sender Process having PID %d, sent the data\n", getpid());
    close(res);
    return 0;
}
