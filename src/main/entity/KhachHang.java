/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author hangnt
 */
// annotation: bat dau bang @ 
@AllArgsConstructor // contrutor full tham so 
@NoArgsConstructor // contrutor k tham so 
@Getter
@Setter 
@ToString 
@Builder // contructor tuy y tham so 
public class KhachHang {
    
    // entity => MAPPING 100% GIONG CSDL 
    // KHONG DUOC PHEP KHAI BAO BIEN HANG LOAT 
    // Liet ke cac thuoc tinh trong CSDL
    private Integer id;
    
    private String ma;
    
    private String ten;
    
    private String tenDem;
    
    private String ho;
    
    private Date ngaySinh;
    
    private String soDienThoai;
    
    private String diaChi;
    
    private String thanhPho;
    
    private String quocGia;
    
    private String matKhau;
    
    private Integer trangThai;
    
}
