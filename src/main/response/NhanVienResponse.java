/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.response;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder 
@Getter
@Setter
@ToString
public class NhanVienResponse {
    // response => Tang se chua nhung class
    // trong day se chua nhung du lieu tra ra 
    // dto: data tranfer object
    // => chuyen Object tu entity thanh cac loai Object can thiet
    // response: Du lieu tra ra
    // request
    private Integer id;
    
    private String ma;
    
    private String ten;
    
    private String gioiTinh;
    
    private String sdt;
    
    private String diaChi;
    
    private String maChucVu;
    
    private String tenChucVu;
    
}
