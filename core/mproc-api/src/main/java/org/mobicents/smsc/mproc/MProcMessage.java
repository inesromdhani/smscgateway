/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012. 
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.smsc.mproc;

import java.util.Date;

/**
 *
 * @author sergey vetyutnev
 *
 */
public interface MProcMessage {

    // source address part
    int getSourceAddrTon();

    int getSourceAddrNpi();

    String getSourceAddr();

    // dest address part
    int getDestAddrTon();

    int getDestAddrNpi();

    String getDestAddr();

    // message content part
    String getShortMessageText();

    byte[] getShortMessageBin();

    // other options
    int getNetworkId();

    int getOrigNetworkId();

    String getOrigEsmeName();

    OrigType getOriginationType();

    Date getScheduleDeliveryTime();

    Date getValidityPeriod();

    int getDataCoding();

    int getNationalLanguageSingleShift();

    int getNationalLanguageLockingShift();

    int getEsmClass();

    int getPriority();

    int getRegisteredDelivery();

    String getOriginatorSccpAddress();

    String getImsiDigits();

    String getNnnDigits();

    /**
     * @return Procedure that has given an error / success
     */
    ProcessingType getProcessingType();

    /**
     * @return 0 in case of delivery success or error code from ErrorCode in case of delivery failure
     */
    int getErrorCode();

    // delivery receipt staff

    boolean isDeliveryReceipt();

    DeliveryReceiptData getDeliveryReceiptData();

    Long getReceiptLocalMessageId();

    MProcMessage getOriginMessageForDeliveryReceipt(long messageId);

}
