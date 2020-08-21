/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Administrator
 */
public class My_CBB {

     Object value; // Lưu mã 
     Object text; //Lưu tên

    public My_CBB(Object value, Object text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return text.toString();
    }
}
