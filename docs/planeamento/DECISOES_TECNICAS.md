# Decisões técnicas iniciais

| Decisão | Estado | Justificação |
|---|---|---|
| Java 17 | Adoptada | Versão LTS e compatível com Spring Boot escolhido. |
| Spring Boot | Adoptada | Base para API REST e organização do backend. |
| PostgreSQL | Prevista | Base de dados relacional para ambiente de produção. |
| H2 | Adoptada em desenvolvimento | Permite executar e experimentar localmente sem instalar servidor de BD. |
| Arquitectura em camadas | Adoptada | Separa entrada HTTP, regras de negócio e persistência. |
| Aplicação modular inicial | Adoptada | Evita complexidade prematura; distribuição em serviços pode ser avaliada futuramente. |

## Questões em aberto

- Definir se a interface será Thymeleaf, React ou outra tecnologia.
- Definir regras legais de facturação e relatórios.
- Identificar fornecedor e documentação oficial para pagamentos.
- Definir estratégia de sincronização para operação com conectividade intermitente.
- Definir política de cópias de segurança, retenção e protecção de dados.
