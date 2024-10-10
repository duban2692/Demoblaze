package co.com.demoblaze.userinterfaces.login;


import co.com.demoblaze.utils.Utilities;


public enum UrlInitiationWeb {

    UrlInitiationWebDev("https://www.demoblaze.com/", "dev"),
    UrlInitiationWebCert("https://www.demoblaze.com/", "cert"),
    UrlInitiationWebProd("https://www.demoblaze.com/", "prod");

    private final String url;
    private final String Environments;

    UrlInitiationWeb(String url, String environments) {
        this.url = url;
        Environments = environments;
    }

    public String getUrl() {
        return url;
    }

    public String getEnvironments() {
        return Environments;
    }

    public String Url() {

        return url;
    }

    public static String getURL() {

        String url = null;
        for (UrlInitiationWeb urlInitiationWeb : UrlInitiationWeb.values()) {

            if (Utilities.getEnvironments().equals(urlInitiationWeb.getEnvironments())) {

                url = urlInitiationWeb.getUrl();
                break;
            }
        }

        return url;
    }

}

