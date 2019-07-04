package cscProject;

public class Policy {
	private String policyStatus;
	private String policyCode;
	private String policyNumber;
	private String policyModule;
	private String Code;

	@Override
	public String toString() {
		return "Policy [policyStatus=" + policyStatus + ", policyCode=" + policyCode + ", policyNumber=" + policyNumber
				+ ", policyModule=" + policyModule + ", Code=" + Code + "]";
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyModule() {
		return policyModule;
	}

	public void setPolicyModule(String policyModule) {
		this.policyModule = policyModule;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

}
