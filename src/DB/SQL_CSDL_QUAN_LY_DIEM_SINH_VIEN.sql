#Tao bang sinh vien
CREATE TABLE `javacore15`.`sinhvien` (
  `MaSV` INT NOT NULL AUTO_INCREMENT,
  `HoTen` VARCHAR(45) NULL,
  `GioiTinh` VARCHAR(45) NULL,
  `NgaySinh` DATE NULL,
  `MaLop` VARCHAR(45) NULL,
  `HocBong` DOUBLE NULL,
  PRIMARY KEY (`MaSV`));
  
  #Tao bang lop
  CREATE TABLE Lop(
  MaLop VARCHAR(45) NOT NULL,
  TenLop VARCHAR(45),
  MaKhoa VARCHAR(45),
  PRIMARY KEY (MaLop)
  );
  
  #Tao bang khoa
  CREATE TABLE Khoa(
  MaKhoa VARCHAR(45) NOT NULL,
  TenKhoa VARCHAR(45),
  PRIMARY KEY (MaKhoa)
  );
  
  #Tao bang mon hoc
  CREATE TABLE MonHoc(
  MaMH VARCHAR(45) NOT NULL,
  TenMH VARCHAR(45),
  SoTiet INT,
  PRIMARY KEY (MaMH)  
  );
  
  #Tao bang ket qua
  CREATE TABLE KetQua(
  MaSV VARCHAR(45) NOT NULL,
  MaMH VARCHAR(45) NOT NULL,
  DiemThi INT
  );
  
select * from lop;
select * from sinhvien;
select * from khoa;  
select * from monhoc;
select * from ketqua;  
  
#Vi du 3
SELECT MaSV, GioiTinh, HocBong FROM SINHVIEN WHERE HOCBONG > 0;

#Vi du 4
SELECT * FROM SINHVIEN WHERE GIOITINH = 'NU';

#Vi du 5
SELECT * FROM SINHVIEN WHERE HOTEN LIKE 'Tran%';

#Vi du 6
SELECT * FROM SINHVIEN WHERE GioiTinh = 'Nu' AND HocBong >0;

#Vi du 7
SELECT * FROM SINHVIEN WHERE GioiTinh = 'Nu' OR HocBong >0;
  
#Vi du 8
SELECT * FROM SINHVIEN WHERE YEAR(NgaySinh) BETWEEN 1978 AND 1985;  
  
#Vi du 9
SELECT * FROM SINHVIEN ORDER BY MaSV;  
  
#Vi du 10
SELECT * FROM SinhVien ORDER BY HocBong DESC;

#Vi du 11
SELECT SinhVien.MaSV, HoTen, GioiTinh, NgaySinh, DiemThi FROM SinhVien INNER
JOIN KetQua ON SinhVien.MaSV = KetQua.MaSV WHERE MaMH = 'CSDL' AND
DiemThi>=8;

#Vi du 12
SELECT MaSV, HoTen, HocBong, TenLop FROM Lop INNER JOIN SinhVien ON
Lop.MaLop=SinhVien.MaLop WHERE HocBong>0 AND MaKhoa ='CNTT';
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  