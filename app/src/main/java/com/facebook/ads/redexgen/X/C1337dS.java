package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1337dS extends AbstractC02550p {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C1337dS.class.getSimpleName();
    public C1339dU A00;
    public boolean A01;
    public final C1075Xy A02;
    public final InterfaceC0703Jh A03;
    public final O6 A04;

    public C1337dS(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, O6 o6, C0895Qw c0895Qw, AbstractC02560q abstractC02560q) {
        super(c1075Xy, abstractC02560q, c0895Qw);
        this.A03 = interfaceC0703Jh;
        this.A04 = o6;
        this.A02 = c1075Xy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02550p
    public final void A06(Map<String, String> map) {
        C1339dU c1339dU = this.A00;
        if (c1339dU != null && !TextUtils.isEmpty(c1339dU.A65())) {
            this.A02.A0D().A2Y();
            AnonymousClass29.A00(this.A00.A05());
            InterfaceC0703Jh interfaceC0703Jh = this.A03;
            String strA65 = this.A00.A65();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC0703Jh.A93(strA65, map);
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                MM.A00(new C1338dT(this));
            }
        }
    }

    public final void A08(C1339dU c1339dU) {
        this.A00 = c1339dU;
    }
}
