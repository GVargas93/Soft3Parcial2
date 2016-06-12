USE [BD_ExamenSoft3]
GO
/****** Object:  StoredProcedure [dbo].[Actualizar_Tranferencia]    Script Date: 12/06/2016 9:57:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[Actualizar_Tranferencia]

	@FechaTransferencia varchar(50),
	@Monto varchar(50),
	@Categoria_iD_Fk int,
	@Cuenta_iD_FK int,
	@Transferencia_iD int
AS
BEGIN
UPDATE [DML].[Tbl_Tranferencia]
   SET [FechaTransferencia]=@FechaTransferencia,
       [Monto]=@Monto,
       [Categoria_iD_Fk]=@Categoria_iD_Fk,
       [Cuenta_iD_FK]=@Cuenta_iD_FK


 WHERE [Transferencia_iD]=@Transferencia_iD

END 


GO
/****** Object:  StoredProcedure [dbo].[Eliminar_Tranferencia]    Script Date: 12/06/2016 9:57:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[Eliminar_Tranferencia]

	@Transferencia_iD int
AS
BEGIN
 DELETE FROM [DML].[Tbl_Tranferencia]
 WHERE [Transferencia_iD]=@Transferencia_iD

END 




GO
/****** Object:  StoredProcedure [dbo].[GetTranferenciaById]    Script Date: 12/06/2016 9:57:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[GetTranferenciaById]

	@intTransferencia_iD int 
AS
BEGIN
SELECT [Transferencia_iD]
      ,[FechaTransferencia]
      ,[Monto]
      ,[Categoria_iD_Fk]
      ,[Cuenta_iD_FK]
  FROM [DML].[Tbl_Tranferencia]
  where [Transferencia_iD]=@intTransferencia_iD
END 




GO
/****** Object:  StoredProcedure [dbo].[Insertar_Tranferencia]    Script Date: 12/06/2016 9:57:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[Insertar_Tranferencia]

	@FechaTransferencia varchar(50),
	@Monto varchar(50),
	@Categoria_iD_Fk int,
	@Cuenta_iD_FK int
	 
AS
BEGIN
INSERT INTO [DML].[Tbl_Tranferencia]
           ([FechaTransferencia]
           ,[Monto]
           ,[Categoria_iD_Fk]
           ,[Cuenta_iD_FK])
     VALUES
           (@FechaTransferencia,@Monto,@Categoria_iD_Fk,@Cuenta_iD_FK)
END 


GO
/****** Object:  StoredProcedure [dbo].[SelectAll_Tranferencia]    Script Date: 12/06/2016 9:57:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[SelectAll_Tranferencia]
AS
BEGIN
SELECT [Transferencia_iD]
      ,[FechaTransferencia]
      ,[Monto]
      ,[Categoria_iD_Fk]
      ,[Cuenta_iD_FK]
  FROM [DML].[Tbl_Tranferencia]
END




GO
