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
add constraint FK_Tbl_CategoriaTransacciones foreign key(Categoria_iD_FK) references [DML].[Tbl_CategoriaTransaccion](Categoria_iD)	

alter table [DML].[Tbl_Tranferencia]
add constraint FK_Tbl_CategoriaTransferencias foreign key(Categoria_iD_FK) references [DML].[Tbl_CategoriaTransferencia](Categoria_iD)	

alter table [DML].[Tbl_Tranferencia] add Cuenta_iD_FK int not NULL; 

alter table [DML].[Tbl_Tranferencia]
add constraint FK_Tbl_CuentaTransferencias foreign key(Cuenta_iD_FK) references [DML].[Tbl_Cuentas](Cuenta_iD)	

alter table [DML].[Tbl_Transacciones] add Cuenta_iD_FK int not NULL; 

alter table [DML].[Tbl_Transacciones]
add constraint FK_Tbl_CuentaTransacciones foreign key(Cuenta_iD_FK) references [DML].[Tbl_Cuentas](Cuenta_iD)	
