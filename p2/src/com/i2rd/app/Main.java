/*
 *  Copyright (c) Interactive Information R & D (I2RD) LLC.
 *  All Rights Reserved.
 *   
 *  This software is confidential and proprietary information of
 *  I2RD LLC ("Confidential Information"). You shall not disclose
 *  such Confidential Information and shall use it only in 
 *  accordance with the terms of the license agreement you entered
 *  into with I2RD.
 */
package com.i2rd.app;

import java.util.Arrays;

import org.i2rd.util.Util;

/**
 * Type comment.
 * @author Russ Tennant (russ@i2rd.com)
 */
public class Main
{

    
    public static void main(String[] args)
    {
        System.out.println(Util.toString(Arrays.asList(args), ", "));
    }
}
