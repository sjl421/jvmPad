//MVC Design Pattern, =>Model
//Title:CheckBoard
import java.io.*;
class CheckBoard
{
    private byte[][] mat;
    private int usr1,usr2;
    CheckBoard()
    {
        mat=new byte[8][8];
        usr1=0;
        usr2=0;
        for(int i=0;i<8;i++)
        {
            mat[0][i]=1;mat[7][i]=2;
        }
    }
    void print(PrintWriter out)
    {
        out.println("\t  1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t");
        for(int i=0;i<8;i++)
        {
            out.print("\t"+(i+1)+" ");
            for(int j=0;j<8;j++)
            {
                if(mat[i][j]==0)
                    out.print("O\t");
                else if(mat[i][j]==1)
                    out.print("(W)\t");
                else if(mat[i][j]==2)
                    out.print("(B)\t");
            }
            out.println();
        }
    }
    int[] score()
    {
        int[] m={usr1,usr2};
        return m;
    }
    void move(int rin,int cin)
    {
        try
        {
            if(mat[rin][cin]==1)
            {
                if(mat[rin+1][cin]==2)
                {
                    usr1++;
                    mat[rin][cin]=0;
                    mat[rin+1][cin]=1;
                }
                else
                {
                    mat[rin][cin]=0;
                    mat[rin+1][cin]=1;
                }
            }
            else if(mat[rin][cin]==2)
            {
                if(mat[rin-1][cin]==1)
                {
                    usr2++;
                    mat[rin][cin]=0;
                    mat[rin-1][cin]=2;
                }
                else
                {
                    mat[rin][cin]=0;
                    mat[rin-1][cin]=2;
                }
            }
            else if(mat[rin][cin]==0)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
        }
    }
}