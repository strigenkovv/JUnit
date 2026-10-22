# Voortgang

## Projectstructuur

- `be.vdab.theorie`: theoretische voorbeelden.
- `be.vdab.oefeningen`: oefeningen uit de hoofdstukken.

## Afgewerkt

- `Jaar` en `JaarTest`: schrikkeljaar, `toString`, `@DisplayName` en `equals`.
- `Woord` en `WoordTest`: palindroom controleren.
- `Rechthoek` en `RechthoekTest`: oppervlakte en omtrek.
- `Converter` en `ConverterTest`: inches naar centimeters met `BigDecimal`.
- `Artikel` en `ArtikelTest`: prijs inclusief btw.
- `Rekening` en `RekeningTest`: TDD, `@BeforeEach` niet van toepassing, saldo storten en refactoring naar `BigDecimal.ZERO`.
- `Veiling` en `VeilingTest`: hoogste bod, `@DisplayName` en `@BeforeEach`.

## Huidig onderwerp

Hoofdstuk 8.2: `equals` voor `Jaar`.

Toegevoegd aan `JaarTest`:

- twee `Jaar`-objecten met hetzelfde jaartal zijn gelijk;
- twee `Jaar`-objecten met een verschillend jaartal zijn verschillend.

Toegevoegd aan `Jaar`:

```java
@Override
public boolean equals(Object object) {
    return object instanceof Jaar anderJaar && jaar == anderJaar.jaar;
}
```

## Git

- Commitberichten schrijven in het Nederlands.
- `target/`, `.idea/` en `*.iml` staan in `.gitignore`.
