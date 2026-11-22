# PharmaGest — Sistema de Gestão de Farmácia Comunitária

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-brightgreen)](https://spring.io/projects/spring-boot) [![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)]()

## Sobre o projecto

O **PharmaGest** é um projecto académico e de portfólio, desenvolvido a partir do caso de estudo *Farmácia Comunitária* da unidade curricular Metodologias de Desenvolvimento de Sistemas de Informação (MDSI), Variante A, 1.ª frequência, ISAF, ano lectivo 2025/2026.

O caso descreve uma farmácia com registos em papel, perda de informação, dificuldades no controlo de validade e rupturas de stock, pagamentos não integrados, reconciliação manual e ausência de relatórios de apoio à decisão. O sistema pretendido deve apoiar a gestão de medicamentos, stock, vendas, pagamentos, utilizadores e relatórios.

> Este repositório é uma implementação independente para fins de aprendizagem. Não é um produto certificado, não substitui orientação farmacêutica nem comprova conformidade com a legislação aplicável.

## Objectivo

Desenvolver progressivamente um sistema que digitalize e integre os processos operacionais de uma farmácia comunitária, melhorando a organização dos dados, o controlo de stock, o processamento de vendas e a produção de informação de gestão.

## Âmbito identificado no caso de estudo

- Cadastro, actualização e consulta de medicamentos (nome, lote, validade e preço).
- Inventariação e actualização de stock após vendas.
- Registo e processamento de pedidos, descontos e emissão de facturas.
- Integração pretendida com cartões, transferências e POS, com registo automático e recibos digitais.
- Relatórios mensais, incluindo informação sobre medicamentos controlados.
- Perfis diferenciados para farmacêuticos, administradores e auxiliares.
- Requisitos de disponibilidade, desempenho, segurança, usabilidade, escalabilidade e conformidade.

## Estado actual da implementação

### Implementado nesta versão inicial
- Projecto Maven com Spring Boot e Java 17.
- Configuração de desenvolvimento com H2 em memória.
- Configuração preparada para PostgreSQL em perfil de produção.
- Entidade de medicamento e entidade de lote.
- API inicial para criar/listar medicamentos, registar lotes e consultar stock.
- Validação básica de dados de entrada.
- Controlo optimista de concorrência na entidade de lote (`@Version`).

### Ainda por implementar
- Autenticação, autorização e perfis de acesso.
- Vendas, carrinho, descontos, facturas e recibos.
- Baixa de stock transaccional após venda e regras completas de lote/validade.
- Pagamentos reais e integração com POS/operadores (dependem de documentação e credenciais oficiais).
- Relatórios mensais e relatórios de medicamentos controlados.
- Auditoria, logs funcionais e trilho de alterações.
- Interface Web, testes automatizados abrangentes, documentação OpenAPI e implantação.
- Estratégia de operação offline e sincronização para cenários de conectividade limitada.

## Tecnologias
- Java 17
- Spring Boot 3.3.5
- Spring Web
- Spring Data JPA / Hibernate
- Jakarta Bean Validation
- H2 (desenvolvimento)
- PostgreSQL (produção prevista)
- Maven

## Como executar

### Pré-requisitos
- JDK 17 ou superior
- Maven 3.8+

Na pasta do projecto:

```bash
mvn spring-boot:run
```

A aplicação inicia em `http://localhost:8080`.

A consola H2 de desenvolvimento fica em `http://localhost:8080/h2-console`.
- JDBC URL: `jdbc:h2:mem:pharmagest`
- User: `sa`
- Password: deixar vazio

### Executar testes

```bash
mvn test
```

### Executar com PostgreSQL

Criar uma base de dados chamada `pharmagest` e definir as variáveis de ambiente `DB_URL`, `DB_USERNAME` e `DB_PASSWORD`. Depois executar:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

Em produção, configurar credenciais seguras fora do código e gerir o esquema com migrações versionadas antes de disponibilizar o sistema.

## API disponível nesta versão

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/api/medicines` | Listar medicamentos |
| POST | `/api/medicines` | Criar medicamento |
| GET | `/api/medicines/{id}/batches` | Listar lotes de um medicamento |
| POST | `/api/medicines/{id}/batches` | Registar lote |
| GET | `/api/medicines/{id}/stock` | Consultar quantidade disponível não expirada |

Exemplo de criação de medicamento:

```json
{
  "name": "Paracetamol 500 mg",
  "category": "Analgésico",
  "salePrice": 750.00
}
```

Exemplo de registo de lote:

```json
{
  "batchCode": "PAR-2026-001",
  "expiryDate": "2027-08-31",
  "quantity": 120
}
```

Os preços e exemplos são dados fictícios, apenas para testes.

## Organização da documentação

- `docs/analise/` — contexto, problemas, objectivos e requisitos.
- `docs/diagramas/` — diagramas de contexto, fluxo e arquitectura (Mermaid).
- `docs/planeamento/` — fases, backlog e decisões em aberto.

## Método de trabalho

O desenvolvimento seguirá os quatro módulos da prova de MDSI:
1. Desenvolvimento de Sistemas.
2. Engenharia de Requisitos.
3. Análise Ambiental e Comportamental.
4. Solução de Problemas.

A documentação distingue os elementos retirados do caso de estudo das decisões técnicas propostas durante a implementação. Ver `docs/analise/BASE_DO_CASO_E_PREMISSAS.md`.

## Contribuição e continuidade

O projecto está em fase inicial. Antes de implementar novos módulos, consultar `docs/planeamento/ROADMAP.md` e actualizar o estado das tarefas. As funcionalidades devem ser acompanhadas por testes e documentação.

## Licença

A definir pelo autor antes de aceitar contribuições externas ou reutilização pública.
