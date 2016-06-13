-- =================================================
-- Autor:			Gerardo Vargas
-- Fecha:			21/05/2016
-- Descripción:		BD_ExamenSoft2
-- Versión:			1.0.0
-- =================================================

use BD_ExamenSoft3

------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Insertar_Cliente 1'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Ins_Categoria]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Ins_Categoria]
END
GO

CREATE PROCEDURE [DML].[Ins_Categoria]
@Categoria_iD			int OUTPUT,
@TipoCategoria			varchar(250)

AS
BEGIN
INSERT INTO [DML].[Tbl_Categoria]         
values (@TipoCategoria)
SET @Categoria_iD	 = SCOPE_IDENTITY();
select @Categoria_iD = @@IDENTITY
END
GO
PRINT '1 FINALIZA PROCEDURE Insertar_Cliente 1'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '2 INICIA PROCEDURE Upd_Cliente 2'

IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Upd_Transaccion]') 
AND OBJECTPROPERTY(id, N'IsProcedure') = 1)
BEGIN
	DROP PROCEDURE [DML].[Upd_Categoria]
END
GO

CREATE PROCEDURE [DML].[Upd_Categoria]
@Categoria_iD			int,
@TipoCategoria			varchar(250)
as
begin
update [DML].[Tbl_Categoria] set TipoCategoria = @TipoCategoria
where  Categoria_iD = @Categoria_iD;
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
	DROP PROCEDURE [DML].[Drop_Categoria]
END
GO

CREATE PROCEDURE [DML].[Drop_Categoria]
@Categoria_iD			int
AS
BEGIN
delete from [DML].[Tbl_Categoria]
WHERE Categoria_iD = @Categoria_iD;
end
go
PRINT '3 FINALIZA PROCEDURE Drop_Cliente 3'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
-- =================================================
-- exec [DML].Drop_Cliente 9
-- =================================================
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------
PRINT '1 INICIA PROCEDURE Select_Categoria 0'
IF EXISTS (SELECT * FROM sysobjects WHERE id = object_id(N'[DML].[Select_Categoria]') 
AND OBJECTPROPERTY(id, N'Select_Categoria') = 1)
BEGIN
	DROP PROCEDURE [DML].[Select_Categoria]
END
GO

CREATE PROCEDURE [DML].[Select_Categoria]
AS
BEGIN
SELECT        *
FROM           [DML].[Tbl_Categoria]
END
GO
PRINT '1 FINALIZA PROCEDURE Select_Categoria 0'
------------------------------------- Soy Una Barra Separadora  :) ----------------------------------------