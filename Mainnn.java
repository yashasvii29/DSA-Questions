 
 for(int i=0;i<n; i++){

    for(int j=0; j<n; j++){

        s_s[i][j] = parth.nextInt();

        r[i][j] = s_s[i][j];

    }

}

s_s(s_s,0,0);

}

static boolean f_r = true;

public static void s_s(int [][] s_s, int c_r, int c_c) {



if(c_c == s_s.length) {

    c_r++;

    c_c=0;

}



if(c_r == s_s.length) {

    f_a(s_s);

    f_r = false;

    return;

}



if(f_r == false)

    return;

if(s_s[c_r][c_c]!=0)

    s_s(s_s,c_r,c_c+1);



for(int i=1; i<=s_s.length;i++) {

    if(s_s[c_r][c_c]==0 && c_3(s_s, c_r, c_c, i) && c_9(s_s, c_r, c_c, i)) {

        s_s[c_r][c_c] = i;

        s_s(s_s, c_r, c_c+1);

        s_s[c_r][c_c] = 0;

    }

}



}






public static boolean c_3(int [][]s_s, int r, int c, int v) {
int ck_r = (r/3)*3;

int ck_c = (c/3)*3;

for(int i=ck_r; i<ck_r+3;i++) {

    for(int j=ck_c; j<ck_c+3;j++) {

        if(s_s[i][j] == v)

            return false;

    }

}

return true;

}









public static boolean c_9(int [][]s_s, int r, int c, int v) {

for(int i=0; i<s_s.length;i++) {

    if(s_s[i][c]==v)


        return false;

    if(s_s[r][i]==v)

        return false;

}

return true;

}







public static void f_a(int [][] r){

for(int i=0; i<r.length;i++){

    for(int j=0; j<r[0].length;j++)

        System.out.print(r[i][j]+" ");

    System.out.println();

}

}