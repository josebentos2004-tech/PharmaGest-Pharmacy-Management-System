# Fluxo operacional de alto nível

```mermaid
flowchart TD
    A[Cadastro e actualização de medicamentos] --> B[Gestão de lotes e validade]
    B --> C[Consulta e inventário de stock]
    C --> D[Pedido do cliente]
    D --> E[Processamento da venda]
    E --> F[Pagamento / confirmação]
    F --> G[Emissão de factura ou recibo]
    G --> H[Actualização do stock]
    H --> I[Relatórios operacionais e mensais]
```

O fluxo sintetiza as actividades descritas no caso. A ordem exacta de confirmação de pagamento, emissão fiscal e baixa de stock deve ser validada com as regras operacionais e legais aplicáveis.
