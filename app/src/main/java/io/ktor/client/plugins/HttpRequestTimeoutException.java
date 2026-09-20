package io.ktor.client.plugins;

import defpackage.N;
import defpackage.ah1;
import defpackage.gf1;
import defpackage.ig1;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpRequestTimeoutException extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(ig1 ig1Var) {
        String strC = ig1Var.a.c();
        ah1.CQf cQf = ah1.d;
        Map map = (Map) ig1Var.f.d(gf1.a);
        ah1.QnHx qnHx = (ah1.QnHx) (map != null ? map.get(cQf) : null);
        String str = qnHx != null ? qnHx.a : null;
        StringBuilder sbA = N.a("Request timeout has expired [url=", strC, ", request_timeout=");
        sbA.append(str == null ? "unknown" : str);
        sbA.append(" ms]");
        super(sbA.toString());
    }
}
