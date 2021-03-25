# Jogo-de-Batalha-de-Monstros
O objetivo principal deste projeto é criar um sistema de batalhe entre dois jogadores, onde cada jogador poderá escolher 3 monstros para a batalha.

# Regras
1. Devem haver no mínimo 6 possíveis escolhas de monstros pré-definidos;
2. Cada jogador deve escolher 3 destes monstros (idealmente o jogador 2 não pode saber
quais os monstros escolhidos pelo jogador 1). Os dois jogadores podem selecionar os
mesmos monstros;
3. Cada monstro deve possuir valores diferentes em cada atributo;
4. A batalha deve ser efetuada em turnos: onde o jogador 1 escolhe sua ação, depois disso
o jogador 2 escolhe sua ação e por fim as duas ações são executadas conforme as regras
de prioridade descritas abaixo;
5. Cada monstro deve possuir no mínimo dois golpes diferentes e devem haver no mínimo
12 golpes diferentes no jogo;
6. Cada golpe deve possuir valores diferentes para cada atributo;
7. Vence a batalha o jogador que derrotar todos os monstros do oponente;

# Atributos dos monstros
Cada monstro precisa necessariamente ter os atributos: Nome, Tipo/Elemento, Vida, Força,
Defesa e Velocidade.
Atributos dos golpes
Cada golpe precisa necessariamente ter os atributos: Nome, Poder e Tipo/Elemento.
Ações possíveis em cada turno
Atacar (deve-se escolher qual golpe utilizar) – Trocar (deve-se escolher qual monstro substituirá
o atual)

# Regras de prioridade

Depois de ambos jogadores escolherem suas ações o jogo deve executar as ações na seguinte
prioridade: Toda ação de troca deve possuir prioridade máxima, ou seja, sempre é realizada
uma troca antes do cálculo de dano.
Se os dois jogadores resolverem atacar, o monstro com maior velocidade deve atacar primeiro.
Caso dê empate, utilize ataque como critério de desempate e por último a defesa.
Sempre que um monstro é derrotado a ação de troca deve ser realizada imediatamente, sem
que o outro jogador possa realizar um ataque.

# Tipos/Elementos

Cada monstro deve conter um tipo/elemento diferente, todos os seis tipos devem possuir uma
vantagem e uma desvantagem, dessa forma, balanceando o combate:

![elementos](https://i.ibb.co/4g5bLY0/Screenshot-1.jpg)

• Utilize os três tipos acima como referência e acrescente três novos tipos ao seu jogo.
Mecânica geral da batalha
Todos os monstros de cada jogador iniciam a batalha com a vida no máximo, a cada rodada,
quando os golpes são selecionados deve-se aplicar um cálculo baseando-se na força e na
defesa dos monstros envolvidos.
Sempre que um monstro que possui um tipo/elemento que leve vantagem ao seu oponente ele
deve causar o dobro do dano (super effective!).
Neste cálculo considere o tipo do ataque e a fraqueza do monstro que está sendo
atacado

# Ciclo de Vida da Aplicação
![Ciclo de Vida da Aplicação](https://i.ibb.co/Rpk0dcv/Screenshot-2.jpg)

# Contribuidores
- Sabrina Fernandes de Sousa
- Lucas Andrade Zilio
- Raphael Scandura da Cunha
- Michael Carlos Damasceno
- Prospoto pelo professor de Programação Orientada à Objetos, André Santana, no curso de Ciência da Computação na Universidade Anhembi Morumbi
