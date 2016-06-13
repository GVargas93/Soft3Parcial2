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
Print 'Iniciando 4 Tabla-Tbl_Transferencia'

CREATE TABLE [DML].[Tbl_Transferencia]
(
Transferencia_iD			int identity(1,1) not null,
FechaTransferencia				DATE not null,
Monto 					varchar(50) not null,
MotivoTransferencia					varchar(250) not null,
Cuenta_iD_Destino					int not null,
Cuenta_iD_Origen					int not null
Constraint	Pk_Tbl_Tranferencia primary key (Transferencia_iD),						
)
Go
Print 'Finalizando 4 Tabla-Tbl_Transferencia'

------------------------------------- Soy Una Barra Separadora :) ----------------------------------------