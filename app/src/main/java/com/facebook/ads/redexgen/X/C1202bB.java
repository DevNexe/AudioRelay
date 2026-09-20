package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1202bB implements C6N {
    public static String[] A02 = {"iWDBF2OKl3jtj3mE0UZLtkhUaVvUxXqs", "ms2LCEwCyzsqM8QDDj0PRev1P1CSm3w7", "hMtVrOKQMF9h", "gi6PEiuAAOhVuZEccjIoIAk9XYc1uF", "R32JKWcbl7Qu2cyp2LhmQehQDOktlipk", "kBJUlLOX6LAUVPMDIzawXbz3hNZwTKWy", "5r9f7V6KCkM3IvysTdnytDlDBRDUQAcw", "vGzO7SO4CN32udhBb2qyIGFDHHv1hOkX"};
    public final C1200b9 A00;
    public final C1074Xx A01;

    public C1202bB(C1074Xx c1074Xx) {
        this.A01 = c1074Xx;
        this.A00 = new C1200b9(c1074Xx);
    }

    public final C1200b9 A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C6N
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final void AE3(Throwable th) {
        if (th == null || AnonymousClass69.A00(this.A01) >= Math.random()) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        C1200b9 c1200b9 = this.A00;
        String strA02 = C6I.A04.A02();
        String strA03 = C6J.A06.A02();
        HashMap map = new HashMap();
        String message = th.getMessage();
        if (string != null) {
            int length = string.length();
            if (A02[1].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            A02[5] = "Ct83iaSYEVOHUGfDQtOJkAbKybUxEBTx";
            if (length > 500) {
                string = string.substring(0, RCHTTPStatusCodes.ERROR);
            }
        }
        c1200b9.A9A(strA02, strA03, map, null, message, string, th.getClass().getSimpleName());
    }
}
