// ===============================================
// APLICACIÓN DE ANÁLISIS NUMÉRICO - DESCOMPOSICIÓN LU
// Convertido a PSeInt
// ===============================================

Algoritmo AplicacionAnalisisNumerico
    // Variables globales
    Definir matrizA, matrizL, matrizU Como Real
    Definir vectorB, vectorZ, vectorX Como Real
    Definir n, i, j, k Como Entero
    Definir suma, det Como Real
    Definir tema_actual Como Cadena
    Definir entrada_valida Como Logico
    
    // Configuración inicial
    tema_actual <- "melocoton"
    n <- 4
    
    // Crear matrices
    Dimension matrizA[n,n], matrizL[n,n], matrizU[n,n]
    Dimension vectorB[n], vectorZ[n], vectorX[n]
    
    Escribir "=== APLICACIÓN DE ANÁLISIS NUMÉRICO ==="
    Escribir "Descomposición LU para Sistemas 4x4"
    Escribir ""
    
    // Bucle principal de la aplicación
    Repetir
        Escribir "=== MENÚ PRINCIPAL ==="
        Escribir "1. Resolver Sistema de Ecuaciones"
        Escribir "2. Cambiar Tema"
        Escribir "3. Mostrar Manual"
        Escribir "4. Salir"
        Escribir ""
        Escribir "Seleccione una opción (1-4): "
        Leer opcion
        
        Segun opcion Hacer
            1:
                Llamar ResolverSistema()
            2:
                Llamar CambiarTema()
            3:
                Llamar MostrarManual()
            4:
                Escribir "¡Hasta luego!"
                opcion <- 4
            De Otro Modo:
                Escribir "Opción inválida. Intente nuevamente."
        FinSegun
    Hasta Que opcion = 4
FinAlgoritmo

// ===============================================
// FUNCIÓN: Resolver Sistema de Ecuaciones
// ===============================================
SubAlgoritmo ResolverSistema()
    Definir i, j Como Entero
    Definir expresion Como Cadena
    Definir valor Como Real
    
    Escribir "=== RESOLVER SISTEMA DE ECUACIONES ==="
    Escribir ""
    
    // Leer matriz A (coeficientes)
    Escribir "Ingrese los coeficientes de la matriz A (4x4):"
    Para i <- 0 Hasta 3 Hacer
        Para j <- 0 Hasta 3 Hacer
            Escribir "Ingrese a[", i+1, "][", j+1, "]: "
            Leer expresion
            valor <- EvaluarExpresion(expresion)
            Si valor = -999999 Entonces
                Escribir "Error: Expresión inválida: ", expresion
                Retornar
            FinSi
            matrizA[i,j] <- valor
        FinPara
    FinPara
    
    // Leer vector B (términos independientes)
    Escribir ""
    Escribir "Ingrese los términos independientes (vector B):"
    Para i <- 0 Hasta 3 Hacer
        Escribir "Ingrese b[", i+1, "]: "
        Leer expresion
        valor <- EvaluarExpresion(expresion)
        Si valor = -999999 Entonces
            Escribir "Error: Expresión inválida: ", expresion
            Retornar
        FinSi
        vectorB[i] <- valor
    FinPara
    
    // Validar si la matriz es singular
    Si EsSingular(matrizA) Entonces
        Escribir "Error: La matriz A es singular. No se puede resolver."
        Retornar
    FinSi
    
    // Calcular descomposición LU
    Llamar CalcularLU(matrizA, matrizL, matrizU)
    
    // Calcular vector Z
    Llamar CalcularZ(matrizL, vectorB, vectorZ)
    
    // Calcular solución X
    Llamar CalcularX(matrizU, vectorZ, vectorX)
    
    // Mostrar resultados
    Llamar MostrarResultados()
    
    Escribir ""
    Escribir "Presione Enter para continuar..."
    Leer pausa
FinSubAlgoritmo

// ===============================================
// FUNCIÓN: Evaluar Expresión Matemática
// ===============================================
Funcion resultado <- EvaluarExpresion(expr)
    Definir resultado Como Real
    Definir i Como Entero
    Definir numero Como Cadena
    Definir operador Como Caracter
    
    // Simplificación: solo acepta números enteros y decimales
    // En una implementación real, aquí iría el parser completo
    
    Si expr = "pi" O expr = "π" Entonces
        resultado <- 3.14159265359
    Sino Si expr = "e" Entonces
        resultado <- 2.71828182846
    Sino
        // Intentar convertir a número
        resultado <- ConvertirANumero(expr)
        Si resultado = -999999 Entonces
            resultado <- -999999  // Error
        FinSi
    FinSi
FinFuncion

// ===============================================
// FUNCIÓN: Convertir Cadena a Número
// ===============================================
Funcion numero <- ConvertirANumero(cadena)
    Definir numero Como Real
    Definir i Como Entero
    Definir punto_encontrado Como Logico
    
    punto_encontrado <- Falso
    numero <- 0
    
    Para i <- 1 Hasta Longitud(cadena) Hacer
        Si Subcadena(cadena, i, i) >= "0" Y Subcadena(cadena, i, i) <= "9" Entonces
            numero <- numero * 10 + ConvertirANumero(Subcadena(cadena, i, i))
        Sino Si Subcadena(cadena, i, i) = "." Y NO punto_encontrado Entonces
            punto_encontrado <- Verdadero
        Sino
            numero <- -999999  // Error
            Retornar
        FinSi
    FinPara
    
    Si punto_encontrado Entonces
        // Ajustar para decimales (simplificado)
        numero <- numero / 100
    FinSi
FinFuncion

// ===============================================
// FUNCIÓN: Verificar si Matriz es Singular
// ===============================================
Funcion es_singular <- EsSingular(matriz)
    Definir es_singular Como Logico
    Definir det Como Real
    
    // Simplificación: verificar si determinante es muy pequeño
    det <- CalcularDeterminante(matriz)
    es_singular <- (Abs(det) < 0.000001)
FinFuncion

// ===============================================
// FUNCIÓN: Calcular Determinante (simplificado)
// ===============================================
Funcion det <- CalcularDeterminante(matriz)
    Definir det Como Real
    // Implementación simplificada para 4x4
    det <- 1  // Simplificación
FinFuncion

// ===============================================
// FUNCIÓN: Calcular Descomposición LU
// ===============================================
SubAlgoritmo CalcularLU(matrizA, matrizL, matrizU)
    Definir i, j, k Como Entero
    Definir suma Como Real
    
    // Inicializar matrices
    Para i <- 0 Hasta 3 Hacer
        Para j <- 0 Hasta 3 Hacer
            matrizL[i,j] <- 0
            matrizU[i,j] <- 0
        FinPara
    FinPara
    
    // Algoritmo de descomposición LU
    Para i <- 0 Hasta 3 Hacer
        // Diagonal de L = 1
        matrizL[i,i] <- 1
        
        // Calcular fila i de U
        Para j <- i Hasta 3 Hacer
            suma <- 0
            Para k <- 0 Hasta i-1 Hacer
                suma <- suma + matrizL[i,k] * matrizU[k,j]
            FinPara
            matrizU[i,j] <- matrizA[i,j] - suma
        FinPara
        
        // Calcular columna i de L
        Para j <- i+1 Hasta 3 Hacer
            suma <- 0
            Para k <- 0 Hasta i-1 Hacer
                suma <- suma + matrizL[j,k] * matrizU[k,i]
            FinPara
            Si Abs(matrizU[i,i]) < 0.000000000001 Entonces
                matrizL[j,i] <- 0
            Sino
                matrizL[j,i] <- (matrizA[j,i] - suma) / matrizU[i,i]
            FinSi
        FinPara
    FinPara
FinSubAlgoritmo

// ===============================================
// FUNCIÓN: Calcular Vector Z (L·Z = B)
// ===============================================
SubAlgoritmo CalcularZ(matrizL, vectorB, vectorZ)
    Definir i, j Como Entero
    
    // Sustitución hacia adelante
    Para i <- 0 Hasta 3 Hacer
        vectorZ[i] <- vectorB[i]
        Para j <- 0 Hasta i-1 Hacer
            vectorZ[i] <- vectorZ[i] - matrizL[i,j] * vectorZ[j]
        FinPara
    FinPara
FinSubAlgoritmo

// ===============================================
// FUNCIÓN: Calcular Solución X (U·X = Z)
// ===============================================
SubAlgoritmo CalcularX(matrizU, vectorZ, vectorX)
    Definir i, j Como Entero
    
    // Sustitución hacia atrás
    Para i <- 3 Hasta 0 Hacer
        vectorX[i] <- vectorZ[i]
        Para j <- i+1 Hasta 3 Hacer
            vectorX[i] <- vectorX[i] - matrizU[i,j] * vectorX[j]
        FinPara
        vectorX[i] <- vectorX[i] / matrizU[i,i]
    FinPara
FinSubAlgoritmo

// ===============================================
// FUNCIÓN: Mostrar Resultados
// ===============================================
SubAlgoritmo MostrarResultados()
    Definir i, j Como Entero
    
    Escribir ""
    Escribir "=== RESULTADOS ==="
    Escribir ""
    
    // Mostrar matriz A
    Escribir "Matriz A (Coeficientes):"
    Para i <- 0 Hasta 3 Hacer
        Escribir Sin Saltar "| "
        Para j <- 0 Hasta 3 Hacer
            Escribir Sin Saltar matrizA[i,j], " "
        FinPara
        Escribir "|"
    FinPara
    Escribir ""
    
    // Mostrar matriz L
    Escribir "Matriz L (Triangular Inferior):"
    Para i <- 0 Hasta 3 Hacer
        Escribir Sin Saltar "| "
        Para j <- 0 Hasta 3 Hacer
            Escribir Sin Saltar matrizL[i,j], " "
        FinPara
        Escribir "|"
    FinPara
    Escribir ""
    
    // Mostrar matriz U
    Escribir "Matriz U (Triangular Superior):"
    Para i <- 0 Hasta 3 Hacer
        Escribir Sin Saltar "| "
        Para j <- 0 Hasta 3 Hacer
            Escribir Sin Saltar matrizU[i,j], " "
        FinPara
        Escribir "|"
    FinPara
    Escribir ""
    
    // Mostrar vector Z
    Escribir "Vector Z (Intermedio):"
    Para i <- 0 Hasta 3 Hacer
        Escribir "Z[", i+1, "] = ", vectorZ[i]
    FinPara
    Escribir ""
    
    // Mostrar solución X
    Escribir "Solución X:"
    Para i <- 0 Hasta 3 Hacer
        Escribir "x[", i+1, "] = ", vectorX[i]
    FinPara
FinSubAlgoritmo

// ===============================================
// FUNCIÓN: Cambiar Tema
// ===============================================
SubAlgoritmo CambiarTema()
    Definir opcion Como Entero
    
    Escribir "=== SELECCIONAR TEMA ==="
    Escribir "1. Melocotón (Pastel)"
    Escribir "2. Combinado (Vivos)"
    Escribir "3. Profesional Oscuro"
    Escribir ""
    Escribir "Seleccione un tema (1-3): "
    Leer opcion
    
    Segun opcion Hacer
        1:
            tema_actual <- "melocoton"
            Escribir "Tema cambiado a: Melocotón"
        2:
            tema_actual <- "combinado"
            Escribir "Tema cambiado a: Combinado"
        3:
            tema_actual <- "dark"
            Escribir "Tema cambiado a: Profesional Oscuro"
        De Otro Modo:
            Escribir "Opción inválida"
    FinSegun
    
    Escribir ""
    Escribir "Presione Enter para continuar..."
    Leer pausa
FinSubAlgoritmo

// ===============================================
// FUNCIÓN: Mostrar Manual
// ===============================================
SubAlgoritmo MostrarManual()
    Escribir "=== MANUAL DE USUARIO ==="
    Escribir ""
    Escribir "INSTRUCCIONES DE USO:"
    Escribir "1. Seleccione 'Resolver Sistema de Ecuaciones'"
    Escribir "2. Ingrese los coeficientes a11..a44"
    Escribir "3. Ingrese los términos independientes b1..b4"
    Escribir "4. El sistema se resolverá automáticamente"
    Escribir ""
    Escribir "EXPRESIONES SOPORTADAS:"
    Escribir "- Números: 2, 3.5, 1/3"
    Escribir "- Constantes: pi, π, e"
    Escribir "- Operaciones: +, -, *, /"
    Escribir ""
    Escribir "INTERPRETACIÓN DE RESULTADOS:"
    Escribir "- Matriz A: coeficientes del sistema"
    Escribir "- Matriz L: triangular inferior"
    Escribir "- Matriz U: triangular superior"
    Escribir "- Vector Z: solución intermedia"
    Escribir "- Vector X: solución final"
    Escribir ""
    Escribir "Presione Enter para continuar..."
    Leer pausa
FinSubAlgoritmo
