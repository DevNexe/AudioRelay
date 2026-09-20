package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public final class C1377eC {
    public final C1388eN A00;
    public final C1386eL A01;

    public C1377eC(AbstractC1393eS abstractC1393eS, C1386eL c1386eL, C1388eN c1388eN) {
        this.A00 = c1388eN;
        this.A01 = c1386eL;
        abstractC1393eS.A02(new GK(c1386eL));
    }

    public static C1377eC A00(AbstractC1393eS abstractC1393eS, InterfaceC1397eW interfaceC1397eW, GL gl) {
        C1388eN c1388eN = new C1388eN();
        return new C1377eC(abstractC1393eS, new C1386eL(interfaceC1397eW, new GP(), gl, c1388eN, new Handler()), c1388eN);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1395eU c1395eU) {
        this.A00.A02(view, c1395eU);
    }

    public final void A03(@Nullable InterfaceC1392eR interfaceC1392eR) {
        this.A01.A0B(interfaceC1392eR);
    }

    public final void A04(@Nullable InterfaceC1390eP interfaceC1390eP) {
        this.A01.A0C(interfaceC1390eP);
    }
}
