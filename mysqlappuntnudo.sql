
select avg(prezzo) from corsi;
-- count
select count(distinct cognome) from studenti;

select * from studenti;
update studenti set genere = null where studente_id = 1;

-- sum()
select sum(distinct prezzo) from corsi;
select sum(prezzo) from iscrizioni;

-- max , min
select max(prezzo) , min(prezzo)
from corsi;

-- floor, ceiling, round
select * from libri;
select prezzo, floor(prezzo), ceiling(prezzo), round(prezzo) from libri;

select avg(prezzo) from libri;

-- length
select titolo, length(titolo) from libri;

-- concat, concat_ws
select concat(cognome,' ', nome)from autori;
select concat_ws(' ', cognome, nome)from autori;


-- substring, left, right
select cognome, substring(cognome, 1, 3) from studenti;
select cognome, left(cognome, 1), right(cognome, 1) from studenti;

select cognome, nome, length(concat(cognome, nome)) from studenti;

select round(avg(length(concat(cognome, nome))),2)from studenti;

-- last_insert_id
select * from studenti;
insert into studenti(cognome, email) value('pasquale', 'pasqu@gmail.com');
select last_insert_id();
insert into studenti(cognome, email) value('pino', 'pinu@gmail.com'),('nudo', 'nudo@gmail.com');

-- replace
select email, replace(email, '.com', '.it') from studenti;

update studenti set email = replace(email, 'gmail.com', 'gmail.it');
select email from studenti;

-- data e ora
select curtime();
select curdate();
select now();
insert into studenti(cognome, email, data_nascita)
values ('cattivo', 'cattivissimo@icloud.com', curdate());
select * from studenti;
select data_nascita, year(data_nascita), month(data_nascita), day(data_nascita), dayofweek(data_nascita)
from studenti;

select dayofweek(curdate());
select dayname(curdate());
select monthname(curdate());                        

select @@lc_time_names;
set lc_time_names = 'it_IT';

select cognome, nome, date_format(data_nascita, '%D/%M del%y')`data di nascita` from studenti;
select time_format(curtime(), '%h:%i %p');

-- str_to_date
select str_to_date('05/10/1969', '%d/%m/%y');
insert into studenti(cognome, email, data_nascita)
value('vienna', 'vienna@gmail.com', str_to_date('05/05/2004', '%d/%m/%Y'));
select * from studenti where studente_id = last_insert_id();

select adddate(curdate(), interval 5 day);
select subdate(curdate(), interval 5 year);
select addtime(curtime(), '00:05:05');

insert into studenti(cognome, email, data_nascita)
value('momo', 'momo@gmail.com', str_to_date(concat_ws('/','01','01','2003'), '%d/%m/%Y'));