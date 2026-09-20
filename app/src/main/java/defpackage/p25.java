package defpackage;

import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public final class p25 extends cx1 implements j81<rw1.CQf<Float>, sd5> {
    public static final p25 w = new p25();

    public p25() {
        super(1);
    }

    @Override // defpackage.j81
    public final sd5 invoke(rw1.CQf<Float> cQf) {
        rw1.CQf<Float> cQf2 = cQf;
        cQf2.a = AdError.NETWORK_ERROR_CODE;
        Float fValueOf = Float.valueOf(1.0f);
        cQf2.a(0, fValueOf);
        cQf2.a(499, fValueOf);
        Float fValueOf2 = Float.valueOf(0.0f);
        cQf2.a(RCHTTPStatusCodes.ERROR, fValueOf2);
        cQf2.a(999, fValueOf2);
        return sd5.a;
    }
}
