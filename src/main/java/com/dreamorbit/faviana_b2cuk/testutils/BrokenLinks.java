/* Project		: Faviana B2C UK
 * Author		: Bharath Kambalakatta
 * Created Date	: 12-Oct-2018
 * Reviewer		:
 */

package com.dreamorbit.faviana_b2cuk.testutils;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;

public class BrokenLinks {

	public static final Logger log = Logger.getLogger(BrokenLinks.class
			.getName());

	public static void verifyLinkActiveOrNot(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url
					.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - "
						+ httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - "
						+ httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
				log.info(linkUrl + " link is broken");
			}
		} catch (Exception e) {
		}
	}
}
