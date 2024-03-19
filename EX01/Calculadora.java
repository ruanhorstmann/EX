package EX.EX01;

// Classe Calculadora para realizar os cálculos
class Calculadora {
    public static int adicao(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtracao(int num1, int num2) {

        return num1 - num2;
    }

    public static int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public static int divisao(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return -1; // Retorna -1 em caso de divisão por zero
        } else {
            return num1 / num2;
        }
    }
}
