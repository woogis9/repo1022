package gaea.domain.authority;

public class Role {
	private long recid;
	private long seq;
	private String roleName;
	private String description;
	private String regDate;
	private String regUserId;
	private String chgDate;
	private String chgUserId;
	private String baseYn;

	public long getRecid() {
		return recid;
	}

	public void setRecid(long recid) {
		this.recid = recid;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getRegUserId() {
		return regUserId;
	}

	public void setRegUserId(String regUserId) {
		this.regUserId = regUserId;
	}

	public String getChgDate() {
		return chgDate;
	}

	public void setChgDate(String chgDate) {
		this.chgDate = chgDate;
	}

	public String getChgUserId() {
		return chgUserId;
	}

	public void setChgUserId(String chgUserId) {
		this.chgUserId = chgUserId;
	}

	public String getBaseYn() {
		return baseYn;
	}

	public void setBaseYn(String baseYn) {
		this.baseYn = baseYn;
	}

	@Override
	public String toString() {
		return "Role [recid=" + recid + ", seq=" + seq + ", roleName=" + roleName + ", description=" + description + ", regDate=" + regDate
				+ ", regUserId=" + regUserId + ", chgDate=" + chgDate + ", chgUserId=" + chgUserId + ", baseYn=" + baseYn + "]";
	}

}
