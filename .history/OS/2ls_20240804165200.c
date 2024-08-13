#include<stdio.h>
#include<dirent.h>
int main(int argc, char *argv[])
{
DIR *dirop;
struct dirent *dired;
if(argc!=2)
{
printf("Invalid no of argument");
}
if((dirop=opendir(argv[1]))==NULL)
printf("cannot open the directory");
while((dired=readdir(dirop))!=NULL)
printf("%ld %s\n", dired->d_ino,dired->d_name);
closedir(dirop);

}