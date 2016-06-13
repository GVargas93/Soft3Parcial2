-- =================================================
-- Autor:			Gerardo Vargas
-- Fecha:			21/05/2016
-- Descripción:		BD_ExamenSoft3
-- Versión:			1.0.0
-- =================================================

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
---- Union de las base de datos y nuevas columnas----

use BD_ExamenSoft3

alter table [DML].[Tbl_Transacciones]
add constraint FK_Tbl_CategoriaTransacciones foreign key(Categoria_iD_FK) references [DML].[Tbl_Categoria](Categoria_iD)	

alter table [DML].[Tbl_Transferencia]
add constraint FK_Tbl_CuentaDestino foreign key(Cuenta_iD_Destino) references [DML].[Tbl_Cuentas](Cuenta_iD)

alter table [DML].[Tbl_Transferencia]
add constraint FK_Tbl_CuentaOrigen foreign key(Cuenta_iD_Origen) references [DML].[Tbl_Cuentas](Cuenta_iD)	

alter table [DML].[Tbl_Transacciones] add Cuenta_iD_FK int not NULL; 

alter table [DML].[Tbl_Transacciones]
add constraint FK_Tbl_CuentaTransacciones foreign key(Cuenta_iD_FK) references [DML].[Tbl_Cuentas](Cuenta_iD)	
