package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1218bR extends L8 {
    public static byte[] A01;
    public final /* synthetic */ C03735g A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public C1218bR(C03735g c03735g) {
        this.A00 = c03735g;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        try {
            JSONArray jSONArray = this.A00.A05.getJSONArray(A00(0, 6, 77));
            for (int i = 0; i < i; i++) {
                C03715e c03715eA00 = C03715e.A00(jSONArray.getJSONObject(i));
                this.A00.A09(c03715eA00.A04, c03715eA00);
            }
            this.A00.A02.A0W(new C1220bT(this), new C7N(this.A00.A04, this.A00.A03));
        } catch (JSONException unused) {
            this.A00.A00.post(new C1219bS(this));
        }
    }
}
