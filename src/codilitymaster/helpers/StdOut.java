/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitymaster.helpers;

import java.util.logging.Logger;

/**
 *
 * @author icode
 */
public class StdOut {

    private static final Logger LOG = Logger.getLogger(StdOut.class.getName());

    public static void println(String prefix) {
        LOG.info(prefix);
    }

    public static void println() {

        LOG.info("\n");
    }

}
