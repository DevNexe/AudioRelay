package defpackage;

import com.google.auto.value.AutoValue;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class nu0 {
    public static final p3 a;

    static {
        Long l = 10485760L;
        Integer numValueOf = Integer.valueOf(RCHTTPStatusCodes.SUCCESS);
        Integer num = 10000;
        Long l2 = 604800000L;
        Integer num2 = 81920;
        String strA = l == null ? " maxStorageSizeInBytes" : "";
        if (numValueOf == null) {
            strA = strA.concat(" loadBatchSize");
        }
        if (num == null) {
            strA = rz.a(strA, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            strA = rz.a(strA, " eventCleanUpAge");
        }
        if (num2 == null) {
            strA = rz.a(strA, " maxBlobByteSizePerRow");
        }
        if (!strA.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
        a = new p3(l.longValue(), numValueOf.intValue(), num.intValue(), l2.longValue(), num2.intValue());
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
