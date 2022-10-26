
___

##### Controle de pacotes 

- *import* importa pacotes ou classes para dentro do código
- *package* específica a que pacote todas as classes de um arquivo pertecem

##### Modificadores de acesso

- *public* acesso de qualquer classe
- *private* acesso apenas dentro da classe
- *protected* acesso por classes no mesmo pacote e subclasses (uso de herença)

##### Primitivos

- *boolean* um valor indicando verddeiro ou falso 
- *byte* um inteiro de 8 bits (signed)
- *char* um character unicode ()16-bit unsigned)
- *double* um número de ponto flutuante de 64 bits
- *float* um número de ponto flutuante de 32 bits (signed)
- *int* um inteiro de 32 bits (signed)
- *long* um inteiro de 64 bits (signed)
- *short* um inteiro de 32 bits (signed)
- *void* indica que o método não tem retorno de valor

##### Modificadores de classes variáveis ou métodos

- *abstract* classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata (associada com herença)
- *class* específica de uma classe
- *extends* indica a superclasse que a sub classe está estendendo (associada ao abstract)
- *final* impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada
- *implements* indica as interfaces que uma irá implementar (associado ao extends)
- *native* indica que um método está escrito em uma linguagem dependente de plataforma, como o C
- *new* instancia de um novo objeto, chamado seu construtor
- *static* um método ou varíavel pertecer à classe ao invés instâncias
- *strictfp* usando em frente a um método ou classe para indicar que os números de ponto fluteante seguirão as regras de ponbto flutuante em todas as expressões (precisão de dados)
- *synchrozined* indica que um método só pode ser acessado por uma thread de cada vez
- *transient* impede a serialização de campos(tenho a informação, mas não vou salva-la)
- *volatile* indica que uma variável pode ser alterada durante o uso de threads

##### Controle de Fluxo dentro de um bloco de código

- *break* sai do bloco de código em que ele está
- *case* executa um bloco de código dependendo do teste de switch
- *continue* pula a execução do código que vira após essa linha e vai para a próxima passagem do loop.

##### Tratamentos de erros

- *assert* testa uma expressão condicional para verificar uma suposição do programador
- *catch* declara o bloco do código usado parta tratar uma exceção
- *finally* bloco de código, após um try-catch, que é executado independentemente do fluixo de programa seguido ao lidar com uma exceção
- *throw* usada para passar uma exceção para o método que o chamou
- *throws* indica que um método pode passar uma exceção para o método que chamou
- *try* bloco de código que tentará ser executado, mas que pode causar uma exceção

##### Variáveis
- *super* refere-se a superclasse imediata
- *this* refere-se a instância atual do objeto
___


