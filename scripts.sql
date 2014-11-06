--execute apenas a primera vez:
--create database PIM2014;
--go
--USE [master]
--GO
--CREATE LOGIN [appPim2014] WITH PASSWORD=N'pim2014', DEFAULT_DATABASE=[master], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
--GO
--USE [PIM2014]
--GO
--CREATE USER [appPim2014] FOR LOGIN [appPim2014]
--GO
--USE [PIM2014]
--GO
--ALTER USER [appPim2014] WITH DEFAULT_SCHEMA=[dbo]
--GO
--USE [PIM2014]
--GO
--EXEC sp_addrolemember N'db_owner', N'appPim2014'
--GO

USE [PIM2014]
GO
if object_id('TB_CLIENTE') is not null
	drop table TB_CLIENTE
go
create table TB_CLIENTE (
	cdCliente int identity(1,1) primary key,
	vlrCliente decimal,
	nmCliente varchar(50),
	agencia varchar(5),
	conta varchar(5),
	senha varchar(30)
)
go


insert into TB_CLIENTE (vlrCliente, nmCliente, agencia, conta, senha) values (10000, 'José Silva', '123', '1234', 'abcdef')
insert into TB_CLIENTE (vlrCliente, nmCliente, agencia, conta, senha) values (498.75, 'Maria Pereira', '321', '4321', 'senha')
insert into TB_CLIENTE (vlrCliente, nmCliente, agencia, conta, senha) values (1000, 'Renato Augusto', '123', '2345', 'mickeymouse')
go

SELECT * FROM TB_CLIENTE;

if object_id('TB_CAIXA') is not null
	drop table TB_CAIXA
go
create table TB_CAIXA (
	CDBDN int identity(1,1) primary key,
	VALORBDN decimal,
	ENDRECOBDN varchar(250)
)

insert into TB_CAIXA (VALORBDN, ENDRECOBDN) values (1000000, 'R. De Cima, 123')
insert into TB_CAIXA (VALORBDN, ENDRECOBDN) values (50000, 'Av. de Baixo, 456')
insert into TB_CAIXA (VALORBDN, ENDRECOBDN) values (20000, 'Av. Paulista, 789')

SELECT VALORBDN, ENDRECOBDN FROM TB_CAIXA