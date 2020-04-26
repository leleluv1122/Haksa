// enum 타입에서는 toString 자동생성 

package four_enum;

public enum BloodType {
    A, B, O, AB; //객체인스턴스 
    
    public boolean canGiveTo(BloodType recipient) {
        if (this == recipient) return true;        
        if (this == O) return true;
        if (recipient == AB) return true;
        return false;
    }   
}
