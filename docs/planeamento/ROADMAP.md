# Roadmap de desenvolvimento

## Marco 0 — Fundação (actual)
- [x] Criar projecto Maven/Spring Boot.
- [x] Configurar H2 para desenvolvimento.
- [x] Preparar perfil PostgreSQL.
- [x] Criar entidades de medicamento e lote.
- [x] Criar API inicial de catálogo e consulta de stock.
- [x] Documentar o caso, requisitos e diagramas iniciais.

## Marco 1 — Gestão de medicamentos e stock
- [ ] Completar edição, desactivação e pesquisa de medicamentos.
- [ ] Implementar entradas, saídas e ajustes de stock com histórico.
- [ ] Implementar alertas de validade e stock mínimo.
- [ ] Definir política de lote e rotação de stock.
- [ ] Criar testes unitários e de integração.

## Marco 2 — Vendas
- [ ] Modelar venda e linhas de venda.
- [ ] Implementar cálculo de totais e descontos autorizados.
- [ ] Garantir operação transaccional e impedir stock negativo.
- [ ] Implementar factura/recibo em formato de demonstração.
- [ ] Criar testes para concorrência, duplicação e falhas.

## Marco 3 — Utilizadores e segurança
- [ ] Implementar autenticação.
- [ ] Implementar perfis: administrador, farmacêutico e auxiliar.
- [ ] Definir permissões por operação.
- [ ] Registar auditoria de operações sensíveis.

## Marco 4 — Pagamentos e relatórios
- [ ] Definir contrato de integração com fornecedor autorizado.
- [ ] Implementar estados de pagamento e idempotência.
- [ ] Criar relatórios de vendas, stock e medicamentos controlados.
- [ ] Validar formatos e obrigações legais com entidades competentes.

## Marco 5 — Operação e expansão
- [ ] Investigar modo offline e sincronização segura.
- [ ] Testar desempenho e disponibilidade.
- [ ] Preparar implantação, monitorização e cópias de segurança.
- [ ] Avaliar multi-farmácia e interoperabilidade.

## Critério de conclusão
Uma tarefa só deve ser marcada como concluída quando estiver implementada, testada e documentada. Itens futuros não devem ser apresentados no README como funcionalidades disponíveis.
