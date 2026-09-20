package com.unity3d.services.core.webview;

import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import defpackage.Md5A;
import defpackage.rz;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewUrlBuilder {
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        StringBuilder sbG = Md5A.g("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl()));
        sbG.append(buildQueryParam(MediationMetaData.KEY_VERSION, configuration.getWebViewVersion()));
        String string = sbG.toString();
        if (configuration.getExperiments() != null && configuration.getExperiments().isForwardExperimentsToWebViewEnabled()) {
            StringBuilder sbG2 = Md5A.g(string);
            sbG2.append(buildQueryParam("experiments", configuration.getExperiments().getExperimentsAsJson().toString()));
            string = sbG2.toString();
        }
        StringBuilder sbG3 = Md5A.g(string);
        sbG3.append(buildQueryParam("isNativeCollectingMetrics", String.valueOf(SDKMetrics.getInstance().areMetricsEnabledForCurrentSession())));
        this._urlWithQueryString = rz.a(str, sbG3.toString());
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            DeviceLog.exception(String.format("Unsupported charset when encoding %s", str), e);
            return "";
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
