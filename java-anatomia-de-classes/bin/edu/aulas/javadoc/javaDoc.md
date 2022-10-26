# Assuntos 
- Documentação oficial
- Tags
- Tipos de comentários
- Javadoc
___
#### Documentação
- Estudar documentação
link: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
____
#### Tags
São as informações que obtemos através de classes documentadas na linguagem. Java Documentation é composto por tags que representamdados relevantes para a compreensão da proposta de uma classe e os conjunto de seus métodos e atributos

- Tabela

Tag --------------| Descrição
@autor ---------| Autor/Criador
@version ------| Versão dp recurso disponibilizado do recurso
@param -------| Descrição dos parâmetros dos métodos criados
@return ------- | Definição do tipo de retorno de um método
@throws -------| Se o método lança alguma exceção

____

#### Tipos de comentários

- One Line - uma linha
- Mult Line -  comentário mais detalhado com mais linhas
- Documentation - comntário a nível de documentação
____
#### Javadoc
Javadoc é um gerador de documentação criado pela Sun Microsystems para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muito simples inseridas nos comentários do programa.
Este sistema é o padrão de documentação de classes em Java, e muitas dos IDE's dessa linguagem irão automaticamente gerar um Javadoc HTML

- comando para reproduzir em html

*javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/edu/aulas/javadoc/*.java