
public class ListaEncadeada {
  private No primeiro;
  private No ultimo;

  public ListaEncadeada(){
    this.primeiro=null;
  }

  public int tamanho(){
    No noAux=this.primeiro;
    int tam=1;
    while (noAux.getProximo()!=null) {
      tam+=1;
      noAux=noAux.getProximo();
    }
    return tam;
  }

  public String vazia(){
    if (this.primeiro==null) {
      return "Sim";
    }
    else{
      return "Não";
    }
  }

  public void push(int elemento){
    No noAux = new No(elemento);
    if (primeiro==null) {
      this.primeiro=noAux;
      this.ultimo=noAux;
    }else{
        if (elemento<this.primeiro.getElemento()) {
          inserirInicio(elemento);
        }
        else if(elemento>ultimo.getElemento()){
          inserirFinal(elemento);
        }else{
          inserirMeio(elemento);
        }
      }
    }

    public void popInicio(){
      this.primeiro=primeiro.getProximo();
    }

    public void popMeio(int elemento){
      No anterior=this.primeiro;
      No posterior = anterior.getProximo();
      while (posterior.getElemento()!=elemento){
        anterior=posterior;
        posterior=anterior.getProximo();
      }
      if (posterior.getElemento()==elemento){
        anterior.setProximo(posterior.getProximo());
      }
    }

    public void popFinal(){
      No anterior=this.primeiro;
      No posterior = anterior.getProximo();
      while (posterior.getProximo()!=null){
        anterior=posterior;
        posterior=anterior.getProximo();
      }
      if (posterior.getProximo()==null){
        anterior.setProximo(null);
      }
    }

    public void inserirInicio (int elemento){
      No noAux = new No(elemento);
      noAux.setProximo(this.primeiro);
      this.primeiro=noAux;
    }
    public void inserirFinal (int elemento){
      No noAux = new No(elemento);
      this.ultimo.setProximo(noAux);
      this.ultimo = noAux;
    }

    public void inserirMeio(int elemento){
      No noAux = new No(elemento);
      No anterior=this.primeiro;
      No posterior=this.primeiro.getProximo();

      while (posterior.getProximo()!=null && elemento>anterior.getElemento() && elemento<posterior.getElemento()== false){
        anterior=posterior;
        posterior=posterior.getProximo();
      }
      noAux.setProximo(posterior);
      anterior.setProximo(noAux);
    }


    public void imprimir(){
      No noAux=this.primeiro;
		  System.out.println();
		  while (noAux!=null) {
			  System.out.println(noAux.getElemento());
			  noAux = noAux.getProximo();
		}
		System.out.println(); 
    }
}