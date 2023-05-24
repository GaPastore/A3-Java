create database db_sistema_cadastro;
use db_sistema_cadastro;

create table tb_usuario (
	id int primary key auto_increment,
    nome varchar(200),
    senha varchar(200)
    );
    
insert into tb_usuario (nome, senha) values ('admin', 'admin');

select * from tb_usuario;