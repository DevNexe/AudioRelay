package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes3.dex */
public final class zx6 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    public zx6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, String str, String str2, boolean z) {
        this.B = appMeasurementDynamiteService;
        this.A = zzcfVar;
        this.x = str;
        this.y = str2;
        this.z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleH0;
        int i = this.w;
        Object obj = this.A;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                String str = this.y;
                dy6 dy6Var = ((cy6) obj2).w;
                dy6Var.e();
                dq6 dq6Var = dy6Var.a;
                try {
                    m37 m37Var = dq6Var.l;
                    dq6.f(m37Var);
                    if (TextUtils.isEmpty(str)) {
                        bundleH0 = null;
                    } else if (str.contains("gclid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid")) {
                        bundleH0 = m37Var.h0(Uri.parse("https://google.com/search?".concat(str)));
                        if (bundleH0 != null) {
                            bundleH0.putString("_cis", "referrer");
                        }
                    } else {
                        bi6 bi6Var = m37Var.a.i;
                        dq6.h(bi6Var);
                        bi6Var.m.b("Activity created with data 'referrer' without required params");
                        bundleH0 = null;
                    }
                    sa7 sa7Var = dy6Var.n;
                    boolean z = this.z;
                    String str2 = this.x;
                    if (z) {
                        m37 m37Var2 = dq6Var.l;
                        dq6.f(m37Var2);
                        Bundle bundleH1 = m37Var2.h0(uri);
                        if (bundleH1 != null) {
                            bundleH1.putString("_cis", "intent");
                            if (!bundleH1.containsKey("gclid") && bundleH0 != null && bundleH0.containsKey("gclid")) {
                                bundleH1.putString("_cer", String.format("gclid=%s", bundleH0.getString("gclid")));
                            }
                            dy6Var.l(bundleH1, str2, "_cmp");
                            sa7Var.a(str2, bundleH1);
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bi6 bi6Var2 = dq6Var.i;
                        dq6.h(bi6Var2);
                        bi6Var2.m.c(str, "Activity created with referrer");
                        boolean zN = dq6Var.g.n(null, lg6.Z);
                        bi6 bi6Var3 = dq6Var.i;
                        if (zN) {
                            if (bundleH0 != null) {
                                dy6Var.l(bundleH0, str2, "_cmp");
                                sa7Var.a(str2, bundleH0);
                            } else {
                                dq6.h(bi6Var3);
                                bi6Var3.m.c(str, "Referrer does not contain valid parameters");
                            }
                            dq6Var.n.getClass();
                            dy6Var.t("auto", "_ldl", null, true, System.currentTimeMillis());
                        } else if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                            dq6.h(bi6Var3);
                            bi6Var3.m.b("Activity created with data 'referrer' without required params");
                        } else if (!TextUtils.isEmpty(str)) {
                            dq6Var.n.getClass();
                            dy6Var.t("auto", "_ldl", str, true, System.currentTimeMillis());
                        }
                    }
                } catch (RuntimeException e) {
                    bi6 bi6Var4 = dq6Var.i;
                    dq6.h(bi6Var4);
                    bi6Var4.f.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                }
                break;
            default:
                u07 u07VarQ = ((AppMeasurementDynamiteService) obj2).w.q();
                String str3 = this.x;
                String str4 = this.y;
                boolean z2 = this.z;
                u07VarQ.e();
                u07VarQ.f();
                u07VarQ.q(new fz6(u07VarQ, str3, str4, u07VarQ.n(false), z2, (zzcf) obj));
                break;
        }
    }

    public zx6(cy6 cy6Var, boolean z, Uri uri, String str, String str2) {
        this.B = cy6Var;
        this.z = z;
        this.A = uri;
        this.x = str;
        this.y = str2;
    }
}
