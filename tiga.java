import java.util.*;
public class tiga{
public static void main(String[] args){
String[][] hallo = {{"*", "*", "*"}, {"*", "*", "*"},
{"*", "*", "*"}};
for(int i=0; i<3; i++)
{
for(int j=0; j<3;)
{
System.out.print
(hallo[i][j++]+"  "+hallo[i][j++]+"  "+hallo[i][j++]+"\n");
}}
}}