# Evidence zaměstnanců (Java Projekt)
**Autor:** Jakub Žalud [259 525]  
**Předmět:** PC2-T – Semestrální projekt

## Popis projektu
Aplikace slouží ke správě zaměstnanců ve firmě, rozdělených do dvou specializací: **Datový analytik** a **Bezpečnostní specialista**. Systém umožňuje evidovat vzájemné spolupráce mezi kolegy a vyhodnocovat statistiky týmu.

### Klíčové funkce:
* **Správa dat:** Přidávání, mazání a abecední výpis zaměstnanců.
* **Vazby:** Evidence spoluprací s různou úrovní kvality (Nízká, Střední, Vysoká).
* **Dovednosti:** Každá skupina má vlastní implementaci výpočtu (analýza počtu vazeb vs. výpočet rizikového skóre).
* **Persistence:** Ukládání a načítání databáze pomocí serializace do souboru `data.ser`.
* **Robustnost:** Ošetření uživatelských vstupů proti zadání neplatných datových typů.

## Poznámka k SQL
V souladu se zadáním (bod "Pozn. Databáze SQL bude sloužit pouze jako záloha dat, program musí být schopný pracovat i bez použití SQL") projekt využívá pro trvalé uchování dat **serializaci do souboru**. SQL integrace nebyla realizována z důvodu prioritizace plné funkčnosti souborového úložiště a logiky programu.

## Jak spustit
1. Stáhněte si `.java` soubory.
2. Importujte je do libovolného IDE (doporučeno Eclipse).
3. Spusťte třídu `Main.java`.
