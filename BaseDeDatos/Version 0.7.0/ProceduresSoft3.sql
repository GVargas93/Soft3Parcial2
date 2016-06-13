-- =================================================
-- Autor:			Gerardo Vargas
-- Fecha:			21/05/2016
-- Descripción:		BD_ExamenSoft2
-- Versión:			1.0.0
-- =================================================

use BD_ExamenSoft3

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Insertar_Cliente 1'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Ins_Transferencia]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Ins_Transferencia]
END
GO
	
CREATE PROCEDURE [DML].[Ins_Transferencia]
@Transferencia_iD			int OUTPUT,
@FechaTransferencia		Date,
@Monto					varchar(50),
@MotivoTransferencia 		varchar(250),
@Cuenta_iD_Destino       	int,
@Cuenta_iD_Origen       	int

AS
BEGIN
INSERT INTO [DML].[Tbl_Transferencia]         
values (@FechaTransferencia,@Monto,@MotivoTransferencia,@Cuenta_iD_Destino,@Cuenta_iD_Origen)
SET @Transferencia_iD	 = SCOPE_IDENTITY();
select @Transferencia_iD = @@IDENTITY
END
GO
PRINT '1 FINALIZA PROCEDURE Insertar_Cliente 1'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '2 INICIA PROCEDURE Upd_Cliente 2'

IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Upd_Transferencia]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Upd_Transferencia]
END
GO

CREATE PROCEDURE [DML].[Upd_Transferencia]
@Transferencia_iD			int,
@FechaTransferencia		Date,
@Monto					varchar(50),
@MotivoTransferencia 		varchar(250),
@Cuenta_iD_Destino       	int,
@Cuenta_iD_Origen       	int
as
begin
update [DML].[Tbl_Transferencia] set FechaTransferencia = @FechaTransferencia, Monto = @Monto,MotivoTransferencia = @MotivoTransferencia, Cuenta_iD_Destino=@Cuenta_iD_Destino,  Cuenta_iD_Origen =@Cuenta_iD_Origen
where  Transferencia_iD = @Transferencia_iD;
end
go

PRINT '2 FINALIZA PROCEDURE upd-Cliente 2'

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
-- =================================================
-- exec [DML].[Upd_Cliente] 2,'gerardo',71025879
-- =================================================
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '3 INICIA PROCEDURE Drop_Cliente 3'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Drop_Transferencia]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Drop_Transferencia]
END
GO

CREATE PROCEDURE [DML].[Drop_Transferencia]
@Transferencia_iD			int
AS
BEGIN
delete from [DML].[Tbl_Transferencia]
WHERE Transferencia_iD = @Transferencia_iD;
end
go
PRINT '3 FINALIZA PROCEDURE Drop_Cliente 3'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
-- =================================================
-- exec [DML].Drop_Cliente 9
-- =================================================
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Select_Producto 0'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Select_Transferencia]') 
AND OBJECTPROPERTY(id, N'Select_Producto') = 1)
BEGIN
	DROP PROCEDURE [DML].[Select_Transferencia]
END
GO

CREATE PROCEDURE [DML].[Select_Transferencia]
AS
BEGIN
SELECT        *
FROM           [DML].[Tbl_Transferencia]
END
GO
PRINT '1 FINALIZA PROCEDURE Select_Producto 0'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
