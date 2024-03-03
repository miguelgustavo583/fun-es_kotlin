import kotlin.math.*

// Função para calcular a área do retângulo
fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

// Função para calcular a área do triângulo
fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}

// Função para calcular a área do triângulo equilátero
fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado * lado
}

// Função para calcular a área do triângulo isósceles
fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return 0.5 * base * altura
}

// Função para calcular a área do triângulo escaleno usando a fórmula de Heron
fun calcularAreaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}

// Função para calcular a área da circunferência
fun calcularAreaCircunferencia(raio: Double): Double {
    return PI * raio * raio
}

// Função para calcular a área do losango
fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

// Função para calcular a área do trapézio
fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}

// Exemplo de uso:
fun main() {
    println("Área do retângulo: ${calcularAreaRetangulo(5.0, 4.0)}")
    println("Área do triângulo: ${calcularAreaTriangulo(6.0, 3.0)}")
    println("Área do triângulo equilátero: ${calcularAreaTrianguloEquilatero(4.0)}")
    println("Área do triângulo isósceles: ${calcularAreaTrianguloIsosceles(4.0, 3.0)}")
    println("Área do triângulo escaleno: ${calcularAreaTrianguloEscaleno(3.0, 4.0, 5.0)}")
    println("Área da circunferência: ${calcularAreaCircunferencia(2.0)}")
    println("Área do losango: ${calcularAreaLosango(6.0, 4.0)}")
    println("Área do trapézio: ${calcularAreaTrapezio(4.0, 6.0, 5.0)}")
}
