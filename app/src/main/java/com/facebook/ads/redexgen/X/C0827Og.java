package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0827Og {
    public static AbstractC0826Of A00(C0830Oj c0830Oj, @Nullable Bundle bundle, boolean z) {
        AbstractC0826Of c0944St;
        C1B c1bA0O = c0830Oj.A04().A0O();
        double dA00 = C0825Oe.A00(c1bA0O);
        boolean isWatchAndBrowse = c0830Oj.A04().A0O().A0N();
        boolean isVideo = C0825Oe.A05(c0830Oj.A00(), c0830Oj.A01(), dA00);
        AbstractC02460f abstractC02460fA00 = C02470g.A00(c0830Oj.A05(), c0830Oj.A06(), "", C0745La.A00(c0830Oj.A04().A0O().A0F().A05()), new HashMap());
        boolean z2 = !TextUtils.isEmpty(c1bA0O.A0D().A08());
        if (JR.A1I(c0830Oj.A05())) {
            c0830Oj.A05().A09().AFP(c0830Oj.A02(), c0830Oj.A04().A0U(), z2);
        }
        if (isWatchAndBrowse && (abstractC02460fA00 instanceof G0)) {
            c0944St = new C0937Sm(c0830Oj);
        } else if (z2) {
            c0944St = new A9(c0830Oj);
        } else if (!z2 && JR.A1q(c0830Oj.A05())) {
            c0944St = new AA(c0830Oj, isVideo);
        } else if (isVideo) {
            c0944St = new C0946Sv(c0830Oj, c0830Oj.A00() == 2);
        } else {
            c0944St = new C0944St(c0830Oj, C0825Oe.A03(dA00));
        }
        if (z) {
            c0944St.A0b(c1bA0O, c0830Oj.A04().A0U(), dA00, bundle);
        }
        return c0944St;
    }
}
