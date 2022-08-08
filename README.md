# SocketSimulation

Desenvolver uma aplicação em rede usando sockets. A aplicação deverá:

+ ter duas implementações, uma usando TCP e outra usando UDP;
+ ser Cliente/Servidor;
+ ser capaz de transferir um arquivo de texto do cliente para o servidor.
 
Após o desenvolvimento das duas aplicações, realizar os experimentos abaixo. Escreva
um relatório comentando sobre o experimento e analisando os resultados.

1. Rode o Wireshark e em seguida rode as aplicações, usando sockets TCP e UDP, desenvolvidas na aula de Redes. Faça transferência com dois arquivos texto com tamanhos diferentes, um com menos de 1500 bytes e outro maior, com uns 10000 bytes. Analise o tráfego gerado pelas duas aplicações e responda as questões a seguir:
   1. Qual a diferença, em termos de tráfego na rede, entre o socket TCP e UDP?
   2. Quantos pacotes são necessários para transmitir um arquivo com TCP e o mesmo arquivo com UDP?

1. Faça alteração da perda de pacotes e da latência da interface de sua rede.
    1. Avaliação com perda de pacotes
        1. Configurar a interface de rede da máquina para incluir perda de pacotes.
        2. Qual a diferença, em termos de tráfego na rede, entre o socket TCP e UDP? 
        + Houve alguma retransmissão usando TCP?
    2. Avaliação com latência (atraso) variável
        1. Configurar a interface de rede da máquina para incluir latência variável.
        2. Qual a diferença, em termos de tráfego na rede, entre o socket TCP e UDP?
        + Houve alguma retransmissão usando TCP?