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
- [X] Schritt 10, Ant als Build-Werkzeug einsetzen, HTML Doku erstellbar über Konsole
- [X] Schritt 11, README.md anpassen und *release4* erzeugen
- [X] Schritt 12, Lösung aus Schritt 10 im main-branch des GitHub-repositories verwenden und auf GitHub mit Hilfe von Actions ein Build erstellen, das bei einem Commit oder manuell getriggert wird. Verwenden von GitHub-Pages um die erstellte HTMLDokumentation im repository verfügbar zu machen. README.md anpassen und *release5* erzeugen

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
- diverse Probleme beim Commit
  - Fälschlicherweise die FixedPointNumber.iml gelöscht -> führte zum Projektfehler (lokal)
  - Unachtsames Pushen führte zu Problemen unter den Branches
  - Restore etwas schwieriger, aber gelöst durch Erstellen eines Branches von einem älteren Commit
  - Diesen mit dem lokalen Projekt zusammengeführt, verglichen und neu committed
- Erstellen eines gitignore, damit keine IDE-Projekt-Files übertragen werden
- Ant-Configuration (build.xml) erstellt mit Hilfe von Beispieldateien aus Vorlesungsunterlagen, Internetrecherche und Ant-Dokumentation
- Screenshot von lokal ausgeführter Ant-Config in Projektverzeichnis

![Screenshot](ant-execute-screenshot.PNG)

- *\mainpage* - Attribut in der Hauptklasse 'Account' hinzugefügt und HTML-Dokumentation neu erstellt (-> für Doxygen)
- Release4 erstellt und release-4-branch zur Sicherung des aktuellen Standes

## Beschreibung der Code-Änderungen ([Release-5](../../releases/tag/release-5))
- GitActions durch Anlegen zweier .yml-Dateien in .github/workflows
  - ant.yml -> zum Kompilieren über ANT auf Github
  - doxygen.html -> zum Erstellen von GitPages über eine Action
- GitPages veröffentlicht und erreichbar unter: ([https://vrlab-hskl.github.io/SMGWiltz/](https://vrlab-hskl.github.io/SMGWiltz/))
- JUnit-Testfiles nach kommentiert
- Neuer Durchlauf von ANT angetriggert, um Dokumentation zu erneuern
- Neuen Durchlauf über GitActions angestoßen, um gitpages zu aktualisieren