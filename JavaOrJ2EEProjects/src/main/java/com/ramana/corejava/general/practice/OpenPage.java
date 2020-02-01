/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.io.IOException;

/**
 * @author RamanaGorle
 *
 */
public class OpenPage {

	public static void main(String args[]) throws IOException {

		String downloadURL = "https://www.youtube.com/watch?v=Bjl-0qCXaKo&index=4&list=PL_8OvQephnI9x3RBPgr1TX4GNEMM010Dh";

		java.awt.Desktop myNewBrowserDesktop = java.awt.Desktop.getDesktop();

		try {

			for (int i = 0; i < 5; i++) {

				java.net.URI myNewLocation = new java.net.URI(downloadURL);

				myNewBrowserDesktop.browse(myNewLocation);

				System.out.println(i);

			}

		} catch (Exception e) {

		}

	}

}
