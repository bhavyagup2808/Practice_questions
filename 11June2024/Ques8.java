class Ques8{
    public static void main(String[] args) {
        String arr[]={"rabbit","bribe","dog"};
        String str="bib";
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<str.length();j++)
            {
                if(arr[i].contains(Character.toString(str.charAt(i))) == false)
                {
                    flag=false;
                }
            }
            if(flag==true) System.out.println(arr[i]);
        }
    }
}