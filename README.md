dynamic-inject
==============
Simples aplicação que tenta demostrar como você pode fazer injeção dinâmica com CDI com utilização de Qualifier. :-)

Qualifier
==========
Esses caras servem para que você indique que implementação gostaria de usar para aquela interface, assim eu posso
ter várias implementações para uma única interface, dando a ela vários resultados para um certo comportamento.

AnnotationLiteral
================
Esse cara é quem vai ajudar na mágica, imagine você: Como eu vou colocar uma anotação no código em tempo de execução?
Aí que entra o AnnotationLiteral, ele vai nos possibilitar de nosso Qualifier se transformar em uma classe concreta e então
tornar disponível a utilização desse cara em tempo de execução.

O exemplo
==========
Ele é simples, tem uma interface EJB: com.github.danielsoro.dynamicinject.hello.Hello
Essa interface tem o método Hello();

Então eu tenho 5 implementações para esse cara:

```
com.github.danielsoro.dynamicinject.helloimpl.HelloDaniel
com.github.danielsoro.dynamicinject.helloimpl.HelloGustavo
com.github.danielsoro.dynamicinject.helloimpl.HelloIsabela
com.github.danielsoro.dynamicinject.helloimpl.HelloLuizVictor
com.github.danielsoro.dynamicinject.helloimpl.HelloSandra
```

Temos os qualificadores para indicar a implementação de cada um desses caras para o ponto de injeção:

```
com.github.danielsoro.dynamicinject.qualifier.Daniel
com.github.danielsoro.dynamicinject.qualifier.Gustavo
com.github.danielsoro.dynamicinject.qualifier.Isabela
com.github.danielsoro.dynamicinject.qualifier.LuizVictor
com.github.danielsoro.dynamicinject.qualifier.Sandra
```

E temos os nossos annotationLiteral, que nada mais é que uma classe que estende de AnnotationLiteral<T> e implementa
o qualifier que eu passo no generic:

```
com.github.danielsoro.dynamicinject.annotationLiteral.DanielQualifier
com.github.danielsoro.dynamicinject.annotationLiteral.GustavoQualifier
com.github.danielsoro.dynamicinject.annotationLiteral.IsabelaQualifier
com.github.danielsoro.dynamicinject.annotationLiteral.LuizVictorQualifier
com.github.danielsoro.dynamicinject.annotationLiteral.SandraQualifier
```

UTILIZANDO
=============

Fiz uma página JSF e criei um enum chamado Pessoas que possui uma instância de cada AnnotationLiteral:
com.github.danielsoro.dynamicinject.enums.Pessoas

Na minha tela pego todos os valores do enum:

```
private List<Pessoas> pessoas = Arrays.asList(Pessoas.values());
```

Defino a interface e o Instance desta forma:

``` 
@Inject @Any
private Instance<Hello> helloSource;
private Hello hello;
```

E a mágica funciona assim:
Quando eu seleciono um valor no combo e presiono o botão o seguinte código é executado:

```
public void addHello() {
    this.hello = this.helloSource.select(pessoa.getAnnotation()).get();
} 
```
Neste momento eu estou dizendo que a interface Hello terá a implementação contida na opção que ele fez ao escolher na combo.

Tente rodar e veja como isso é mágico. :-)


-- 
Daniel Cunha <danielsoro@gmail.com> - http://www.danielsoro.com.br/

[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/danielsoro/dynamic-inject/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

