// enum Ÿ�Կ����� toString �ڵ����� 

package four_enum;

public enum BloodType {
    A, B, O, AB; //��ü�ν��Ͻ� 
    
    public boolean canGiveTo(BloodType recipient) {
        if (this == recipient) return true;        
        if (this == O) return true;
        if (recipient == AB) return true;
        return false;
    }   
}
