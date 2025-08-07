<!-- Continuação das anotações sobre os conteúdos faltantes do dia 04/08/2025 (07/08/2025) -->

- SOLID, O Princípio da Responsabilidade Única afirma que uma classe deve ter apenas um motivo para ser modificada. Isso significa que ela deve ter uma única responsabilidade.

- Exemplo prático desse princípio é a separação entre a apresentação e as regras de negócio. A ideia é que classes que lidam com a interface do usuário (apresentação) e classes que lidam com a lógica do sistema (regras de negócio) devem ser distintas. Elas são alteradas por motivos diferentes, por isso devem ser implementadas separadamente. Isso explica por que existem desenvolvedores de front-end e back-end focados em responsabilidades diferentes.

- Um exemplo de violação desse princípio é uma classe chamada Disciplina que, além de calcular o índice de desistência, também imprime o resultado no console. A classe tem duas responsabilidades: o cálculo e a impressão.

- Princípio da Segregação de Interfaces. Também uma aplicação da ideia de coesão, focando em interfaces, esse princípio defne que interfaces tem que ser pequenas, coesas e específicas para cada tipo de cliente.
