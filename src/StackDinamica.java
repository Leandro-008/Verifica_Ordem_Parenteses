public class StackDinamica {
    private CelulaPilha top;

    public void push(String nome){
        CelulaPilha novaCelula = new CelulaPilha();
        novaCelula.setDado(nome);
        novaCelula.setAnterior(this.top);
        this.top = novaCelula;
        }

    public void pop(){
        if(!isEmpyt()){
        System.out.println("Retirando elem. da pilha..: "+this.top.getDado());
        this.top = this.top.getAnterior();
        }else{
        System.out.println("Pilha Vazia!!!");
        } 
    }

    public boolean isEmpyt(){
        if(this.top == null){
        
        return true;
        }else return false;
    }

    public int sizePilha(){
        CelulaPilha p; int cont = 0;
        p = this.top;
        while(p != null){
        p = p.getAnterior();
        cont++;
        }
        return cont; }

    public void imprimir(){
        CelulaPilha p; p = this.top;
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        }else{
        while(p != null){
        System.out.println("Nome na pilha..: "+p.getDado());
        p = p.getAnterior();
            } 
        } 
    }

    public CelulaPilha top(){
        if(isEmpyt()){
        System.out.println("Pilha Vazia!!!");
        return null;
        }else {
        System.out.println("Nome no topo da Pilha..: "+top.getDado());
        return this.top;
        } 
    } 

    public boolean verificarParametrizacao(String expressao) {
        StackDinamica pilha = new StackDinamica();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(Character.toString(caractere));
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpyt()) {
                    return false; 
                } else {
                    char topo = pilha.top().getDado().charAt(0);
                    if (caractere == ')' && topo != '(' ||
                            caractere == ']' && topo != '[' ||
                            caractere == '}' && topo != '{') {
                        return false;
                    }
                    pilha.pop();
                }
            }
        }

        return pilha.isEmpyt();
    }
}


