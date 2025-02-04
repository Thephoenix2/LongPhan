USE [master]
GO
/****** Object:  Database [Duan1-QLDienThoai-Laptop]    Script Date: 12/4/2019 7:05:47 PM ******/
CREATE DATABASE [Duan1-QLDienThoai-Laptop]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Duan1-QLDienThoai-Laptop', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\Duan1-QLDienThoai-Laptop.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Duan1-QLDienThoai-Laptop_log', FILENAME = N'C:\Program Files (x86)\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\Duan1-QLDienThoai-Laptop_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Duan1-QLDienThoai-Laptop].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET ARITHABORT OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET  MULTI_USER 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [Duan1-QLDienThoai-Laptop]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaCTHD] [int] IDENTITY(1,1) NOT NULL,
	[MaHD] [int] NULL,
	[MaSP] [nchar](10) NULL,
	[SoLuong] [int] NULL,
	[ThanhTien] [money] NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY CLUSTERED 
(
	[MaCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[MaCTPN] [int] IDENTITY(1,1) NOT NULL,
	[MaPN] [int] NULL,
	[MaSP] [nchar](10) NULL,
	[SoLuong] [int] NULL,
	[TongTien] [money] NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_ChiTietPhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaCTPN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[SoHoaDon] [varchar](15) NULL,
	[MaKH] [nchar](10) NULL,
	[TenTK] [nvarchar](50) NULL,
	[GiamGia] [money] NULL,
	[TongTien] [money] NULL,
	[NgayLap] [datetime] NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKH] [nchar](10) NOT NULL,
	[TenKH] [nvarchar](50) NULL,
	[GioiTinh] [bit] NULL,
	[SDT] [nchar](10) NULL,
	[Email] [nvarchar](255) NULL,
	[DiaChi] [nvarchar](255) NULL,
	[Ngaysinh] [date] NULL,
	[Loaikhachhang] [nvarchar](50) NULL,
	[Hinh] [nvarchar](max) NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSP]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSP](
	[MaLoaiSP] [nchar](10) NOT NULL,
	[TenLoaiSP] [nvarchar](50) NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_LoaiSP] PRIMARY KEY CLUSTERED 
(
	[MaLoaiSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Luong]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Luong](
	[MaLuong] [int] NOT NULL,
	[MaNV] [nchar](10) NULL,
	[Luong1Gio] [money] NULL,
	[SoGioLam] [int] NULL,
	[NgayLam] [date] NULL,
	[LuongLamThem] [money] NULL,
	[TongLuong1Ngay] [money] NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_Luong] PRIMARY KEY CLUSTERED 
(
	[MaLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [nchar](10) NOT NULL,
	[TenNCC] [nvarchar](255) NULL,
	[SDT] [nchar](10) NULL,
	[Email] [nvarchar](255) NULL,
	[DiaChi] [nvarchar](255) NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nchar](10) NOT NULL,
	[TenNV] [nvarchar](50) NULL,
	[GioiTinh] [bit] NULL,
	[DiaChi] [nvarchar](255) NULL,
	[SDT] [nchar](10) NULL,
	[CMND] [nchar](9) NULL,
	[Email] [nvarchar](255) NULL,
	[NgaySinh] [date] NULL,
	[ChucVu] [nvarchar](255) NULL,
	[NgayVaoLam] [date] NULL,
	[Hinh] [nvarchar](max) NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaPN] [int] IDENTITY(1,1) NOT NULL,
	[SoPhieu] [varchar](15) NULL,
	[TenTK] [nvarchar](50) NULL,
	[MaNCC] [nchar](10) NULL,
	[Tongtien] [money] NULL,
	[Ngaylap] [datetime] NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaPN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [int] NOT NULL,
	[TenQuyen] [nvarchar](50) NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [nchar](10) NOT NULL,
	[TenSP] [nvarchar](255) NULL,
	[MaLoaiSP] [nchar](10) NOT NULL,
	[GiaNhap] [money] NULL,
	[GiaBan] [money] NULL,
	[TonKho] [int] NULL,
	[DonViTinh] [nvarchar](50) NULL,
	[Hinh] [nvarchar](max) NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/4/2019 7:05:48 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TenTK] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NULL,
	[MaNV] [nchar](10) NULL,
	[MaQuyen] [int] NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[TenTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] ON 

INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (84, 45, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (85, 45, N'BP02      ', 1, 790000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (86, 45, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (87, 46, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (88, 46, N'DT02      ', 1, 33900000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (89, 47, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (90, 47, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (91, 48, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (92, 49, N'BP02      ', 1, 790000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (93, 50, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (94, 51, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (95, 52, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (96, 53, N'LT02      ', 1, 25000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (97, 54, N'BP02      ', 1, 790000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (98, 55, N'BP02      ', 1, 790000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (99, 56, N'BP02      ', 1, 790000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (100, 57, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (101, 58, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (102, 58, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (103, 59, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (104, 59, N'DT02      ', 2, 67800000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (105, 60, N'DT02      ', 1, 33900000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (106, 62, N'LT02      ', 1, 25000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (107, 62, N'BP02      ', 2, 1580000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (108, 63, N'LT01      ', 1, 10900000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (109, 64, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (110, 64, N'LT01      ', 5, 54500000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (111, 65, N'BP02      ', 1, 790000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (112, 66, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (113, 66, N'LT02      ', 1, 25000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (114, 67, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (115, 67, N'DT02      ', 2, 67800000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (116, 68, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (117, 69, N'BP01      ', 1, 125000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (118, 70, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (119, 71, N'DT02      ', 3, 101700000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (120, 71, N'LT02      ', 1, 25000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (121, 72, N'DT01      ', 1, 6000000.0000, N'')
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [SoLuong], [ThanhTien], [MoTa]) VALUES (122, 73, N'LT01      ', 1, 10900000.0000, N'')
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] OFF
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] ON 

INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (1, 2, N'BP01      ', 1, 50000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (6, 5, N'BP01      ', 1, 50000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (9, 7, N'BP01      ', 5, 250000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (10, 8, N'DT01      ', 2, 8000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (12, 8, N'DT01      ', 1, 4000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (13, 8, N'DT01      ', 1, 4000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (15, 11, N'BP01      ', 1, 50000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (16, 12, N'BP01      ', 1, 50000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (17, 12, N'BP02      ', 1, 500000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (19, 14, N'BP03      ', 1, 5000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (20, 15, N'BP03      ', 1, 5000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (22, 17, N'LT01      ', 1, 8000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (23, 18, N'LT01      ', 1, 8000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (27, 22, N'BP03      ', 1, 5000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (29, 26, N'LT01      ', 1, 8000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (31, 27, N'DT02      ', 4, 100000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (32, 27, N'LT02      ', 3, 60000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (33, 28, N'BP03      ', 4, 20000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (34, 28, N'BP02      ', 3, 1500000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (35, 28, N'LT01      ', 3, 24000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (36, 29, N'DT02      ', 3, 75000000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (37, 29, N'BP02      ', 5, 2500000.0000, N'')
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPN], [MaSP], [SoLuong], [TongTien], [MoTa]) VALUES (38, 29, N'BP01      ', 4, 200000.0000, N'')
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (45, N'191116002', N'1         ', N'admin', 0.0000, 6915000.0000, CAST(0x0000AB07010D8800 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (46, N'191116003', N'1         ', N'admin', 0.0000, 34025000.0000, CAST(0x0000AB070112EDA4 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (47, N'191116004', N'1         ', N'admin', 0.0000, 6125000.0000, CAST(0x0000AB070113157C AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (48, N'191116005', N'1         ', N'admin', 0.0000, 6000000.0000, CAST(0x0000AB0701135140 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (49, N'191116006', N'1         ', N'admin', 0.0000, 790000.0000, CAST(0x0000AB070113A6CC AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (50, N'191116007', N'1         ', N'admin', 0.0000, 125000.0000, CAST(0x0000AB0701147638 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (51, N'191116008', N'1         ', N'admin', 0.0000, 6000000.0000, CAST(0x0000AB070114F5F4 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (52, N'191116009', N'1         ', N'admin', 0.0000, 6000000.0000, CAST(0x0000AB0701154928 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (53, N'191116010', N'1         ', N'admin', 0.0000, 25000000.0000, CAST(0x0000AB070116AE94 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (54, N'191116011', N'1         ', N'admin', 0.0000, 790000.0000, CAST(0x0000AB0701177E00 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (55, N'191116012', N'1         ', N'admin', 0.0000, 790000.0000, CAST(0x0000AB070117E19C AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (56, N'191116013', N'1         ', N'admin', 0.0000, 790000.0000, CAST(0x0000AB0701181B08 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (57, N'191116014', N'1         ', N'admin', 0.0000, 125000.0000, CAST(0x0000AB070118A550 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (58, N'191118001', N'1         ', N'admin', 0.0000, 6125000.0000, CAST(0x0000AB090148D478 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (59, N'191119001', N'1         ', N'admin', 0.0000, 73800000.0000, CAST(0x0000AB0A011C9C28 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (60, N'191119002', N'1         ', N'admin', 0.0000, 33900000.0000, CAST(0x0000AB0A011D102C AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (61, N'191119003', N'1         ', N'admin', 0.0000, 0.0000, CAST(0x0000AB0A0128C5D4 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (62, N'191120001', N'2         ', N'admin', 0.0000, 26580000.0000, CAST(0x0000AB0B007C4F70 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (63, N'191120002', N'1         ', N'admin', 0.0000, 10900000.0000, CAST(0x0000AB0B007DACA8 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (64, N'191120003', N'1         ', N'admin', 0.0000, 60500000.0000, CAST(0x0000AB0B0081E64C AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (65, N'191120004', N'1         ', N'admin', 0.0000, 790000.0000, CAST(0x0000AB0B0084AB48 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (66, N'191121001', N'1         ', N'admin', 1550000.0000, 29450000.0000, CAST(0x0000AB0C01114B48 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (67, N'191121002', N'1         ', N'admin', 11070000.0000, 62730000.0000, CAST(0x0000AB0C012BB17C AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (68, N'191122001', N'1         ', N'admin', 18750.0000, 106250.0000, CAST(0x0000AB0D00858C48 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (69, N'191123001', N'1         ', N'admin', 18750.0000, 106250.0000, CAST(0x0000AB0E0103851C AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (70, N'191123002', N'3         ', N'admin', 0.0000, 6000000.0000, CAST(0x0000AB0E0104C634 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (71, N'191128001', N'1         ', N'admin', 19005000.0000, 107695000.0000, CAST(0x0000AB130147B8E0 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (72, N'191204001', N'1         ', N'admin', 0.0000, 6000000.0000, CAST(0x0000AB19012CAB18 AS DateTime), N'')
INSERT [dbo].[HoaDon] ([MaHD], [SoHoaDon], [MaKH], [TenTK], [GiamGia], [TongTien], [NgayLap], [MoTa]) VALUES (73, N'191204002', N'2         ', N'admin', 0.0000, 10900000.0000, CAST(0x0000AB19012D08D8 AS DateTime), N'')
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [SDT], [Email], [DiaChi], [Ngaysinh], [Loaikhachhang], [Hinh], [MoTa]) VALUES (N'1         ', N'Võ Tá Thiện', 1, N'0551531524', N'thien@gmail.com', N'aaaaaaaaaaa', CAST(0x84240B00 AS Date), N'Platinum', N'', N'')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [SDT], [Email], [DiaChi], [Ngaysinh], [Loaikhachhang], [Hinh], [MoTa]) VALUES (N'2         ', N'Trần Quang Trường', 1, N'0153151531', N'truong@gmail.com', N'aaaaaaaaa', CAST(0x45240B00 AS Date), N'Silver', N'', N'')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [SDT], [Email], [DiaChi], [Ngaysinh], [Loaikhachhang], [Hinh], [MoTa]) VALUES (N'3         ', N'Bùi Quang Huy', 1, N'0461681161', N'huy@gmail.com', N'bbbbbb', CAST(0x9A220B00 AS Date), N'Normal', N'', N'')
INSERT [dbo].[KhachHang] ([MaKH], [TenKH], [GioiTinh], [SDT], [Email], [DiaChi], [Ngaysinh], [Loaikhachhang], [Hinh], [MoTa]) VALUES (N'4         ', N'Trần Văn Thái Hà', 1, N'0513135151', N'ha@gmail.com', N'zzzzzzzzzz', CAST(0xE6240B00 AS Date), N'Normal', N'', N'')
INSERT [dbo].[LoaiSP] ([MaLoaiSP], [TenLoaiSP], [MoTa]) VALUES (N'1         ', N'Laptop', NULL)
INSERT [dbo].[LoaiSP] ([MaLoaiSP], [TenLoaiSP], [MoTa]) VALUES (N'2         ', N'Điện thoại', NULL)
INSERT [dbo].[LoaiSP] ([MaLoaiSP], [TenLoaiSP], [MoTa]) VALUES (N'3         ', N'Phụ kiện', NULL)
INSERT [dbo].[Luong] ([MaLuong], [MaNV], [Luong1Gio], [SoGioLam], [NgayLam], [LuongLamThem], [TongLuong1Ngay], [MoTa]) VALUES (1, N'NV01      ', 60000.0000, 4, CAST(0x68400B00 AS Date), 50000.0000, 290000.0000, N'a')
INSERT [dbo].[Luong] ([MaLuong], [MaNV], [Luong1Gio], [SoGioLam], [NgayLam], [LuongLamThem], [TongLuong1Ngay], [MoTa]) VALUES (2, N'NV02      ', 60000.0000, 6, CAST(0x67400B00 AS Date), 20000.0000, 380000.0000, N'a')
INSERT [dbo].[NhaCungCap] ([MaNCC], [TenNCC], [SDT], [Email], [DiaChi], [MoTa]) VALUES (N'1         ', N'Công ty Phong Vũ', N'0651615314', N'phongvu@gmail.com', N'99 Trần Hưng Đạo', NULL)
INSERT [dbo].[NhaCungCap] ([MaNCC], [TenNCC], [SDT], [Email], [DiaChi], [MoTa]) VALUES (N'2         ', N'Công ty Trần Gia', N'0531315135', N'minh@gmail.com', N'101 Lê Duẩn', NULL)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [SDT], [CMND], [Email], [NgaySinh], [ChucVu], [NgayVaoLam], [Hinh], [MoTa]) VALUES (N'NV01      ', N'Đỗ Minh Đức', 1, N'buôn ma thuột', N'0123123321', N'123321111', N'duc@gmail.com', CAST(0x9A220B00 AS Date), N'Quản lí ', CAST(0x243F0B00 AS Date), N'park_autumn_trees_117202_3840x2160.jpg', N'')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [SDT], [CMND], [Email], [NgaySinh], [ChucVu], [NgayVaoLam], [Hinh], [MoTa]) VALUES (N'NV02      ', N'Nguyễn Hoàng Minh', 1, N'daklak', N'0153153111', N'586561861', N'minh@gmail.com', CAST(0x27240B00 AS Date), N'Nhân viên', CAST(0x823C0B00 AS Date), N'49569622_537494110089154_1187426777941671936_n-1445.jpg', N'')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [SDT], [CMND], [Email], [NgaySinh], [ChucVu], [NgayVaoLam], [Hinh], [MoTa]) VALUES (N'NV03      ', N'Quang Trường', 1, N'dkalak', N'0315315126', N'151515311', N'fjdsf@ghfg.com', CAST(0x9A220B00 AS Date), N'Quản lí ', CAST(0x65400B00 AS Date), N'103061_hotelimage_87574038.jpg', N'')
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [GioiTinh], [DiaChi], [SDT], [CMND], [Email], [NgaySinh], [ChucVu], [NgayVaoLam], [Hinh], [MoTa]) VALUES (N'NV04      ', N'Bùi Quang Huy', 1, N'zzzzzzzzzz', N'0153153151', N'153153135', N'huy@gmail.com', CAST(0x9A220B00 AS Date), N'Quản lí ', CAST(0x69400B00 AS Date), N'null', N'')
SET IDENTITY_INSERT [dbo].[PhieuNhap] ON 

INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (1, N'1119201901', N'admin', N'1         ', 500000.0000, CAST(0x0000AA4400000000 AS DateTime), NULL)
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (2, N'191123001', N'admin', N'1         ', 50000.0000, CAST(0x0000AB0E0100A2D4 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (5, N'191126001', N'admin', N'1         ', 50000.0000, CAST(0x0000AB1100FD8BD0 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (7, N'191126002', N'admin', N'1         ', 250000.0000, CAST(0x0000AB1100FDBE34 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (8, N'191126003', N'admin', N'1         ', 8000000.0000, CAST(0x0000AB1100FF3E94 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (11, N'191126004', N'admin', N'1         ', 50000.0000, CAST(0x0000AB1101014A68 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (12, N'191126005', N'admin', N'1         ', 550000.0000, CAST(0x0000AB1101016430 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (14, N'191126006', N'admin', N'1         ', 5000000.0000, CAST(0x0000AB110101B2B4 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (15, N'191126007', N'admin', N'1         ', 5000000.0000, CAST(0x0000AB110101D384 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (17, N'191126008', N'admin', N'1         ', 8000000.0000, CAST(0x0000AB110101F904 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (18, N'191126009', N'admin', N'1         ', 8000000.0000, CAST(0x0000AB11010211A0 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (22, N'191126010', N'admin', N'1         ', 5000000.0000, CAST(0x0000AB1101025DCC AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (24, N'191126011', N'admin', N'1         ', 25000000.0000, CAST(0x0000AB1101052AFC AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (25, N'191126012', N'admin', N'1         ', 16000000.0000, CAST(0x0000AB110105426C AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (26, N'191126013', N'admin', N'1         ', 73000000.0000, CAST(0x0000AB1101058FC4 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (27, N'191126014', N'admin', N'1         ', 160000000.0000, CAST(0x0000AB1101074E40 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (28, N'191126015', N'admin', N'1         ', 45500000.0000, CAST(0x0000AB110107AAD4 AS DateTime), N'')
INSERT [dbo].[PhieuNhap] ([MaPN], [SoPhieu], [TenTK], [MaNCC], [Tongtien], [Ngaylap], [MoTa]) VALUES (29, N'191127001', N'admin', N'1         ', 77700000.0000, CAST(0x0000AB1201302234 AS DateTime), N'')
SET IDENTITY_INSERT [dbo].[PhieuNhap] OFF
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (1, N'Quản lí', N'Được sử dụng tất cả chức năng')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (2, N'Nhân viên', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'b1        ', N'aaaa', N'1         ', 2000000.0000, 3000000.0000, 2, N'cai', N'images (2).jfif', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'BP01      ', N'Bàn phím Prolink 1005', N'3         ', 50000.0000, 125000.0000, 18, N'Cái', N'', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'BP02      ', N'Bàn phím bluetooth Logitech K380', N'3         ', 500000.0000, 790000.0000, 16, N'cai', N'', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'BP03      ', N'Máy Tính Bảng', N'1         ', 5000000.0000, 7000000.0000, 15, N'cai', N'', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'DT01      ', N'Samsung Galaxy A50', N'2         ', 4000000.0000, 6000000.0000, 12, N'cai', N'', N'123')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'DT02      ', N'Iphone 11 Pro Max 64GB', N'2         ', 25000000.0000, 33900000.0000, 23, N'Cái', N'', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'LT01      ', N'Dell Inspiron N3567', N'1         ', 8000000.0000, 10900000.0000, 16, N'Cái', N'', N'')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaNhap], [GiaBan], [TonKho], [DonViTinh], [Hinh], [MoTa]) VALUES (N'LT02      ', N'Macbook Air 13 128GB 2018', N'1         ', 20000000.0000, 25000000.0000, 14, N'Cái', N'', N'')
INSERT [dbo].[TaiKhoan] ([TenTK], [MatKhau], [MaNV], [MaQuyen], [MoTa]) VALUES (N'admin', N'admin', N'NV01      ', 1, N'')
INSERT [dbo].[TaiKhoan] ([TenTK], [MatKhau], [MaNV], [MaQuyen], [MoTa]) VALUES (N'admin1', N'admin1', N'NV02      ', 2, N'')
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [DF_NhanVien_Hinh]  DEFAULT (N'') FOR [Hinh]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap] FOREIGN KEY([MaPN])
REFERENCES [dbo].[PhieuNhap] ([MaPN])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhachHang] ([MaKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_TaiKhoan] FOREIGN KEY([TenTK])
REFERENCES [dbo].[TaiKhoan] ([TenTK])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_TaiKhoan]
GO
ALTER TABLE [dbo].[Luong]  WITH CHECK ADD  CONSTRAINT [FK_Luong_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[Luong] CHECK CONSTRAINT [FK_Luong_NhanVien]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhaCungCap] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_TaiKhoan] FOREIGN KEY([TenTK])
REFERENCES [dbo].[TaiKhoan] ([TenTK])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_TaiKhoan]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSP] FOREIGN KEY([MaLoaiSP])
REFERENCES [dbo].[LoaiSP] ([MaLoaiSP])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSP]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_Quyen] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_Quyen]
GO
USE [master]
GO
ALTER DATABASE [Duan1-QLDienThoai-Laptop] SET  READ_WRITE 
GO
