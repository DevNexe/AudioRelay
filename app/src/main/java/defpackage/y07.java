package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class y07 extends g27 {
    public final HashMap d;
    public final bj6 e;
    public final bj6 f;
    public final bj6 g;
    public final bj6 h;
    public final bj6 i;

    public y07(r27 r27Var) {
        super(r27Var);
        this.d = new HashMap();
        xj6 xj6Var = this.a.h;
        dq6.f(xj6Var);
        this.e = new bj6(xj6Var, "last_delete_stale", 0L);
        xj6 xj6Var2 = this.a.h;
        dq6.f(xj6Var2);
        this.f = new bj6(xj6Var2, "backoff", 0L);
        xj6 xj6Var3 = this.a.h;
        dq6.f(xj6Var3);
        this.g = new bj6(xj6Var3, "last_upload", 0L);
        xj6 xj6Var4 = this.a.h;
        dq6.f(xj6Var4);
        this.h = new bj6(xj6Var4, "last_upload_attempt", 0L);
        xj6 xj6Var5 = this.a.h;
        dq6.f(xj6Var5);
        this.i = new bj6(xj6Var5, "midnight_offset", 0L);
    }

    @Override // defpackage.g27
    public final void h() {
    }

    @Deprecated
    public final Pair i(String str) {
        w07 w07Var;
        e();
        dq6 dq6Var = this.a;
        dq6Var.n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.d;
        w07 w07Var2 = (w07) map.get(str);
        if (w07Var2 != null && jElapsedRealtime < w07Var2.c) {
            return new Pair(w07Var2.a, Boolean.valueOf(w07Var2.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jK = dq6Var.g.k(str, lg6.c) + jElapsedRealtime;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(dq6Var.a);
            if (advertisingIdInfo == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            w07Var = id != null ? new w07(jK, id, advertisingIdInfo.isLimitAdTrackingEnabled()) : new w07(jK, "", advertisingIdInfo.isLimitAdTrackingEnabled());
            map.put(str, w07Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(w07Var.a, Boolean.valueOf(w07Var.b));
        } catch (Exception e) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.m.c(e, "Unable to get advertising id");
            w07Var = new w07(jK, "", false);
        }
    }

    @Deprecated
    public final String j(String str, boolean z) {
        e();
        String str2 = z ? (String) i(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM = m37.m();
        if (messageDigestM == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM.digest(str2.getBytes())));
    }
}
