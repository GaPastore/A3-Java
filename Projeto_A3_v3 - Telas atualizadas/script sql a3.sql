create database db_sistema_cadastro;
use db_sistema_cadastro;

drop table tb_usuario;

create table tb_usuario (
    id int primary key auto_increment,
    nome varchar(50),
    email varchar(50),
    senha varchar(20),
    endereco varchar(45),
    bairro varchar(30),
    cidade varchar(20),
    estado varchar(2),
    cep varchar(8), #sem formatação
    tel_resi varchar(10), #sem formatação
    cel_resi varchar(11), #sem formatação
    tel_come varchar(10), #sem formatação
    cel_come varchar(11), #sem formatação
    comple varchar(15),
    tipo_usuario int(1)
    );

create table tb_empresa (
    id int primary key auto_increment,
    bairro_emp varchar(30),
    cidade_emp varchar(20),
    estado_emp varchar(2),
    cep_emp varchar(8),
    cnpj_emp varchar(14),
    tel_emp varchar(10),
    cel_emp varchar(8),
    nome_emp varchar(50),
    comp_emp varchar(15),
    arq_emp varchar(50)
);

insert into tb_usuario (nome, senha) values ('admin', 'admin');

select * from tb_usuario;