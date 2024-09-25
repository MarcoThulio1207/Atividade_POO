import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respostaMidia;
        int id = 0;
        int resposta;


        PlataformaStreaming plataformaStreaming = new PlataformaStreaming();
        System.out.println("Seja bem vindo ao piratão");
        System.out.println("Dgite seu nome para se cadastrar: "); 
        String nomeUsuario = scanner.nextLine();
        Usuario usuario01 = new Usuario(nomeUsuario, id, false);
        plataformaStreaming.registrarUsuario(usuario01);

        do { 
            do {
                System.out.println();
                System.out.println("Olá " + usuario01.getNome());
                System.out.println("o que você deseja realizar ?");
                System.out.println("""
                            
                            1 - ativar assinatura.
                            2 - criar uma nova midia.
                            3 - reproduzir mídias. \s
                            4 - adicionar midia aos favoritos.
                            5 - remover midia das favoritas.
                            6 - encerrar processo.
                            """);
                resposta =scanner.nextInt();
                switch (resposta){
                    case 1:
                            plataformaStreaming.ativarAssinatura(usuario01);
                            System.out.println("Conta ativada");
                        break;

                    case 2:
                        System.out.println("""
                        Filme: digite F/f
                        Musica: digite M/m
                        Série: digite S/s """);
                        System.out.print("Qual o tipo de mídia?");
                        scanner.nextLine();
                        respostaMidia = scanner.nextLine();

                        System.out.print("Informe o título: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Informe o ano de lançamento: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        if (respostaMidia.equalsIgnoreCase("f")) {
                            System.out.print("Informe a duração em minutos do filme: ");
                            int duracao = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Informe o diretor do filme: ");
                            String diretor = scanner.nextLine();

                            Filme filme = new Filme(titulo, ano, false, duracao, diretor);
                            plataformaStreaming.adicionarMidia(filme);


                        } else if (respostaMidia.equalsIgnoreCase("m")) {
                            System.out.print("Informe o artista da música: ");
                            String artista = scanner.nextLine();

                            System.out.print("Informe a duração em minutos da música: ");
                            int duracao = scanner.nextInt();
                            scanner.nextLine();

                            Musica musica = new Musica(titulo, ano, false, artista, duracao);
                            plataformaStreaming.adicionarMidia(musica);

                        } else if (respostaMidia.equalsIgnoreCase("s")) {
                            System.out.print("Informe o número de temporadas da série: ");
                            int temporadas = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Informe o número de episódios: ");
                            int episodios = scanner.nextInt();
                            scanner.nextLine();

                            Serie serie = new Serie(titulo, ano, false, temporadas, episodios);
                            plataformaStreaming.adicionarMidia(serie);

                        } else {

                            System.out.println("Digite uma opção valida");
                        }
                        break;
                    case 3:

                        System.out.println("essas são nossas opções de mídia: ");
                        int count =0;
                        for (Midia mid : plataformaStreaming.listarCatalogoDisponivel()){
                            System.out.println((count+1) + "- " + mid.toString());
                            count++;
                        }
                        System.out.println("Qual midia você gostaria de reproduzir ?");
                        int resposta01 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println(plataformaStreaming.getCatalogo().get(resposta01 -1).reproduzir());
                        break;
                    case 4:

                        System.out.println("essas são nossas opções de mídia: ");
                        int count4 =0;
                        for (Midia mid : plataformaStreaming.listarCatalogoDisponivel()){
                            System.out.println((count4+1) + "- " + mid.toString());
                            count4++;
                        }
                        System.out.println("Qual midia você gostaria de adicionar as favoritas ?");
                        resposta01 = scanner.nextInt();
                        usuario01.adicionarMidiaFavorita(plataformaStreaming.getCatalogo().get(resposta01 -1));
                        break;
                    case 5:

                    System.out.println("essas são nossas opções de mídia: ");
                    int count5 =0;
                    for (Midia mid : plataformaStreaming.listarCatalogoDisponivel()){
                        System.out.println((count5+1) + "- " + mid.toString());
                        count5++;
                    }
                    System.out.println("Qual midia você gostaria de remover das favoritas ?");
                    resposta01 = scanner.nextInt();
                    usuario01.removerMidiaFavorita(plataformaStreaming.getCatalogo().get(resposta01 -1));
                    break;

                    case 6:
                        System.out.println("Encerrando o processo.");
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (resposta != 6);
            
        } while (true);

    }
}
