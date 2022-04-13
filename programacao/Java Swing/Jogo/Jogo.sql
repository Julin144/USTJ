create table personagem(
                    id_Personagem int primary key AUTO_INCREMENT , 
                    ds_login varchar(20) not null ,
                    ds_senha varchar(20) not null,
                    nm_personagem varchar(20) not null,
                    nr_energia int not null,
                    nr_fome int not null,
                    nr_sono int not null
                    );
insert into personagem(ds_login,ds_senha,nm_personagem,nr_energia,nr_fome,nr_sono ) values("jogador",123,"Julio",10,0,0);
insert into personagem(ds_login,ds_senha,nm_personagem,nr_energia,nr_fome,nr_sono ) values("jogador 2",321,"Ronaldin",10,0,0);
select * from personagem;
