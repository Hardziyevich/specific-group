package com.github.akarazhev.jacademy.practice.designpatterns.builder;

/**
 * Main interface which provide a combination of element configuration on the board
 */
public interface BoardBuilder {

    /**
     * Installs on board power supply module.
     *
     * @return a BordBuilder.
     */
    BoardBuilder powerSupply();

    /**
     * Installs on board processor module.
     *
     * @return a BordBuilder
     */
    BoardBuilder processor();

    /**
     * Installs on board hdmi module.
     *
     * @return a BordBuilder
     */
    BoardBuilder hdmi();

    /**
     * Installs on board usb module.
     *
     * @return a BordBuilder
     */
    BoardBuilder usb();

    /**
     * Installs on board sdi module.
     *
     * @return a BordBuilder
     */
    BoardBuilder sdi();

    /**
     * Installs on board ddr module.
     *
     * @return a BordBuilder
     */
    BoardBuilder ddr();

    /**
     * Show information about power supply module.
     *
     * @return a string of board.
     */
    String getPowerSupply();

    /**
     * Show information about processor module.
     *
     * @return a string of board.
     */
    String getProcessor();

    /**
     * Show information about hdmi module.
     *
     * @return a string of board.
     */
    String getHdmi();

    /**
     * Show information about usb module.
     *
     * @return a string of board.
     */
    String getUsb();

    /**
     * Show information about sdi module.
     *
     * @return a string of board.
     */
    String getSdi();

    /**
     * Show information about ddr module.
     *
     * @return a string of board.
     */
    String getDdr();

}
