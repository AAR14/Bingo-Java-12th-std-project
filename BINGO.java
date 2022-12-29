import java.util.*;
class BINGO
    {
        public void main()
        {   
            Scanner sc=new Scanner(System.in);
            int a[]=new int[25];
            int b[]=new int[25];
            int c[]=new int[25];
            int d1[]=new int[25];
            int d[]=new int[25];
            int e[]=new int[25];
            b[0]=24;
            b[1]=6;
            b[2]=14;
            b[3]=8;
            b[4]=20;
            b[5]=9;
            b[6]=25;
            b[7]=4;
            b[8]=19;
            b[9]=12;
            b[10]=16;
            b[11]=2;
            b[12]=23;
            b[13]=1;
            b[14]=15;
            b[15]=11;
            b[16]=18;
            b[17]=3;
            b[18]=22;
            b[19]=10;
            b[20]=17;
            b[21]=7;
            b[22]=13;
            b[23]=5;
            b[24]=21;
            c[0]=1;
            c[1]=14;
            c[2]=2;
            c[3]=15;
            c[4]=3;
            c[5]=16;
            c[6]=4;
            c[7]=17;
            c[8]=5;
            c[9]=18;
            c[10]=6;
            c[11]=14;
            c[12]=7;
            c[13]=20;
            c[14]=8;
            c[15]=21;
            c[16]=9;
            c[17]=22;
            c[18]=10;
            c[19]=23;
            c[20]=16;
            c[21]=24;
            c[22]=12;
            c[23]=25;
            c[24]=13;
            d[0]=9;
            d[1]=14;
            d[2]=6;
            d[3]=8;
            d[4]=15;
            d[5]=4;
            d[6]=24;
            d[7]=22;
            d[8]=20;
            d[9]=10;
            d[10]=12;
            d[11]=18;
            d[12]=25;
            d[13]=1;
            d[14]=11;
            d[15]=19;
            d[16]=16;
            d[17]=3;
            d[18]=13;
            d[19]=7;
            d[20]=21;
            d[21]=5;
            d[22]=17;
            d[23]= 23;
            d[24]=2;
            int m=1;
            for(int i=0;i<25;i++)
            {
                d1[i]=m;
                m++;
            }
            int n1=0,n=0;
            System.out.println("ENTER THE VALUES FROM 1 TO 25");
            System.out.println("==============================");
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.println("ENTER THE VALUES FOR ROW NO."+(i+1));
                    System.out.print("");
                    a[n]=sc.nextInt();
                    System.out.println();
                    for(int k=0;k<n1;k++)
                    {
                        if(a[n]>25||a[n]<=0)
                        {                            
                            System.out.println("ILLEGAL GAME RULE");
                            System.out.println("ENTER A NUMBER TO REPLACE THE WRONG ONE");
                            a[n]=sc.nextInt();       
                            System.out.println();
                        }
                    }
                    for(int k=0;k<n1;k++)
                    {
                        if(a[n]==a[k])
                        {                            
                            System.out.println("THE NUMBER "+a[n]+" IS REPEATED ");
                            System.out.println("ENTER ANOTHER NUMBER");                            
                            a[n]=sc.nextInt();
                            System.out.println();  
                            if(a[n]==1)
                            {
                                k=-1;
                            }
                            else
                            k=0;                            
                        }
                    }
                    for(int l=0;l<25;l++)
                    {
                        if(a[n]==d1[l])
                        {
                            d1[l]=0;
                        }
                    }
                    System.out.print("THE NUMBERS LEFT ARE :{");
                        for(int g=0;g<25;g++)
                        {
                            if(d1[g]!=0)
                            {
                                System.out.print(d1[g]);
                                for(int l=g+1;l<25;l++)
                                {
                                    if(d1[l]!=0)
                                    {
                                        System.out.print(",");
                                        break;
                                    }
                                }
                            }
                        }
                        System.out.print("}");
                        System.out.println();
                        n1++;
                        n++;
                    }                           
                    System.out.println("=============================");
                }
                int n7 =0;
                for(int i=0;i<5;i++)
                {
                    System.out.println("\t\t");
                    for(int j=0;j<5;j++)
                    {
                        System.out.print("\t\t"+a[n7]);
                        n7++;
                    }
                }
                System.out.println();
                System.out.println("LET'S START THE GAME");
                double n2=Math.random();
                if(n2<0.30)
                {
                    for(int i=0;i<25;i++)
                    {
                        if(i%2==0)
                        {
                            System.out.println("\f");
                            System.out.println("ENTER YOUR NUMBER");
                            int ch=sc.nextInt();
                            for(int l=0;l<25;l++)
                            {
                                if(a[l]==ch)
                                {
                                    a[l]=0;
                                }
                                if(b[l]==ch)
                                {
                                    b[l]=0;
                                }
                            }
                        }
                        else if(i%2!=0)
                        {
                            System.out.println("COMPUTER'S CHANCE");
                            for(int l=0;l<25;l++)
                            {
                                if(b[l]!=0)
                                {
                                    System.out.println(b[l]);
                                    for(int k=0;k<25;k++)
                                    {
                                        if(a[k]==b[l])
                                        {
                                            a[k]=0;
                                            b[l]=0;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        System.out.println("=========================================================================================");
                        int n4=0;
                        for(int k=0;k<5;k++)
                        {
                            for(int j = 0;j<5;j++)
                            {
                                System.out.print("\t\t"+a[n4]);
                                n4++;
                            }
                            System.out.println();
                        }
                        System.out.println("=========================================================================================");
                        String s=" ";
                        if((a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0&&a[4]==0)||(a[0]==0&&a[5]==0&&a[10]==0&&a[15]==0&&a[20]==0))
                        {
                            System.out.println("B IS DONE FOR YOU");
                            s=s+'B';
                        }
                        if((a[5]==0&&a[6]==0&&a[7]==0&&a[8]==0&&a[9]==0)||(a[1]==0&&a[6]==0&&a[11]==0&&a[16]==0&&a[21]==0))
                        {
                            System.out.println("I IS DONE FOR YOU");
                            s=s+'I';
                        }
                        if((a[10]==0&&a[11]==0&&a[12]==0&&a[13]==0&&a[14]==0)||(a[2]==0&&a[7]==0&&a[12]==0&&a[17]==0&&a[22]==0))
                        {
                            System.out.println("N IS DONE FOR YOU");
                            s=s+'N';
                        }
                        if((a[15]==0&&a[16]==0&&a[17]==0&&a[18]==0&&a[19]==0)||(a[3]==0&&a[8]==0&&a[13]==0&&a[18]==0&&a[23]==0))
                        {
                            System.out.println("G IS DONE FOR YOU");
                            s=s+'G';
                        }
                        if((a[20]==0&&a[21]==0&&a[22]==0&&a[23]==0&&a[24]==0)||(a[4]==0&&a[9]==0&&a[14]==0&&a[19]==0&&a[24]==0))
                        {
                            System.out.println("O IS DONE FOR YOU");
                            s=s+'O';
                        }
                        String s1=" ";
                        if((b[0]==0&&b[1]==0&&b[2]==0&&b[3]==0&&b[4]==0)||(b[0]==0&&b[5]==0&&b[10]==0&&b[15]==0&&b[20]==0))
                        {
                            s1=s1+'B';
                        }
                        if((b[5]==0&&b[6]==0&&b[7]==0&&b[8]==0&&b[9]==0)||(b[1]==0&&b[6]==0&&b[11]==0&&b[16]==0&&b[21]==0))
                        {
                            s1=s1+'I';
                        }
                        if((b[10]==0&&b[11]==0&&b[12]==0&&b[13]==0&&b[14]==0)||(b[2]==0&&b[7]==0&&b[12]==0&&b[17]==0&&b[22]==0))
                        {
                            s1=s1+'N';
                        }
                        if((b[15]==0&&b[16]==0&&b[17]==0&&b[18]==0&&b[19]==0)||(b[3]==0&&b[8]==0&&b[13]==0&&b[18]==0&&b[23]==0))
                        {
                            s1=s1+'G';
                        }
                        if((b[20]==0&&b[21]==0&&b[22]==0&&b[23]==0&&b[24]==0)||(b[4]==0&&b[9]==0&&b[14]==0&&b[19]==0&&b[24]==0))
                        {
                            s1=s1+'O';
                        }
                        if(s.length()==6||s1.length()==6)
                        {
                            System.out.println("COMPUTER'S GAME IS :");
                            int f = 0;
                            for(int g=0;g<5;g++)
                            {
                                System.out.println();
                                for(int h=0;h<5;h++)
                                {
                                    System.out.print("\t\t"+b[f]);
                                    f++;
                                }
                            }
                            System.out.println();
                            if(s1.length()==6&&s1.length()>s.length())
                            {
                                System.out.println("BINGO");
                                System.out.println("COMPUTER WIN");
                                break;
                            }
                            else if(s.length()==6&&s.length()>s1.length())
                            {
                                System.out.println("''BINGO!!''");
                                System.out.println("''YOU WIN!!''");
                                break;
                            }
                            else if(s.length()==s1.length()&&s.length()==6&&s1.length()==6)
                            {
                                System.out.println("IT'S A DRAW MATCH");
                            }
                            break;
                        }
                        }
                    }
                    else if(n2>0.30 && n2<0.60)
                    {
                        for(int i=0;i<25;i++)
                        {
                            if(i%2==0)
                            {
                                System.out.println("\f");
                                System.out.println("ENTER YOUR NUMBER");
                                int ch=sc.nextInt();
                                for(int l=0;l<25;l++)
                                {
                                    if(a[l]==ch)
                                    {
                                        a[l]=0;
                                    }
                                    if(c[l]==ch)
                                    {
                                        c[l]=0;
                                    }
                                }
                            }
                            else if(i%2!=0)
                            {
                                System.out.println("COMPUTER'S CHANCE");
                                for(int l=0;l<25;l++)
                                {
                                    if(c[l]!=0)
                                    {
                                        System.out.println(c[l]);
                                        for(int k=0;k<25;k++)
                                        {
                                            if(a[k]==c[l])
                                            {
                                                a[k]=0;
                                                c[l]=0;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            System.out.println("=========================================================================================");
                            int n4=0;
                            for(int k=0;k<5;k++)
                            {
                                for(int j = 0;j<5;j++)
                                {
                                    System.out.print("\t\t"+a[n4]);
                                    n4++;
                                }
                                System.out.println();
                            }
                            System.out.println("=========================================================================================");
                            String s=" ";
                            if((a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0&&a[4]==0)||(a[0]==0&&a[5]==0&&a[10]==0&&a[15]==0&&a[20]==0))
                            {
                                System.out.println("B IS DONE FOR YOU");
                                s=s+'B';
                            }
                            if((a[5]==0&&a[6]==0&&a[7]==0&&a[8]==0&&a[9]==0)||(a[1]==0&&a[6]==0&&a[11]==0&&a[16]==0&&a[21]==0))
                            {
                                System.out.println("I IS DONE FOR YOU");
                                s=s+'I';
                            }
                            if((a[10]==0&&a[11]==0&&a[12]==0&&a[13]==0&&a[14]==0)||(a[2]==0&&a[7]==0&&a[12]==0&&a[17]==0&&a[22]==0))
                            {
                                System.out.println("N IS DONE FOR YOU");
                                s=s+'N';
                            }
                            if((a[15]==0&&a[16]==0&&a[17]==0&&a[18]==0&&a[19]==0)||(a[3]==0&&a[8]==0&&a[13]==0&&a[18]==0&&a[23]==0))
                            {
                                System.out.println("G IS DONE FOR YOU");
                                s=s+'G';
                            }
                            if((a[20]==0&&a[21]==0&&a[22]==0&&a[23]==0&&a[24]==0)||(a[4]==0&&a[9]==0&&a[14]==0&&a[19]==0&&a[24]==0))
                            {
                                System.out.println("O IS DONE FOR YOU");
                                s=s+'O';
                            }
                            String s1=" ";
                            if((c[0]==0&&c[1]==0&&c[2]==0&&c[3]==0&&c[4]==0)||(c[0]==0&&c[5]==0&&c[10]==0&&c[15]==0&&c[20]==0))
                            {
                                s1=s1+'B';
                            }
                            if((c[5]==0&&c[6]==0&&c[7]==0&&c[8]==0&&c[9]==0)||(c[1]==0&&c[6]==0&&c[11]==0&&c[16]==0&&c[21]==0))
                            {
                                s1=s1+'I';
                            }
                            if((c[10]==0&&c[11]==0&&c[12]==0&&c[13]==0&&c[14]==0)||(c[2]==0&&c[7]==0&&c[12]==0&&c[17]==0&&c[22]==0))
                            {
                                s1=s1+'N';
                            }
                            if((c[15]==0&&c[16]==0&&c[17]==0&&c[18]==0&&c[19]==0)||(c[3]==0&&c[8]==0&&c[13]==0&&c[18]==0&&c[23]==0))
                            {
                                s1=s1+'G';
                            }
                            if((c[20]==0&&c[21]==0&&c[22]==0&&c[23]==0&&c[24]==0)||(c[4]==0&&c[9]==0&&c[14]==0&&c[19]==0&&c[24]==0))
                            {
                                s1=s1+'O';
                            }
                            if(s.length()==6||s1.length()==6)
                            {
                                System.out.println("COMPUTER'S GAME IS :");
                                int f = 0;
                                for(int g=0;g<5;g++)
                                {
                                    System.out.println();
                                    for(int h=0;h<5;h++)
                                    {
                                        System.out.print("\t\t"+c[f]);
                                        f++;
                                    }
                                }
                                System.out.println();
                                if(s1.length()==6&&s1.length()>s.length())
                                {
                                    System.out.println("BINGO");
                                    System.out.println("COMPUTER WIN");
                                    break;
                                }
                                else if(s.length()==6&&s.length()>s1.length())
                                {
                                    System.out.println("BINGO");
                                    System.out.println("YOU WIN");
                                    break;
                                }
                                else if(s.length()==s1.length()&&s.length()==6&&s1.length()==6)
                                {
                                    System.out.println("IT'S A DRAW MATCH");
                                }
                                break;
                            }
                        }
                    }
                    else if(n2>=0.60 && n2<1.00)
                    {
                        for(int i=0;i<25;i++)
                        {
                            if(i%2==0)
                            {
                                System.out.println("ENTER YOUR CHOICE");
                                int ch=sc.nextInt();
                                for(int l=0;l<25;l++)
                                {
                                    if(a[l]==ch)
                                    {
                                        a[l]=0;
                                    }
                                    if(d[l]==ch)
                                    {
                                        d[l]=0;
                                    }
                                }
                            }
                            else if(i%2!=0)
                            {
                                System.out.println("computer's chance");
                                for(int l=0;l<25;l++)
                                {
                                    if(d[l]!=0)
                                    {
                                        System.out.println(d[l]);
                                        for(int k=0;k<25;k++)
                                        {
                                            if(a[k]==d[l])
                                            {
                                                a[k]=0;
                                                d[l]=0;
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            System.out.println("=========================================================================================");
                            int n4=0;
                            for(int k=0;k<5;k++)
                            {
                                for(int j = 0;j<5;j++)
                                {
                                    System.out.print("\t\t"+a[n4]);
                                    n4++;
                                }
                                System.out.println();
                            }
                            System.out.println("=========================================================================================");
                            String s=" ";
                            if((a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0&&a[4]==0)||(a[0]==0&&a[5]==0&&a[10]==0&&a[15]==0&&a[20]==0))
                            {
                                System.out.println("B IS DONE FOR YOU");
                                s=s+'B';
                            }
                            if((a[5]==0&&a[6]==0&&a[7]==0&&a[8]==0&&a[9]==0)||(a[1]==0&&a[6]==0&&a[11]==0&&a[16]==0&&a[21]==0))
                            {
                                System.out.println("I IS DONE FOR YOU");
                                s=s+'I';
                            }
                            if((a[10]==0&&a[11]==0&&a[12]==0&&a[13]==0&&a[14]==0)||(a[2]==0&&a[7]==0&&a[12]==0&&a[17]==0&&a[22]==0))
                            {
                                System.out.println("N IS DONE FOR YOU");
                                s=s+'N';
                            }
                            if((a[15]==0&&a[16]==0&&a[17]==0&&a[18]==0&&a[19]==0)||(a[3]==0&&a[8]==0&&a[13]==0&&a[18]==0&&a[23]==0))
                            {
                                System.out.println("G IS DONE FOR YOU");
                                s=s+'G';
                            }
                            if((a[20]==0&&a[21]==0&&a[22]==0&&a[23]==0&&a[24]==0)||(a[4]==0&&a[9]==0&&a[14]==0&&a[19]==0&&a[24]==0))
                            {
                                System.out.println("O IS DONE FOR YOU");
                                s=s+'O';
                            }
                            String s1=" ";
                            if((d[0]==0&&d[1]==0&&d[2]==0&&d[3]==0&&d[4]==0)||(d[0]==0&&d[5]==0&&d[10]==0&&d[15]==0&&d[20]==0))
                            {
                                s1=s1+'B';
                            }
                            if((d[5]==0&&d[6]==0&&d[7]==0&&d[8]==0&&d[9]==0)||(d[1]==0&&d[6]==0&&d[11]==0&&d[16]==0&&d[21]==0))
                            {
                                s1=s1+'I';
                            }
                            if((d[10]==0&&d[11]==0&&d[12]==0&&d[13]==0&&d[14]==0)||(d[2]==0&&d[7]==0&&d[12]==0&&d[17]==0&&d[22]==0))
                            {
                                s1=s1+'N';
                            }
                            if((d[15]==0&&d[16]==0&&d[17]==0&&d[18]==0&&d[19]==0)||(d[3]==0&&d[8]==0&&d[13]==0&&d[18]==0&&d[23]==0))
                            {
                                s1=s1+'G';
                            }
                            if((d[20]==0&&d[21]==0&&d[22]==0&&d[23]==0&&d[24]==0)||(d[4]==0&&d[9]==0&&d[14]==0&&d[19]==0&&d[24]==0))
                            {
                                s1=s1+'O';
                            }
                            if(s.length()==6||s1.length()==6)
                            {
                                System.out.println("COMPUTER'S GAME IS :");
                                int f = 0;
                                for(int g=0;g<5;g++)
                                {
                                    System.out.println();
                                    for(int h=0;h<5;h++)
                                    {
                                        System.out.print("\t\t"+b[f]);
                                        f++;
                                    }
                                }
                                System.out.println();
                                if(s1.length()==6&&s1.length()>s.length())
                                {
                                    System.out.println("BINGO");
                                    System.out.println("COMPUTER WIN");
                                    break;
                                }
                                else if(s.length()==6&&s.length()>s1.length())
                                {
                                    System.out.println("''BINGO!!''");
                                    System.out.println("''YOU WIN!!''");
                                    break;
                                }
                                else if(s.length()==s1.length()&&s.length()==6&&s1.length()==6)
                                {
                                    System.out.println("IT'S A DRAW MATCH");
                                }
                                break;
                            }
                        }
                    }
                }
            }
      
       
