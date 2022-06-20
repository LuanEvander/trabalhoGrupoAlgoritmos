# Introdução

Este é um algoritmo em linguagem Java que exibe questões com respostas de múltipla escolha. Consistem em três temas com cinco perguntas e uma série de alternativas, dentre as quais apenas uma é a correta.

## Estrutura do Arquivo

Esse workspace contém duas pastas por padrão, onde:

- `src`: a pasta que contém as sources
- `lib`: a pasta que contém as dependencies

Enquanto isso, os arquivos de saída compilados serão gerados na pasta `bin` por padrão.

> Se você quiser mudar a estrutura da pasta, abra `.vscode/settings.json` e altere as configurações relacionadas aqui.

# Tour pelo algoritmo

Esse documento irá detalhar o funcionamento do algoritmo usado nesse repositório. O algoritmo será explicado seguindo uma das possíveis formas de uso e interação dentre as variadas formas.

## Bloco try

Um bloco `try` pode ser usado para tratar possíveis erros caso aconteçam conversões que levem à quebra da execução do algoritmo.

```java
    try {
        // Algoritmo que inclui comandos/invocações de métodos
        // que podem gerar uma situação de exceção.
    }
```

Nesse algoritmo o bloco try é usado na declaração da classe `Scanner`:

```java
    try(Scanner sc = new Scanner(System.in)){
        // Algoritmo que inclui comandos/invocações de métodos
        // que podem gerar uma situação de exceção.
    }
```

Para garantir que não haja poluição visual, a classe `Scanner` será armazenada na variável `sc` em detrimento de `entrada`.

## Variáveis

O algoritmo possui duas variáveis para armazenar o resultado das respostas.

```java
    int acertos = 0, erros = 0;
```

Duas variáveis são usadas para receber entradas do usuário e executar interações.

```java
    String opcao, volta;
```

E uma variável para conferir se a resposta é inválida.

```java
    boolean invalido;
```

## Estrutura de repetição principal

Para garantir que o algoritmo irá executar, será utilizado o comando `Do-While`:

```java
    do{
        //Instruções para limpar o console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Algoritmo que inclui comandos/invocações de métodos
        // referentes ao menu principal e aos quizes
    }while(volta.equals("n")); 
```

## Menu de temas

O algoritmo irá imprimir no console para o usuário selecionar um tema, com uma indicação de que ele poderá digitar uma opção:

```java
    System.out.println("Escolha um tema:\n(a) Formula 1\n(b) Filosofia\n(c) Jogos\n(d) Fim");
    System.out.print("Opção: ");
```

Abaixo será executado uma linha utilizando a classe `Scanner`, cuja entrada será armazenada na variável `opcao`:

```java
    // .toLowerCase para forçar letras minúsculas
    // Seu uso não é possível com variáveis tipo `char`
    opcao = sc.next().toLowerCase();
```

## Limpeza do console

Após selecionado um tema, o algoritmo irá executar instruções que apagam o texto exibido anteriormente no console.

```java
    System.out.print("\033[H\033[2J");
    System.out.flush();
```

## Seleção de temas

Para simular uso de métodos foi utilizado o comando `Switch-Case`. Esse comando é responsável por:

* Executar o quiz do tema selecionado;
* Encerrar o algoritmo; ou
* Informar que foi inserido uma entrada inválida.

```java
    switch(opcao){
        case "a":
            // Quiz sobre Formula 1
        break;
        case "b":
            // Quiz sobre Filosofia
        break;
        case "c":
            // Quiz sobre jogos
        break;
        case "d":
            // Encerra o algoritmo
            System.out.println("Sair");
        break;
        default:
            // Informa que a entrada é inválida
            System.out.println("Entrada Inválida");
        break; 
    }
```

Vale ressaltar que no Menu de Temas uma entrada foi armazenada na variável `opcao`, então, o `Switch-Case` será executado após a Limpeza do Console.

## Estrutura do quiz

A estrutura de repetição de um quiz é semelhante à estrutura de repetição principal. 

```java
    case "c":
        do{
            // Quiz sobre jogos
        }while(opcao.equals("s"));
    break;
```
## Perguntas do quiz

A forma de imprimir as perguntas no console é semelhante à forma de imprimir o Menu de Temas:

```java
    do{
        do{
            System.out.println("Quiz Jogos Digitais" + "\n\n");
            //Início da QUESTÃO 1.
            System.out.println("QUESTÃO 1. Rockstar Games é conhecida por ter criado grandes nomes dos jogos eletrônicos. Entre eles, qual jogo desta empresa é o mais popular?\n\n a) Red Dead Redemption 2  \n b) L.A Noire \n c) Bully \n d) Grand Theft Auto \n");
            System.out.print("Informe sua resposta: ");
            opcao = sc.next().toLowerCase();

            // Switch-Case das respostas
            // Outras instruções
        }while(invalido == true);
        // Outras questões do quiz
    }while(opcao.equals("s"));
```

Também é semelhante a forma de receber uma entrada e armazenar em uma variável.

## Verificar respostas

As respostas são verificadas através do comando `Switch-Case`:

```java
    switch(opcao){
        case "d":
            System.out.println("\nResposta correta! :)");
            acertos = acertos + 1;
            invalido = false; 
        break;  
        case "a": case "b": case "c": 
            System.out.println("\nAlternativa incorreta :( A resposta é: letra d!");  
            erros = erros + 1;
            invalido = false;
        break;
        default:
            System.out.println("\nLETRA INVÁLIDA");
            invalido = true;
        break;         
    }
```
Após a execução do `Switch-Case` o console irá imprimir a próxima pergunta.

Essa é a estrutura completa:

```java
    // Início da QUESTÃO 1.
    do{
        System.out.println("QUESTÃO 1. Rockstar Games é conhecida por ter criado grandes nomes dos jogos eletrônicos. Entre eles, qual jogo desta empresa é o mais popular?\n\n a) Red Dead Redemption 2  \n b) L.A Noire \n c) Bully \n d) Grand Theft Auto \n");
        System.out.print("Informe sua resposta: ");
        opcao = sc.next().toLowerCase();
        
        switch(opcao){
            case "d":
                System.out.println("\nResposta correta! :)");
                acertos = acertos + 1;
                invalido = false; 
            break;  
            case "a": case "b": case "c": 
                System.out.println("\nAlternativa incorreta :( A resposta é: letra d!");  
                erros = erros + 1;
                invalido = false;
            break;
            default:
                System.out.println("\nLETRA INVÁLIDA");
                invalido = true;
            break;         
        }
    }while(invalido == true);
        // Fim da QUESTÃO 1.
```

Cada questão está aninhada em um `Do-While` que irá repetir enquanto o usuário não digitar uma entrada válida.

## Finalização do quiz

Finalizada todas perguntas, será exibido o número total de erros e acertos: 

```java
    System.out.println("\nRespostas certas: " + acertos);
    System.out.println("Respostas erradas: " + erros + "\n");
```

Em seguida haverá uma sequência de comandos solicitando ao usuário para decidir se deseja realizar o quiz novamente ou não.

Sua estrutura também irá repetir enquanto a entrada for inválida.

```java
    do{
        System.out.println("\nDeseja refazer esse quiz?\n[s] Sim\n[n] Não");
        System.out.print("Opção: ");
        opcao = sc.next().toLowerCase();

        if(opcao.equals("s") || opcao.equals("n")){
            invalido = false;
        }else{
            invalido = true;
            System.out.println("Inválido\n");
        }
    }while(invalido == true);
```
A pontuação será zerada:

```java
    acertos = 0;
    erros = 0;
```

E a Limpeza do Console será executada.

## Executar novamente ou não

Com o fim dos comandos dentro do `Switch-Case` será impresso no console solicitando ao usuário para decidir se deseja encerrar o algoritmo ou não.

```java
    do{
        System.out.println("Deseja encerrar a execução do programa?\n[s] Sim\n[n] Não");
        System.out.print("Opção: ");
        volta = sc.next().toLowerCase();
        
            if(volta.equals("s") || volta.equals("n")){
                invalido = false;
            }else{
                invalido = true;
                System.out.println("Inválido\n");
            }
    }while(invalido == true);
```

A variável `volta` serve para armazenar a entrada obtida para a repetição da Estrutura Principal.

```java
    do{
            // Algoritmo que inclui comandos/invocações de métodos
            // referentes ao menu principal e aos quizes
        do{
            System.out.println("Deseja encerrar a execução do programa?\n[s] Sim\n[n] Não");
            System.out.print("Opção: ");
            volta = sc.next().toLowerCase();
            
                if(volta.equals("s") || volta.equals("n")){
                    invalido = false;
                }else{
                    invalido = true;
                    System.out.println("Inválido\n");
                }
        }while(invalido == true);
    }while(volta.equals("n"));
```

Caso o usuário deseje finalizar a execução, então será finalizado. Caso o usuário deseje continuar, a Estrutura Principal irá repetir.

# Contribuidores
   
* [André Mendes](https://github.com/MrFagothz)
* [Edelin Chaves](https://github.com/ede-ch)
* [Luan Evander](https://github.com/LuanEvander)