package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.measurement.Com1Fixed;
import com.google.android.gms.internal.measurement.EQ;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.FJCM;
import com.google.android.gms.internal.measurement.LPt8Fixed;
import com.google.android.gms.internal.measurement.NUlFixed;
import com.google.android.gms.internal.measurement.auxFixed;
import com.google.android.gms.internal.measurement.byN;
import com.google.android.gms.internal.measurement.o_K;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class wl6 extends g27 implements cv5 {
    public final Bt7j d;
    public final Bt7j e;
    public final Bt7j f;
    public final Bt7j g;
    public final Bt7j h;
    public final Bt7j i;
    public final kl6 j;
    public final pq2 k;
    public final Bt7j l;
    public final Bt7j m;
    public final Bt7j n;

    public wl6(r27 r27Var) {
        super(r27Var);
        this.d = new Bt7j();
        this.e = new Bt7j();
        this.f = new Bt7j();
        this.g = new Bt7j();
        this.h = new Bt7j();
        this.l = new Bt7j();
        this.m = new Bt7j();
        this.n = new Bt7j();
        this.i = new Bt7j();
        this.j = new kl6(this);
        this.k = new pq2(this);
    }

    public static final Bt7j m(FJCM fjcm) {
        Bt7j bt7j = new Bt7j();
        for (y yVar : fjcm.D()) {
            bt7j.put(yVar.s(), yVar.t());
        }
        return bt7j;
    }

    @Override // defpackage.cv5
    public final String a(String str, String str2) throws Throwable {
        e();
        k(str);
        Map map = (Map) this.d.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.g27
    public final void h() {
    }

    public final FJCM i(String str, byte[] bArr) {
        dq6 dq6Var = this.a;
        if (bArr == null) {
            return FJCM.x();
        }
        try {
            FJCM fjcm = (FJCM) ((yj6) b37.w(FJCM.v(), bArr)).n();
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.d(fjcm.I() ? Long.valueOf(fjcm.t()) : null, "Parsed config. version, gmp_app_id", fjcm.H() ? fjcm.y() : null);
            return fjcm;
        } catch (zzko e) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.i.d(bi6.n(str), "Unable to merge remote config. appId", e);
            return FJCM.x();
        } catch (RuntimeException e2) {
            bi6 bi6Var3 = dq6Var.i;
            dq6.h(bi6Var3);
            bi6Var3.i.d(bi6.n(str), "Unable to merge remote config. appId", e2);
            return FJCM.x();
        }
    }

    public final void j(String str, yj6 yj6Var) {
        HashSet hashSet = new HashSet();
        Bt7j bt7j = new Bt7j();
        Bt7j bt7j2 = new Bt7j();
        Bt7j bt7j3 = new Bt7j();
        c87.b();
        dq6 dq6Var = this.a;
        if (dq6Var.g.n(null, lg6.j0)) {
            Iterator it = Collections.unmodifiableList(((FJCM) yj6Var.x).B()).iterator();
            while (it.hasNext()) {
                hashSet.add(((byN) it.next()).s());
            }
        }
        for (int i = 0; i < ((FJCM) yj6Var.x).s(); i++) {
            sj6 sj6Var = (sj6) ((FJCM) yj6Var.x).u(i).o();
            boolean zIsEmpty = sj6Var.q().isEmpty();
            bi6 bi6Var = dq6Var.i;
            if (zIsEmpty) {
                dq6.h(bi6Var);
                bi6Var.i.b("EventConfig contained null event name");
            } else {
                String strQ = sj6Var.q();
                String strN = C0239D.N(sj6Var.q(), v3A.A, v3A.C);
                if (!TextUtils.isEmpty(strN)) {
                    if (sj6Var.y) {
                        sj6Var.p();
                        sj6Var.y = false;
                    }
                    EQ.u((EQ) sj6Var.x, strN);
                    if (yj6Var.y) {
                        yj6Var.p();
                        yj6Var.y = false;
                    }
                    FJCM.E((FJCM) yj6Var.x, i, (EQ) sj6Var.n());
                }
                if (((EQ) sj6Var.x).x() && ((EQ) sj6Var.x).v()) {
                    bt7j.put(strQ, Boolean.TRUE);
                }
                if (((EQ) sj6Var.x).y() && ((EQ) sj6Var.x).w()) {
                    bt7j2.put(sj6Var.q(), Boolean.TRUE);
                }
                if (((EQ) sj6Var.x).z()) {
                    if (((EQ) sj6Var.x).r() < 2 || ((EQ) sj6Var.x).r() > 65535) {
                        dq6.h(bi6Var);
                        bi6Var.i.d(sj6Var.q(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((EQ) sj6Var.x).r()));
                    } else {
                        bt7j3.put(sj6Var.q(), Integer.valueOf(((EQ) sj6Var.x).r()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, bt7j);
        this.g.put(str, bt7j2);
        this.i.put(str, bt7j3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    public final void k(String str) throws Throwable {
        Cursor cursorQuery;
        xi5 xi5Var;
        Bt7j bt7j;
        Bt7j bt7j2;
        Bt7j bt7j3;
        Bt7j bt7j4;
        f();
        e();
        oa3.e(str);
        Bt7j bt7j5 = this.h;
        Cursor cursor = null;
        if (bt7j5.getOrDefault(str, null) == null) {
            iy5 iy5Var = this.b.c;
            r27.E(iy5Var);
            dq6 dq6Var = iy5Var.a;
            oa3.e(str);
            iy5Var.e();
            iy5Var.f();
            try {
                cursorQuery = iy5Var.x().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = dq6Var.g.n(null, lg6.u0) ? cursorQuery.getString(2) : null;
                            if (cursorQuery.moveToNext()) {
                                bi6 bi6Var = dq6Var.i;
                                dq6.h(bi6Var);
                                bi6Var.f.c(bi6.n(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob != null) {
                                xi5Var = new xi5(blob, string, string2, 6);
                                cursorQuery.close();
                            }
                            bt7j = this.n;
                            bt7j2 = this.m;
                            bt7j3 = this.l;
                            bt7j4 = this.d;
                            if (xi5Var != null) {
                                yj6 yj6Var = (yj6) i(str, (byte[]) xi5Var.x).o();
                                j(str, yj6Var);
                                bt7j4.put(str, m((FJCM) yj6Var.n()));
                                bt7j5.put(str, (FJCM) yj6Var.n());
                                l(str, (FJCM) yj6Var.n());
                                bt7j3.put(str, ((FJCM) yj6Var.x).z());
                                bt7j2.put(str, (String) xi5Var.y);
                                bt7j.put(str, (String) xi5Var.z);
                                return;
                            }
                            bt7j4.put(str, null);
                            this.f.put(str, null);
                            this.e.put(str, null);
                            this.g.put(str, null);
                            bt7j5.put(str, null);
                            bt7j3.put(str, null);
                            bt7j2.put(str, null);
                            bt7j.put(str, null);
                            this.i.put(str, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    bi6 bi6Var2 = dq6Var.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.d(bi6.n(str), "Error querying remote config. appId", e);
                    if (cursorQuery != null) {
                    }
                    xi5Var = null;
                    bt7j = this.n;
                    bt7j2 = this.m;
                    bt7j3 = this.l;
                    bt7j4 = this.d;
                    if (xi5Var != null) {
                        yj6 yj6Var2 = (yj6) i(str, (byte[]) xi5Var.x).o();
                        j(str, yj6Var2);
                        bt7j4.put(str, m((FJCM) yj6Var2.n()));
                        bt7j5.put(str, (FJCM) yj6Var2.n());
                        l(str, (FJCM) yj6Var2.n());
                        bt7j3.put(str, ((FJCM) yj6Var2.x).z());
                        bt7j2.put(str, (String) xi5Var.y);
                        bt7j.put(str, (String) xi5Var.z);
                        return;
                    }
                    bt7j4.put(str, null);
                    this.f.put(str, null);
                    this.e.put(str, null);
                    this.g.put(str, null);
                    bt7j5.put(str, null);
                    bt7j3.put(str, null);
                    bt7j2.put(str, null);
                    bt7j.put(str, null);
                    this.i.put(str, null);
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursorQuery.close();
            xi5Var = null;
            bt7j = this.n;
            bt7j2 = this.m;
            bt7j3 = this.l;
            bt7j4 = this.d;
            if (xi5Var != null) {
                yj6 yj6Var3 = (yj6) i(str, (byte[]) xi5Var.x).o();
                j(str, yj6Var3);
                bt7j4.put(str, m((FJCM) yj6Var3.n()));
                bt7j5.put(str, (FJCM) yj6Var3.n());
                l(str, (FJCM) yj6Var3.n());
                bt7j3.put(str, ((FJCM) yj6Var3.x).z());
                bt7j2.put(str, (String) xi5Var.y);
                bt7j.put(str, (String) xi5Var.z);
                return;
            }
            bt7j4.put(str, null);
            this.f.put(str, null);
            this.e.put(str, null);
            this.g.put(str, null);
            bt7j5.put(str, null);
            bt7j3.put(str, null);
            bt7j2.put(str, null);
            bt7j.put(str, null);
            this.i.put(str, null);
        }
    }

    public final void l(final String str, FJCM fjcm) {
        if (fjcm.r() == 0) {
            kl6 kl6Var = this.j;
            if (str == null) {
                kl6Var.getClass();
                throw new NullPointerException("key == null");
            }
            synchronized (kl6Var) {
                if (kl6Var.a.remove(str) != null) {
                    kl6Var.b--;
                }
            }
            return;
        }
        bi6 bi6Var = this.a.i;
        dq6.h(bi6Var);
        bi6Var.n.c(Integer.valueOf(fjcm.r()), "EES programs found");
        o_K o_k = (o_K) fjcm.C().get(0);
        try {
            x66 x66Var = new x66();
            x66Var.a.d.a.put("internal.remoteConfig", new el6(this, str));
            x66Var.a.d.a.put("internal.appMetadata", new Callable() { // from class: gl6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new pb7(new p87(2, this.w, str));
                }
            });
            x66Var.a.d.a.put("internal.logger", new Callable() { // from class: il6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new c47(this.w.k);
                }
            });
            x66Var.a(o_k);
            this.j.c(str, x66Var);
            bi6 bi6Var2 = this.a.i;
            dq6.h(bi6Var2);
            bi6Var2.n.d(str, "EES program loaded for appId, activities", Integer.valueOf(o_k.r().r()));
            for (Com1Fixed com1 : o_k.r().u()) {
                bi6 bi6Var3 = this.a.i;
                dq6.h(bi6Var3);
                bi6Var3.n.c(com1.s(), "EES program activity");
            }
        } catch (zzd unused) {
            bi6 bi6Var4 = this.a.i;
            dq6.h(bi6Var4);
            bi6Var4.f.c(str, "Failed to load EES program. appId");
        }
    }

    public final int n(String str, String str2) throws Throwable {
        Integer num;
        e();
        k(str);
        Map map = (Map) this.i.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final FJCM o(String str) {
        f();
        e();
        oa3.e(str);
        k(str);
        return (FJCM) this.h.getOrDefault(str, null);
    }

    public final String p(String str) throws Throwable {
        e();
        k(str);
        return (String) this.l.getOrDefault(str, null);
    }

    public final boolean q(String str) {
        FJCM fjcm;
        return (TextUtils.isEmpty(str) || (fjcm = (FJCM) this.h.getOrDefault(str, null)) == null || fjcm.r() == 0) ? false : true;
    }

    public final boolean r(String str, String str2) throws Throwable {
        Boolean bool;
        e();
        k(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean s(String str, String str2) {
        Boolean bool;
        e();
        k(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && m37.P(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && m37.Q(str2)) {
            return true;
        }
        Map map = (Map) this.f.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void t(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        dq6 dq6Var;
        byte[] bArrG;
        String str4;
        yj6 yj6Var;
        r27 r27Var;
        String str5;
        String str6;
        ah6 ah6Var;
        boolean z;
        boolean z2;
        boolean z3;
        f();
        e();
        oa3.e(str);
        yj6 yj6Var2 = (yj6) i(str, bArr).o();
        j(str, yj6Var2);
        l(str, (FJCM) yj6Var2.n());
        FJCM fjcm = (FJCM) yj6Var2.n();
        Bt7j bt7j = this.h;
        bt7j.put(str, fjcm);
        this.l.put(str, ((FJCM) yj6Var2.x).z());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, m((FJCM) yj6Var2.n()));
        r27 r27Var2 = this.b;
        iy5 iy5Var = r27Var2.c;
        r27.E(iy5Var);
        ArrayList<F1> arrayList = new ArrayList(Collections.unmodifiableList(((FJCM) yj6Var2.x).A()));
        String str7 = "app_id=? and audience_id=?";
        String str8 = "event_filters";
        int i = 0;
        while (i < arrayList.size()) {
            ah6 ah6Var2 = (ah6) ((F1) arrayList.get(i)).o();
            if (((F1) ah6Var2.x).s() != 0) {
                ah6Var = ah6Var2;
                int i2 = 0;
                while (i2 < ((F1) ah6Var.x).s()) {
                    ih6 ih6Var = (ih6) ((F1) ah6Var.x).v(i2).o();
                    ih6 ih6Var2 = (ih6) ih6Var.clone();
                    r27 r27Var3 = r27Var2;
                    yj6 yj6Var3 = yj6Var2;
                    String strN = C0239D.N(((LPt8Fixed) ih6Var.x).x(), v3A.A, v3A.C);
                    if (strN != null) {
                        if (ih6Var2.y) {
                            ih6Var2.p();
                            ih6Var2.y = false;
                        }
                        LPt8Fixed.z((LPt8Fixed) ih6Var2.x, strN);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z4 = z2;
                    int i3 = 0;
                    while (i3 < ((LPt8Fixed) ih6Var.x).r()) {
                        NUlFixed nUlV = ((LPt8Fixed) ih6Var.x).v(i3);
                        ih6 ih6Var3 = ih6Var;
                        String str9 = str7;
                        String str10 = str8;
                        String strN2 = C0239D.N(nUlV.v(), NRt.A, NRt.B);
                        if (strN2 != null) {
                            oh6 oh6Var = (oh6) nUlV.o();
                            if (oh6Var.y) {
                                oh6Var.p();
                                z3 = false;
                                oh6Var.y = false;
                            } else {
                                z3 = false;
                            }
                            NUlFixed.w((NUlFixed) oh6Var.x, strN2);
                            NUlFixed nUl = (NUlFixed) oh6Var.n();
                            if (ih6Var2.y) {
                                ih6Var2.p();
                                ih6Var2.y = z3;
                            }
                            LPt8Fixed.A((LPt8Fixed) ih6Var2.x, i3, nUl);
                            z4 = true;
                        }
                        i3++;
                        ih6Var = ih6Var3;
                        str7 = str9;
                        str8 = str10;
                    }
                    String str11 = str7;
                    String str12 = str8;
                    if (z4) {
                        if (ah6Var.y) {
                            ah6Var.p();
                            ah6Var.y = false;
                        }
                        F1.A((F1) ah6Var.x, i2, (LPt8Fixed) ih6Var2.n());
                        arrayList.set(i, (F1) ah6Var2.n());
                        ah6Var = ah6Var2;
                    }
                    i2++;
                    r27Var2 = r27Var3;
                    yj6Var2 = yj6Var3;
                    str7 = str11;
                    str8 = str12;
                }
                yj6Var = yj6Var2;
                r27Var = r27Var2;
                str5 = str7;
                str6 = str8;
            } else {
                yj6Var = yj6Var2;
                r27Var = r27Var2;
                str5 = str7;
                str6 = str8;
                ah6Var = ah6Var2;
            }
            if (((F1) ah6Var.x).t() != 0) {
                for (int i4 = 0; i4 < ((F1) ah6Var.x).t(); i4++) {
                    auxFixed auxVarW = ((F1) ah6Var.x).w(i4);
                    String strN3 = C0239D.N(auxVarW.v(), fXUx.B, fXUx.C);
                    if (strN3 != null) {
                        ji6 ji6Var = (ji6) auxVarW.o();
                        if (ji6Var.y) {
                            ji6Var.p();
                            z = false;
                            ji6Var.y = false;
                        } else {
                            z = false;
                        }
                        auxFixed.w((auxFixed) ji6Var.x, strN3);
                        if (ah6Var.y) {
                            ah6Var.p();
                            ah6Var.y = z;
                        }
                        F1.z((F1) ah6Var.x, i4, (auxFixed) ji6Var.n());
                        arrayList.set(i, (F1) ah6Var2.n());
                        ah6Var = ah6Var2;
                    }
                }
            }
            i++;
            bt7j = bt7j;
            r27Var2 = r27Var;
            yj6Var2 = yj6Var;
            str7 = str5;
            str8 = str6;
        }
        yj6 yj6Var4 = yj6Var2;
        Bt7j bt7j2 = bt7j;
        r27 r27Var4 = r27Var2;
        String str13 = str7;
        String str14 = str8;
        iy5Var.f();
        iy5Var.e();
        oa3.e(str);
        SQLiteDatabase sQLiteDatabaseX = iy5Var.x();
        sQLiteDatabaseX.beginTransaction();
        try {
            iy5Var.f();
            iy5Var.e();
            oa3.e(str);
            SQLiteDatabase sQLiteDatabaseX2 = iy5Var.x();
            sQLiteDatabaseX2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseX2.delete(str14, "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                dq6Var = iy5Var.a;
                if (!zHasNext) {
                    break;
                }
                try {
                    F1 f1 = (F1) it.next();
                    iy5Var.f();
                    iy5Var.e();
                    oa3.e(str);
                    oa3.h(f1);
                    if (f1.B()) {
                        int iR = f1.r();
                        Iterator it2 = f1.x().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!((LPt8Fixed) it2.next()).F()) {
                                    bi6 bi6Var = dq6Var.i;
                                    dq6.h(bi6Var);
                                    bi6Var.i.d(bi6.n(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iR));
                                    break;
                                }
                            } else {
                                Iterator it3 = f1.y().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!((auxFixed) it3.next()).A()) {
                                            bi6 bi6Var2 = dq6Var.i;
                                            dq6.h(bi6Var2);
                                            bi6Var2.i.d(bi6.n(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iR));
                                            break;
                                        }
                                    } else {
                                        Iterator it4 = f1.x().iterator();
                                        while (true) {
                                            Iterator it5 = it;
                                            String str15 = "app_id";
                                            try {
                                                if (!it4.hasNext()) {
                                                    sQLiteDatabase = sQLiteDatabaseX;
                                                    Iterator it6 = f1.y().iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            auxFixed auxVar = (auxFixed) it6.next();
                                                            iy5Var.f();
                                                            iy5Var.e();
                                                            oa3.e(str);
                                                            oa3.h(auxVar);
                                                            if (auxVar.v().isEmpty()) {
                                                                bi6 bi6Var3 = dq6Var.i;
                                                                dq6.h(bi6Var3);
                                                                bi6Var3.i.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", bi6.n(str), Integer.valueOf(iR), String.valueOf(auxVar.A() ? Integer.valueOf(auxVar.r()) : null));
                                                            } else {
                                                                byte[] bArrG2 = auxVar.g();
                                                                ContentValues contentValues = new ContentValues();
                                                                contentValues.put(str15, str);
                                                                Iterator it7 = it6;
                                                                contentValues.put("audience_id", Integer.valueOf(iR));
                                                                contentValues.put("filter_id", auxVar.A() ? Integer.valueOf(auxVar.r()) : null);
                                                                String str16 = str15;
                                                                contentValues.put("property_name", auxVar.v());
                                                                contentValues.put("session_scoped", auxVar.B() ? Boolean.valueOf(auxVar.z()) : null);
                                                                contentValues.put("data", bArrG2);
                                                                try {
                                                                    if (iy5Var.x().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                        bi6 bi6Var4 = dq6Var.i;
                                                                        dq6.h(bi6Var4);
                                                                        bi6Var4.f.c(bi6.n(str), "Failed to insert property filter (got -1). appId");
                                                                    } else {
                                                                        it6 = it7;
                                                                        str15 = str16;
                                                                    }
                                                                } catch (SQLiteException e) {
                                                                    bi6 bi6Var5 = dq6Var.i;
                                                                    dq6.h(bi6Var5);
                                                                    bi6Var5.f.d(bi6.n(str), "Error storing property filter. appId", e);
                                                                }
                                                            }
                                                        } else {
                                                            str4 = str13;
                                                        }
                                                        str13 = str4;
                                                        it = it5;
                                                        sQLiteDatabaseX = sQLiteDatabase;
                                                        break;
                                                    }
                                                }
                                                LPt8Fixed lPt8 = (LPt8Fixed) it4.next();
                                                iy5Var.f();
                                                iy5Var.e();
                                                oa3.e(str);
                                                oa3.h(lPt8);
                                                if (!lPt8.x().isEmpty()) {
                                                    Iterator it8 = it4;
                                                    byte[] bArrG3 = lPt8.g();
                                                    sQLiteDatabase = sQLiteDatabaseX;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str);
                                                    contentValues2.put("audience_id", Integer.valueOf(iR));
                                                    contentValues2.put("filter_id", lPt8.F() ? Integer.valueOf(lPt8.s()) : null);
                                                    contentValues2.put("event_name", lPt8.x());
                                                    contentValues2.put("session_scoped", lPt8.G() ? Boolean.valueOf(lPt8.D()) : null);
                                                    contentValues2.put("data", bArrG3);
                                                    try {
                                                        if (iy5Var.x().insertWithOnConflict(str14, null, contentValues2, 5) == -1) {
                                                            bi6 bi6Var6 = dq6Var.i;
                                                            dq6.h(bi6Var6);
                                                            bi6Var6.f.c(bi6.n(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        it = it5;
                                                        it4 = it8;
                                                        sQLiteDatabaseX = sQLiteDatabase;
                                                    } catch (SQLiteException e2) {
                                                        bi6 bi6Var7 = dq6Var.i;
                                                        dq6.h(bi6Var7);
                                                        bi6Var7.f.d(bi6.n(str), "Error storing event filter. appId", e2);
                                                        iy5Var.f();
                                                        iy5Var.e();
                                                        oa3.e(str);
                                                        SQLiteDatabase sQLiteDatabaseX3 = iy5Var.x();
                                                        str4 = str13;
                                                        sQLiteDatabaseX3.delete("property_filters", str4, new String[]{str, String.valueOf(iR)});
                                                        sQLiteDatabaseX3.delete(str14, str4, new String[]{str, String.valueOf(iR)});
                                                        str13 = str4;
                                                        it = it5;
                                                        sQLiteDatabaseX = sQLiteDatabase;
                                                        break;
                                                    }
                                                } else {
                                                    bi6 bi6Var8 = dq6Var.i;
                                                    dq6.h(bi6Var8);
                                                    bi6Var8.i.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", bi6.n(str), Integer.valueOf(iR), String.valueOf(lPt8.F() ? Integer.valueOf(lPt8.s()) : null));
                                                    sQLiteDatabase = sQLiteDatabaseX;
                                                }
                                                iy5Var.f();
                                                iy5Var.e();
                                                oa3.e(str);
                                                SQLiteDatabase sQLiteDatabaseX4 = iy5Var.x();
                                                str4 = str13;
                                                sQLiteDatabaseX4.delete("property_filters", str4, new String[]{str, String.valueOf(iR)});
                                                sQLiteDatabaseX4.delete(str14, str4, new String[]{str, String.valueOf(iR)});
                                                str13 = str4;
                                                it = it5;
                                                sQLiteDatabaseX = sQLiteDatabase;
                                                break;
                                                break;
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bi6 bi6Var9 = dq6Var.i;
                        dq6.h(bi6Var9);
                        bi6Var9.i.c(bi6.n(str), "Audience with no ID. appId");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseX;
                }
                th = th;
                sQLiteDatabase.endTransaction();
                throw th;
            }
            sQLiteDatabase = sQLiteDatabaseX;
            ArrayList arrayList2 = new ArrayList();
            for (F1 f2 : arrayList) {
                arrayList2.add(f2.B() ? Integer.valueOf(f2.r()) : null);
            }
            oa3.e(str);
            iy5Var.f();
            iy5Var.e();
            SQLiteDatabase sQLiteDatabaseX5 = iy5Var.x();
            try {
                long jS = iy5Var.s("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, dq6Var.g.i(str, lg6.G)));
                if (jS > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder();
                            sb.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb.append("(" + strJoin + ")");
                            sb.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseX5.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e3) {
                bi6 bi6Var10 = dq6Var.i;
                dq6.h(bi6Var10);
                bi6Var10.f.d(bi6.n(str), "Database error querying filters. appId", e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                if (yj6Var4.y) {
                    yj6Var4.p();
                    yj6Var4.y = false;
                }
                FJCM.F((FJCM) yj6Var4.x);
                bArrG = ((FJCM) yj6Var4.n()).g();
            } catch (RuntimeException e4) {
                bi6 bi6Var11 = this.a.i;
                dq6.h(bi6Var11);
                bi6Var11.i.d(bi6.n(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e4);
                bArrG = bArr;
            }
            iy5 iy5Var2 = r27Var4.c;
            r27.E(iy5Var2);
            oa3.e(str);
            iy5Var2.e();
            iy5Var2.f();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrG);
            contentValues3.put("config_last_modified_time", str2);
            dq6 dq6Var2 = iy5Var2.a;
            vv5 vv5Var = dq6Var2.g;
            bi6 bi6Var12 = dq6Var2.i;
            if (vv5Var.n(null, lg6.u0)) {
                contentValues3.put("e_tag", str3);
            }
            try {
                if (iy5Var2.x().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    dq6.h(bi6Var12);
                    bi6Var12.f.c(bi6.n(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e5) {
                dq6.h(bi6Var12);
                bi6Var12.f.d(bi6.n(str), "Error storing remote config. appId", e5);
            }
            bt7j2.put(str, (FJCM) yj6Var4.n());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseX;
        }
    }
}
