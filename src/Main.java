import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // Bloco try para tratamento de erros da lib .Scanner
        try(Scanner sc = new Scanner(System.in)){
            int acertos = 0, erros = 0;
            
            // Variáveis tipo String para entradas do usuário
            String opcao, volta;
            
            // Estrutura principal
            do{ 
                // Instruções para limpar o console
                System.out.print("\033[H\033[2J");
                System.out.flush();
                // Menu de temas
                System.out.println("Escolha um tema:\n(a) Formula 1\n(b) Filosofia\n(c) Jogos\n(d) Fim");
                System.out.print("Opção: ");
                // .toLowerCase para forçar letras minúsculas
                opcao = sc.next().toLowerCase();
                
                // Instruções para limpar o console
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Switch-Case para seleção dos quizes
                switch(opcao){
                    // Início do Quiz sobre Formula 1
                    case "a":
                        do{
                            System.out.print("Quiz Formula 1\n\n");

                            // Primeira pergunta
                            System.out.println("1 - Lewis Hamilton é o piloto que mais venceu corridas na Formula 1. Quantas corridas ele venceu?\na) 85\nb) 103\nc) 157\nd) 42");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "b":
                                    System.out.println("\nResposta Certa! Hamilton possui também o maior número de pole position's.\n");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "c": case "d":
                                    System.out.println("\nResposta Errada! Lewis Hamilton venceu uma centena de corridas!\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nResposta inválida.\n");
                                break;  
                            }// Fim da primeira pergunta
                            
                            // Segunda pergunta
                            System.out.println("2 - O Brasil possui muitas conquistas na Formula 1. Quantos mundiais de pilotos o Brasil possui?\na) 8\nb) 12\nc) 5\nd) 20");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "a":
                                    System.out.println("\nResposta Certa! O Brasil é o terceiro em número de campeonatos mundiais por nação.\n");
                                    acertos = acertos + 1;
                                break;
                                case "b": case "c": case "d":
                                    System.out.println("\nResposta Errada! O Brasil possui quase uma dezena de campeonatos mundiais por nação.\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nResposta inválida\n");
                                break;
                            }// Fim da segunda pergunta
                            
                            // Terceira pergunta
                            System.out.println("3 - Equipes de Formula 1 têm contratado pilotos cada vez mais jovens. Quantos anos tinha o piloto mais jovem a vencer uma corrida de Formula 1?\na) 16\nb) 21\nc) 18\nd) 24");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "c":
                                    System.out.println("\nResposta Certa! Max Verstappen venceu o Grand Prix da Espanha de 2016 aos 18 anos, 7 meses \n");
                                    acertos = acertos + 1;
                                break;
                                case "a":case "b": case"d":
                                    System.out.println("\nResposta Errada! Ele acabara de conseguir idade para tirar carteira de habilitação.\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nResposta inválida\n");
                                break;
                            }// Fim da terceira pergunta
                            
                            // Quarta pergunta
                            System.out.println("4 - Ayrton Senna ficou conhecido como o Rei de Mônaco devido seu número de vitórias nesse circuito. Quantas vitórias ele obd) 6");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "d":
                                    System.out.println("\nResposta Certa! Ayrton Senna foi também pole position 5 vezes.\n");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "b": case "c":
                                    System.out.println("\nResposta Errada! Ayrton Senna venceu 5 vezes consecutivas.\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nResposta inválida.\n");
                                break;
                            }// Fim da quarta pergunta
                            
                            // Quinta pergunta
                            System.out.println("5 - O pit stop na Formula 1 é muito conhecido por sua eficiência. Qual o pit stop mais rápido já executado durante uma corrida?\na) 2,56s\nb) 1,82s\nc) 0,97s\nd) 3,14");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "b":
                                    System.out.println("\nResposta Certa! A parada de Max Verstappen no Grand Prix do Brasil de 2019 foi de 1,82 segundos.\n");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "d": case "c":
                                    System.out.println("\nResposta Errada! Pit stops na Formula 1 podem ser inferiores a 2 segundos.\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nResposta inválida.\n");
                                break;
                            }// Fim da quinta pergunta

                            // Fim do Quiz sobre Formula 1
                            
                            // Resultado do quiz
                            System.out.println("\nTotal de acertos: " + acertos);
                            System.out.println("Total de erros: " + erros + "\n");

                            // Bloco para repetir o quiz atual
                            System.out.println("\n\nDeseja refazer esse quiz?\n[s] Sim\n[n] Não");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();
                            
                            // Reinicia a pontuação
                            acertos = 0;
                            erros = 0;

                            // Instruções para limpar o console
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                        }while(opcao.equals("s"));
                    break;
                        
                    case "b":
                        // Início do Quiz sobre Filosofia
                        do{                 
                            System.out.println("Quiz de Filosofia");
                            // Primeira pergunta
                            System.out.println("\nQuestão 1:\nQuais destes conceitos pertence a Nietzsche \na)Genealogia da Moral \nb)Materialismo historico \nc)O absurdo \nd)Fenomenologia do espirito\n");
                            System.out.print("Digite sua resposta:");
                            opcao = sc.next().toLowerCase();
                            
                            switch(opcao){
                                case "a":
                                    System.out.println("\nResposta Correta");
                                    acertos = acertos + 1;
                                break;
                                
                                case "b": case "c": case "d":
                                    System.out.println("\nResposta Errada");
                                    erros = erros + 1; 
                                break;
                                
                                default:
                                    System.out.println("\nResposta inválida." + "\n");
                                break; 
                            }// Fim da primeira pergunta
                            
                            // Segunda pergunta
                            System.out.println("\nQuestao 2:   \nQuais destes autores não escreve filosofia:  \na)Sartre   \nb)Camus  \nc)Shakespeare  \nd)Kant");
                            System.out.print("Digite sua resposta:");
                            opcao = sc.next().toLowerCase();
                            
                            switch(opcao){
                                case "c": 
                                    System.out.println("\nResposta Correta");
                                    acertos = acertos + 1;
                                break;

                                case "a": case "b": case "d":
                                    System.out.println("\nResposta Errada");
                                    erros = erros + 1; 
                                break;
                                
                                default:
                                    System.out.println("\nResposta inválida." + "\n");
                                break; 
                            }// Fim da segunda pergunta
                            
                            // Terceira pergunta
                            System.out.println("\nQuestao 3: \nQuais destes autores não pertence à Grecia antiga:  \na)Epiteto  \nb)Platao \nc)Sócrates \nd)Maquiavel");
                            System.out.print("Digite sua resposta:");
                            opcao = sc.next().toLowerCase();
                                    
                            switch(opcao){
                                case "d":
                                    System.out.println("\nResposta Correta");
                                    acertos = acertos + 1; 
                                break;
                                
                                case "a": case "b": case "c":
                                    System.out.println("\nResposta Errada");
                                    erros = erros + 1;
                                break; 
                                
                                default:
                                    System.out.println("\nResposta inválida." + "\n");
                                break; 
                            }// Fim da terceira pergunta
                            
                            // Quarta pergunta
                            System.out.println("\nQuestão 4: \nQuem é o autor da frase \"Tudo flui\"?\n\na)Heraclito  \nb)Epiteto  \nc)Parmindes  \nd)Zenao de Heleia");
                            System.out.print("Digite sua resposta:");
                            opcao = sc.next().toLowerCase();
                            
                            switch(opcao){
                                case "a":
                                    System.out.println("\nResposta Correta");
                                    acertos = acertos + 1;
                                break;
                            
                                case "b": case "c": case "d":
                                    System.out.println("\nResposta Errada");
                                    erros = erros + 1;
                                break;
                                
                                default:
                                    System.out.println("\nResposta inválida." + "\n");
                                break; 
                            }// Fim da quarta pergunta
                            
                            // Quinta pergunta
                            System.out.println("\nQuestão 5: \nQuem é o autor da frase \"Os fins justificam os meios\" \na)Hanna Arendt \nb)Simone de Beavouir \nc)Karl Marx \nd)Nicolau Maquivel");
                            System.out.print("Digite sua resposta:");
                            opcao = sc.next().toLowerCase();
                        
                            switch(opcao){
                                case "d":
                                    System.out.println("\nResposta Correta");
                                    acertos = acertos + 1; 
                                break;

                                case "a": case "b": case "c":
                                    System.out.println("\nResposta Errada");
                                    erros = erros + 1;
                                break;
                                
                                default:
                                    System.out.println("\nResposta inválida." + "\n");
                                break; 
                            }// Fim da quinta pergunta
                            
                            // Fim do Quiz sobre Filosofia
                            
                            // Resultado do quiz
                            System.out.println("\nTotal de acertos: " + acertos);
                            System.out.println("Total de erros: " + erros + "\n");
                            
                            // Bloco para repetir o quiz atual
                            System.out.println("\n\nDeseja refazer esse quiz?\n[s] Sim\n[n] Não");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            // Reinicia a pontuação
                            acertos = 0;
                            erros = 0;

                            // Instruções para limpar o console
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                        }while(opcao.equals("s"));
                    break;

                    case "c":
                        // Início do Quiz sobre Jogos
                        do{ 
                            System.out.println("Quiz Jogos Digitais" + "\n\n");
                            // Início da QUESTÃO 1.
                            System.out.println("QUESTÃO 1. Rockstar Games é conhecida por ter criado grandes nomes dos jogos eletrônicos. Entre eles, qual jogo desta empresa é o mais popular?\n\n a) Red Dead Redemption 2  \n b) L.A Noire \n c) Bully \n d) Grand Theft Auto \n");
                            System.out.print("Informe sua resposta: ");
                            opcao = sc.next().toLowerCase();
                            
                            switch(opcao){
                                case "d":
                                    System.out.println("\nResposta correta! :)");
                                    acertos = acertos + 1; 
                                break;  
                                case "a": case "b": case "c": 
                                    System.out.println("\nAlternativa incorreta :( A resposta é: letra d!");  
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nLETRA INVÁLIDA");
                                break;         

                            }// Fim da QUESTÃO 1.

                            // Início da QUESTÃO 2.
                            System.out.println("\n\nQUESTÃO 2. O jogo 'Crash Bandicoot' é do gênero plataforma com diversos spin-offs do gênero corrida e em grupo. Qual foi o primeiro console disponível para jogá-lo?\n\n a) Nitendo DS \n b) PlayStation \n c) Xbox \n d) Game Cube \n");
                            System.out.print("Informe sua resposta: "); 
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "b":
                                    System.out.println("\nResposta correta! :)");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "c": case "d":
                                    System.out.println("\nAlternativa incorreta :( A respota é: letra b!");
                                    erros = erros + 1;
                                break;
                                default:
                            System.out.println("\nLETRA INVÁLIDA");
                                break;

                            }// Fim da QUESTÃO 2.
                
                            // Início da QUESTÃO 3.
                            System.out.println("\n\nQUESTÃO 3. O jogo 'Dark Souls' faz parte da série Souls que se refere a um conjunto de videojogos do gênero role-playing game de ação, criados e produzidos pela companhia japonesa FromSoftware. Quantos ja foram lançados?\n\n a) 7 \n b) 3 \n c) 6 \n d) 5 \n");
                            System.out.print("Informe sua resposta: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "a":
                                    System.out.println("\nResposta correta! :)");
                                    acertos = acertos + 1;
                                break;
                                case "b": case "c": case "d":
                                    System.out.println("\nAlternativa incorreta :( A resposta é: letra a!");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("\nLETRA INVÁLIDA");
                                break;
                                
                            }// Fim da QUESTÃO 3.
                            
                            // Início da QUESTÃO 4.
                            System.out.println("\n\nQUESTÃO 4. Qual desses jogos é o mais vendido?\n\n a) The Last of Us \n b) Super Mario Bros \n c) Minecraft \n d) Elden Ring\n");
                            System.out.print("Informe sua resposta: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "c":
                                    System.out.println("\nResposta correta! :)");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "b": case "d":  
                                    System.out.println("\nAlternativa incorreta :( A resposta é: letra c!");
                                    erros = erros + 1;
                                break; 
                                default:
                                    System.out.println("\nLETRA INVÁLIDA");
                                break; 

                            }// Fim da QUESTÃO 4.

                            // Início da QUESTÃO 5.
                            System.out.println("\n\nQUESTÃO 5. Qual destes jogos mobile é o mais avaliado positivamente?\n\n a) Pokémon Go \n b) Free Fire \n c) Call Of Duty \n d) Genshin Impact \n");
                            System.out.print("Informe sua resposta: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "d":
                                    System.out.println("\nResposta correta! :)");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "b": case "c":
                                    System.out.println("\nAlternativa incorreta :( A resposta é: letra d!");
                                    erros = erros + 1;
                                break;
                                default:
                                System.out.println("\nLETRA INVÁLIDA");
                                break;

                            }// Fim da QUESTÃ0 5.
                            
                            // Fim do Quiz sobre Jogos

                            // Resultado do Quiz.
                            System.out.println("\nRespostas certas: " + acertos);
                            System.out.println("Respostas erradas: " + erros + "\n");

                            // Bloco para refazer o quiz atual
                            System.out.println("\n\nDeseja refazer o quiz?\n[s] Sim\n[n] Não");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            // Reinicia a pontuação
                            acertos = 0;
                            erros = 0;
                            
                            // Instruções para limpar o console
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                        }while(opcao.equals("s"));
                    break;
                   
                    // Case para encerrar o programa
                    case "d":
                        System.out.println("Sair");
                    break;
                    
                    // Case para entradas inválidas
                    default:
                        System.out.println("Entrada Inválida");
                    break;    
                }
                // Para retroceder no menu dos quizes
                System.out.print("\n\nDeseja sair?\n[s] Sim\n[n] Não");
                volta = sc.next().toLowerCase();

            }while(volta.equals("n"));       
        }
    }
}