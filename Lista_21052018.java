public interface Lista_21052018 {
//      Adicionar uma string na lista
    void adicionar(String nome);

//      Remove o ultimo elemento
    void removeUltimo();
//    Remove o primeiro elemento
    void removerPrimeiro();
//    Remove a palavra passada como parametro da lista
    void removePalavra(String palavra);
//    Ordenar a lista pelo nome
    void ordenar();
//    Retorna todas as palavras que contem o parametro passado
    String[] contem(String a);
//    Remove todos os elementos da lista
    void limpaLista();
//    Exibe todos os elementos contidos na lsita.
    void exibeTodos();
//    retorna a quantidade de elementos da lista
    int tamanho();
}
