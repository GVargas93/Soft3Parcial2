-- =================================================
-- Autor:			Gerardo Vargas
-- Fecha:			21/05/2016
-- Descripción:		BD_ExamenSoft2
-- Versión:			1.0.0
-- =================================================

use BD_ExamenSoft3

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Insertar_Cliente 1'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Ins_Transacciones]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Ins_Transacciones]
END
GO

CREATE PROCEDURE [DML].[Ins_Transacciones]
@Transaccion_iD			int OUTPUT,
@FechaTransaccion		Date,
@Monto					varchar(50),
@Categoria_iD_Fk       	int,
@Cuenta_iD_Fk       	int

AS
BEGIN
INSERT INTO [DML].[Tbl_Transacciones]         
values (@FechaTransaccion,@Monto,@Categoria_iD_Fk,@Cuenta_iD_Fk)
SET @Transaccion_iD	 = SCOPE_IDENTITY();
select @Transaccion_iD = @@IDENTITY
END
GO
PRINT '1 FINALIZA PROCEDURE Insertar_Cliente 1'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '2 INICIA PROCEDURE Upd_Cliente 2'

IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Upd_Transaccion]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Upd_Transaccion]
END
GO

CREATE PROCEDURE [DML].[Upd_Transaccion]
@Transaccion_iD			int,
@FechaTransaccion		Date,
@Monto					varchar(50),
@Categoria_iD_Fk       	int,
@Cuenta_iD_Fk       	int
as
begin
update [DML].[Tbl_Transacciones] set FechaTransaccion = @FechaTransaccion, Monto = @Monto, Categoria_iD_Fk=@Categoria_iD_Fk,  Cuenta_iD_Fk =@Cuenta_iD_Fk
where  Transaccion_iD = @Transaccion_iD;
end
go

PRINT '2 FINALIZA PROCEDURE upd-Cliente 2'

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
-- =================================================
-- exec [DML].[Upd_Cliente] 2,'gerardo',71025879
-- =================================================
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '3 INICIA PROCEDURE Drop_Cliente 3'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Drop_Transaccion]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Drop_Transaccion]
END
GO

CREATE PROCEDURE [DML].[Drop_Transaccion]
@Transaccion_iD			int
AS
BEGIN
delete from [DML].[Tbl_Transacciones]
WHERE Transaccion_iD = @Transaccion_iD;
end
go
PRINT '3 FINALIZA PROCEDURE Drop_Cliente 3'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
-- =================================================
-- exec [DML].Drop_Cliente 9
-- =================================================
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Select_Producto 0'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Select_Transaccion]') 
AND OBJECTPROPERTY(id, N'Select_Producto') = 1)
BEGIN
	DROP PROCEDURE [DML].[Select_Transaccion]
END
GO

CREATE PROCEDURE [DML].[Select_Transaccion]
AS
BEGIN
SELECT        *
FROM           [DML].[Tbl_Transacciones]
END
GO
PRINT '1 FINALIZA PROCEDURE Select_Producto 0'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
