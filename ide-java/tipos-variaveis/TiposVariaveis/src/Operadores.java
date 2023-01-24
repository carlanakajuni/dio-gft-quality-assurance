public class Operadores {
  public static void main(String[] args) {
    int numero = 5;

    numero = - numero;

    System.out.println(numero);

    numero = numero * -1; /* tornar o número negativo, positivo novamente */

    System.out.println(numero);

    /*
     * operador de atribuição " = "
     * 
     * operador unário: operador aplicados juntamente com um outro operador aritmético. Trabalhos básicos: incrementar,
     * decrementar, inverter valores numéricos e booleanos
        * Operador unário de valor positivo (+)
        * Operador unário de valor negativo (-)
        * Operador unário de incremento de valor (++)
        * Operador unário de decremento de valor (--)
        * Operador unário de negação (!)
     * 
     * x repetição: usando o operador de incremento: ( numero++ );
     * 
     * Operador ternário: forma resumida para definir uma condição e escolher por um dentre dois valores
        * condição de IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha
        * representado pelos símbolos ?:
        <expreção condicional> ? <caso condição seja true> : <caso condição seja false>
          int a, b;
          a = 5;
          b = 6;
          String resultado = "";
          if(a==b)
            resultado = "verdadeiro";
          else
            resultado = "falso";
          
          System.out.printIn(resultado); ----> falso

        OU

          String resultado = a == b ? "verdadeiro" : "falso"; ----> falso

     * Operadores Relacionais: avaliam a relação entre duas variáveis ou expressões. Definem se o operando à esquerda
     * é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.
        (==) verificar se uma variável é IGUAL A outra
        (!=) verificar se uma variável é DIFERENTE da outra
        (>) verificar se MAIOR QUE
        (>=) verificar se MAIOR IGUAL
        (<) verificar se MENOR QUE
        (<=) verificar se MENOR IGUAL
     * Para String, utilizar o equals: System.out.printIn(nomeUm.equals(nomeDois));
     * 
     * Operações lógicos: && -> E , || -> OU
     */

  }
}
