#Query 1 •	Inserimento di un nuovo utente
INSERT INTO Utente (codicefiscale,nome,cognome,indirizzo,email) values
			('grdngl1987a717v','Angelo','Giordano','Via Superiore','angeljord@hotmail.it');
            
#Query 2 •	Visualizzazione delle informazioni anagrafiche e del modello di telefono posseduto
Select u.codicefiscale, u.nome,u.cognome, s.name as modello
from utente as u, smartphone as s
where u.codicefiscale=s.contatto;

#Query 3 •	Update sia delle informazioni anagrafiche che del telefono
update utente 
inner join
smartphone
on utente.codicefiscale=smartphone.contatto
set
utente.email= ' ', utente.nome=' ',smartphone.ram= ' ', smartphone.cpu=' '
where utente.codicefiscale='fuinbs76s1osram';



#Query 4 •	Visualizzazione delle informazioni relative al telefono
Select * from smartphone
where numero='3203843507';