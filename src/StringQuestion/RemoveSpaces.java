package StringQuestion;

public class RemoveSpaces {
    public static void main(String[] args) {
        String sc = "Saikat Nayek";
        Remover(sc);
    }

    static void Remover(String s){
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != ' ' && ch[i] != '\n'){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
    }
}
