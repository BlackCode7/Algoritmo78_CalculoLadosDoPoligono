# Algoritmo78_CalculoLadosDoPoligono

Dado um polfgono convexo de n lados, podemos calcular o número de diagonais
diferentes (nd) desse polfgono pela fórmula : nd = n (n - 3) I 2. Fazer um algoritmo
que leia quantos lados tem o po/fgono, calcule e escreva o número de diagonais
diferentes (nd) do mesmo.

prog lea51

real nd;

int n;

imprima "\ndigite o numero de lados do poligono: ";

leia n;

nd <- n * ( n - 3) I 2;

imprima "\nnumero de diagonais: " nd;

imprima "\n";

fimprog
