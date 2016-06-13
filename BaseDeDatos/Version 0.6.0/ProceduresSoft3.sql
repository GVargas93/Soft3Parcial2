-- =================================================
-- Autor:			Gerardo Vargas
-- Fecha:			21/05/2016
-- Descripción:		BD_ExamenSoft2
-- Versión:			1.0.0
-- =================================================

use BD_ExamenSoft3

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Insertar_Cliente 1'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Ins_Cuenta]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Ins_Cuenta]
END
GO

CREATE PROCEDURE [DML].[Ins_Cuenta]
@Cuenta_iD			int OUTPUT,
@NroCuenta			varchar(50),
@Saldo       		varchar(50)

AS
BEGIN
INSERT INTO [DML].[Tbl_Cuentas]         
values (@NroCuenta,@Saldo)
SET @Cuenta_iD	 = SCOPE_IDENTITY();
select @Cuenta_iD = @@IDENTITY
END
GO
PRINT '1 FINALIZA PROCEDURE Insertar_Cliente 1'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '2 INICIA PROCEDURE Upd_Cliente 2'

IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Upd_Cuenta]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Upd_Cuenta]
END
GO

CREATE PROCEDURE [DML].[Upd_Cuenta]
@Cuenta_iD			int,
@NroCuenta			varchar(50),
@Saldo       		varchar(50)
as
begin
update [DML].[Tbl_Cuentas] set NroCuenta = @NroCuenta, Saldo = @Saldo
where  Cuenta_iD = @Cuenta_iD;
end
go

PRINT '2 FINALIZA PROCEDURE Upd_Cuenta 2'

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
-- =================================================
-- exec [DML].[Upd_Cliente] 2,'gerardo',71025879
-- =================================================
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '3 INICIA PROCEDURE Drop_Cliente 3'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Drop_Cuenta]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Drop_Cuenta]
END
GO

CREATE PROCEDURE [DML].[Drop_Cuenta]
@Cuenta_iD			int
AS
BEGIN
delete from [DML].[Tbl_Cuentas]
WHERE Cuenta_iD = @Cuenta_iD;
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
	DROP PROCEDURE [DML].[Select_Cuenta]
END
GO

CREATE PROCEDURE [DML].[Select_Cuenta]
AS
BEGIN
SELECT        *
FROM           [DML].[Tbl_Cuentas]
END
GO
PRINT '1 FINALIZA PROCEDURE Select_Producto 0'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
