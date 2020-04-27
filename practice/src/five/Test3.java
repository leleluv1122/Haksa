package five;

public class Test3 {
	public static void main(String[] args) {
        Person[] list = new Person[] { 
                new Person("ȫ�浿", 18, BloodType.AB),
                new Person("����ġ", 24, BloodType.O),
                new Person("�Ӳ���", 22, BloodType.B)
        };
        
        StringBuilder builder = new StringBuilder();
        builder.append("<table>\n");
        builder.append("    <tr><td>�̸�</td></td><td>����</td><td>������</td></tr>\n");
        for (Person p : list) {
            builder.append("    <tr>");
            builder.append("<td>").append(p.getName()).append("</td>");
            builder.append("<td>").append(p.getAge()).append("</td>");
            builder.append("<td>").append(p.getBloodType()).append("</td>");            
            builder.append("</tr>\n");
        }
        builder.append("</table>\n");
        System.out.println(builder.toString());
    }

}
