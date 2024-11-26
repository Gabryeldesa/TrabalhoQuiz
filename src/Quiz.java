import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Questao> questoes = new ArrayList<>();
        questoes.add(new Questao("1- Quantas notas musicais existem na escala cromática?",
                "A) 7", "B) 8", "C) 12", "D) 10", "E) 5", "C"));
        questoes.add(new Questao("2- Qual é a duração de uma semínima?",
                "A) 1 tempo", "B) 2 tempos", "C) Meio tempo", "D) 4 tempos", "E) 3 tempos", "A"));
        questoes.add(new Questao("3- Qual é o intervalo de uma oitava?",
                "A) 5 tons", "B) 6 tons", "C) 7 tons", "D) 8 tons", "E) Meio tom", "C"));
        questoes.add(new Questao("4- O que é um acorde maior?",
                "A) Tríade formada por uma terça maior e uma quinta justa", "B) Uma única nota",
                "C) Tríade formada por terça menor e quinta diminuta", "D) Uma série de escalas",
                "E) Uma tríade aumentada", "A"));
        questoes.add(new Questao("5- Quantos semitons há em uma oitava?",
                "A) 6", "B) 10", "C) 8", "D) 12", "E) 7", "D"));
        questoes.add(new Questao("6- Qual é a sequência de tons da escala maior?",
                "A) Tom, tom, semitom, tom, tom, tom, semitom", "B) Tom, semitom, tom, tom, semitom, tom, tom",
                "C) Semitom, tom, tom, semitom, tom, tom, semitom", "D) Tom, tom, tom, tom, semitom",
                "E) Semitom, tom, tom, tom, semitom, tom", "A"));
        questoes.add(new Questao("7- O que significa 'pianíssimo' em música?",
                "A) Tocar rapidamente", "B) Tocar muito baixo", "C) Tocar com intensidade média",
                "D) Tocar com força", "E) Tocar pausadamente", "B"));
        questoes.add(new Questao("8- Qual é a fórmula para acordes diminutos?",
                "A) 1ª, 3ª maior e 5ª justa", "B) 1ª, 3ª menor e 5ª diminuta",
                "C) 1ª, 3ª maior e 7ª maior", "D) 1ª, 5ª justa e 8ª", "E) 1ª, 3ª menor e 7ª menor", "B"));
        questoes.add(new Questao("9- Qual é o tempo padrão de um compasso 4/4?",
                "A) 3 tempos", "B) 6 tempos", "C) 4 tempos", "D) 2 tempos", "E) 8 tempos", "C"));
        questoes.add(new Questao("10- O que é um intervalo harmônico?",
                "A) Notas tocadas sucessivamente", "B) Notas tocadas simultaneamente",
                "C) Uma escala menor", "D) Um ritmo alternado", "E) Uma melodia dissonante", "B"));
        questoes.add(new Questao("11- Qual é a definição de 'timbre'?",
                "A) Altura do som", "B) Duração do som", "C) Cor ou qualidade do som",
                "D) Intensidade do som", "E) Frequência do som", "C"));
        questoes.add(new Questao("12- O que é uma síncope na música?",
                "A) Nota sustentada por vários compassos", "B) Ênfase em tempos fracos ou partes fracas do tempo",
                "C) Sequência de notas descendentes", "D) Uma pausa longa", "E) Escala cromática", "B"));
        questoes.add(new Questao("13- Quantos semitons há em um intervalo de quinta justa?",
                "A) 6", "B) 5", "C) 7", "D) 8", "E) 4", "C"));
        questoes.add(new Questao("14- O que significa 'adagio' na música?",
                "A) Tocar rapidamente", "B) Tocar moderadamente rápido", "C) Tocar lentamente",
                "D) Tocar com intensidade", "E) Tocar sem pausas", "C"));
        questoes.add(new Questao("15- Qual é a nota intermediária entre Fá e Sol na escala cromática?",
                "A) Fá sustenido", "B) Sol bemol", "C) Ambas estão corretas", "D) Nenhuma das anteriores",
                "E) Lá bemol", "C"));


        System.out.println("Centro Universitário Alfredo Nascer - Unifan");
        System.out.println("Aluno: Gabryel Albuquerque de Sá");
        System.out.println("Disciplina: Algoitmo e Programação II");
        System.out.println("Professor Breno Pimenta");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Bem-vindo ao Quiz de Teoria Musical!");
        System.out.println("Você responderá 15 perguntas de múltipla escolha.");
        System.out.println("Cada pergunta tem 5 alternativas. Digite a letra correspondente à sua resposta.\n");

        int acertos = 0;
        ArrayList<String> respostasDetalhadas = new ArrayList<>();
        ArrayList<String> questoesErradas = new ArrayList<>();


        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            questao.escrevaQuestao();

            String respostaUsuario = questao.leiaResposta();

            if (questao.isCorreta(respostaUsuario)) {
                acertos++;
                respostasDetalhadas.add("Pergunta " + (i + 1) + " (Acertou): " + questao.pergunta);
            } else {
                respostasDetalhadas.add("Pergunta " + (i + 1) + " (Errou): " + questao.pergunta);
                questoesErradas.add("Pergunta " + (i + 1) + ": " + questao.pergunta +
                        "\nResposta correta: " + questao.correta);
            }
        }

        int erros = questoes.size() - acertos;
        double porcentagem = (acertos / (double) questoes.size()) * 100;

        System.out.println("\n--- Resultados ---");
        System.out.println("Você acertou " + acertos + " questão(ões).");
        System.out.println("Você errou " + erros + " questão(ões).");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);

        System.out.println("\n--- Resumo das Respostas ---");
        for (String detalhe : respostasDetalhadas) {
            System.out.println(detalhe);
        }

        if (!questoesErradas.isEmpty()) {
            System.out.println("\n--- Questões Erradas e Respostas Corretas ---");
            for (String detalheErro : questoesErradas) {
                System.out.println(detalheErro);
            }
        }

        scanner.close();
    }
}


