# Santander Dev Week 2023 - Avanade 2025
Java RESTful API criada durante o bootcamp DecolaTech 2025 - Dio + Avanade.

## Diagrama de Classes

```mermaid

classDiagram
    class User {
        +String name
        +Account account
        +Feature[] features
        +String description
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +float balance
        +float limit
    }

    class Feature {
        +String icon
    }

    class Card {
        +String number
        +float limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
