# THREAD
Implementar um programa em java que irá simular o comportamento de um pedágio.  Os seguintes dados serão informados pelo usuário para o funcionamento do programa:  
1 - Número total de cancelas. 
2 - Número de cancelas ativas no momento. 
3 - Número de veículos a serem atendidos.

Os seguintes dados poderão ser fixados no código:

1 - Valor do pedágio

As seguintes regras devem ser atendidas:

1 - O número de threads criadas não poderá ultrapassar o número de cancelas ativas
2 - Cada carro terá uma informação de tempo de atendimento (um número inteiro).
Esse valor deve ser utilizado para que cada thread aguarde o tempo de atendimento definido.

Ao final da execução, as seguintes informações devem ser apresentadas:

1 - Número de carros atendidos por cada cancela.
2 - Relatório de Total arrecadado por cada cancela
(Ordenado do maior para o menor).
