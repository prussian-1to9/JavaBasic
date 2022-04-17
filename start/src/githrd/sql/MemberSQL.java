package githrd.sql;

public class MemberSQL {
	public final int SEL_ALL = 1001;
	public final int SEL_MEB = 1002;
	public final int CHK_ID = 1003;
	
	public final int ALT_TEL = 3001;
	
	public final int INSERT_MEB = 3101;
	
	public MemberSQL() {

	}

	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	mno, id, pw, name ");
			buff.append("FROM ");
			buff.append("	member ");
			
			break;

		case SEL_MEB:
			buff.append("SELECT ");
			buff.append("	mno, id, pw, name, tel, mail, joindate, gen, avt ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			
			break;

		case CHK_ID:
			buff.append("SELECT ");
			buff.append("	id ");
			buff.append("FROM ");
			buff.append("	member ");
			
			break;
			
		case ALT_TEL:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	tel = ? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			
			break;
			
		case INSERT_MEB:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
			buff.append("VALUES( ");
			buff.append("	membseq.NEXTVAL, ? , ? , ? , ? , ? , ? , ? ");
			buff.append(") ");
			
			break;

		}
		
		return buff.toString();
	}
}
