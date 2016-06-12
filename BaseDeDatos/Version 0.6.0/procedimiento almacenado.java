USE [BD_ExamenSoft3]
GO

/****** Object:  StoredProcedure [dbo].[actulizarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[actulizarcuenta]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[actulizarcuenta]
GO

/****** Object:  StoredProcedure [dbo].[eliminarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[eliminarcuenta]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[eliminarcuenta]
GO

/****** Object:  StoredProcedure [dbo].[insertarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[insertarcuenta]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[insertarcuenta]
GO

/****** Object:  StoredProcedure [dbo].[seleccionarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[seleccionarcuenta]') AND type in (N'P', N'PC'))
DROP PROCEDURE [dbo].[seleccionarcuenta]
GO

USE [BD_ExamenSoft3]
GO

/****** Object:  StoredProcedure [dbo].[actulizarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[actulizarcuenta]
	@intcuenta int,
	@nrocuenta varchar,
	@salado varchar
as
begin
update [DML].[Tbl_Cuentas] set NroCuenta = @nrocuenta, Saldo = @salado
where  Cuenta_iD = @intcuenta;;
end

GO

/****** Object:  StoredProcedure [dbo].[eliminarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	jose clavijo
create PROCEDURE [dbo].[eliminarcuenta]
		@intcuenta int

AS
BEGIN

delete from [DML].[Tbl_Cuentas]
WHERE Cuenta_iD = @intcuenta;
	SET NOCOUNT ON;

    -- Insert statements for procedure here

end
GO

/****** Object:  StoredProcedure [dbo].[insertarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	jose clavijo
-- =============================================
CREATE PROCEDURE [dbo].[insertarcuenta]
		@intcuenta int,
	@nrocuenta varchar,
	@salado varchar
AS
BEGIN
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	insert into  [DML].[Tbl_Cuentas](Cuenta_iD,NroCuenta,Saldo)
	values(@intcuenta,@nrocuenta,@salado);
	SET @intcuenta	 = SCOPE_IDENTITY();
select @intcuenta = @@IDENTITY
END

GO

/****** Object:  StoredProcedure [dbo].[seleccionarcuenta]    Script Date: 06/12/2016 01:56:50 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create PROCEDURE [dbo].[seleccionarcuenta]
AS
BEGIN
SELECT        *
FROM           [DML].[Tbl_Cuentas]
END

GO

