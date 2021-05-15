#include<stdio.h>
int main(int c,char *s[])
{
char a[16];
FILE *f1;
FILE*f2;
char g;
int x;
if(c!=2) 
{
printf("Usage :  LineItUp <name of the file>");
return 0;
}
f1=fopen(s[1],"r");
f2=fopen("tmp.tmp","w");
x=0;
while(1)
{
g=fgetc(f1);
if(feof(f1)) break;
if(g=='\r' || g=='\n') continue;
fputc(g,f2);
x++;
}
sprintf(a,"\r\n Length: %d",x);
fputs(a,f2);
fclose(f1);
fclose(f2);
printf("File contents flattened and saved to tmp.tmp");
return 0;
}
