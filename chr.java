public class chr {
    
    static void printChar(char[] str)
    {
        for(int i = 0; i < str.length; i++)
        {
            System.out.print(str[i]);
        }
    }

    static void replaceWithStar(char[] ch)
    {
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
            {
                if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') ||
                ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
                {
                    ch[i] = '*';
                }
            }
        }
        System.out.println(ch);
    }

    static void encryptionArrayV1(char[] ch)
    {

        for(int i = 0; i < ch.length; i++)
        {
            int value = ch.length;
            value += ch[i];

            System.out.print(value);
        }
    }

    static void denCryptionsV1(char[] ch)
    {
        int value = ch.length;
        for(int i = 0; i < ch.length; i++)
        {
            value -= ch[i];
            System.out.print((char) value);
        }
    }

    static void enCryptionV2(char[] ch)
    {
        for(int i = 0; i < ch.length; i++)
        {
            ch[i]++;
        }
        System.out.println(ch);
    }

    static void denCryptionV2(char[] ch)
    {
        for(int i = 0; i < ch.length; i++)
        {
            ch[i]--;
        }
        System.out.println(ch);
    }

    static void adarshaAlgorithm(char[] ch)
    {
        for(int i = 0; i < ch.length; i++)
        {
            ch[i] = (char) (ch[i] + 4 + ch.length - i);
        }
        System.out.println(ch);
    }
    public static void main(String[] args) 
    {
        String msg = "Hi Hamza, How are you?";
        char []ch = msg.toCharArray();
        printChar(ch);

        System.out.println();
        replaceWithStar(ch);

        encryptionArrayV1(ch);
        System.out.println();
        denCryptionsV1(ch);

        enCryptionV2(ch);
        System.out.println();
        denCryptionV2(ch);

        adarshaAlgorithm(ch);

    }
}
