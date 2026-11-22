# Base do caso de estudo e premissas

## 1. Fonte académica

Caso: **Farmácia Comunitária**, MDSI, Variante A, 1.ª Frequência, ISAF, ano lectivo 2025/2026. Este documento de projecto foi preparado a partir do enunciado e da resolução fornecidos pelo autor.

## 2. Contexto descrito no enunciado

A farmácia é pequena, localiza-se numa zona urbana ou periurbana vulnerável e possui balcão de atendimento, armazém e área administrativa. As actividades descritas são gestão de medicamentos, gestão de stocks, processamento de vendas e produção de relatórios.

## 3. Problemas expressamente identificados

- Registos manuais em papel e risco de perda de informação.
- Dificuldade em controlar prazos de validade.
- Rupturas de stock.
- Pagamentos não integrados com o sistema de gestão.
- Reconciliações manuais.
- Falta de relatórios de apoio à decisão.
- Baixa maturidade digital e utilização de apenas um computador para tarefas básicas.

## 4. Objectivos descritos

Digitalizar a gestão de vendas de medicamentos, apoiar o atendimento, controlar stocks, emitir relatórios para a direcção central da saúde e integrar pagamentos (cartões, transferências e POS), permitindo registo automático da transacção e emissão de recibos digitais.

## 5. Requisitos mencionados no enunciado

### Funcionais
- Cadastrar, editar e remover dados de medicamentos: nome, lote, validade e preço.
- Inventariar, contar e calcular stocks.
- Actualizar quantidades após cada venda.
- Receber e processar pedidos, organizar entrega, emitir facturas e calcular descontos.
- Produzir relatórios mensais, incluindo medicamentos controlados.
- Integrar pagamentos e emitir recibos digitais.
- Autenticar utilizadores com perfis diferenciados: farmacêuticos, administradores e auxiliares.

### Não funcionais
- Disponibilidade pretendida de 99%, incluindo fins de semana.
- Processamento de cada venda em menos de 2 segundos.
- Criptografia de dados de clientes e medicamentos.
- Interface simples para funcionários com baixo nível de literacia digital.
- Escalabilidade pretendida para 200 dos 326 municípios, sem perda de conectividade.
- Respeito pelas normas e regulamentos aplicáveis do Ministério da Saúde.
- Interoperabilidade futura com sistemas de saúde, prescrições electrónicas e BI.

## 6. Tipos de sistemas referidos na resolução fornecida

- SGBD: gestão centralizada e uniforme dos dados.
- TPS: processamento de transacções e operações diárias.
- MIS: relatórios de gestão e informação de controlo.
- DSS/BI: evolução futura para apoio à decisão e inteligência de negócio.
- SIS: perspectiva estratégica e expansão.

Estas classificações são preservadas como conteúdo de estudo do documento de origem; a arquitectura técnica deste repositório não implementa todos esses tipos de sistema.

## 7. Premissas técnicas propostas (não são exigências literais do enunciado)

- Java 17 e Spring Boot para o backend.
- PostgreSQL como base de dados prevista para produção e H2 para desenvolvimento local.
- Separação por camadas: controller, service, repository, model e DTO.
- Identificação de lotes individualmente para permitir controlo de validade.
- Uso de controlo optimista de concorrência na entidade de lote como primeira protecção contra actualizações concorrentes.
- Desenvolvimento incremental, começando por catálogo e stock antes de vendas e integrações.

## 8. Pontos que exigem investigação antes de produção

O enunciado não fornece especificações de APIs de pagamento, formatos oficiais de relatórios, legislação detalhada, requisitos de prescrição, política de retenção de dados ou arquitectura de conectividade offline. Estes pontos não devem ser inventados. Devem ser levantados com as entidades competentes e fornecedores antes de qualquer implantação real.
