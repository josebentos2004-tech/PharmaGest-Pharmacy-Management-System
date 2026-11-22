# Requisitos do PharmaGest

Os requisitos abaixo organizam o que é mencionado no caso de estudo. Os identificadores e prioridades são organização do projecto.

## Requisitos funcionais

| ID | Requisito | Prioridade |
|---|---|---|
| RF-01 | O sistema deve permitir cadastrar medicamentos. | Alta |
| RF-02 | O sistema deve permitir editar e desactivar/remover informação de medicamentos, respeitando o histórico. | Alta |
| RF-03 | O sistema deve registar lote, validade e quantidade por medicamento. | Alta |
| RF-04 | O sistema deve permitir inventariar e consultar níveis de stock. | Alta |
| RF-05 | O sistema deve actualizar o stock após uma venda confirmada. | Alta |
| RF-06 | O sistema deve registar pedidos e processar vendas. | Alta |
| RF-07 | O sistema deve calcular descontos conforme regras autorizadas. | Média |
| RF-08 | O sistema deve emitir facturas e recibos. | Alta |
| RF-09 | O sistema deve integrar meios de pagamento suportados. | Média |
| RF-10 | O sistema deve produzir relatórios mensais, incluindo medicamentos controlados. | Alta |
| RF-11 | O sistema deve disponibilizar relatórios internos de vendas e stock. | Média |
| RF-12 | O sistema deve autenticar utilizadores e diferenciar perfis. | Alta |

## Requisitos não funcionais

| ID | Qualidade/restrição | Critério do enunciado |
|---|---|---|
| RNF-01 | Disponibilidade | 99% do tempo, incluindo fins de semana |
| RNF-02 | Desempenho | Cada venda em menos de 2 segundos |
| RNF-03 | Segurança | Criptografia de dados de clientes e medicamentos |
| RNF-04 | Usabilidade | Interface simples para utilizadores com baixa literacia digital |
| RNF-05 | Escalabilidade/conectividade | Objectivo de expansão a 200 municípios sem perda de conectividade |
| RNF-06 | Conformidade | Respeito pelas normas do Ministério da Saúde e regras de medicamentos controlados |
| RNF-07 | Interoperabilidade futura | Sistemas de saúde, prescrições electrónicas e BI |

## Critérios de aceitação iniciais

- Um medicamento pode ser criado com nome e preço válidos.
- Um lote deve estar associado a um medicamento e possuir código, validade e quantidade.
- A consulta de stock deve excluir lotes cuja validade já terminou.
- Dados inválidos devem produzir resposta HTTP 400.
- Um identificador de medicamento inexistente deve produzir resposta HTTP 404.

## Regras de negócio a detalhar

- Quando e por quem um medicamento pode ser desactivado.
- Como tratar medicamentos controlados e respectivos registos.
- Como calcular e autorizar descontos.
- Em que momento a venda é considerada confirmada.
- Como tratar pagamentos pendentes, recusados, estornados ou duplicados.
- Como seleccionar lotes numa venda e impedir saída de lote expirado.
- Como corrigir inventários sem apagar o histórico.
