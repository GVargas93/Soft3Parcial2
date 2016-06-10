-- =================================================
-- Autor:			Alvaro Siles
-- Fecha:			21/05/2016
-- Descripción:		BD_ExamenSoft2
-- Versión:			1.0.0
-- =================================================

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------

PRINT 'INICIANDO CREACION DE LA BASE DE DATOS'

USE master;
GO

IF NOT EXISTS(SELECT name FROM sys.databases WHERE name = 'BD_ExamenSoft3')
	CREATE DATABASE BD_ExamenSoft3;
GO

USE BD_ExamenSoft3
GO

PRINT 'FIN CREACION BASE DE DATOS'
GO


PRINT 'INICIANDO CREACION DE ESQUEMAS'

IF NOT EXISTS (SELECT * FROM sys.schemas WHERE name = N'DML')
	Exec('CREATE SCHEMA DML')
GO

PRINT 'FIN CREACION DE ESQUEMAS'
GO
------------------------------------- Soy Una Barra Separadora :) ----------------------------------------
PRINT 'INICIANDO CREACION DE TABLAS'
------------------------------------- Soy Una Barra Separadora :) ----------------------------------------
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
Print 'Iniciando 4 Tabla-Tbl_Tranferencia'

CREATE TABLE [DML].[Tbl_Tranferencia]
(
Transferencia_iD			int identity(1,1) not null,
FechaTransferencia				DATE not null,
Monto 					varchar(50) not null,
Categoria_iD_Fk					int not null,
Constraint	Pk_Tbl_Tranferencia primary key (Transferencia_iD),						
)
Go
Print 'Finalizando 4 Tabla-Tbl_Tranferencia'

------------------------------------- Soy Una Barra Separadora :) ----------------------------------------
------------------------------------ Soy Una Barra Separadora :) ----------------------------------------
Print 'Iniciando 3 Tabla-Tbl_CategoriaTransferencia'

CREATE TABLE [DML].[Tbl_CategoriaTransferencia]
(
Categoria_iD			int identity(1,1) not null,
TipoCategoria				varchar(250) not null,
CONSTRAINT PK_Tbl_CategoriaTransferencia primary key(Categoria_iD),
)
Go
Print 'Finalizando 3 Tabla-Tbl_CategoriaTransferencia'

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------