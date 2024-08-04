#include<stdio.h>
//#include<string.h>
int main(int argc, char *argv[])
{
int r;
if(argc<3)
printf("wrong arguments");
else
if(argc==3)
{
printf("\n%s %s\n",argv[1],argv[2]);
r=link(argv[1],argv[2]);
printf("%d\n",r);
unlink(argv[1]);
}
return 0;
}