# java

INTERFACES

São contratos que declaram o comportamento de outras classes.
Podem ser compostas por constantes e métodos abstratos, defaults ou estáticos.
As interfaces contam apenas com a assinatura do método (exceto métodos defatult).
Cada classe que implementa uma interface, deve obrigatoriamente possuir os métodos por ela definidos.

As interfaces são públicas (acessíveis a qualquer classe de qualquer pacote).
Quando não especificado:
    Constantes: públicas, estáticas e finais
    Métodos: públicos e abstratos
    
Uma interface define um comportamento esperado, que pode ser implementado de diferentes maneiras por outras classes.
A vantagem em se utilizar interfaces, é que esses comportamentos são conhecidos, mas sua implementação não.
Dessa maneira, cada classe possui liberdade para implementar os métodos obrigatórios, sem a necessidade de conhecer implementações alheis.

Exemplo:
    Interface para calcular se um objeto é maior que outro.
    
    > public int isLargerThan(Relatable other);
    
Essa comparação pode ser feita tanto para número de páginas de livros, quanto para área de duas casas.
A assinatura do método seria a mesma para ambos os casos, porém, cada classe teria a liberdade de implementar conforme suas necessidades/particularidades

* Métodos abstratos: declarado, mas não implementado. Se uma classe inclui um método abstrato, então esta também deverá ser abstrata (exceto interfaces).
* Métodos default: são implementados em interfaces e servem para atualizar uma interface sem quebrar as classes que a implementam. Contudo, estes podem ser redefinidos (overriding) ou redeclarados (tornando-os estes abstratos).
* Métodos estáticos: são conhecidos como métodos da classe. Geralmente utilizados para acessar uma variável estática (conhecida como variável da classe). Como o próprio nome sugere, o valor desse tipo de variável é estático. É possível que sofra alterações (exemplo: counters), porém, essa mudança é refletida para todos os objetos da classe a qual pertence a variável. Ou seja, todos os objetos dessa classe enxergam o mesmo valor para essa variável. O sentido de pertencimento à classe, tanto dos métodos quanto das variáveis estáticas deve-se ao fato de também serem acessadas através do nome da classe. Podemos acessá-lo através de uma instância, porém, não é aconselhado pois não deixa explícito a característica estática da variável/método.
*Final: variáveis desse tipo não podem ter seu valor alterado.
*Constantes: são variáveis estáticas e finais. Geralmente são declaradas em letra maiúscula.

Variável de Referência

    > Object variavelRef = new Object();

varialRef        = variável de referência

Objeto atribuído = new Object();

Quando se define uma variável de referência do tipo interface, o objeto atribuído a ela deve ser uma instância de uma classe que implementa essa interface.
Dessa maneira, o objeto criado pode usufruir do conceito de herança múltipla, já que ele pode utilizar tanto os metodos da interface quanto da superclasse.


O que fazer caso quisermos acrescentar um novo método à interface?
Existem duas opções para isso:

1º Criar um método default:
    como dito um pouco antes, o método default é implementado na própria interface impedindo que a classe que as implementem quebrem. Esses métodos poderão sofrer overriding da classe que implementa a interface. (Não utilizar o modificador default caso faça overriding do método!).

2º Criar uma nova interface que extenda a primeira e que contenha o novo método:
    Dessa maneira, apenas as classes que optarem por implementar a segunda interface terão que se preocupar em implementar o novo método e todos os demais métodos da primeira interface.
    







    
    