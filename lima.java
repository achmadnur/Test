import java.util.*;

public class lima {
  public static long ff(char[][] m, int r, int c){
    if (r<0 || r>=m.length) return 0;
    if (c<0 || c>=m[0].length) return 0;
    if (m[r][c]!='.') return 0;

    long ret = 1;
    m[r][c] = '#';
    ret += ff(m,r+1,c);
    ret += ff(m,r-1,c);
    ret += ff(m,r,c+1);
    ret += ff(m,r,c-1);
    return ret;
  }

  void solve(){
    Scanner scan = new Scanner(System.in);

    int nTC = scan.nextInt();
    while (nTC-- > 0){
      int R = scan.nextInt();
      int C = scan.nextInt();

      char[][] m = new char[R][];
      for (int i=0; i<R; i++)
        m[i] = scan.next().toCharArray();

      long res = 0;
      for (int i=0; i<R; i++)
        for (int j=0; j<C; j++)
          if (m[i][j]=='.'){
            long c = ff(m,i,j);
            res += (c*(c-1))/2;
          }

      System.out.println(res);
    }
  }

  public static void main(String[] args){
    new lima().solve();
  }
}