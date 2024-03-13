public class Main {
  public static void main(String[] args) {
    ListaEncadeada lista=new ListaEncadeada();
    System.out.println("Pilha vazia: "+lista.vazia());
    lista.push(10);
    lista.push(500);
    lista.push(60);
    lista.push(50);
    lista.push(600);
    lista.push(5);
    lista.push(55);

    lista.imprimir();

    lista.popInicio();
    lista.popMeio(60);
    lista.popFinal();

    lista.imprimir();

    System.out.println("Tamanho: "+lista.tamanho());
    System.out.println("Pilha vazia: "+lista.vazia());

  }
}
