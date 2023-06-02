create database db_sistema_cadastro;
use db_sistema_cadastro;

drop table tb_usuario;

create table tb_usuario (
    id int primary key auto_increment,
    new_data varchar(10),
    nome varchar(50),
    email varchar(50),
    senha varchar(20),
    endereco varchar(45),
    cpf varchar(11),
    cnpj varchar(14),
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

drop table tb_empresa;

create table tb_empresa (
    id int primary key auto_increment,
    bairro_emp varchar(30),
    cidade_emp varchar(20),
    endereco_emp varchar(45),
    email_emp varchar(50),
    estado_emp varchar(2),
    cep_emp varchar(8),
    cnpj_emp varchar(14),
    tel_emp varchar(10),
    cel_emp varchar(8),
    nome_emp varchar(50),
    comp_emp varchar(15),
    arq_emp varchar(50)
);

insert into tb_empresa (bairro_emp, cidade_emp, endereco_emp, email_emp, estado_emp, cep_emp, cnpj_emp, tel_emp, cel_emp, nome_emp, comp_emp, arq_emp) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

select * from tb_usuario where tipo_usuario = 2 and new_data = "11/11/1111" and nome = 'b';

select * from tb_empresa;
select * from tb_usuario;