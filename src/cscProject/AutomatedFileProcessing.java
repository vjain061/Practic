package cscProject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class AutomatedFileProcessing {

	public static void main(String[] args) throws IOException {

		/*
		 * LocalDate temp = LocalDate.now(); LocalDate date = temp.minusDays(1);
		 * System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		 */

		List<Policy> policyListFromTXTFile = getPolicyDetailsFromTXTFile();

		List<Policy> policyListFromDATFile = getListOfLinesFromDATFile();

		System.out.println(policyListFromTXTFile);
		System.out.println(policyListFromDATFile);

		List<Policy> policyNotPresentInSAFCCMEX_File = compareList(policyListFromTXTFile, policyListFromDATFile);

		// checkPolicyNotPresentInSAFCCMEX_FileIsPresentInSAFDLYEX_File(null);

		createQueryToSeeTheReasonForPolicyWhichIsNotPresentInCMEFile(policyNotPresentInSAFCCMEX_File);
	}

	private static void createQueryToSeeTheReasonForPolicyWhichIsNotPresentInCMEFile(
			List<Policy> policyNotPresentInSAFCCMEX_File) {
		String query = "SELECT REASAMNDCD,* from PMSP0200A(NOLOCK)where POLICY0NUM IN (";

		int flag = 0;

		for (Policy policy : policyNotPresentInSAFCCMEX_File) {
			if (flag == 0) {
				query += "'" + policy.getPolicyNumber() + "'";
				flag = 1;
			} else
				query += ",'" + policy.getPolicyNumber() + "'";//2983
		}
		query += ") AND ENTERDATE='1190505'";

		System.out.println(query);

	}

	/*
	 * private static void
	 * checkPolicyNotPresentInSAFCCMEX_FileIsPresentInSAFDLYEX_File( List<Policy>
	 * policyNotPresentInSAFCCMEX_File) throws IOException { String[] lines =
	 * Files.readAllLines(new
	 * File("C://Prod Reports/May/27-05-2019/SAFDLYEX04292019.DAT").toPath())
	 * .toArray(new String[0]); boolean line = lines[1].trim().contains("6251152");
	 * // boolean line = //
	 * lines[1].trim().contains(policyNotPresentInSAFCCMEX_File.get(0).
	 * getPolicyNumber()); if (line)
	 * System.out.println("Policy 6251152 Is present in the SAFDLYEX File"); else
	 * System.out.println("Policy 6251152 Is present in the SAFDLYEX File"); }
	 */

	private static List<Policy> getListOfLinesFromDATFile() throws IOException {
		String[] lines = Files.readAllLines(new File("C://Prod Reports/Jun/28-06-2019/SAFCCMEX06282019.DAT").toPath())
				.toArray(new String[0]);
		List<String> listOfLinesFromDATFile = new ArrayList<String>();
		List<Policy> policyList = new ArrayList<Policy>();
		int flagToExcludeHeader = 1;
		for (String line : lines) {
			line = line.replace(" ", "");

			if (!line.isEmpty() && line.length() > 30) {
				if (flagToExcludeHeader == 1 || flagToExcludeHeader == 2) {
					flagToExcludeHeader++;
				} else
					listOfLinesFromDATFile.add(line.substring(0, 32));
			}
		}
		for (String line : listOfLinesFromDATFile) {
			Policy policy = new Policy();
			policy.setPolicyCode(line.substring(20, 23).toString());
			policy.setPolicyNumber(line.substring(23, 30).toString());
			policy.setPolicyModule(line.substring(31, 32).toString());
			policy.setCode(null);
			policyList.add(policy);
		}
		return policyList;
	}

	private static List<Policy> getPolicyDetailsFromTXTFile() throws IOException {
		String fileName = "C:\\Prod Reports\\Jun\\28-06-2019/demo06282019.txt";

		List<Policy> policyList = new ArrayList<Policy>();

		try {

			String[] lines = Files.readAllLines(new File(fileName).toPath()).toArray(new String[0]);

			for (int i = 0; i < lines.length; i++) {
				Policy policy = new Policy();
				policy.setPolicyStatus((lines[i].split(" ")[1].trim()));
				policy.setPolicyCode((lines[i].split(" ")[2].trim()));
				policy.setPolicyNumber((lines[i].split(" ")[3].trim()));
				policy.setPolicyModule((lines[i].split(" ")[4].trim()));
				policy.setCode((lines[i].split(" ")[5].trim()));
				policyList.add(policy);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return policyList;
	}

	private static List<Policy> compareList(List<Policy> policyListFromTXTFile, List<Policy> policyListFromDATFile) {
		System.out.println("Policy which is not present in DAT File");
		List<Policy> policyNotPresentInSAFCCMEX_File = new ArrayList<Policy>();
		List<Policy> policyNotPresentInSAFCCMEX_File_With_Error_Status = new ArrayList<Policy>();
		for (Policy policyTXTFile : policyListFromTXTFile) {
			boolean flagToCheckEquality = false;
			for (Policy policyDATFile : policyListFromDATFile) {
				if (policyTXTFile.getPolicyNumber().equals(policyDATFile.getPolicyNumber())
						&& Integer.parseInt(policyTXTFile.getPolicyModule()) == Integer
								.parseInt(policyDATFile.getPolicyModule())) {
					flagToCheckEquality = true;
				}
			}
			if (flagToCheckEquality == false) {
				if (policyTXTFile.getPolicyStatus().equals("E")) {
					policyNotPresentInSAFCCMEX_File_With_Error_Status.add(policyTXTFile);
					System.out
							.println("Policy (" + policyTXTFile.getPolicyCode() + " " + policyTXTFile.getPolicyNumber()
									+ " " + policyTXTFile.getPolicyModule() + ") is with Error code");
				} else {
					System.out.println("Policy (" + policyTXTFile.getPolicyCode() + " "
							+ policyTXTFile.getPolicyNumber() + " " + policyTXTFile.getPolicyModule()
							+ ") is not present in CCM report since it was an " + policyTXTFile.getCode()
							+ " transaction with reason amend code ' '");
					policyNotPresentInSAFCCMEX_File.add(policyTXTFile);

				}
			}
		}
		return policyNotPresentInSAFCCMEX_File;
	}

}
