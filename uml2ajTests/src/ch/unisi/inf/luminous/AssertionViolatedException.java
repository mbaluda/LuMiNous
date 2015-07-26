/*******************************************************************************
 * Copyright (c) 2008 - Jochen Wuttke.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jochen Wuttke - initial API and implementation
 ********************************************************************************
 *
 * Created: Sep 30, 2008 by Jochen Wuttke
 * Last changed: $Id: AssertionViolatedException.java 114 2008-10-16 13:27:43Z Jochen $
 */

package ch.unisi.inf.luminous;

/**
 * @author <a href="&#109;&#97;&#105;&#108;&#116;&#111;&#58;&#119;&#117;&#116;&#116;&#107;&#101;&#106;&#64;&#108;&#117;&#46;&#117;&#110;&#105;&#115;&#105;&#46;&#99;&#104;">Jochen Wuttke</a>
 *
 */
@SuppressWarnings("serial")
public class AssertionViolatedException extends java.lang.Exception {

	/**
	 * 
	 */
	public AssertionViolatedException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AssertionViolatedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AssertionViolatedException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AssertionViolatedException(Throwable cause) {
		super(cause);
	}

	
}
