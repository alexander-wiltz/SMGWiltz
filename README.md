# Software Management Grundlagen
> SMG Repository für Alexander Wiltz

## Checkliste
- [X] Schritt 1, Klassen übernommen und implementiert
- [X] Schritt 2, Klasse *Account* anlegen und von *FixedPointNumber* ableiten
- [X] Schritt 3, Methode *multiply* in Klasse *Account* integrieren
- [X] Schritt 4, Klasse *AppAccount* anlegen und Beispiele für *Account* integrieren
- [X] Schritt 5, README.md anpassen und *release1* erzeugen
- [X] Schritt 6, HTML-Dokumentation erstellen
- [X] Schritt 7, README.md anpassen und *release2* erzeugen
- [X] Schritt 8, Logging implementieren
- [X] Schritt 9, README.md anpassen und *release3* erzeugen
- [ ] Schritt 10, Ant als Build-Werkzeug einsetzen, HTML Doku erstellbar über Konsole
- [ ] Schritt 11, README.md anpassen und *release4* erzeugen
- [ ] Schritt 12, Lösung aus Schritt 10 im main-branch des GitHub-repositories verwenden und auf GitHub mit Hilfe von Actions ein Build erstellen, das bei einem Commit oder manuell getriggert wird. Verwenden von GitHub-Pages um die erstellte HTMLDokumentation im repository verfügbar zu machen. README.md anpassen und *release5* erzeugen

## Beschreibung der Code-Änderungen ([Release-1](../../releases/tag/release-1))
- Hinzugefügte Klasse *Account* (abgeleitet von FixedPointNumber), um die Berechnung von Festkommazahlen mit anderer Skalierung und Verschiebung für Geldbeträge zu berechnen. Multiplikationsmthode hinzugefügt.
- Klasse *AppAccount* angelegt, in dem die Werte berechnet werden mit zwei verschiedenen Beispielen.
- Zusätzliche Unittests angelegt.

## Beschreibung der Code-Änderungen ([Release-2](../../releases/tag/release-2))
- Doxyfile erstellt und mit Hilfe von Doxygen eine HTML-Dokumentation erstellt

## Beschreibung der Code-Änderungen ([Release-3](../../releases/tag/release-3))
- LogBack-Modul in die Dependencies über MAVEN hinzugefügt (Module: logback-core (1.4.0), logback-classic (1.4.0), slf4j-api (2.0.0))
- In die Klassen *FixedPointNumber* und *Account* ein festes Methoden-Logging installiert und exemplarisch in die beiden Beispielklassen (AppAccount, App) jeweils die berechneten Ergebnisse geloggt
- Dateiausgabe in */src/main/resources/logback.xml* konfiguriert 
- Beispieldatei mit Log-Tests liegt im Projekt-Root unter */log/logfile.log*
- Update in der HTML-Dokumentation:
  - zeigt auch private-classes an
  - Kommentare werden jetzt richtig angezeigt (Syntaxfehler im Code)
  - Doxyfile angepasst

## Beschreibung der Code-Änderungen ([Release-4](../../releases/tag/release-4))
- Test

## Beschreibung der Code-Änderungen ([Release-5](../../releases/tag/release-5))
- Test
- Test