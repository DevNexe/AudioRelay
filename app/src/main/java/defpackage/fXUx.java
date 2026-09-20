package defpackage;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fXUx implements q0, pa3, a03, qf6 {
    public static ej1 x;
    public static ej1 z;
    public static final String[] w = {"standard", "accelerate", "decelerate", "linear"};
    public static final fXUx y = new fXUx();
    public static final /* synthetic */ fXUx A = new fXUx();
    public static final String[] B = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] C = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static final Float c(Object obj, Map map) {
        Object next;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ur1.a(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static String d(int i) {
        switch (i) {
            case -2:
                return "FEATURE_NOT_SUPPORTED";
            case -1:
                return "SERVICE_DISCONNECTED";
            case 0:
                return "OK";
            case 1:
                return "USER_CANCELED";
            case 2:
                return "SERVICE_UNAVAILABLE";
            case 3:
                return "BILLING_UNAVAILABLE";
            case 4:
                return "ITEM_UNAVAILABLE";
            case 5:
                return "DEVELOPER_ERROR";
            case 6:
                return "ERROR";
            case 7:
                return "ITEM_ALREADY_OWNED";
            case 8:
                return "ITEM_NOT_OWNED";
            default:
                return "UNKNOWN_CODE";
        }
    }

    public static pg2 e(pg2 pg2Var, iy4 iy4Var, Map map, boolean z2, boolean z3, ci2 ci2Var, x81 x81Var, float f, int i) {
        boolean z4 = (i & 8) != 0 ? true : z2;
        boolean z5 = (i & 16) != 0 ? false : z3;
        lp3 lp3Var = null;
        ci2 ci2Var2 = (i & 32) != 0 ? null : ci2Var;
        x81 x81Var2 = (i & 64) != 0 ? ey4.w : x81Var;
        if ((i & 128) != 0) {
            float f2 = zx4.a;
            Set setKeySet = map.keySet();
            if (setKeySet.size() > 1) {
                Set set = setKeySet;
                lp3Var = new lp3(wu.Q0(set).floatValue() - wu.R0(set).floatValue(), 10.0f, 10.0f);
            }
        }
        return f30.a(pg2Var, wo1.a, new hy4((i & 256) != 0 ? zx4.a : f, ci2Var2, lp3Var, iy4Var, map, x81Var2, z4, z5));
    }

    @Override // defpackage.q0
    public p0 a(t6r8 t6r8Var, m1 m1Var) {
        int i = t6r8Var.j.b;
        long j = i;
        ry4 ry4Var = t6r8Var.d;
        if (j < ((Number) ry4Var.getValue()).longValue()) {
            ry4 ry4Var2 = t6r8Var.c;
            return new p0(new r0(OW8.h(t6r8Var.f, ((Number) ry4Var2.getValue()).longValue()), ((Number) ry4Var2.getValue()).longValue(), ((Number) ry4Var.getValue()).longValue()), m1Var);
        }
        throw new IllegalStateException(("The specified maximum queued bytes needs to be superior to the AudioTrack buffer (" + i + " vs " + ((Number) ry4Var.getValue()).longValue() + ")").toString());
    }

    @Override // defpackage.a03
    public void b(ByteBuffer byteBuffer, j81 j81Var) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        j81Var.invoke(Collections.singletonList(bArr));
    }

    @Override // defpackage.pa3
    public boolean test(Object obj) {
        return ((y73) obj) instanceof y73.CQf;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(((q67) o67.x.w.zza()).zzd());
    }
}
