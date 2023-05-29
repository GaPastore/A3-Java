create database db_sistema_cadastro;
use db_sistema_cadastro;

drop table tb_usuario;

create table tb_usuario (
    id int auto_increment, 
    constraint pk_usuario
    primary key (id),
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

drop table tb_empresa;

create table tb_empresa (
    id int auto_increment, 
    constraint pk_empresa
    primary key (id),
    id_cli int,
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

alter table tb_empresa 
add constraint fk_empresausuario 
foreign key (id_cli) references tb_usuario(id);

insert into tb_usuario (nome, senha) values ('admin', 'admin');

select * from tb_usuario;
select * from tb_empresa;

select nome from tb_usuario;

