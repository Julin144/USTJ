create table personagem(
                    id_Personagem integer primary key AUTO_INCREMENT , 
                    ds_login varchar(20) not null ,
                    ds_senha varchar(20) not null,
                    nm_personagem varchar(20) not null,
                    nr_energia integer not null,
                    nr_fome integer not null,
                    nr_sono integernot not null
                    );
insert into personagem(ds_login,ds_senha,nm_personagem,nr_energia,nr_fome,nr_sono ) values("jogador",123,"Julio",10,0,0);
insert into personagem(ds_login,ds_senha,nm_personagem,nr_energia,nr_fome,nr_sono ) values("jogador2",321,"Julia",10,0,0);
select * from personagem;
