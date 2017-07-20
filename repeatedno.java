package repeatedno;
import java.util.Scanner;
import java.util.*;
public class repeat{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=s.nextInt();
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[j]==a[i]){
System.out.println(a[j]);
}
}
}
}
}
