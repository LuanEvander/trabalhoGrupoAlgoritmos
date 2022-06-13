import java.util.Scanner;

public class App{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){            
            String opcao = "".toLowerCase();
            int acertos = 0, erros = 0;
            String volta = "".toLowerCase();
            
            //Estrutura do menu
            do{
                System.out.println("Escolha um tema:" + "\n" + "(a) Formula 1" + "\n" + "(b) Filosofia" + "\n" + "(c) Jogos" + "\n" + "(d) Fim");
                System.out.print("Opção: ");
                opcao = sc.next().toLowerCase();

                //Switch-Case de seleção dos quizes
                switch(opcao){
                    case "a":
                        do{
                            //Reinicia a pontuação
                            acertos = 0;
                            erros = 0;

                            System.out.print("Quiz Formula 1" + "\n\n");
                            //Primeira pergunta
                            System.out.println("1 - Lewis Hamilton é o piloto que mais venceu corridas na Formula 1. Quantas corridas ele venceu?" + "\n" + "a) 85" + "\n" + "b) 103" + "\n" + "c) 157" + "\n" + "d) 42");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "b":
                                    System.out.println("Resposta Certa! Hamilton possui também o maior número de pole position's." + "\n");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "c": case "d":
                                    System.out.println("Resposta Errada! Lewis Hamilton venceu uma centena de corridas!" + "\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("Resposta inválida." + "\n");
                                break;  
                            }//Fim
                            
                            //Segunda pergunta
                            System.out.println("2 - O Brasil possui muitas conquistas na Formula 1. Quantos mundiais de pilotos o Brasil possui?" + "\n" + "a) 8" + "\n" + "b) 12" + "\n" + "c) 5" + "\n" + "d) 20");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "a":
                                    System.out.println("Resposta Certa! O Brasil é o terceiro em número de campeonatos mundiais por país." + "\n");
                                    acertos = acertos + 1;
                                break;
                                case "b": case "c": case "d":
                                    System.out.println("Resposta Errada! O Brasil possui quase uma dezena de campeonatos mundiais por país." + "\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("Resposta inválida." + "\n");
                                break;
                            }//Fim
                            
                            //Terceira pergunta
                            System.out.println("3 - Equipes de Formula 1 têm contratado pilotos cada vez mais jovens. Quantos anos tinha o piloto mais jovem a vencer uma corrida de Formula 1?" + "\n" + "a) 16" + "\n" + "b) 21" + "\n" + "c) 18" + "\n" + "d) 24");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "c":
                                    System.out.println("Resposta Certa! Max Verstappen venceu o Grand Prix da Espanha de 2016 aos 18 anos, 7 meses e 15 dias." + "\n");
                                    acertos = acertos + 1;
                                break;
                                case "a":case "b": case"d":
                                    System.out.println("Resposta Errada! Ele acabara de conseguir idade para tirar carteira de habilitação." + "\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("Resposta inválida." + "\n");
                                break;
                            }//Fim
                            
                            //Quarta pergunta
                            System.out.println("4 - Ayrton Senna ficou conhecido como o Rei de Mônaco devido seu número de vitórias nesse circuito. Quantas vitórias ele obteve?" + "\n" + "a) 5" + "\n" + "b) 8" + "\n" + "c) 7" + "\n" + "d) 6");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "d":
                                    System.out.println("Resposta Certa! Ayrton Senna foi também pole position 5 vezes." + "\n");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "b": case "c":
                                    System.out.println("Resposta Errada! Ayrton Senna ." + "\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("Resposta inválida." + "\n");
                                break;
                            }//Fim
                            
                            //Quinta pergunta
                            System.out.println("5 - O pit stop na Formula 1 é muito conhecido por sua eficiência. Qual o pit stop mais rápido já executado durante uma corrida?" + "\n" + "a) 2,56s" + "\n" + "b) 1,82s" + "\n" + "c) 0,97s" + "\n" + "d) 3,14");
                            System.out.print("Opção: ");
                            opcao = sc.next().toLowerCase();

                            switch(opcao){
                                case "b":
                                    System.out.println("Resposta Certa! A parada de Max Verstappen no Grand Prix do Brasil de 2019 foi de 1,82 segundos." + "\n");
                                    acertos = acertos + 1;
                                break;
                                case "a": case "d": case "c":
                                    System.out.println("Resposta Errada! Pit stops na Formula 1 podem ser inferiores a 2 segundos." + "\n");
                                    erros = erros + 1;
                                break;
                                default:
                                    System.out.println("Resposta inválida." + "\n");
                                break;
                            }//Fim do Quiz sobre Formula 1
                            
                            //Resultado do quiz
                            System.out.println("Total de acertos: " + acertos);
                            System.out.println("Total de erros: " + erros + "\n");

                            System.out.println("\n\nDeseja refazer esse quiz?" + "\n" + "[s] Sim" + "\n" + "[n] Não");
                            System.out.println("Opção: ");
                            opcao = sc.next().toLowerCase();

                        }while(opcao.equals("s"));
                    break;

                        case "b":
                            do{
                                //Reinicia a pontuação
                                acertos = 0;
                                erros = 0;
                                                    
                                System.out.println("Quiz de Filosofia");
                                //Primeira pergunta
                                System.out.println("Questão 1: Quais destes conceitos pertence a Nietzsche:" + " \na)Genealogia da Moral " +"\nb)Materialismo historico" + " \nc) O absurdo" + "\nd) Fenomenologia do espirito");
                                System.out.println("Digite sua resposta:");
                                opcao = sc.next().toLowerCase();
                                
                                switch(opcao){
                                    case "a":
                                        System.out.println("Resposta Correta");
                                        acertos = acertos + 1;
                                    break;
                                    
                                    case "b": case "c": case "d":
                                        System.out.println("Resposta Errada");
                                        erros = erros + 1; 
                                    break;
                                    
                                    default:
                                        System.out.println("Resposta inválida." + "\n");
                                    break; 
                                }//Fim
                    
                                System.out.println("Questao 2: " + "\n 2) Quais destes autores não escreve filosofia:" + "\na) Sartre " + "\n b) Camus" + "\nc) Shakespeare" + "\nd) Kant");
                                System.out.println("Digite sua resposta:");
                                opcao = sc.next().toLowerCase();
                                
                                switch(opcao){
                                    case "c": 
                                        System.out.println("Resposta Correta");
                                        acertos = acertos + 1;
                                    break;

                                    case "a": case "b": case "d":
                                        System.out.println("Resposta Errada");
                                        erros = erros + 1; 
                                    break;
                                    
                                    default:
                                        System.out.println("Resposta inválida." + "\n");
                                    break; 
                                }//Fim
                                
                                System.out.println("Questao 3: Quais destes autores não pertence à Grecia antiga:" + "\n a)Epiteto" + "\nb)Platao" + "\n  c) Sócrates " + "\n  d)Maquiavel");
                                System.out.println("Digite sua resposta:");
                                opcao = sc.next().toLowerCase();
                                        
                                switch(opcao){
                                    case "d":
                                        System.out.println("Resposta Correta");
                                        acertos = acertos + 1; 
                                    break;
                                    
                                    case "a": case "b": case "c":
                                        System.out.println("Resposta Errada");
                                        erros = erros + 1;
                                    break; 
                                    
                                    default:
                                        System.out.println("Resposta inválida." + "\n");
                                    break; 
                                }//Fim
                                
                                System.out.println("Questão 4: Quem é o autor da frase \"Tudo flui\"?" + "\na) heraclito" + "\nb) Epiteto" + "\nc) Parmindes" + "\nd) Zenao de Heleia");
                                System.out.println("Digite sua resposta:");
                                opcao = sc.next().toLowerCase();
                                
                                switch(opcao){
                                    case "a":
                                        System.out.println("Resposta Correta");
                                        acertos = acertos + 1;
                                    break;
                                
                                    case "b": case "c": case "d":
                                        System.out.println("Resposta Errada");
                                        erros = erros + 1;
                                    break;
                                    
                                    default:
                                        System.out.println("Resposta inválida." + "\n");
                                    break; 
                                }//Fim
                                
                                System.out.println("Questão 5: Quem é o autor da frase \"Os fins justificam os meios\"" + "\na)Hanna Arendt" + "\nb) Simone de Beavouir" + "\nc) Karl Marx" + "\nd) Nicolau Maquivel");
                                System.out.println("Digite sua resposta:");
                                opcao = sc.next().toLowerCase();
                            
                                switch(opcao){
                                    case "d":
                                        System.out.println("Resposta Correta");
                                        acertos = acertos + 1; 
                                    break;

                                    case "a": case "b": case "c":
                                        System.out.println("Resposta Errada");
                                        erros = erros + 1;
                                    break;
                                    
                                    default:
                                        System.out.println("Resposta inválida." + "\n");
                                    break; 
                                }//Fim
                                
                                System.out.println("Total de acertos: " + acertos);
                                System.out.println("Total de erros: " + erros + "\n");

                                System.out.println("\n\nDeseja refazer esse quiz?" + "\n" + "[s] Sim" + "\n" + "[n] Não");
                                System.out.println("Opção: ");
                                opcao = sc.next().toLowerCase();

                            }while(opcao.equals("s"));
                        break;

                
                    case "c":
                        do{ 
                            //Reinicia da pontuação
                            acertos = 0;
                            erros = 0;
                            
                            System.out.println("Quiz Jogos Digitais" + "\n\n");
                            //Início da QUESTÃO 1.
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

                            }//Fim da QUESTÃO 1.

                            //Início da QUESTÃO 2.
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

                            }//Fim da QUESTÃO 2.
                
                            //Início da QUESTÃO 3.
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
                                
                            }//Fimda QUESTÃO 3.
                            
                            //Início da QUESTÃO 4.
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

                            }//Fim da QUESTÃO 4.

                            //Início da QUESTÃO 5.
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

                            }//Fim da QUESTÃ0 5 e Quiz.

                            //Resultado do Quiz.
                            System.out.println("Respostas certas: " + acertos);
                            System.out.println("Respostas erradas: " + erros + "\n");

                            //Refazer o Quiz.

                            System.out.println("\n\nDeseja refazer o quiz?" + "\n" + "[s] Sim" + "\n" + "[n] Não");
                            System.out.println("Opção: ");
                            opcao = sc.next().toLowerCase();
                            
                        }while(opcao.equals("s"));
                    break;
                    
                    case "d":
                        System.out.println("Fim");
                    break;

                    default:
                        System.out.println("Inválido");
                    break;    
                }

                System.out.println("\n\nDeseja voltar ao menu de quizes?" + "\n" + "[s] Sim" + "\n" + "[n] Não");
                volta = sc.next().toLowerCase();    

            }while(volta.equals("s"));      
        }
    }
}