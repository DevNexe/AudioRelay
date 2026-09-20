package defpackage;

import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class og {
    public static final Map<mg, ad0> b;
    public static final og c;
    public final Map<mg, ad0> a;

    static {
        Map<mg, ad0> mapQ = t92.Q(new uy2(mg.Low, new ad0(0, 100)), new uy2(mg.Medium, new ad0(0, RCHTTPStatusCodes.SUCCESS)), new uy2(mg.High, new ad0(AdError.SERVER_ERROR_CODE, 10000)));
        b = mapQ;
        c = new og(mapQ);
    }

    public og(Map<mg, ad0> map) {
        this.a = map;
    }

    public final ad0 a(mg mgVar) {
        ad0 ad0Var = this.a.get(mgVar);
        if (ad0Var != null) {
            return ad0Var;
        }
        ad0 ad0Var2 = b.get(mgVar);
        return ad0Var2 == null ? new ad0(0, 100) : ad0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og) && ur1.a(this.a, ((og) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BufferSizeModes(map=" + this.a + ")";
    }
}
