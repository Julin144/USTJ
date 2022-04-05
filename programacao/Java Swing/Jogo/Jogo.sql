create table personagem(
                    id_Personagem integer primary key AUTO_INCREMENT , 
                    ds_login varchar(20),
                    ds_senha varchar(20),
                    nm_personagem varchar(20),
                    nr_energia integer,
                    nr_fome integer,
                    nr_sono integer
                    );
insert into personagem(ds_login,ds_senha,nm_personagem,nr_energia,nr_fome,nr_sono ) values("jogador",123,"Julio",10,0,0);
insert into personagem(ds_login,ds_senha,nm_personagem,nr_energia,nr_fome,nr_sono ) values("jogador2",321,"Julia",10,0,0);
select * from personagem;
