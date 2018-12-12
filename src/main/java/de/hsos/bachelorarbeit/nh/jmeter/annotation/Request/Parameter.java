package de.hsos.bachelorarbeit.nh.jmeter.annotation.Request;

/**
 * URL-Parameter:
 * /x/{y}/{z}
 * Parameter: y, z
 */
public @interface Parameter{
    /**
     * URL: /user/{id} <p> Key: id
     *
     * @return {@link String} Key
     */
    String key();

    /**
     * URL: /user/{id} <p> Key: id <p> Value: 1 <p> Resolved-URL: /user/1
     *
     * @return {@link String} Value
     */
    String value();
}
