USE [master]
GO
/****** Object:  Database [eShopDB]    Script Date: 11/08/2020 12:59:35 SA ******/
CREATE DATABASE [eShopDB]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'eShopDB', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\eShopDB.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'eShopDB_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\eShopDB_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [eShopDB] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [eShopDB].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [eShopDB] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [eShopDB] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [eShopDB] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [eShopDB] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [eShopDB] SET ARITHABORT OFF 
GO
ALTER DATABASE [eShopDB] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [eShopDB] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [eShopDB] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [eShopDB] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [eShopDB] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [eShopDB] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [eShopDB] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [eShopDB] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [eShopDB] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [eShopDB] SET  DISABLE_BROKER 
GO
ALTER DATABASE [eShopDB] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [eShopDB] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [eShopDB] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [eShopDB] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [eShopDB] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [eShopDB] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [eShopDB] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [eShopDB] SET RECOVERY FULL 
GO
ALTER DATABASE [eShopDB] SET  MULTI_USER 
GO
ALTER DATABASE [eShopDB] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [eShopDB] SET DB_CHAINING OFF 
GO
ALTER DATABASE [eShopDB] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [eShopDB] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [eShopDB] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'eShopDB', N'ON'
GO
ALTER DATABASE [eShopDB] SET QUERY_STORE = OFF
GO
USE [eShopDB]
GO
/****** Object:  Table [dbo].[tbAdmin]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbAdmin](
	[AdminID] [varchar](50) NOT NULL,
	[AdminName] [nvarchar](100) NOT NULL,
	[Gender] [bit] NOT NULL,
	[Email] [varchar](255) NOT NULL,
	[Phone] [varchar](20) NOT NULL,
	[Password] [varchar](255) NOT NULL,
	[Address] [varchar](200) NOT NULL,
	[Role] [nvarchar](50) NOT NULL,
	[Status] [bit] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbAdmin] PRIMARY KEY CLUSTERED 
(
	[AdminID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbAdminNoti]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbAdminNoti](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[AdminID] [varchar](50) NOT NULL,
	[Content] [nvarchar](3000) NOT NULL,
	[DueDate] [datetime] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbAdminNoti] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbBrand]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbBrand](
	[BrandID] [int] IDENTITY(1,1) NOT NULL,
	[BrandName] [nvarchar](500) NOT NULL,
	[Description] [nvarchar](3000) NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbBrand] PRIMARY KEY CLUSTERED 
(
	[BrandID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbCategory]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbCategory](
	[CateID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](500) NOT NULL,
	[ParentID] [int] NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Description] [nvarchar](3000) NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbCategory] PRIMARY KEY CLUSTERED 
(
	[CateID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbCcTransaction]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbCcTransaction](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Code] [varchar](500) NOT NULL,
	[OrderID] [int] NOT NULL,
	[Transdate] [datetime] NOT NULL,
	[Processor] [varchar](256) NOT NULL,
	[ProcessorTransID] [varchar](256) NOT NULL,
	[Amount] [bigint] NOT NULL,
	[CcNum] [varchar](256) NOT NULL,
	[CcType] [varchar](256) NOT NULL,
	[Response] [nvarchar](500) NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_CcTransaction] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbEvent]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbEvent](
	[EventID] [int] IDENTITY(1,1) NOT NULL,
	[Brand] [nvarchar](500) NULL,
	[Category] [nvarchar](500) NULL,
	[EventName] [nvarchar](500) NOT NULL,
	[Description] [nvarchar](3000) NOT NULL,
	[StartDate] [datetime] NOT NULL,
	[EndDate] [datetime] NOT NULL,
	[Amount] [int] NOT NULL,
	[Min] [int] NOT NULL,
	[Max] [int] NOT NULL,
	[Type] [nvarchar](100) NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Quantity] [int] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbEvent] PRIMARY KEY CLUSTERED 
(
	[EventID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbEventDetails]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbEventDetails](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[EventID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Amount] [int] NOT NULL,
	[Percent] [tinyint] NOT NULL,
	[Status] [bit] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_tbEventDetails] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbEx_Import]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbEx_Import](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Financial_ID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
	[RealQuantity] [int] NOT NULL,
	[Price] [int] NOT NULL,
	[Total] [bigint] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbEx_Import] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbFeedback]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbFeedback](
	[FID] [int] IDENTITY(1,1) NOT NULL,
	[Content] [nvarchar](3000) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Title] [nvarchar](3000) NOT NULL,
	[Type] [nvarchar](3000) NOT NULL,
	[OrderID] [int] NOT NULL,
	[ReplyContent] [nvarchar](3000) NOT NULL,
	[ReplyBy] [varchar](50) NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbFeedback] PRIMARY KEY CLUSTERED 
(
	[FID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbFinancialPaper]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbFinancialPaper](
	[Financial_ID] [int] IDENTITY(1,1) NOT NULL,
	[Type] [nvarchar](100) NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[EmployeeName] [nvarchar](100) NOT NULL,
	[WareHouseID] [int] NOT NULL,
	[ShippingFee] [int] NOT NULL,
	[OrderID] [int] NULL,
	[Partner] [nvarchar](500) NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbFinancialPaper] PRIMARY KEY CLUSTERED 
(
	[Financial_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbOrder]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbOrder](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[VerifyBy] [varchar](50) NULL,
	[OrderDate] [datetime] NOT NULL,
	[OrderStatus] [varchar](50) NOT NULL,
	[DeliveryDate] [datetime] NULL,
	[Total] [bigint] NOT NULL,
	[Payment] [varchar](50) NOT NULL,
	[Address] [nvarchar](256) NOT NULL,
	[Phone] [varchar](20) NOT NULL,
	[Email] [varchar](256) NOT NULL,
	[Info] [nvarchar](3000) NOT NULL,
	[VoucherID] [int] NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[DeliveryFee] [int] NOT NULL,
	[FinalTotal] [bigint] NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbOrderDetails]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbOrderDetails](
	[ID] [bigint] IDENTITY(1,1) NOT NULL,
	[OrderID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
	[Subtotal] [bigint] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbOrderDetails] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbProduct]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbProduct](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[SKU] [varchar](30) NOT NULL,
	[CateID] [int] NOT NULL,
	[BrandID] [int] NOT NULL,
	[ProductName] [nvarchar](3000) NOT NULL,
	[TotalRating] [int] NOT NULL,
	[NumberRating] [int] NOT NULL,
	[EventID] [int] NOT NULL,
	[ImportPrice] [bigint] NOT NULL,
	[Price] [bigint] NOT NULL,
	[Discount] [bigint] NOT NULL,
	[ProductImage] [nvarchar](3000) NOT NULL,
	[ProductSpec] [xml] NOT NULL,
	[Quantity] [int] NOT NULL,
	[Status] [bit] NOT NULL,
	[Sold] [int] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbProduct] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbRating]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbRating](
	[RateID] [int] IDENTITY(1,1) NOT NULL,
	[ProductID] [int] NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[Status] [bit] NOT NULL,
	[RatingPoint] [tinyint] NOT NULL,
	[Content] [nvarchar](3000) NOT NULL,
	[Layer] [tinyint] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbRating] PRIMARY KEY CLUSTERED 
(
	[RateID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbUser]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbUser](
	[UserName] [varchar](50) NOT NULL,
	[FullName] [nvarchar](100) NOT NULL,
	[Gender] [bit] NOT NULL,
	[Email] [varchar](256) NOT NULL,
	[Phone] [varchar](20) NOT NULL,
	[Password] [varchar](256) NOT NULL,
	[Address] [nvarchar](256) NOT NULL,
	[DOB] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbUser] PRIMARY KEY CLUSTERED 
(
	[UserName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbUserNoti]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbUserNoti](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Content] [nvarchar](3000) NOT NULL,
	[DueDate] [datetime] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbUserNoti] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbVoucher]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbVoucher](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Code] [varchar](50) NOT NULL,
	[StartDate] [datetime] NOT NULL,
	[EndDate] [datetime] NOT NULL,
	[Type] [bit] NOT NULL,
	[FixAmount] [int] NULL,
	[MinRequire] [int] NULL,
	[MaxAmount] [int] NULL,
	[Percent] [tinyint] NULL,
	[Quantity] [int] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbVoucher] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbWareHouse]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbWareHouse](
	[WareHouseID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](500) NOT NULL,
	[Address] [nvarchar](500) NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
	[Status] [bit] NOT NULL,
 CONSTRAINT [PK_tbWareHouse] PRIMARY KEY CLUSTERED 
(
	[WareHouseID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbWishList]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbWishList](
	[WLID] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[Type] [bit] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbWishList] PRIMARY KEY CLUSTERED 
(
	[WLID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tbWishListDetails]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tbWishListDetails](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[WLID] [int] NOT NULL,
	[ProductID] [int] NOT NULL,
	[InsertAt] [datetime] NOT NULL,
	[UpdateAt] [datetime] NOT NULL,
 CONSTRAINT [PK_tbWishListDetails] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Test]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Test](
	[id] [int] NULL,
	[name] [nvarchar](50) NULL,
	[email] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Test2]    Script Date: 11/08/2020 12:59:36 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Test2](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Test2] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[tbAdminNoti]  WITH CHECK ADD  CONSTRAINT [FK_tbAdminNoti_tbAdmin] FOREIGN KEY([AdminID])
REFERENCES [dbo].[tbAdmin] ([AdminID])
GO
ALTER TABLE [dbo].[tbAdminNoti] CHECK CONSTRAINT [FK_tbAdminNoti_tbAdmin]
GO
ALTER TABLE [dbo].[tbCategory]  WITH CHECK ADD  CONSTRAINT [FK_tbCategory_tbCategory] FOREIGN KEY([ParentID])
REFERENCES [dbo].[tbCategory] ([CateID])
GO
ALTER TABLE [dbo].[tbCategory] CHECK CONSTRAINT [FK_tbCategory_tbCategory]
GO
ALTER TABLE [dbo].[tbCcTransaction]  WITH CHECK ADD  CONSTRAINT [FK_tbCcTransaction_tbOrder] FOREIGN KEY([OrderID])
REFERENCES [dbo].[tbOrder] ([OrderID])
GO
ALTER TABLE [dbo].[tbCcTransaction] CHECK CONSTRAINT [FK_tbCcTransaction_tbOrder]
GO
ALTER TABLE [dbo].[tbEventDetails]  WITH CHECK ADD  CONSTRAINT [FK_tbEventDetails_tbEvent] FOREIGN KEY([EventID])
REFERENCES [dbo].[tbEvent] ([EventID])
GO
ALTER TABLE [dbo].[tbEventDetails] CHECK CONSTRAINT [FK_tbEventDetails_tbEvent]
GO
ALTER TABLE [dbo].[tbEventDetails]  WITH CHECK ADD  CONSTRAINT [FK_tbEventDetails_tbProduct] FOREIGN KEY([ProductID])
REFERENCES [dbo].[tbProduct] ([ProductID])
GO
ALTER TABLE [dbo].[tbEventDetails] CHECK CONSTRAINT [FK_tbEventDetails_tbProduct]
GO
ALTER TABLE [dbo].[tbEx_Import]  WITH CHECK ADD  CONSTRAINT [FK_tbEx_Import_tbFinancialPaper] FOREIGN KEY([Financial_ID])
REFERENCES [dbo].[tbFinancialPaper] ([Financial_ID])
GO
ALTER TABLE [dbo].[tbEx_Import] CHECK CONSTRAINT [FK_tbEx_Import_tbFinancialPaper]
GO
ALTER TABLE [dbo].[tbEx_Import]  WITH CHECK ADD  CONSTRAINT [FK_tbEx_Import_tbProduct] FOREIGN KEY([ProductID])
REFERENCES [dbo].[tbProduct] ([ProductID])
GO
ALTER TABLE [dbo].[tbEx_Import] CHECK CONSTRAINT [FK_tbEx_Import_tbProduct]
GO
ALTER TABLE [dbo].[tbFeedback]  WITH CHECK ADD  CONSTRAINT [FK_tbFeedback_tbAdmin] FOREIGN KEY([ReplyBy])
REFERENCES [dbo].[tbAdmin] ([AdminID])
GO
ALTER TABLE [dbo].[tbFeedback] CHECK CONSTRAINT [FK_tbFeedback_tbAdmin]
GO
ALTER TABLE [dbo].[tbFeedback]  WITH CHECK ADD  CONSTRAINT [FK_tbFeedback_tbOrder] FOREIGN KEY([OrderID])
REFERENCES [dbo].[tbOrder] ([OrderID])
GO
ALTER TABLE [dbo].[tbFeedback] CHECK CONSTRAINT [FK_tbFeedback_tbOrder]
GO
ALTER TABLE [dbo].[tbFeedback]  WITH CHECK ADD  CONSTRAINT [FK_tbFeedback_tbUser] FOREIGN KEY([Username])
REFERENCES [dbo].[tbUser] ([UserName])
GO
ALTER TABLE [dbo].[tbFeedback] CHECK CONSTRAINT [FK_tbFeedback_tbUser]
GO
ALTER TABLE [dbo].[tbFinancialPaper]  WITH CHECK ADD  CONSTRAINT [FK_tbFinancialPaper_tbOrder] FOREIGN KEY([OrderID])
REFERENCES [dbo].[tbOrder] ([OrderID])
GO
ALTER TABLE [dbo].[tbFinancialPaper] CHECK CONSTRAINT [FK_tbFinancialPaper_tbOrder]
GO
ALTER TABLE [dbo].[tbFinancialPaper]  WITH CHECK ADD  CONSTRAINT [FK_tbFinancialPaper_tbWareHouse] FOREIGN KEY([WareHouseID])
REFERENCES [dbo].[tbWareHouse] ([WareHouseID])
GO
ALTER TABLE [dbo].[tbFinancialPaper] CHECK CONSTRAINT [FK_tbFinancialPaper_tbWareHouse]
GO
ALTER TABLE [dbo].[tbOrder]  WITH CHECK ADD  CONSTRAINT [FK_tbOrder_tbAdmin] FOREIGN KEY([VerifyBy])
REFERENCES [dbo].[tbAdmin] ([AdminID])
GO
ALTER TABLE [dbo].[tbOrder] CHECK CONSTRAINT [FK_tbOrder_tbAdmin]
GO
ALTER TABLE [dbo].[tbOrder]  WITH CHECK ADD  CONSTRAINT [FK_tbOrder_tbUser] FOREIGN KEY([UserName])
REFERENCES [dbo].[tbUser] ([UserName])
GO
ALTER TABLE [dbo].[tbOrder] CHECK CONSTRAINT [FK_tbOrder_tbUser]
GO
ALTER TABLE [dbo].[tbOrder]  WITH CHECK ADD  CONSTRAINT [FK_tbOrder_tbVoucher] FOREIGN KEY([VoucherID])
REFERENCES [dbo].[tbVoucher] ([ID])
GO
ALTER TABLE [dbo].[tbOrder] CHECK CONSTRAINT [FK_tbOrder_tbVoucher]
GO
ALTER TABLE [dbo].[tbOrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_tbOrderDetails_tbOrder] FOREIGN KEY([OrderID])
REFERENCES [dbo].[tbOrder] ([OrderID])
GO
ALTER TABLE [dbo].[tbOrderDetails] CHECK CONSTRAINT [FK_tbOrderDetails_tbOrder]
GO
ALTER TABLE [dbo].[tbOrderDetails]  WITH CHECK ADD  CONSTRAINT [FK_tbOrderDetails_tbProduct] FOREIGN KEY([ProductID])
REFERENCES [dbo].[tbProduct] ([ProductID])
GO
ALTER TABLE [dbo].[tbOrderDetails] CHECK CONSTRAINT [FK_tbOrderDetails_tbProduct]
GO
ALTER TABLE [dbo].[tbProduct]  WITH CHECK ADD  CONSTRAINT [FK_tbProduct_tbBrand] FOREIGN KEY([BrandID])
REFERENCES [dbo].[tbBrand] ([BrandID])
GO
ALTER TABLE [dbo].[tbProduct] CHECK CONSTRAINT [FK_tbProduct_tbBrand]
GO
ALTER TABLE [dbo].[tbProduct]  WITH CHECK ADD  CONSTRAINT [FK_tbProduct_tbCategory] FOREIGN KEY([CateID])
REFERENCES [dbo].[tbCategory] ([CateID])
GO
ALTER TABLE [dbo].[tbProduct] CHECK CONSTRAINT [FK_tbProduct_tbCategory]
GO
ALTER TABLE [dbo].[tbRating]  WITH CHECK ADD  CONSTRAINT [FK_tbRating_tbProduct] FOREIGN KEY([ProductID])
REFERENCES [dbo].[tbProduct] ([ProductID])
GO
ALTER TABLE [dbo].[tbRating] CHECK CONSTRAINT [FK_tbRating_tbProduct]
GO
ALTER TABLE [dbo].[tbRating]  WITH CHECK ADD  CONSTRAINT [FK_tbRating_tbUser] FOREIGN KEY([UserName])
REFERENCES [dbo].[tbUser] ([UserName])
GO
ALTER TABLE [dbo].[tbRating] CHECK CONSTRAINT [FK_tbRating_tbUser]
GO
ALTER TABLE [dbo].[tbUserNoti]  WITH CHECK ADD  CONSTRAINT [FK_tbUserNoti_tbUser] FOREIGN KEY([Username])
REFERENCES [dbo].[tbUser] ([UserName])
GO
ALTER TABLE [dbo].[tbUserNoti] CHECK CONSTRAINT [FK_tbUserNoti_tbUser]
GO
ALTER TABLE [dbo].[tbWishList]  WITH CHECK ADD  CONSTRAINT [FK_tbWishList_tbUser] FOREIGN KEY([UserName])
REFERENCES [dbo].[tbUser] ([UserName])
GO
ALTER TABLE [dbo].[tbWishList] CHECK CONSTRAINT [FK_tbWishList_tbUser]
GO
ALTER TABLE [dbo].[tbWishListDetails]  WITH CHECK ADD  CONSTRAINT [FK_tbWishListDetails_tbProduct] FOREIGN KEY([ProductID])
REFERENCES [dbo].[tbProduct] ([ProductID])
GO
ALTER TABLE [dbo].[tbWishListDetails] CHECK CONSTRAINT [FK_tbWishListDetails_tbProduct]
GO
ALTER TABLE [dbo].[tbWishListDetails]  WITH CHECK ADD  CONSTRAINT [FK_tbWishListDetails_tbWishList] FOREIGN KEY([WLID])
REFERENCES [dbo].[tbWishList] ([WLID])
GO
ALTER TABLE [dbo].[tbWishListDetails] CHECK CONSTRAINT [FK_tbWishListDetails_tbWishList]
GO
USE [master]
GO
ALTER DATABASE [eShopDB] SET  READ_WRITE 
GO
