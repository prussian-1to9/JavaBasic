package githrd.exc;

import java.sql.*;

import githrd.dao.*;
import githrd.vo.*;
public class IdException extends Exception {

	@Override
	public String toString() {
		return "존재하지 않는 id입니다.";
	}

}
